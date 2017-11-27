package com.cholewa.codingbat.string1;

import org.junit.Assert;
import org.junit.Test;

public class StringOneTestSuite {

    @Test
    public void testHelloName() {
        //Given
        StringOne stringOne = new StringOne();

        //When
        String result1 = stringOne.helloName("Bob");
        String result2 = stringOne.helloName("Alice");
        String result3 = stringOne.helloName("X");
        String result4 = stringOne.helloName("");

        //Then
        Assert.assertEquals("Hello Bob!", result1);
        Assert.assertEquals("Hello Alice!", result2);
        Assert.assertEquals("Hello X!", result3);
        Assert.assertEquals("Hello !", result4);
    }

    @Test
    public void testHasBad() {
        //Given
        StringOne stringOne = new StringOne();

        //When
        boolean result1 = stringOne.hasBad("badxx");
        boolean result2 = stringOne.hasBad("xbadxx");
        boolean result3 = stringOne.hasBad("xxbadxx");
        boolean result4 = stringOne.hasBad("");
        boolean result5 = stringOne.hasBad("xba");
        boolean result6 = stringOne.hasBad("bad");

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
        Assert.assertFalse(result4);
        Assert.assertFalse(result5);
        Assert.assertTrue(result6);
    }

    @Test
    public void testStartWord() {
        //Given
        StringOne stringOne = new StringOne();

        //When
        String result1 = stringOne.startWord("hippo", "hi");
        String result2 = stringOne.startWord("hippo", "xip");
        String result3 = stringOne.startWord("hippo", "i");
        String result4 = stringOne.startWord("", "a");


        //Then
        Assert.assertEquals("hi", result1);
        Assert.assertEquals("hip", result2);
        Assert.assertEquals("h", result3);
        Assert.assertEquals("", result4);
    }
}
