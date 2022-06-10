package com.example.tdd.domain;

public class Bank {

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    int rate(String from, String to){
        int rate = (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
        return rate;
    }

    public void addRate(String chf, String usd, int i) {
    }
}
