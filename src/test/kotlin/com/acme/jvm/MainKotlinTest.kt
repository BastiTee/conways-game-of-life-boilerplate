package com.acme.jvm

import org.junit.Assert
import org.junit.Test

/**
 * A test suite to fool around with Kotlin's language features
 *
 * https://kotlinlang.org/docs/reference/basic-syntax.html
 * https://kotlinlang.org/docs/reference/idioms.html
 *
 */
class MainKotlinTest {

    // -------------- Immutability

    @Test
    fun variableInitialization() {
        val immutable = 12
        var mutable = 12
        mutable++

        Assert.assertEquals(12, immutable)
        Assert.assertEquals(13, mutable)
    }

    @Test
    fun stringTemplates() {
        val value = 12
        val nullValue = null
        println("My value is $value and a null looks like this: $nullValue")
    }

    // -------------- Nullables

    private fun addWithNullables(sum1: Int?, sum2: Int): Int? {
        if (sum1 == null) {
            return null
        }
        return sum1 + sum2
    }

    @Test
    fun testAddWithNullables() {
        Assert.assertEquals(14, addWithNullables(10, 4))
        Assert.assertNull(addWithNullables(null, 10))
        // Assert.assertNull(addWithNullables(10, null)) => Compiler error
    }

    // -------------- Switches

    private fun describe(obj: Any?): String {
        return when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            null -> "Null"
            !is String -> "Not a string"
            else -> "Unknown"
        }
    }

    @Test
    fun testDescribe() {
        Assert.assertEquals("Null", describe(null))
        Assert.assertEquals("One", describe(1))
    }

    // -------------- Data classes

    data class Customer(val firstname: String = "John", val lastname: String = "Doe")

    @Test
    fun testDataClassIdiom() {
        val c = Customer()
        Assert.assertEquals("John", c.firstname)
        Assert.assertEquals("Doe", c.lastname)
        val c2 = Customer("Jane")
        Assert.assertEquals("Jane", c2.firstname)
        Assert.assertEquals("Doe", c2.lastname)
        Assert.assertNotEquals(c, c2)
    }

    @Test
    fun forLoopTest() {
        for (i in 1..100) {
            Assert.assertTrue("Lower bound check failed: $i", i > 0)
            Assert.assertTrue("Upper bound check failed: $i", i < 101)
        }
    }

    // ------------ Nullable execution

    @Test
    fun conditionalCallsIfNull() {
        var variable: String? = null
        variable?.let {
            Assert.fail("Should not have been called")
        }
        variable = "something"
        variable?.let {
            return
        }
        Assert.fail("Function should have returned already")
    }

    // -------------- Extension functions

    private fun String.translateOsToAs(): String {
        return this.replace("o", "a")
    }

    @Test
    fun testExtensionFunctions() {
        val replacedString = "John Doe".translateOsToAs()
        Assert.assertEquals("Jahn Dae", replacedString)
    }

}