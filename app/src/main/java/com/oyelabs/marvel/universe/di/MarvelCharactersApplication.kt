package com.oyelabs.marvel.universe

import android.app.Application
import com.oyelabs.marvel.universe.di.DaggerApplicationComponent

class MarvelCharactersApplication: Application() {

    val appComponent = DaggerApplicationComponent.create()
}