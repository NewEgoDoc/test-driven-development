package com.example.tdd.domain;

import java.util.Objects;

public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount,"USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    Money times(int multiplier) {
        return null;
    }

    String currency(){
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return  amount == money.amount &&
                getClass().equals(money.getClass());
    }

    @Override
    public String toString() {
        return amount + " " +currency;
    }
}
