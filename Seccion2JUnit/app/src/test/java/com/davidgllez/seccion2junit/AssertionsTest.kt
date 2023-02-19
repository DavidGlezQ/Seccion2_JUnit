package com.davidgllez.seccion2junit

import org.junit.Assert.*
import org.junit.Test
import kotlin.random.Random

/**
 * Created by davidgonzalez on 18/02/23
 */
class AssertionsTest {
    @Test
    fun getArrayTest() {
        val assertions = Assertions()
        //val array = arrayOf(21, 777) //valor esperado
        val array = arrayOf(21, 77) //valor no esperado
        //Verfica que el array es igual al de la clase Assertions
        assertArrayEquals("Mensaje personalizado de error en testing",
            array, assertions.getLuckyNumber())
    }

    @Test
    fun getNameTest() {
        val assertions = Assertions()
        val name = "David"
        val otherName = "Alejandro"
        assertEquals(name, assertions.getName())
        assertNotEquals(otherName, assertions.getName())
    }

    @Test
    fun checkHumanTest() {
        val assertions = Assertions()
        val bot = User("8bit", 999, false)
        val juan = User("Juan", 18, true)
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
        //Nota: siempre es buena practica hacer lo contrario para hacer mas pruebas
        //assertFalse(assertions.checkHuman(juan))
        //assertTrue(assertions.checkHuman(bot))
    }

    @Test
    fun checkNullUserTest() {
        val assertions = Assertions()
        val user = null
        assertNull(user)
        assertNull(assertions.checkHuman(user))
    }

    @Test
    fun checkNotNullUserTest() {
        val user = User("David", 23, true)
        assertNotNull(user)
    }

    @Test
    fun checkNotSameUserTest() {
        val bot = User("8bit", 999, false)
        val juan = User("Juan", 18, true)
        assertNotSame(bot, juan)
    }

    @Test
    fun checkSameUserTest() {
        val bot = User("8bit", 999, false)
        val juan = User("8bit", 999, false)
        val copyJuan = juan
        assertSame(copyJuan, juan) //Misma referencia del objeto
    }

    @Test(timeout = 1_000)
    fun getCities() {
        val cities = arrayOf("Mexico", "Canada", "USA")
        //Thread.sleep(Random.nextLong(200, 1_100))
        Thread.sleep(Random.nextLong(950, 1_050))
        assertEquals(3, cities.size)
    }
}