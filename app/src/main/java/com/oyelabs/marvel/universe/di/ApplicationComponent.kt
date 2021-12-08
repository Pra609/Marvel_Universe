package com.oyelabs.marvel.universe.di

import com.oyelabs.marvel.universe.features.view.activities.CharactersListActivity
import com.oyelabs.marvel.universe.features.view.fragments.CharacterDetailsFragment
import com.oyelabs.marvel.universe.features.view.fragments.CharactersListFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ViewModelModule::class,
        RepositoryModule::class,
        DataSourceModule::class,
        ApiModule::class
    ])

interface ApplicationComponent {

    fun inject(charactersListActivity: CharactersListActivity)

    fun inject(charactersListFragment: CharactersListFragment)

    fun inject(characterDetailsFragment: CharacterDetailsFragment)
}
