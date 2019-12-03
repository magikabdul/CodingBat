package com.cholewa.codingbat.recursion1;

public class Factorial {

    public int of(int value) {
        if (value == 1) return 1;
        else return value * of(value - 1);
    }
}
