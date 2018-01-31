package coding.bat.logic.two;

import org.junit.Assert;
import org.junit.Test;

public class LogicTwoTestSuite {
    private LogicTwo logicTwo = new LogicTwo();

    @Test
    public void testMakeBricks() {
        //Given
        int small1 = 3;
        int big1 = 1;
        int goal1 = 8;

        int small2 = 3;
        int big2 = 1;
        int goal2 = 9;

        int small3 = 3;
        int big3 = 2;
        int goal3 = 10;

        //When
        boolean result1 = logicTwo.makeBricks(small1, big1, goal1);
        boolean result2 = logicTwo.makeBricks(small2, big2, goal2);
        boolean result3 = logicTwo.makeBricks(small3, big3, goal3);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testLoneSum() {
        //Given
        int a1 = 1;
        int b1 = 2;
        int c1 = 3;

        int a2 = 3;
        int b2 = 2;
        int c2 = 3;

        int a3 = 3;
        int b3 = 3;
        int c3 = 3;

        //When
        int result1 = logicTwo.loneSum(a1, b1, c1);
        int result2 = logicTwo.loneSum(a2, b2, c2);
        int result3 = logicTwo.loneSum(a3, b3, c3);

        //Then
        Assert.assertEquals(6, result1);
        Assert.assertEquals(2, result2);
        Assert.assertEquals(0, result3);
    }

    @Test
    public void testLuckySum() {
        //Given
        int a1 = 1;
        int b1 = 2;
        int c1 = 3;

        int a2 = 1;
        int b2 = 2;
        int c2 = 13;

        int a3 = 1;
        int b3 = 13;
        int c3 = 3;

        //When
        int result1 = logicTwo.luckySum(a1, b1, c1);
        int result2 = logicTwo.luckySum(a2, b2, c2);
        int result3 = logicTwo.luckySum(a3, b3, c3);

        //Then
        Assert.assertEquals(6, result1);
        Assert.assertEquals(3, result2);
        Assert.assertEquals(1, result3);
    }

    @Test
    public void testNoTeenSum() {
        //Given
        int a1 = 1;
        int b1 = 2;
        int c1 = 3;

        int a2 = 2;
        int b2 = 13;
        int c2 = 1;

        int a3 = 2;
        int b3 = 1;
        int c3 = 14;

        //When
        int result1 = logicTwo.noTeenSum(a1, b1, c1);
        int result2 = logicTwo.noTeenSum(a2, b2, c2);
        int result3 = logicTwo.noTeenSum(a3, b3, c3);

        //Then
        Assert.assertEquals(6, result1);
        Assert.assertEquals(3, result2);
        Assert.assertEquals(3, result3);
    }

    @Test
    public void testRoundSum() {
        //Given
        int a1 = 16;
        int b1 = 17;
        int c1 = 18;

        int a2 = 12;
        int b2 = 13;
        int c2 = 14;

        int a3 = 6;
        int b3 = 4;
        int c3 = 4;

        //When
        int result1 = logicTwo.roundSum(a1, b1, c1);
        int result2 = logicTwo.roundSum(a2, b2, c2);
        int result3 = logicTwo.roundSum(a3, b3, c3);

        //Then
        Assert.assertEquals(60, result1);
        Assert.assertEquals(30, result2);
        Assert.assertEquals(10, result3);
    }

    @Test
    public void testCloseFar() {
        //Given
        int a1 = 1;
        int b1 = 2;
        int c1 = 10;

        int a2 = 1;
        int b2 = 2;
        int c2 = 3;

        int a3 = 4;
        int b3 = 1;
        int c3 = 3;

        //When
        boolean result1 = logicTwo.closeFar(a1, b1, c1);
        boolean result2 = logicTwo.closeFar(a2, b2, c2);
        boolean result3 = logicTwo.closeFar(a3, b3, c3);

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testBlackJack() {
        //Given
        int a1 = 19;
        int b1 = 21;

        int a2 = 21;
        int b2 = 19;

        int a3 = 19;
        int b3 = 22;

        //When
        int result1 = logicTwo.blackJack(a1, b1);
        int result2 = logicTwo.blackJack(a2, b2);
        int result3 = logicTwo.blackJack(a3, b3);

        //Then
        Assert.assertEquals(21, result1);
        Assert.assertEquals(21, result2);
        Assert.assertEquals(19, result3);
    }

    @Test
    public void testEvenlySpaced() {
        //Given
        int a1 = 2;
        int b1 = 4;
        int c1 = 6;

        int a2 = 4;
        int b2 = 6;
        int c2 = 2;

        int a3 = 4;
        int b3 = 6;
        int c3 = 3;

        //When
        boolean result1 = logicTwo.evenlySpaced(a1, b1, c1);
        boolean result2 = logicTwo.evenlySpaced(a2, b2, c2);
        boolean result3 = logicTwo.evenlySpaced(a3, b3, c3);

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testMakeChocolate() {
        //Given
        int a1 = 4;
        int b1 = 1;
        int c1 = 9;

        int a2 = 4;
        int b2 = 1;
        int c2 = 10;

        int a3 = 4;
        int b3 = 1;
        int c3 = 7;

        int a4 = 6;
        int b4 = 2;
        int c4 = 7;

        //When
        int result1 = logicTwo.makeChocolate(a1, b1, c1);
        int result2 = logicTwo.makeChocolate(a2, b2, c2);
        int result3 = logicTwo.makeChocolate(a3, b3, c3);
        int result4 = logicTwo.makeChocolate(a4, b4, c4);

        //Then
        Assert.assertEquals(4, result1);
        Assert.assertEquals(-1, result2);
        Assert.assertEquals(2, result3);
        Assert.assertEquals(2, result4);
    }
}