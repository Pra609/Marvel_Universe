package com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.utils

import com.oyelabs.marvel.universe.features.model.entities.MarvelCharacter

sealed class RequestResult{

    object Loading : RequestResult()
    class Success(val result: List<MarvelCharacter>?): RequestResult()
    class Error(val e: Exception): RequestResult()
}
