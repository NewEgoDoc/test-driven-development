package com.example.tdd.pattern;


import org.apache.tomcat.jni.Buffer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestPattern {

    @Test
    public void testsocket(){

        Buffer reply = reader.contents();

        assertTrue(reader.isClosed());
        assertEquals("abc", reply.contents());
    }
}
