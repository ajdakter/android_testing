package com.ajdaakter.testingdemo

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.launchActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class IntegrationTest {

    @Test
    fun testEventCreated() {
        val scenario = launchActivity<MainActivity>()
        scenario.moveToState(Lifecycle.State.CREATED)
    }
    @Test
    fun testEventStarted() {
        val scenario = launchActivity<MainActivity>()
        scenario.moveToState(Lifecycle.State.STARTED)
    }
    @Test
    fun testEventResumed() {
        val scenario = launchActivity<MainActivity>()
        scenario.moveToState(Lifecycle.State.RESUMED)
    }
    @Test
    fun testEventDestroyed() {
        val scenario = launchActivity<MainActivity>()
        scenario.moveToState(Lifecycle.State.DESTROYED)
    }

    @Test
    fun testEventRecreate() {
        val scenario = launchActivity<MainActivity>()
        scenario.recreate()
    }
}