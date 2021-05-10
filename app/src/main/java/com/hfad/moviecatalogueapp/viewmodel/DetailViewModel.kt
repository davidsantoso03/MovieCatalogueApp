package com.hfad.moviecatalogueapp.viewmodel

import androidx.lifecycle.ViewModel
import com.hfad.moviecatalogueapp.model.Movie
import com.hfad.moviecatalogueapp.model.Tvshow
import com.hfad.moviecatalogueapp.utils.DataDummy

class DetailViewModel : ViewModel() {
    private lateinit var movieId: String
    private lateinit var tvId: String

    fun selectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun selectedTvShow(tvId: String) {
        this.tvId = tvId
    }

    fun getMovie(): Movie {
        lateinit var movie: Movie
        val movieEntities = DataDummy.generateMovieDummy()
        for (Movie in movieEntities) {
            if (Movie.movieId == movieId) {
                movie = Movie
            }
        }
        return movie
    }

    fun getTvShow(): Tvshow {
        lateinit var tvshow: Tvshow
        val tvEntities = DataDummy.generateTvShowDummy()
        for (Tvshow in tvEntities) {
            if (Tvshow.tvId == tvId) {
                tvshow = Tvshow
            }

        }
        return tvshow
    }
}