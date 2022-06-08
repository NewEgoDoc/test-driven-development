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

        assertTrue( Franc.franc(5).equals( Franc.franc(5)));
        assertFalse( Franc.franc(5).equals( Franc.franc(6)));

        assertFalse( Franc.franc(5).equals(Dollar.dollar(5)));
    }

    @Test
    public void testFrancMultiplication(){
        Franc five = Franc.franc(5);
        assertEquals( Franc.franc(10), five.times(2));
        assertEquals( Franc.franc(15), five.times(3));
    }

}
