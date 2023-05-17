package com.ada.testewithexpresso

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    @get: Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)


    val LIST_POSITION = 14

    @Test
    fun testRecyclerViewItemClick() {
        Thread.sleep(5000)
        onView(ViewMatchers.withId(R.id.rv_characters)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                LIST_POSITION,
                ViewActions.click()
            )
        )
    }

    @Test
    fun testRecyclerScrollToPosition() {
        onView(ViewMatchers.withId(R.id.rv_characters))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(LIST_POSITION))
    }
}






