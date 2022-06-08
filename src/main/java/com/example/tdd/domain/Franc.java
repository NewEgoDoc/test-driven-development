package com.example.tdd.domain;

import java.util.Objects;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
