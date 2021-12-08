package com.oyelabs.marvel.universefeatures.model.repository

import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.utils.RequestResult

interface CharactersRepository {

    suspend fun loadMarvelCharactersList(): RequestResult
}
