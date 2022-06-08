package com.example.tdd.domain;

import java.util.Objects;

public abstract class Money {
    protected int amount;
    protected String currency;

    public static Money dollar(int i) {
        return null;
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    abstract Money times(int multiplier);

    String currency(){
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return  amount == money.amount &&
                getClass().equals(money.getClass());
    }
}
