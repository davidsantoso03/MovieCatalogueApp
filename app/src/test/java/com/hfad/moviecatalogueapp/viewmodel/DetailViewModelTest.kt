package com.hfad.moviecatalogueapp.viewmodel

import com.hfad.moviecatalogueapp.utils.DataDummy
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class DetailViewModelTest {
    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = DataDummy.generateMovieDummy()[0]
    private val dummyTvShow = DataDummy.generateTvShowDummy()[0]
    private val movieId = dummyMovie.movieId
    private val tvId = dummyTvShow.tvId

    @Before
    fun setUp() {
        viewModel = DetailViewModel()
        viewModel.selectedMovie(movieId)
        viewModel.selectedTvShow(tvId)
    }


    @Test
    fun getMovie() {
        viewModel.selectedMovie(dummyMovie.movieId)
        val movieEntity = viewModel.getMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.movieId, movieEntity.movieId)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.image, movieEntity.image)
        assertEquals(dummyMovie.category, movieEntity.category)
        assertEquals(dummyMovie.creator, movieEntity.creator)
        assertEquals(dummyMovie.date, movieEntity.date)
        assertEquals(dummyMovie.duration, movieEntity.duration)
        assertEquals(dummyMovie.score, movieEntity.score)
        assertEquals(dummyMovie.description, movieEntity.description)


    }

    @Test
    fun getTvShow() {
        viewModel.selectedTvShow(tvId)
        val tvEntity = viewModel.getTvShow()
        assertNotNull(tvEntity)
        assertEquals(dummyTvShow.tvId, tvEntity.tvId)
        assertEquals(dummyTvShow.title, tvEntity.title)
        assertEquals(dummyTvShow.image, tvEntity.image)
        assertEquals(dummyTvShow.Duration, tvEntity.Duration)
        assertEquals(dummyTvShow.category, tvEntity.category)
        assertEquals(dummyTvShow.description, tvEntity.description)
        assertEquals(dummyTvShow.creator, tvEntity.creator)
        assertEquals(dummyTvShow.score, tvEntity.score)
        assertEquals(dummyTvShow.date, tvEntity.date)

    }

}