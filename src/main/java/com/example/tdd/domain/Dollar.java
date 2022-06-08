package com.example.tdd.domain;

import java.util.Objects;

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
