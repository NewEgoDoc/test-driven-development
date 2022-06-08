package com.example.tdd.domain;

import java.util.Objects;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount,currency);
    }

    public static Franc franc(int amount) {
        return new Franc(amount, null);
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier,currency);
    }

    @Override
    String currency() {
        return currency;
    }
}
