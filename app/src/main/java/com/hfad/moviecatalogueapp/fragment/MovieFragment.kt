package com.hfad.moviecatalogueapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.moviecatalogueapp.adapter.MovieAdapter
import com.hfad.moviecatalogueapp.databinding.MovieFragmentBinding
import com.hfad.moviecatalogueapp.viewmodel.MovieViewModel

class MovieFragment : Fragment() {

    private lateinit var fragmentMovieFragmentBinding: MovieFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentMovieFragmentBinding = MovieFragmentBinding.inflate(inflater, container, false)
        return fragmentMovieFragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[MovieViewModel::class.java]
            val movies = viewModel.getMovie()

            val movieAdapter = MovieAdapter()
            movieAdapter.setMovie(movies)

            with(fragmentMovieFragmentBinding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }


    }
}

