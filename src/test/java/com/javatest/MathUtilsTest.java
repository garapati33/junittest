package com.javatest; // Same package as MathUtils

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setUp() {
        System.out.println("Setting up...");
        mathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down...");
    }

    @Test
    public void testAdd() {
        assertEquals(4, mathUtils.add(2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, mathUtils.subtract(4, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(8, mathUtils.multiply(4, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(4, 2), 0);
    }

    @Test
    public void testDivideByZero() {
        assertEquals(-1.0, mathUtils.divide(4, 0), 0);
    }
}
