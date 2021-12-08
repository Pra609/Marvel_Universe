package com.oyelabs.marvel.universe.features.model.repository.impl

import com.oyelabs.marvel.universe.features.model.repository.CharactersRepository
import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.RemoteDataSource
import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.utils.RequestResult
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor( private val remoteDataSource: RemoteDataSource):
    CharactersRepository {

    override suspend fun loadMarvelCharactersList(): RequestResult {

        return remoteDataSource.loadDataFromServer()
    }
}
