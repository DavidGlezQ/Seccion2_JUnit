package com.davidgllez.seccion2junit

import org.junit.*
import org.junit.Assert.*

/**
 * Created by davidgonzalez on 18/02/23
 */
class AssertionsUserAdultTest {

    private lateinit var bot: User
    private lateinit var juan: User

    @get:Rule val locationESRule = LocationESRule()

    @Before
    fun setUp() {
        bot = User("8bit", 999, false)
        juan = User("Juan", 18, true)
    }

    @After
    fun tearDown() {
        bot = User()
    }

    @Test
    fun isAdultTest() {
        /*val assertions = Assertions()
        assertions.setLocation("ES")
        assertTrue(assertions.isAdult(juan))
        assertTrue(assertions.isAdult(bot))*/
        assertEquals(true,locationESRule.assertions?.isAdult(juan))
        assertEquals(true,locationESRule.assertions?.isAdult(bot))
    }
}