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
}
