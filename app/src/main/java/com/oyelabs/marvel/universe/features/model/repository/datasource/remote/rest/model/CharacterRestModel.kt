package com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.model

import com.google.gson.annotations.SerializedName

data class CharacterRestModel(

    @SerializedName("id")
    var id: Int,

    @SerializedName("name")
    var name: String,

    @SerializedName("description")
    var description: String,

    @SerializedName("thumbnail")
    var thumbnail: Thumbnail,
)
