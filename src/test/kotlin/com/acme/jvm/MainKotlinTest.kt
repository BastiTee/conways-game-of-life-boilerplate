package com.acme.jvm

import org.junit.Assert
import org.junit.Test

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
        Assert.assertNotNull(mk)
    }
}