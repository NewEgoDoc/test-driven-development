package com.example.tdd.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testMultiplication(){
        Money five = Dollar.dollar(5);
        assertEquals(Dollar.dollar(10), five.times(2));
        assertEquals(Dollar.dollar(15),five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(Dollar.dollar(5).equals(Dollar.dollar(5)));
        assertFalse(Dollar.dollar(5).equals(Dollar.dollar(6)));

        assertFalse( Franc.franc(5).equals(Dollar.dollar(5)));
    }

    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testDifferentClassEquality(){
        assertTrue(new Money(10,"CHF").equals(
                new Franc(10,"CHF")));
    }

    @Test
    public void testSimpleAddition(){
        Money sum = Money.dollar(5).plus(Money.dollar(5));
    }
}
