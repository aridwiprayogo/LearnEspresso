package com.example.aridwiprayogo.learnespresso

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityEspresso {

    @Rule @JvmField
    val mActivityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun ensureTextChangeWork() {
        onView(withId(R.id.edt_text)).perform(typeText("HELLO"))
        onView(withId(R.id.btn_change_text)).perform(click())
        onView(withId(R.id.tv_printed_text)).check(matches(withText("Lalala")))
    }

    @Test
    fun ensureMoveActivityWithData() {
        onView(withId(R.id.edt_text)).perform(typeText("DicodingMenjadiAndroidDeveloperExpert"))
        onView(withId(R.id.btn_swicth_activity)).perform(click())
        onView(withId(R.id.tv_result_view)).check(matches(withText("DicodingMenjadiAndroidDeveloperExpert")))
    }
}