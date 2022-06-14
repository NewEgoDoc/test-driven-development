package com.example.tdd.pattern;


import org.apache.catalina.Server;
import org.apache.tomcat.jni.Buffer;
import org.junit.jupiter.api.Test;

import java.net.Socket;

import static org.junit.jupiter.api.Assertions.*;
public class TestPattern {

    @Test
    public void testsocket(){
        Server writer = Server(defaultPort(), "abc");
        Socket reader = Socket("localhost", defaultPort());
        Buffer reply = reader.contents();

        assertTrue(reader.isClosed());
        assertEquals("abc", reply.contents());
    }
}
