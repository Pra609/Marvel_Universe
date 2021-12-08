package com.oyelabs.marvel.universe.di

import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.RemoteDataSource
import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.ApiService
import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.rest.impl.RemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataSourceModule {

    @Singleton
    @Provides
    fun provideRemoteDataSource(apiService: ApiService): RemoteDataSource{
        return RemoteDataSourceImpl(apiService)
    }
}
