package com.davidgllez.seccion2junit

import junit.framework.Assert.assertEquals
import org.junit.*
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

/**
 * Created by davidgonzalez on 18/02/23
 */
@RunWith(value = Parameterized::class)
class ParameterizedTest(var currentValue: Boolean, var currentUser: User) {

    @get:Rule
    val locationESRule = LocationESRule()

    companion object {
        var assertions: Assertions? = null

        @BeforeClass @JvmStatic
        fun setUpCommon() {
            assertions = Assertions()
        }

        @AfterClass @JvmStatic
        fun tearDownCommon() {
            assertions = null
        }

        @Parameterized.Parameters @JvmStatic
        /*fun getUserUS() = arrayOf(
            arrayOf(false, User("Pedro", 12)),
            arrayOf(true, User("Gis", 22)),
            arrayOf(true, User("bot21", 4, false)),
            arrayOf(false, User("Alex", 18)))*/

        fun getUserES() = arrayOf(
            arrayOf(true, User("Pedro", 19)),
            arrayOf(false, User("Gis", 14)),
            arrayOf(true, User("bot21", 4, false)),
            arrayOf(true, User("Alex", 18)))
    }

    @Test
    fun isAdultTest() {
        //assertEquals(currentValue, assertions?.isAdult(currentUser))
        assertEquals(currentValue, locationESRule?.assertions?.isAdult(currentUser))
    }
}