package com.hfad.moviecatalogueapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.hfad.moviecatalogueapp.R
import com.hfad.moviecatalogueapp.databinding.ActivityDetailBinding
import com.hfad.moviecatalogueapp.model.Movie
import com.hfad.moviecatalogueapp.model.Tvshow
import com.hfad.moviecatalogueapp.utils.DataDummy
import com.hfad.moviecatalogueapp.viewmodel.DetailViewModel

class DetailActivity : AppCompatActivity() {
    private lateinit var detailBinding: ActivityDetailBinding

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_TV = "extra_tv"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getString(EXTRA_MOVIE)
            if (movieId != null) {
                viewModel.selectedMovie(movieId)
                for (movie in DataDummy.generateMovieDummy()) {
                    if (movie.movieId == movieId) {
                        retrieveMovie(viewModel.getMovie())
                    }
                }
            }
            val tvId = extras.getString(EXTRA_TV)
            if (tvId != null) {
                viewModel.selectedTvShow(tvId)
                for (Tvshow in DataDummy.generateTvShowDummy()) {
                    if (Tvshow.tvId == tvId) {
                        retrieveTvShow(viewModel.getTvShow())
                    }
                }
            }
        }
    }

    private fun retrieveTvShow(tvShow: Tvshow) {
        Glide.with(this)
            .load(tvShow.image)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error)
            )
            .into(detailBinding.imgItem)
        detailBinding.tvItemName.text = tvShow.title
        detailBinding.tvItemDesc.text = tvShow.description
        detailBinding.tvCategory.text = tvShow.category
        detailBinding.tvItemCreator.text = tvShow.creator
        detailBinding.tvItemDuration.text = tvShow.Duration
        detailBinding.tvItemDate.text = tvShow.date
        detailBinding.tvItemScore.text = tvShow.score
        supportActionBar?.title = tvShow.title
    }

    private fun retrieveMovie(movie: Movie) {
        Glide.with(this)
            .load(movie.image)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error)
            )
            .into(detailBinding.imgItem)
        detailBinding.tvItemName.text = movie.title
        detailBinding.tvItemDesc.text = movie.description
        detailBinding.tvCategory.text = movie.category
        detailBinding.tvItemCreator.text = movie.creator
        detailBinding.tvItemDuration.text = movie.duration
        detailBinding.tvItemDate.text = movie.date
        detailBinding.tvItemScore.text = movie.score
        supportActionBar?.title = movie.title

    }
}