package com.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testApp() {
        assertTrue(true);
    }

    @Test
    void testAddition() {
        assertEquals(10, 5 + 5);
    }

    @Test
    void testSubtraction() {
        assertEquals(5, 10 - 5);
    }

    @Test
    void testMultiplication() {
        assertEquals(20, 4 * 5);
    }

    @Test
    void testDivision() {
        assertEquals(5, 20 / 4);
    }
}
