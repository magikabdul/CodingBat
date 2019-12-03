package com.cholewa.codingbat.recursion1;

public class Fibonacci {

    public int calculate(int value) {
        if (value <= 1) return value;
        return calculate(value - 1) + calculate(value - 2);
    }
}
