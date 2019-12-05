package com.cholewa.codingbat.recursion1;

public class BunnyEars2 {


    public int count(int numberOfBunnies) {
        if (numberOfBunnies == 1) return 1;
        else if (numberOfBunnies % 2 == 0) return 3 + count(numberOfBunnies = 1);
        else return 2 + count(numberOfBunnies - 1);
    }
}
