package com.hfad.moviecatalogueapp.viewmodel

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull

import org.junit.Before
import org.junit.Test

class MovieViewModelTest {

    private lateinit var viewModel: MovieViewModel

    @Before
    fun setUp(){
        viewModel = MovieViewModel()
    }

    @Test
    fun getMovie(){
        val movieEntities = viewModel.getMovie()
        assertNotNull(movieEntities)
        assertEquals(15 ,  movieEntities.size)
    }

}