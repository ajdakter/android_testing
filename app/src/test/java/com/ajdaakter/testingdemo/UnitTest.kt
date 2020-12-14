package com.ajdaakter.testingdemo

import org.junit.*
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class UnitTest {

    private var calculator: Calculator? = Calculator()

    @Before
    fun setUp() {
        println("Before notation run")
    }

    @Test
    fun testAdd() {
        assertEquals("Calculator is not adding correctly", 7, calculator!!.add(3, 4, 0))
        println("Test add function")

    }

    @Test
    fun testSub() {
        assertEquals("Calculator is not adding correctly", 1, calculator!!.sub(8, 4, 5, 0))
        println("Test sub function")

    }

    @After
    fun tearDown() {
        println("After notation run")
    }
}