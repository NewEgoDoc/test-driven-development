package com.example.tdd.domain;

import java.util.Objects;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount,currency);
    }

    public static Franc franc(int amount) {
        return new Franc(amount, null);
    }

    @Override
    String currency() {
        return currency;
    }
}
