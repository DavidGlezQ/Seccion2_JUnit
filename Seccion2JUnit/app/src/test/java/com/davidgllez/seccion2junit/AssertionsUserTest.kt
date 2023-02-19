package com.davidgllez.seccion2junit

import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.*
import org.junit.Before
import org.junit.BeforeClass

import org.junit.Test

/**
 * Created by davidgonzalez on 18/02/23
 */
class AssertionsUserTest {

    private lateinit var bot: User

    companion object {
        private lateinit var juan: User
        @BeforeClass @JvmStatic
        fun setUpCommon() {
            juan = User("Juan", 18, true)
            println("BeforeClass")
        }

        @AfterClass @JvmStatic
        fun tearDownCommon() {
            juan = User()
            println("AfterClass")
        }
    }

    @Before
    fun setUp() {
        bot = User("8bit", 999, false)
        println("Before")
    }

    @After
    fun tearDown() {
        bot = User()
        println("After")
    }

    //Nota: por cada test se va a ejecutar una vez @Before y @After
    /*Nota: Ejecucion de las funciones:
    * 1.-Before Class siempre al inicio de la ejecucion
    * 2.-Before
    * 3.-El metodo
    * 4.-After
    * Asi hasta terminar todos los metodos, Before, fun y After
    * 5.-Termina con AfterClass*/

    /*Reglas:
    * */

    @Test
    fun checkHumanTest() {
        val assertions = Assertions()
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
        println("checkHumanTest")
    }

    @Test
    fun checkNotNullUserTest() {
        assertNotNull(juan)
        println("checkNotNullUserTest")
    }

    @Test
    fun checkNotSameUserTest() {
        assertNotSame(bot, juan)
        println("checkNotSameUser")

    }

    @Test
    fun checkSameUserTest() {
        val copyJuan = juan
        assertSame(copyJuan, juan)
        println("checkSameUser")
    }
}