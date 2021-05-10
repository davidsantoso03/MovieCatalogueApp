package com.hfad.moviecatalogueapp.viewmodel

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest{

    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setUp(){
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTvShow(){
        val  tvEntities = viewModel.getTvShow()
        assertNotNull(tvEntities)
        assertEquals(15, tvEntities.size)
    }
}