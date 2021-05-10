package com.hfad.moviecatalogueapp.viewmodel

import androidx.lifecycle.ViewModel
import com.hfad.moviecatalogueapp.model.Movie
import com.hfad.moviecatalogueapp.model.Tvshow
import com.hfad.moviecatalogueapp.utils.DataDummy

class TvShowViewModel : ViewModel() {
    fun getTvShow():List<Tvshow> = DataDummy.generateTvShowDummy()
}