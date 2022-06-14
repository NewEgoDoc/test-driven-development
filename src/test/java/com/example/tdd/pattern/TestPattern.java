package com.example.tdd.pattern;


import com.example.tdd.domain.Bank;
import com.example.tdd.domain.Money;
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

    @Test
    public void testClearData(){
        Bank bank = new Bank();
        bank.addRate("USD", "GBP", 2);
        bank.commission(0.015);
        Money result = bank.convert(new Note(100, "USD"), "GBP");
        assertEquals(new Note(100/2*(1-0.015), "GBP"), result);
    }
}
