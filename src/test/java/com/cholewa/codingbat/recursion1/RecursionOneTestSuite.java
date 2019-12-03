package com.cholewa.codingbat.recursion1;

import org.junit.Assert;
import org.junit.Test;

public class RecursionOneTestSuite {

//    Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
    @Test
    public void testFactorial() {
        //Given
        Factorial factorial = new Factorial();

        //When
        Assert.assertEquals(1, factorial.of(1));
        Assert.assertEquals(2, factorial.of(2));
        Assert.assertEquals(6, factorial.of(3));
        Assert.assertEquals(24, factorial.of(4));
        Assert.assertEquals(120, factorial.of(5));
    }

    //We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    //
    //
    //bunnyEars(0) → 0
    //bunnyEars(1) → 2
    //bunnyEars(2) → 4

    @Test
    public void testBunnyEars() {
        //Given
        BunnyEars bunnyEars = new BunnyEars();

        //When
        Assert.assertEquals(0, bunnyEars.count(0));
        Assert.assertEquals(2, bunnyEars.count(1));
        Assert.assertEquals(4, bunnyEars.count(2));
        Assert.assertEquals(6, bunnyEars.count(3));
    }
}
