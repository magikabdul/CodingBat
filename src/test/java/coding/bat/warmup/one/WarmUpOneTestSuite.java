package coding.bat.warmup.one;

import org.junit.Assert;
import org.junit.Test;

public class WarmUpOneTestSuite {

    @Test
    public void testSleepIn() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.sleepIn(false, false);
        boolean result2 = warmUpOne.sleepIn(true, false);
        boolean result3 = warmUpOne.sleepIn(false, true);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testMonkeyTrouble() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.monkeyTrouble(true, true);
        boolean result2 = warmUpOne.monkeyTrouble(false, false);
        boolean result3 = warmUpOne.monkeyTrouble(true, false);

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testSumDouble() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        int result1 = warmUpOne.sumDouble(1, 2);
        int result2 = warmUpOne.sumDouble(3, 2);
        int result3 = warmUpOne.sumDouble(2, 2);

        //Then
        Assert.assertEquals(3, result1);
        Assert.assertEquals(5, result2);
        Assert.assertEquals(8, result3);
    }

    @Test
    public void testDiff21() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        int result1 = warmUpOne.diff21(19);
        int result2 = warmUpOne.diff21(10);
        int result3 = warmUpOne.diff21(21);

        //Then
        Assert.assertEquals(2, result1);
        Assert.assertEquals(11, result2);
        Assert.assertEquals(0, result3);
    }

    @Test
    public void testParrotTrouble() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.parrotTrouble(true, 6);
        boolean result2 = warmUpOne.parrotTrouble(true, 7);
        boolean result3 = warmUpOne.parrotTrouble(false, 6);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testMakes10() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.makes10(9, 10);
        boolean result2 = warmUpOne.makes10(9, 9);
        boolean result3 = warmUpOne.makes10(1, 9);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testNearHundred() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.nearHundred(93);
        boolean result2 = warmUpOne.nearHundred(90);
        boolean result3 = warmUpOne.nearHundred(89);

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testPosNeg() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.posNeg(1, -1, false);
        boolean result2 = warmUpOne.posNeg(-1, 1, false);
        boolean result3 = warmUpOne.posNeg(-4, -5, true);

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testNotString() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        String  result1 = warmUpOne.notString("candy");
        String  result2 = warmUpOne.notString("x");
        String  result3 = warmUpOne.notString("not bad");

        //Then
        Assert.assertEquals("not candy", result1);
        Assert.assertEquals("not x", result2);
        Assert.assertEquals("not bad", result3);
    }

    @Test
    public void testMissingChar() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        String result1 = warmUpOne.missingChar("kitten", 1);
        String result2 = warmUpOne.missingChar("kitten", 0);
        String result3 = warmUpOne.missingChar("kitten", 4);

        //Then
        Assert.assertEquals("ktten", result1);
        Assert.assertEquals("itten", result2);
        Assert.assertEquals("kittn", result3);
    }

    @Test
    public void testFrontBack() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        String result1 = warmUpOne.frontBack("code");
        String result2 = warmUpOne.frontBack("a");
        String result3 = warmUpOne.frontBack("ab");

        //Then
        Assert.assertEquals("eodc", result1);
        Assert.assertEquals("a", result2);
        Assert.assertEquals("ba", result3);
    }

    @Test
    public void testFront3() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        String result1 = warmUpOne.front3("Java");
        String result2 = warmUpOne.front3("Chocolate");
        String result3 = warmUpOne.front3("abc");

        //Then
        Assert.assertEquals("JavJavJav", result1);
        Assert.assertEquals("ChoChoCho", result2);
        Assert.assertEquals("abcabcabc", result3);
    }

    @Test
    public void testBackAround() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        String result1 = warmUpOne.backAround("cat");
        String result2 = warmUpOne.backAround("Hello");
        String result3 = warmUpOne.backAround("a");

        //Then
        Assert.assertEquals("tcatt", result1);
        Assert.assertEquals("oHelloo", result2);
        Assert.assertEquals("aaa", result3);
    }

    @Test
    public void testOr35() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.or35(3);
        boolean result2 = warmUpOne.or35(10);
        boolean result3 = warmUpOne.or35(8);

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testFront22() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        String result1 = warmUpOne.front22("kitten");
        String result2 = warmUpOne.front22("Ha");
        String result3 = warmUpOne.front22("abc");

        //Then
        Assert.assertEquals("kikittenki", result1);
        Assert.assertEquals("HaHaHa", result2);
        Assert.assertEquals("ababcab", result3);
    }

    @Test
    public void testStartHi() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.startHi("hi there");
        boolean result2 = warmUpOne.startHi("hi");
        boolean result3 = warmUpOne.startHi("hello hi");

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testIcyHot() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.icyHot(120, -1);
        boolean result2 = warmUpOne.icyHot(-1, 120);
        boolean result3 = warmUpOne.icyHot(2, 120);

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testIn1020() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.in1020(12, 99);
        boolean result2 = warmUpOne.in1020(21, 12);
        boolean result3 = warmUpOne.in1020(8, 99);

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testHasTeen() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.hasTeen(13, 20, 10);
        boolean result2 = warmUpOne.hasTeen(20, 19, 10);
        boolean result3 = warmUpOne.hasTeen(20, 10, 13);

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testLoneTeen() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.loneTeen(13, 99);
        boolean result2 = warmUpOne.loneTeen(21, 19);
        boolean result3 = warmUpOne.loneTeen(13, 13);

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testDelDel() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        String result1 = warmUpOne.delDel("adelbc");
        String result2 = warmUpOne.delDel("adelHello");
        String result3 = warmUpOne.delDel("adedbc");

        //Then
        Assert.assertEquals("abc", result1);
        Assert.assertEquals("aHello", result2);
        Assert.assertEquals("adedbc", result3);
    }

    @Test
    public void testMixStart() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.mixStart("mix snacks");
        boolean result2 = warmUpOne.mixStart("pix snacks");
        boolean result3 = warmUpOne.mixStart("piz snacks");

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testStartOz() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        String result1 = warmUpOne.startOz("ozymandias");
        String result2 = warmUpOne.startOz("bzoo");
        String result3 = warmUpOne.startOz("oxx");

        //Then
        Assert.assertEquals("oz", result1);
        Assert.assertEquals("z", result2);
        Assert.assertEquals("o", result3);
    }

    @Test
    public void testIntMax() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        int result1 = warmUpOne.intMax(1, 2, 3);
        int result2 = warmUpOne.intMax(1, 3, 2);
        int result3 = warmUpOne.intMax(3, 2, 1);

        //Then
        Assert.assertEquals(3, result1);
        Assert.assertEquals(3, result2);
        Assert.assertEquals(3, result3);
    }

    @Test
    public void testClose10() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        int result1 = warmUpOne.close10(8, 13);
        int result2 = warmUpOne.close10(13, 8);
        int result3 = warmUpOne.close10(13, 7);

        //Then
        Assert.assertEquals(8, result1);
        Assert.assertEquals(8, result2);
        Assert.assertEquals(0, result3);
    }

    @Test
    public void testIn3050() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.in3050(30, 31);
        boolean result2 = warmUpOne.in3050(30, 41);
        boolean result3 = warmUpOne.in3050(40, 50);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testMax1020() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        int result1 = warmUpOne.max1020(11, 19);
        int result2 = warmUpOne.max1020(19, 11);
        int result3 = warmUpOne.max1020(11, 9);

        //Then
        Assert.assertEquals(19, result1);
        Assert.assertEquals(19, result2);
        Assert.assertEquals(11, result3);
    }

    @Test
    public void testStringE() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.stringE("Hello");
        boolean result2 = warmUpOne.stringE("Heelle");
        boolean result3 = warmUpOne.stringE("Heelele");

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testLastDigit() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        boolean result1 = warmUpOne.lastDigit(7, 17);
        boolean result2 = warmUpOne.lastDigit(6, 17);
        boolean result3 = warmUpOne.lastDigit(3, 113);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testEndUp() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        String result1 = warmUpOne.endUp("Hello");
        String result2 = warmUpOne.endUp("hi there");
        String result3 = warmUpOne.endUp("hi");

        //Then
        Assert.assertEquals("HeLLO", result1);
        Assert.assertEquals("hi thERE", result2);
        Assert.assertEquals("HI", result3);
    }

    @Test
    public void testEveryNth() {
        //Given
        WarmUpOne warmUpOne = new WarmUpOne();

        //When
        String result1 = warmUpOne.everyNth("Miracle", 2);
        String result2 = warmUpOne.everyNth("abcdefg", 2);
        String result3 = warmUpOne.everyNth("abcdefg", 3);

        //Then
        Assert.assertEquals("Mrce", result1);
        Assert.assertEquals("aceg", result2);
        Assert.assertEquals("adg", result3);
    }
}
