package com.wizeline.androidbootcamplivesessions

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
  @get:Rule val activityRule = ActivityScenarioRule(MainActivity::class.java)

  @Test fun activityIsLoaded() {
    // onView(withText("Hello world")).check(matches(isDisplayed()))
    // Thread.sleep(2000)


    onView(withId(R.id.primaryButton)).check(matches(withText("CLICK ME")))
    onView(withId(R.id.primaryButton)).perform(click())
    onView(withId(R.id.messageTextView)).check(matches(withText("Loading.....")))
  }
}