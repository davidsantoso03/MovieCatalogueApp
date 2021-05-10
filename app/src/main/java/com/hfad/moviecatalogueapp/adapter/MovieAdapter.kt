package com.hfad.moviecatalogueapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hfad.moviecatalogueapp.R
import com.hfad.moviecatalogueapp.databinding.ItemsMovieListBinding
import com.hfad.moviecatalogueapp.model.Movie
import com.hfad.moviecatalogueapp.ui.DetailActivity

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private val listMovies = ArrayList<Movie>()

    fun setMovie(movies: List<Movie>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsMovieListBinding =
            ItemsMovieListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsMovieListBinding)
    }

    inner class MovieViewHolder(private val binding: ItemsMovieListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie) {
            with(binding) {
                tvMovieTitle.text = movie.title
                tvMovieCategory.text = movie.category
                tvMovieDuration.text = movie.duration
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_MOVIE, movie.movieId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(movie.image)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(imgMovie)
            }
        }
    }

    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
        val mov = listMovies[position]
        holder.bind(mov)
    }

    override fun getItemCount(): Int = listMovies.size
}