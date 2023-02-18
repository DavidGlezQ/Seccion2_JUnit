package com.davidgllez.seccion2junit

import org.junit.Assert.*
import org.junit.Test

/**
 * Created by davidgonzalez on 18/02/23
 */
class AssertionsTest {
    @Test
    fun getArrayTest() {
        val assertions = Assertions()
        val array = arrayOf(21, 777) //valor esperado
        assertArrayEquals(array, assertions.getLuckyNumber())
    }
}