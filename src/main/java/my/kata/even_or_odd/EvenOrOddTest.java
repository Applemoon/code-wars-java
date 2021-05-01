package main.java.my.kata.even_or_odd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        assertEquals("Even", EvenOrOdd.even_or_odd(6));
        assertEquals("Odd", EvenOrOdd.even_or_odd(7));
        assertEquals("Even", EvenOrOdd.even_or_odd(10));
        assertEquals("Odd", EvenOrOdd.even_or_odd(17));
        assertEquals("Even", EvenOrOdd.even_or_odd(-6));
        assertEquals("Odd", EvenOrOdd.even_or_odd(-7));
        assertEquals("Even", EvenOrOdd.even_or_odd(0));
    }
}