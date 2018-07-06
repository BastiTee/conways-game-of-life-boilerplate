package com.acme.jvm;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test suite for the {@link MainJava} component.
 */
public class MainJavaTest {

    /**
     * A sample test to validate the overall setup.
     */
    @Test
    public void testObjectCreation() {
        MainJava mj = new MainJava();
        Assert.assertNotNull(mj);
    }
}