package com.example.tdd.domain;

import java.util.Objects;

public abstract class Money {
    protected int amount;
    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return  amount == money.amount &&
                getClass().equals(money.getClass());
    }
}
