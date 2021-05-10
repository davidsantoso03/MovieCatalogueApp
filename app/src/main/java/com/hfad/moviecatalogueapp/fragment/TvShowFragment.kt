package com.hfad.moviecatalogueapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.moviecatalogueapp.adapter.TvShowAdapter
import com.hfad.moviecatalogueapp.databinding.TvshowFragmentBinding
import com.hfad.moviecatalogueapp.viewmodel.TvShowViewModel

class TvShowFragment : Fragment() {

    private lateinit var fragmentBinding: TvshowFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentBinding = TvshowFragmentBinding.inflate(inflater, container, false)
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[TvShowViewModel::class.java]
            val tvs = viewModel.getTvShow()


            val tvShowAdapter = TvShowAdapter()
            tvShowAdapter.setTvShow(tvs)

            with(fragmentBinding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvShowAdapter
            }
        }
    }

}