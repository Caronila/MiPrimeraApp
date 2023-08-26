package com.curso.android.app.practica.compara_textos

import androidx.core.content.MimeTypeFilter.matches
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    class ActivityTestRule(activityClass: Class<MainActivity>) {

    }

    @Test
    fun testTextComparisonUI() {
        onView(withId(R.id.editText1)).perform(typeText("hello"))
        onView(withId(R.id.editText2)).perform(typeText("hello"))
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("Los textos son iguales")))
    }
}
