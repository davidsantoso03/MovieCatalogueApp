package com.hfad.moviecatalogueapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hfad.moviecatalogueapp.adapter.SectionPagerAdapter
import com.hfad.moviecatalogueapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val sectionPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        activityMainBinding.pager.adapter = sectionPagerAdapter
        activityMainBinding.tabLayout.setupWithViewPager(activityMainBinding.pager)

        supportActionBar?.elevation = 0f

    }

}