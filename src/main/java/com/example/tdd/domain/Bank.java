package com.example.tdd.domain;

public class Bank {

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String chf, String usd, int i) {
    }
}
