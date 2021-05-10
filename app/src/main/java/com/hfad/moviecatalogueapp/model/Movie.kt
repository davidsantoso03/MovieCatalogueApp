package com.hfad.moviecatalogueapp.model

data class Movie(
        var movieId: String,
        var title:String,
        var description:String,
        var image:String,
        var date: String,
        var category: String,
        var score: String,
        var creator: String,
        var duration:String
)
