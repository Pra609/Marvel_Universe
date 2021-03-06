package com.oyelabs.marvel.universe.features.view.fragments

import android.os.Bundle
import android.view.*
import android.widget.SearchView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.oyelabs.marvel.universe.MarvelCharactersApplication
import com.oyelabs.marvel.universe.R
import com.oyelabs.marvel.universe.databinding.FragmentCharacterDetailsBinding
import com.oyelabs.marvel.universe.features.model.entities.MarvelCharacter
import com.oyelabs.marvel.universe.features.view.activities.CharactersListActivity
import android.R.menu

import android.view.MenuInflater





class CharacterDetailsFragment : Fragment() {

    private lateinit var viewDataBinding: FragmentCharacterDetailsBinding

    private val args: CharacterDetailsFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ((activity as CharactersListActivity).applicationContext as MarvelCharactersApplication)
            .appComponent.inject(this)

        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        viewDataBinding = FragmentCharacterDetailsBinding.inflate(inflater, container, false).apply {
            character = character
        }
        viewDataBinding.character = args.character

        return viewDataBinding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {

        menu.clear()
    }
}