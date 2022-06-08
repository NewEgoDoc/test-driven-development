package com.example.tdd.domain;

import java.util.Objects;

public abstract class Money {
    protected int amount;
    protected String currency;

    public static Money dollar(int i) {
        return null;
    }

    public static Money franc(int i) {
        return null;
    }

    abstract Money times(int multiplier);
    abstract String currency();

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return  amount == money.amount &&
                getClass().equals(money.getClass());
    }
}
