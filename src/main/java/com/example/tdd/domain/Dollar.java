package com.example.tdd.domain;

import java.util.Objects;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        this.amount *= multiplier;
    }
}
