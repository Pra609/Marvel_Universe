package com.oyelabs.marvel.universe.di

import com.oyelabs.marvel.universe.features.model.repository.CharactersRepository
import com.oyelabs.marvel.universe.features.model.repository.datasource.remote.RemoteDataSource
import com.oyelabs.marvel.universe.model.repository.impl.CharactersRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(dataSource: RemoteDataSource): CharactersRepository {
        return CharactersRepositoryImpl(remoteDataSource = dataSource)
    }
}
