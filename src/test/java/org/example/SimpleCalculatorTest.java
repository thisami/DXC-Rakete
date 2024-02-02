package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void multiplyTest() {
        assertEquals(0, SimpleCalculator.multiply(0, 5));
        assertEquals(0, SimpleCalculator.multiply(7, 0));

    }

    @Test
    void divideTest() {
    }
}