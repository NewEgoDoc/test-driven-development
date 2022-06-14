package com.example.tdd.pattern;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestPattern {

    @Test
    public void testsocket(){

        assertTrue(reader.isClosed());
        assertEquals("abc", reply.contents());
    }
}
