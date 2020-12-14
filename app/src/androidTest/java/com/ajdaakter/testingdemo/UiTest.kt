package com.ajdaakter.testingdemo

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class UiTest {

    @Rule
    @JvmField
    val rule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.ajdaakter.testingdemo", appContext.packageName)
    }

    @Test
    fun testAddition() {
        onView(withId(R.id.etxt_base_number))
            .perform(ViewActions.typeText("10"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.etxt_number))
            .perform(ViewActions.typeText("5"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.btn_add)).perform(ViewActions.click())
        onView(withId(R.id.txt_result))
            .check(ViewAssertions.matches(ViewMatchers.withText("15")))
        onView(withId(R.id.btn_add)).perform(ViewActions.doubleClick())
        onView(withId(R.id.txt_result))
            .check(ViewAssertions.matches(ViewMatchers.withText("25")))
        onView(withId(R.id.btn_add)).perform(ViewActions.longClick())
        onView(withId(R.id.txt_result))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testSubstruction() {
        onView(withId(R.id.etxt_base_number))
            .perform(ViewActions.typeText("20"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.etxt_number))
            .perform(ViewActions.typeText("8"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.btn_sub)).perform(ViewActions.click())
        onView(withId(R.id.txt_result))
            .check(ViewAssertions.matches(ViewMatchers.withText("12")))
        onView(withId(R.id.btn_sub)).perform(ViewActions.longClick())
        onView(withId(R.id.txt_result))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testClear() {
        onView(withId(R.id.btn_clear)).perform(ViewActions.click())
        onView(withId(R.id.txt_result))
            .check(ViewAssertions.matches(ViewMatchers.withText("0")))
        onView(withId(R.id.btn_clear)).perform(ViewActions.longClick())
        onView(withId(R.id.txt_result))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testRating() {
        onView(withId(R.id.ratingBar)).perform(ViewActions.click())
    }
}