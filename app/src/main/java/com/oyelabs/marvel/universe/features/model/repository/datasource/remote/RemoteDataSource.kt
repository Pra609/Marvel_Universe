package com.oyelabs.marvel.universe.features.model.repository.datasource.remote

import androidx.lifecycle.MutableLiveData
import com.oyelabs.marvel.universe.features.model.entities.MarvelCharacter
import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.utils.RequestResult

interface RemoteDataSource {

    var items: MutableLiveData<List<MarvelCharacter>?>

    suspend fun loadDataFromServer(): RequestResult
}
