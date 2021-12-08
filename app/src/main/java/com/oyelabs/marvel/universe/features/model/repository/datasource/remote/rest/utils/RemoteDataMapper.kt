package com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.utils

import com.oyelabs.marvel.universe.features.model.entities.MarvelCharacter
import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.model.CharacterRestModel

object RemoteDataMapper {

    fun mapListCharacterRestModelToCharacter(responseList: List<CharacterRestModel>?): List<MarvelCharacter>{

        val result = ArrayList<MarvelCharacter>()

        if (responseList==null)
            return result

        for (element in responseList){
            result.add(
                MarvelCharacter(
                    id = element.id,
                    imageURL = element.thumbnail.getUrl(),
                    name = element.name,
                    description = element.description
            ))
        }
        return result
    }
}
