package com.example.tdd.domain;

import java.util.Objects;

public class Franc extends Money{
    public Franc(int amount) {
        this.amount = amount;
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
