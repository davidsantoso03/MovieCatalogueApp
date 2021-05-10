package com.hfad.moviecatalogueapp.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.hfad.moviecatalogueapp.R
import com.hfad.moviecatalogueapp.utils.DataDummy
import org.junit.Rule
import org.junit.Test


class MainActivityTest {
    private val dummyMovie = DataDummy.generateMovieDummy()
    private val dummyTvShow = DataDummy.generateTvShowDummy()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun loadMovie(){
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadMovieDetail(){
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(1,click()))
        onView(withId(R.id.tv_item_name)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_name)).check(matches(withText(dummyMovie[1].title)))
        onView(withId(R.id.tv_Item_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_Item_duration)).check(matches(withText(dummyMovie[1].duration)))
        onView(withId(R.id.tv_category)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_category)).check(matches(withText(dummyMovie[1].category)))
        onView(withId(R.id.tv_item_desc)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_desc)).check(matches(withText(dummyMovie[1].description)))
        onView(withId(R.id.tv_item_date)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_date)).check(matches(withText(dummyMovie[1].date)))
        onView(withId(R.id.tv_Item_creator)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_Item_creator)).check(matches(withText(dummyMovie[1].creator)))
        onView(withId(R.id.tv_Item_score)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_Item_score)).check(matches(withText(dummyMovie[1].score)))



    }
    @Test
    fun loadTvShow(){
        onView(withText("TVSHOW")).perform(click())
        onView(withId(R.id.rv_tvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadTvShowDetail(){
        onView(withText("TVSHOW")).perform(click())
        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(1,click()))
        onView(withId(R.id.tv_item_name)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_name)).check(matches(withText(dummyTvShow[1].title)))
        onView(withId(R.id.tv_Item_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_Item_duration)).check(matches(withText(dummyTvShow[1].Duration)))
        onView(withId(R.id.tv_category)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_category)).check(matches(withText(dummyTvShow[1].category)))
        onView(withId(R.id.tv_item_desc)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_desc)).check(matches(withText(dummyTvShow[1].description)))
        onView(withId(R.id.tv_item_date)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_item_date)).check(matches(withText(dummyTvShow[1].date)))
        onView(withId(R.id.tv_Item_creator)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_Item_creator)).check(matches(withText(dummyTvShow[1].creator)))
        onView(withId(R.id.tv_Item_score)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_Item_score)).check(matches(withText(dummyTvShow[1].score)))
    }

}