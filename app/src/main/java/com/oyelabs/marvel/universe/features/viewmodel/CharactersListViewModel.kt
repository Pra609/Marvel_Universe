package com.yelotmany.marvelcharacters.features.viewmodel

import androidx.lifecycle.*
import com.oyelabs.marvel.universe.features.model.entities.MarvelCharacter
import com.oyelabs.marvel.universe.features.model.repository.CharactersRepository
import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.utils.RequestResult
import com.oyelabs.marvel.universe.features.view.utils.Event
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class CharactersListViewModel @Inject constructor(val charactersRepository: CharactersRepository):
    ViewModel(){

    lateinit var currentItems: MutableLiveData<RequestResult>
    private lateinit var items: RequestResult.Success

    private val _openCharacterEvent = MutableLiveData<Event<MarvelCharacter>>()
    val openCharacterEvent: LiveData<Event<MarvelCharacter>> = _openCharacterEvent

    fun loadCharactersList(){

        if (this::currentItems.isInitialized)
            return

        currentItems = MutableLiveData()

        currentItems.postValue(RequestResult.Loading)
        viewModelScope.launch(Dispatchers.IO){
            currentItems.postValue(charactersRepository.loadMarvelCharactersList())
        }

        currentItems.observeForever { result ->
            if (result is RequestResult.Success && !this::items.isInitialized)
                items = currentItems.value as RequestResult.Success
        }
    }


    fun openCharacterDetails(character: MarvelCharacter){

        _openCharacterEvent.value = Event(character)
    }

    fun filterList(text: String) {

        if (currentItems.value !is RequestResult.Success)
            return

        val filterResult = RequestResult.Success(items.result?.filter { it -> it.name!!.lowercase().contains(text.lowercase())})
        currentItems.postValue(filterResult)
    }
}
