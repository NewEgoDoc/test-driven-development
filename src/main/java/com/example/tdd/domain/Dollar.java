package com.example.tdd.domain;

import java.util.Objects;

public class Dollar extends Money{

    public Dollar(int amount, String currency) {
        super(amount,currency);
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount,"USD");
    }

    @Override
    String currency() {
        return currency;
    }
}
