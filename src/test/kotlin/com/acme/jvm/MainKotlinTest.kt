package com.acme.jvm

import org.junit.Assert
import org.junit.Test
import kotlin.test.assertNotNull

/**
 * Test suite for the {@link MainKotlin} component.
 */
class MainKotlinTest() {

    /**
     * A sample test to validate the overall setup.
     */
    @Test
    fun testObjectCreation() {
        val mk = MainKotlin()
        Assert.assertNotNull(mk) // JUnit assertion
        assertNotNull(mk) // Kotlin assertion
    }
}
