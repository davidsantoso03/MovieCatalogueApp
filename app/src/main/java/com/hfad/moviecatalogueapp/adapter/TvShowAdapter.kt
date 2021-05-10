package com.hfad.moviecatalogueapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hfad.moviecatalogueapp.R
import com.hfad.moviecatalogueapp.databinding.ItemsTvshowListBinding
import com.hfad.moviecatalogueapp.model.Tvshow
import com.hfad.moviecatalogueapp.ui.DetailActivity

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvViewHolder>() {

    private var listTvShow = ArrayList<Tvshow>()

    fun setTvShow(tvs: List<Tvshow>?) {
        if (tvs == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(tvs)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowAdapter.TvViewHolder {
        val itemsTvShowListBinding =
            ItemsTvshowListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvViewHolder(itemsTvShowListBinding)
    }

    override fun onBindViewHolder(holder: TvShowAdapter.TvViewHolder, position: Int) {
        val tv = listTvShow[position]
        holder.bind(tv)
    }

    override fun getItemCount(): Int = listTvShow.size


    inner class TvViewHolder(private val binding: ItemsTvshowListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tv: Tvshow) {
            with(binding) {
                tvTvShowTitle.text = tv.title
                tvTvShowCategory.text = tv.category
                tvTvShowDuration.text = tv.Duration
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_TV, tv.tvId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(tv.image)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(imgTvShow)
            }
        }


    }

}