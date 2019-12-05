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

    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
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

    // The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
    // The first two values in the sequence are 0 and 1 (essentially 2 base cases).
    // Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
    // Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.
    //
    //fibonacci(0) → 0
    //fibonacci(1) → 1
    //fibonacci(2) → 1

    @Test
    public void testFibonacci() {
        //Given
        Fibonacci fibonacci = new Fibonacci();

        //When
        Assert.assertEquals(0, fibonacci.calculate(0));
        Assert.assertEquals(1, fibonacci.calculate(1));
        Assert.assertEquals(1, fibonacci.calculate(2));
        Assert.assertEquals(2, fibonacci.calculate(3));
        Assert.assertEquals(3, fibonacci.calculate(4));
        Assert.assertEquals(21, fibonacci.calculate(8));
    }

    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    // Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    //
    //bunnyEars2(0) → 0
    //bunnyEars2(1) → 2
    //bunnyEars2(2) → 5

    @Test
    public void testBunnyEars2() {
        //Given
        BunnyEars2 bunnyEars2 = new BunnyEars2();

        //When
        Assert.assertEquals(0, bunnyEars2.count(0));
        Assert.assertEquals(2, bunnyEars2.count(1));
        Assert.assertEquals(5, bunnyEars2.count(2));
        Assert.assertEquals(7, bunnyEars2.count(3));
        Assert.assertEquals(10, bunnyEars2.count(4));
//        Assert.assertEquals(21, bunnyEars2.count(8));
    }
}
