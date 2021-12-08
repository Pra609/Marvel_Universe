package com.oyelabs.marvel.universe.di


import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.RetrofitBuilder
import com.oyelabs.marvel.universe.model.repository.datasource.remote.rest.ApiService
import dagger.Module
import dagger.Provides

@Module
class ApiModule {

    @Provides
    fun providesMarvelApi(): ApiService {
        return RetrofitBuilder.API_SERVICE
    }
}