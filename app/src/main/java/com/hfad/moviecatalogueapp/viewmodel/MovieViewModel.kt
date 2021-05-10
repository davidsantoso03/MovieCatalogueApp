package com.hfad.moviecatalogueapp.viewmodel

import androidx.lifecycle.ViewModel
import com.hfad.moviecatalogueapp.model.Movie
import com.hfad.moviecatalogueapp.utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getMovie():List<Movie> = DataDummy.generateMovieDummy()
}