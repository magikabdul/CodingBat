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
}
