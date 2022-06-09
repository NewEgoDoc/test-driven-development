package com.example.tdd.domain;

public class Bank {

    public Money reduce(Expression source, String to) {
        Sum sum = (Sum) source;
        return source.reduce(to);
    }
}
