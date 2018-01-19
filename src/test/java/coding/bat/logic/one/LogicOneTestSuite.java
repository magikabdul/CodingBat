package coding.bat.logic.one;

import coding.bat.logic.LogicOne;
import org.junit.Assert;
import org.junit.Test;

public class LogicOneTestSuite {

    @Test
    public void testCigarParty() {
        //Given

        //When
        boolean result1 = LogicOne.cigarParty(30, false);
        boolean result2 = LogicOne.cigarParty(50, false);
        boolean result3 = LogicOne.cigarParty(70, true);

        //Then
        Assert.assertFalse(result1);
        Assert.assertTrue(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testDateFashion() {
        //Given

        //When
        int result1 = LogicOne.dateFashion(5, 10);
        int result2 = LogicOne.dateFashion(5, 2);
        int result3 = LogicOne.dateFashion(5, 5);

        //Then
        Assert.assertEquals(2, result1);
        Assert.assertEquals(0, result2);
        Assert.assertEquals(1, result3);
    }

    @Test
    public void testSquirrelPlay() {
        //Given

        //When
        boolean result1 = LogicOne.squirrelPlay(70, false);
        boolean result2 = LogicOne.squirrelPlay(95, false);
        boolean result3 = LogicOne.squirrelPlay(95, true);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testCaughtSpeeding() {
        //Given

        //When
        int result1 = LogicOne.caughtSpeeding(60, false);
        int result2 = LogicOne.caughtSpeeding(65, false);
        int result3 = LogicOne.caughtSpeeding(65, true);

        //Then
        Assert.assertEquals(0, result1);
        Assert.assertEquals(1, result2);
        Assert.assertEquals(0, result3);
    }

    @Test
    public void testSortaSum() {
        //Given

        //When
        int result1 = LogicOne.sortaSum(3, 4);
        int result2 = LogicOne.sortaSum(9, 4);
        int result3 = LogicOne.sortaSum(10, 11);

        //Then
        Assert.assertEquals(7, result1);
        Assert.assertEquals(20, result2);
        Assert.assertEquals(21, result3);
    }

    @Test
    public void testAlarmClock() {
        //Given

        //When
        String result1 = LogicOne.alarmClock(1, false);
        String result2 = LogicOne.alarmClock(5, false);
        String result3 = LogicOne.alarmClock(0, false);

        //Then
        Assert.assertEquals("7:00", result1);
        Assert.assertEquals("7:00", result2);
        Assert.assertEquals("10:00", result3);
    }

    @Test
    public void testLove6() {
        //Given

        //When
        boolean result1 = LogicOne.love6(6, 4);
        boolean result2 = LogicOne.love6(4, 5);
        boolean result3 = LogicOne.love6(1, 5);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testIn1To10() {
        //Given

        //When
        boolean result1 = LogicOne.in1To10(5, false);
        boolean result2 = LogicOne.in1To10(11, false);
        boolean result3 = LogicOne.in1To10(11, true);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testSpecialEleven() {
        //Given

        //When
        boolean result1 = LogicOne.specialEleven(22);
        boolean result2 = LogicOne.specialEleven(23);
        boolean result3 = LogicOne.specialEleven(24);

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testMore20() {
        //Given

        //When
        boolean result1 = LogicOne.more20(20);
        boolean result2 = LogicOne.more20(21);
        boolean result3 = LogicOne.more20(22);

        //Then
        Assert.assertFalse(result1);
        Assert.assertTrue(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testOld35() {
        //Given

        //When
        boolean result1 = LogicOne.old35(3);
        boolean result2 = LogicOne.old35(10);
        boolean result3 = LogicOne.old35(15);

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testLess20() {
        //Given

        //When
        boolean result1 = LogicOne.less20(18);
        boolean result2 = LogicOne.less20(19);
        boolean result3 = LogicOne.less20(20);

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testNearTen() {
        //Given

        //When
        boolean result1 = LogicOne.nearTen(12);
        boolean result2 = LogicOne.nearTen(17);
        boolean result3 = LogicOne.nearTen(39);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testTeenSum() {
        //Given

        //When
        int result1 = LogicOne.teenSum(3, 4);
        int result2 = LogicOne.teenSum(10, 13);
        int result3 = LogicOne.teenSum(13, 2);

        //Then
        Assert.assertEquals(7, result1);
        Assert.assertEquals(19, result2);
        Assert.assertEquals(19, result3);
    }

    @Test
    public void testAnswerCell() {
        //Given

        //When
        boolean result1 = LogicOne.answerCell(false, false, false);
        boolean result2 = LogicOne.answerCell(false,false,true);
        boolean result3 = LogicOne.answerCell(true,false,false);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testTeaParty() {
        //Given

        //When
        int result1 = LogicOne.teaParty(6, 8);
        int result2 = LogicOne.teaParty(3, 8);
        int result3 = LogicOne.teaParty(20, 6);

        //Then
        Assert.assertEquals(1, result1);
        Assert.assertEquals(0, result2);
        Assert.assertEquals(2, result3);
    }

    @Test
    public void testFizzString() {
        //Given

        //When
        String result1 = LogicOne.fizzString("fig");
        String result2 = LogicOne.fizzString("dib");
        String result3 = LogicOne.fizzString("fib");

        //Then
        Assert.assertEquals("Fizz", result1);
        Assert.assertEquals("Buzz", result2);
        Assert.assertEquals("FizzBuzz", result3);
    }

    @Test
    public void testFizzString2() {
        //Given

        //When
        String result1 = LogicOne.fizzString2(1);
        String result2 = LogicOne.fizzString2(2);
        String result3 = LogicOne.fizzString2(3);

        //Then
        Assert.assertEquals("1!", result1);
        Assert.assertEquals("2!", result2);
        Assert.assertEquals("Fizz!", result3);
    }

    @Test
    public void testTwoAsOne() {
        //Given

        //When
        boolean result1 = LogicOne.twoAsOne(1,2,3);
        boolean result2 = LogicOne.twoAsOne(3,1,2);
        boolean result3 = LogicOne.twoAsOne(3,2,2);

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testInOrder() {
        //Given

        //When
        boolean result1 = LogicOne.inOrder(1,2,4, false);
        boolean result2 = LogicOne.inOrder(1,2,1, false);
        boolean result3 = LogicOne.inOrder(1,1,2, true);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testInOrderEqual() {
        //Given

        //When
        boolean result1 = LogicOne.inOrderEqual(2,5,11, false);
        boolean result2 = LogicOne.inOrderEqual(5,7,6, false);
        boolean result3 = LogicOne.inOrderEqual(5,5,7, true);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testLastDigit() {
        //Given

        //When
        boolean result1 = LogicOne.lastDigit(23,19,13);
        boolean result2 = LogicOne.lastDigit(23,19,12);
        boolean result3 = LogicOne.lastDigit(23,19,3);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testLessBy10() {
        //Given

        //When
        boolean result1 = LogicOne.lessBy10(1,7,11);
        boolean result2 = LogicOne.lessBy10(1,7,10);
        boolean result3 = LogicOne.lessBy10(11,1,7);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testWithoutDoubles() {
        //Given

        //When
        int result1 = LogicOne.withoutDoubles(2, 3,true);
        int result2 = LogicOne.withoutDoubles(3, 3,true);
        int result3 = LogicOne.withoutDoubles(3, 3,false);

        //Then
        Assert.assertEquals(5, result1);
        Assert.assertEquals(7, result2);
        Assert.assertEquals(6, result3);
    }

    @Test
    public void testMaxMod5() {
        //Given

        //When
        int result1 = LogicOne.maxMod5(2, 3);
        int result2 = LogicOne.maxMod5(6, 2);
        int result3 = LogicOne.maxMod5(3, 2);

        //Then
        Assert.assertEquals(3, result1);
        Assert.assertEquals(6, result2);
        Assert.assertEquals(3, result3);
    }

    @Test
    public void testRedTicket() {
        //Given

        //When
        int result1 = LogicOne.redTicket(2, 2,2);
        int result2 = LogicOne.redTicket(2, 2,1);
        int result3 = LogicOne.redTicket(0, 0,0);

        //Then
        Assert.assertEquals(10, result1);
        Assert.assertEquals(0, result2);
        Assert.assertEquals(5, result3);
    }

    @Test
    public void testGreenTicket() {
        //Given

        //When
        int result1 = LogicOne.greenTicket(1, 2,3);
        int result2 = LogicOne.greenTicket(2, 2,2);
        int result3 = LogicOne.greenTicket(1, 1,2);

        //Then
        Assert.assertEquals(0, result1);
        Assert.assertEquals(20, result2);
        Assert.assertEquals(10, result3);
    }

    @Test
    public void testBlueTicket() {
        //Given

        //When
        int result1 = LogicOne.blueTicket(9, 1,0);
        int result2 = LogicOne.blueTicket(9, 2,0);
        int result3 = LogicOne.blueTicket(6, 1,4);

        //Then
        Assert.assertEquals(10, result1);
        Assert.assertEquals(0, result2);
        Assert.assertEquals(10, result3);
    }

    @Test
    public void testShareDigit() {
        //Given

        //When
        boolean result1 = LogicOne.shareDigit(12,23);
        boolean result2 = LogicOne.shareDigit(12,43);
        boolean result3 = LogicOne.shareDigit(12,44);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testSumLimit() {
        //Given

        //When
        int result1 = LogicOne.sumLimit(2,3);
        int result2 = LogicOne.sumLimit(8,3);
        int result3 = LogicOne.sumLimit(8,1);

        //Then
        Assert.assertEquals(5, result1);
        Assert.assertEquals(8, result2);
        Assert.assertEquals(9, result3);
    }
}
