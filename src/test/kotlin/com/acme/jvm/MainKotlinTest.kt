package com.acme.jvm

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
        assertNotNull(mk)
    }
}