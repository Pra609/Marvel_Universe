package com.oyelabs.marvel.universe.model.repository.datasource.remote.rest

import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.model.CharacterRestModel
import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.model.MarvelApiResponse
import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.utils.MarvelApiConstants.MARVEL_API_HASH
import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.utils.MarvelApiConstants.MARVEL_API_PUBLIC_KEY
import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.utils.MarvelApiConstants.MARVEL_API_TS
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("http://gateway.marvel.com/v1/public/characters?ts=1&apikey=0a9e73b957bfba689897eb04456a8045&hash=709d135260748f1e99bce8e508a99483")
    suspend fun getCharacters(): Response<MarvelApiResponse<CharacterRestModel>>
}
