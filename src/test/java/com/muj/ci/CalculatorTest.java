package com.muj.ci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    void testSubtract() {
        Calculator c = new Calculator();
        assertEquals(1, c.subtract(3, 2));
    }
}
