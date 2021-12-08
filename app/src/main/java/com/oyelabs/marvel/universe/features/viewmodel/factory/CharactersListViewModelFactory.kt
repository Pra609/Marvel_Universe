package com.oyelabs.marvel.universe.features.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.RemoteDataSource
import com.oyelabs.marvel.universe.features.model.repository.impl.CharactersRepositoryImpl
import com.oyelabs.marvel.universe.features.viewmodel.CharactersListViewModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CharactersListViewModelFactory @Inject constructor(
    private val remoteDataSource: RemoteDataSource): ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return CharactersListViewModel(charactersRepository = CharactersRepositoryImpl(remoteDataSource = remoteDataSource)) as T
    }

}
