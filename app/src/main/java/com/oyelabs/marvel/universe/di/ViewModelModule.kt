package com.oyelabs.marvel.universe.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.oyelabs.marvel.universe.features.viewmodel.CharactersListViewModel
import com.oyelabs.marvel.universe.features.viewmodel.factory.CharactersListViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModel(viewModel: CharactersListViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: CharactersListViewModelFactory):
            ViewModelProvider.Factory
}
