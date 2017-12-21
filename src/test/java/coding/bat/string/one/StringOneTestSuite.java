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

    @Test
    public void testTheEnd() {
        //When
        String result1 = one.theEnd("Hello", true);
        String result2 = one.theEnd("Hello", false);
        String result3 = one.theEnd("oh", true);

        //Then
        Assert.assertEquals("H", result1);
        Assert.assertEquals("o", result2);
        Assert.assertEquals("o", result3);
    }

    @Test
    public void testWithouEnd2() {
        //When
        String result1 = one.withouEnd2("Hello");
        String result2 = one.withouEnd2("abc");
        String result3 = one.withouEnd2("ab");

        //Then
        Assert.assertEquals("ell", result1);
        Assert.assertEquals("b", result2);
        Assert.assertEquals("", result3);
    }

    @Test
    public void testMiddleTwo() {
        //When
        String result1 = one.middleTwo("string");
        String result2 = one.middleTwo("code");
        String result3 = one.middleTwo("Practice");

        //Then
        Assert.assertEquals("ri", result1);
        Assert.assertEquals("od", result2);
        Assert.assertEquals("ct", result3);
    }

    @Test
    public void testEndLy() {
        //When
        boolean result1 = one.endsLy("oddly");
        boolean result2 = one.endsLy("y");
        boolean result3 = one.endsLy("oddy");

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testNTwice() {
        //When
        String result1 = one.nTwice("Hello",2);
        String result2 = one.nTwice("Chocolate",3);
        String result3 = one.nTwice("Chocolate",1);

        //Then
        Assert.assertEquals("Helo", result1);
        Assert.assertEquals("Choate", result2);
        Assert.assertEquals("Ce", result3);
    }

    @Test
    public void testTwoChar() {
        //When
        String result1 = one.twoChar("java",0);
        String result2 = one.twoChar("java",2);
        String result3 = one.twoChar("java",3);
        String result4 = one.twoChar("java",-1);

        //Then
        Assert.assertEquals("ja", result1);
        Assert.assertEquals("va", result2);
        Assert.assertEquals("ja", result3);
        Assert.assertEquals("ja", result4);
    }

    @Test
    public void testMiddleThree() {
        //When
        String result1 = one.middleThree("Candy");
        String result2 = one.middleThree("and");
        String result3 = one.middleThree("solving");

        //Then
        Assert.assertEquals("and", result1);
        Assert.assertEquals("and", result2);
        Assert.assertEquals("lvi", result3);
    }

    @Test
    public void testHasBad() {
        //When
        boolean result1 = one.hasBad("badxx");
        boolean result2 = one.hasBad("xbadxx");
        boolean result3 = one.hasBad("xxbadxx");

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testAtFirst() {
        //When
        String result1 = one.atFirst("hello");
        String result2 = one.atFirst("hi");
        String result3 = one.atFirst("h");

        //Then
        Assert.assertEquals("he", result1);
        Assert.assertEquals("hi", result2);
        Assert.assertEquals("h@", result3);
    }

    @Test
    public void testLastChars() {
        //When
        String result1 = one.lastChars("last", "chars");
        String result2 = one.lastChars("yo","java");
        String result3 = one.lastChars("hi","");

        //Then
        Assert.assertEquals("ls", result1);
        Assert.assertEquals("ya", result2);
        Assert.assertEquals("h@", result3);
    }

    @Test
    public void testConCat() {
        //When
        String result1 = one.conCat("abc", "cat");
        String result2 = one.conCat("dog","cat");
        String result3 = one.conCat("abc","");

        //Then
        Assert.assertEquals("abcat", result1);
        Assert.assertEquals("dogcat", result2);
        Assert.assertEquals("abc", result3);
    }

    @Test
    public void testLastTwo() {
        //When
        String result1 = one.lastTwo("coding");
        String result2 = one.lastTwo("cat");
        String result3 = one.lastTwo("ab");

        //Then
        Assert.assertEquals("codign", result1);
        Assert.assertEquals("cta", result2);
        Assert.assertEquals("ba", result3);
    }

    @Test
    public void testSeeColor() {
        //When
        String result1 = one.seeColor("redxx");
        String result2 = one.seeColor("xxred");
        String result3 = one.seeColor("blueTimes");

        //Then
        Assert.assertEquals("red", result1);
        Assert.assertEquals("", result2);
        Assert.assertEquals("blue", result3);
    }

    @Test
    public void testFrontAgain() {
        //When
        boolean result1 = one.frontAgain("edited");
        boolean result2 = one.frontAgain("edit");
        boolean result3 = one.frontAgain("ed");

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testMinCat() {
        //When
        String result1 = one.minCat("Hello", "Hi");
        String result2 = one.minCat("Hello", "java");
        String result3 = one.minCat("java", "Hello");

        //Then
        Assert.assertEquals("loHi", result1);
        Assert.assertEquals("ellojava", result2);
        Assert.assertEquals("javaello", result3);
    }

    @Test
    public void testExtraFront() {
        //When
        String result1 = one.extraFront("Hello");
        String result2 = one.extraFront("ab");
        String result3 = one.extraFront("H");

        //Then
        Assert.assertEquals("HeHeHe", result1);
        Assert.assertEquals("ababab", result2);
        Assert.assertEquals("HHH", result3);
    }

    @Test
    public void testWithout2() {
        //When
        String result1 = one.without2("HelloHe");
        String result2 = one.without2("HelloHi");
        String result3 = one.without2("Hi");
        String result4 = one.without2("x");

        //Then
        Assert.assertEquals("lloHe", result1);
        Assert.assertEquals("HelloHi", result2);
        Assert.assertEquals("", result3);
        Assert.assertEquals("x", result4);
    }

    @Test
    public void testDeFront() {
        //When
        String result1 = one.deFront("Hello");
        String result2 = one.deFront("java");
        String result3 = one.deFront("away");

        //Then
        Assert.assertEquals("llo", result1);
        Assert.assertEquals("va", result2);
        Assert.assertEquals("aay", result3);
    }

    @Test
    public void testStartWord() {
        //When
        String result1 = one.startWord("hippo","hi");
        String result2 = one.startWord("hippo","hip");
        String result3 = one.startWord("hippo","h");

        //Then
        Assert.assertEquals("hi", result1);
        Assert.assertEquals("hip", result2);
        Assert.assertEquals("h", result3);
    }

    @Test
    public void testWithoutX() {
        //When
        String result1 = one.withoutX("xHix");
        String result2 = one.withoutX("xHi");
        String result3 = one.withoutX("Hxix");
        String result4 = one.withoutX("x");

        //Then
        Assert.assertEquals("Hi", result1);
        Assert.assertEquals("Hi", result2);
        Assert.assertEquals("Hxi", result3);
        Assert.assertEquals("", result4);
    }

    @Test
    public void testWithoutX2() {
        //When
        String result1 = one.withoutX2("xHi");
        String result2 = one.withoutX2("Hxi");
        String result3 = one.withoutX2("Hi");

        //Then
        Assert.assertEquals("Hi", result1);
        Assert.assertEquals("Hi", result2);
        Assert.assertEquals("Hi", result3);
    }
}
