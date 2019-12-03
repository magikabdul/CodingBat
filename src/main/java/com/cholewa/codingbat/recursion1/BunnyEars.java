package com.cholewa.codingbat.recursion1;

public class BunnyEars {
    public int count(int numberOfBunnies) {
        if (numberOfBunnies == 0) return 0;
        else return 2 + count(numberOfBunnies - 1);
    }
}
