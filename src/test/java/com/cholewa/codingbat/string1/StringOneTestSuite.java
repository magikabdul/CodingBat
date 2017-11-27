package com.cholewa.codingbat.string1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringOneTestSuite {
    private StringOne stringOne;

    @Before
    public void before() {
        stringOne = new StringOne();
    }

    @Test
    public void testHelloName() {
        //Given

        //When
        String result1 = stringOne.helloName("Bob");
        String result2 = stringOne.helloName("Alice");
        String result3 = stringOne.helloName("X");

        //Then
        Assert.assertEquals("Hello Bob!", result1);
        Assert.assertEquals("Hello Alice!", result2);
        Assert.assertEquals("X!", result3);
    }
}
