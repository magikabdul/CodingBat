package coding.bat.string.one;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringOneTestSuite {
    private StringOne one;

    @Before
    public void before() {
        one = new StringOne();
    }

    @Test
    public void testHelloName() {
        //When
        String result1 = one.helloName("Bob");
        String result2 = one.helloName("Alice");
        String result3 = one.helloName("X");

        //Then
        Assert.assertEquals("Hello Bob!", result1);
        Assert.assertEquals("Hello Alice!", result2);
        Assert.assertEquals("Hello X!", result3);
    }

    @Test
    public void testMakeAbba() {
        //When
        String result1 = one.makeAbba("Hi", "Bye");
        String result2 = one.makeAbba("Yo", "Alice");
        String result3 = one.makeAbba("What", "Up");

        //Then
        Assert.assertEquals("HiByeByeHi", result1);
        Assert.assertEquals("YoAliceAliceYo", result2);
        Assert.assertEquals("WhatUpUpWhat", result3);
    }

    @Test
    public void testMakeTags() {
        //When
        String result1 = one.makeTags("i", "Yay");
        String result2 = one.makeTags("i", "Hello");
        String result3 = one.makeTags("cite", "Yay");

        //Then
        Assert.assertEquals("<i>Yay</i>", result1);
        Assert.assertEquals("<i>Hello</i>", result2);
        Assert.assertEquals("<cite>Yay</cite>", result3);
    }

    @Test
    public void testMakeOutWord() {
        //When
        String result1 = one.makeOutWord("<<>>", "Yay");
        String result2 = one.makeOutWord("<<>>", "WooHoo");
        String result3 = one.makeOutWord("[[]]", "word");

        //Then
        Assert.assertEquals("<<Yay>>", result1);
        Assert.assertEquals("<<WooHoo>>", result2);
        Assert.assertEquals("[[word]]", result3);
    }

    @Test
    public void testExtraEnd() {
        //When
        String result1 = one.extraEnd("Hello");
        String result2 = one.extraEnd("ab");
        String result3 = one.extraEnd("Hi");

        //Then
        Assert.assertEquals("lololo", result1);
        Assert.assertEquals("ababab", result2);
        Assert.assertEquals("HiHiHi", result3);
    }

    @Test
    public void testFirstTwo() {
        //When
        String result1 = one.firstTwo("Hello");
        String result2 = one.firstTwo("abcdefg");
        String result3 = one.firstTwo("abcdefg");

        //Then
        Assert.assertEquals("He", result1);
        Assert.assertEquals("ab", result2);
        Assert.assertEquals("ab", result3);
    }

    @Test
    public void testFirstHalf() {
        //When
        String result1 = one.firstHalf("WooHoo");
        String result2 = one.firstHalf("HelloThere");
        String result3 = one.firstHalf("abcdef");

        //Then
        Assert.assertEquals("Woo", result1);
        Assert.assertEquals("Hello", result2);
        Assert.assertEquals("abc", result3);
    }

    @Test
    public void testWithoutEnd() {
        //When
        String result1 = one.withoutEnd("Hello");
        String result2 = one.withoutEnd("java");
        String result3 = one.withoutEnd("coding");

        //Then
        Assert.assertEquals("ell", result1);
        Assert.assertEquals("av", result2);
        Assert.assertEquals("odin", result3);
    }

    @Test
    public void testComboString() {
        //When
        String result1 = one.comboString("Hello", "hi");
        String result2 = one.comboString("hi", "Hello");
        String result3 = one.comboString("aaa", "b");

        //Then
        Assert.assertEquals("hiHellohi", result1);
        Assert.assertEquals("hiHellohi", result2);
        Assert.assertEquals("baaab", result3);
    }

    @Test
    public void testNonStart() {
        //When
        String result1 = one.nonStart("Hello", "There");
        String result2 = one.nonStart("java", "code");
        String result3 = one.nonStart("shotl", "java");

        //Then
        Assert.assertEquals("ellohere", result1);
        Assert.assertEquals("avaode", result2);
        Assert.assertEquals("hotlava", result3);
    }

    @Test
    public void testLeft2() {
        //When
        String result1 = one.left2("Hello");
        String result2 = one.left2("java");
        String result3 = one.left2("Hi");

        //Then
        Assert.assertEquals("lloHe", result1);
        Assert.assertEquals("vaja", result2);
        Assert.assertEquals("Hi", result3);
    }

    @Test
    public void testRight2() {
        //When
        String result1 = one.right2("Hello");
        String result2 = one.right2("java");
        String result3 = one.right2("Hi");

        //Then
        Assert.assertEquals("loHel", result1);
        Assert.assertEquals("vaja", result2);
        Assert.assertEquals("Hi", result3);
    }
}
