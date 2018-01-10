package coding.bat.array.one;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOneTestSuite {

    @Test
    public void testFirstLast6() {
        //Given


        //When
        boolean result1 = ArrayOne.firstLast6(new int[]{1, 2, 6});
        boolean result2 = ArrayOne.firstLast6(new int[]{6, 1, 2, 3});
        boolean result3 = ArrayOne.firstLast6(new int[]{13, 6, 1, 2, 3});

        //Then
        assertTrue(result1);
        assertTrue(result2);
        assertFalse(result3);
    }

    @Test
    public void testSameFirstLast() {
        //Given


        //When
        boolean result1 = ArrayOne.sameFirstLast(new int[]{1, 2, 3});
        boolean result2 = ArrayOne.sameFirstLast(new int[]{1, 2, 3, 1});
        boolean result3 = ArrayOne.sameFirstLast(new int[]{1, 2, 1});

        //Then
        assertFalse(result1);
        assertTrue(result2);
        assertTrue(result3);
    }

    @Test
    public void testMakePi() {
        //Given

        //When
        int[] result1 = ArrayOne.makePi();

        //Then
        assertEquals(3, result1[0]);
        assertEquals(1, result1[1]);
        assertEquals(4, result1[2]);
    }

    @Test
    public void testCommonEnd() {
        //Given


        //When
        boolean result1 = ArrayOne.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3});
        boolean result2 = ArrayOne.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2});
        boolean result3 = ArrayOne.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3});

        //Then
        assertTrue(result1);
        assertFalse(result2);
        assertTrue(result3);
    }

    @Test
    public void testSum3() {
        //Given


        //When
        int result1 = ArrayOne.sum3(new int[]{1, 2, 3});
        int result2 = ArrayOne.sum3(new int[]{5, 11, 2});
        int result3 = ArrayOne.sum3(new int[]{7, 0, 0});

        //Then
        assertEquals(6, result1);
        assertEquals(18, result2);
        assertEquals(7, result3);
    }

    @Test
    public void testRotateLeft() {
        //Given


        //When
        int[] result1 = ArrayOne.rotateLeft3(new int[]{1, 2, 3});
        int[] result2 = ArrayOne.rotateLeft3(new int[]{5, 11, 9});
        int[] result3 = ArrayOne.rotateLeft3(new int[]{7, 0, 0});

        //Then
        assertEquals(2, result1[0]);
        assertEquals(3, result1[1]);
        assertEquals(1, result1[2]);

        assertEquals(11, result2[0]);
        assertEquals(9, result2[1]);
        assertEquals(5, result2[2]);

        assertEquals(0, result3[0]);
        assertEquals(0, result3[1]);
        assertEquals(7, result3[2]);
    }

    @Test
    public void testReverse3() {
        //Given


        //When
        int[] result1 = ArrayOne.reverse3(new int[]{1, 2, 3});
        int[] result2 = ArrayOne.reverse3(new int[]{5, 11, 9});
        int[] result3 = ArrayOne.reverse3(new int[]{7, 0, 0});

        //Then
        assertEquals(3, result1[0]);
        assertEquals(2, result1[1]);
        assertEquals(1, result1[2]);

        assertEquals(9, result2[0]);
        assertEquals(11, result2[1]);
        assertEquals(5, result2[2]);

        assertEquals(0, result3[0]);
        assertEquals(0, result3[1]);
        assertEquals(7, result3[2]);
    }

    @Test
    public void testMaxEnd3() {
        //Given


        //When
        int[] result1 = ArrayOne.maxEnd3(new int[]{1, 2, 3});
        int[] result2 = ArrayOne.maxEnd3(new int[]{11, 5, 9});
        int[] result3 = ArrayOne.maxEnd3(new int[]{2, 11, 3});

        //Then
        assertEquals(3, result1[0]);
        assertEquals(3, result1[1]);
        assertEquals(3, result1[2]);

        assertEquals(11, result2[0]);
        assertEquals(11, result2[1]);
        assertEquals(11, result2[2]);

        assertEquals(3, result3[0]);
        assertEquals(3, result3[1]);
        assertEquals(3, result3[2]);
    }

    @Test
    public void testSum2() {
        //Given


        //When
        int result1 = ArrayOne.sum2(new int[]{1, 2, 3});
        int result2 = ArrayOne.sum2(new int[]{1, 1});
        int result3 = ArrayOne.sum2(new int[]{1, 1, 1, 1});

        //Then
        assertEquals(3, result1);
        assertEquals(2, result2);
        assertEquals(2, result3);
    }

    @Test
    public void testMiddleWay() {
        //Given

        //When
        int[] result1 = ArrayOne.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        int[] result2 = ArrayOne.middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0});
        int[] result3 = ArrayOne.middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5});

        //Then
        Assert.assertEquals(2, result1[0]);
        Assert.assertEquals(5, result1[1]);
        Assert.assertEquals(7, result2[0]);
        Assert.assertEquals(8, result2[1]);
        Assert.assertEquals(2, result3[0]);
        Assert.assertEquals(4, result3[1]);
    }

    @Test
    public void testMakeEnds() {
        //Given

        int[] result1 = ArrayOne.makeEnds(new int[]{1, 2, 3});
        int[] result2 = ArrayOne.makeEnds(new int[]{1, 2, 3, 4});
        int[] result3 = ArrayOne.makeEnds(new int[]{7, 4, 6, 2});

        //Then
        Assert.assertEquals(1, result1[0]);
        Assert.assertEquals(3, result1[1]);
        Assert.assertEquals(1, result2[0]);
        Assert.assertEquals(4, result2[1]);
        Assert.assertEquals(7, result3[0]);
        Assert.assertEquals(2, result3[1]);
    }

    @Test
    public void testHas23() {
        //Given

        //When
        boolean result1 = ArrayOne.has23(new int[]{2, 5});
        boolean result2 = ArrayOne.has23(new int[]{4, 3});
        boolean result3 = ArrayOne.has23(new int[]{4, 5});

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testNo23() {
        //Given

        //When
        boolean result1 = ArrayOne.no23(new int[]{4, 5});
        boolean result2 = ArrayOne.no23(new int[]{4, 2});
        boolean result3 = ArrayOne.no23(new int[]{3, 5});

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testMakeLast() {
        //Given

        //When
        int[] result1 = ArrayOne.makeLast(new int[]{4, 5, 6});
        int[] result2 = ArrayOne.makeLast(new int[]{1, 2});
        int[] result3 = ArrayOne.makeLast(new int[]{3});

        //Then
        Assert.assertEquals(6, result1.length);
        Assert.assertEquals(6, result1[result1.length - 1]);
        Assert.assertEquals(4, result2.length);
        Assert.assertEquals(2, result2[result2.length - 1]);
        Assert.assertEquals(2, result3.length);
        Assert.assertEquals(3, result3[result3.length - 1]);
    }

    @Test
    public void testDouble23() {
        //Given

        //When
        boolean result1 = ArrayOne.double23(new int[]{2, 2});
        boolean result2 = ArrayOne.double23(new int[]{3, 3});
        boolean result3 = ArrayOne.double23(new int[]{2, 3});

        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testFix23() {
        //Given

        //When
        int[] result1 = ArrayOne.fix23(new int[]{1, 2, 3});
        int[] result2 = ArrayOne.fix23(new int[]{2, 3, 5});
        int[] result3 = ArrayOne.fix23(new int[]{1, 2, 1});

        //Then
        Assert.assertEquals(1, result1[0]);
        Assert.assertEquals(2, result1[1]);
        Assert.assertEquals(0, result1[2]);
        Assert.assertEquals(2, result2[0]);
        Assert.assertEquals(0, result2[1]);
        Assert.assertEquals(5, result2[2]);
        Assert.assertEquals(1, result3[0]);
        Assert.assertEquals(2, result3[1]);
        Assert.assertEquals(1, result3[2]);
    }

    @Test
    public void testStart1() {
        //Given

        //When
        int result1 = ArrayOne.start1(new int[]{1, 2, 3}, new int[]{1, 3});
        int result2 = ArrayOne.start1(new int[]{2, 3, 5}, new int[]{1});
        int result3 = ArrayOne.start1(new int[]{1, 2, 1}, new int[]{});

        //Then
        Assert.assertEquals(2, result1);
        Assert.assertEquals(1, result2);
        Assert.assertEquals(1, result3);
    }

    @Test
    public void testBiggerTwo() {
        //Given

        //When
        int[] result1 = ArrayOne.biggerTwo(new int[]{1, 2}, new int[]{3, 4});
        int[] result2 = ArrayOne.biggerTwo(new int[]{3, 4}, new int[]{3, 4});
        int[] result3 = ArrayOne.biggerTwo(new int[]{1, 1}, new int[]{1, 2});

        //Then
        Assert.assertEquals(3, result1[0]);
        Assert.assertEquals(4, result1[1]);
        Assert.assertEquals(3, result2[0]);
        Assert.assertEquals(4, result2[1]);
        Assert.assertEquals(1, result3[0]);
        Assert.assertEquals(2, result3[1]);
    }

    @Test
    public void testMakeMiddle() {
        //Given

        //When
        int[] result1 = ArrayOne.makeMiddle(new int[]{1, 2, 3, 4});
        int[] result2 = ArrayOne.makeMiddle(new int[]{7, 1, 2, 3, 4, 9});
        int[] result3 = ArrayOne.makeMiddle(new int[]{1, 2});

        //Then
        Assert.assertEquals(2, result1[0]);
        Assert.assertEquals(3, result1[1]);
        Assert.assertEquals(2, result2[0]);
        Assert.assertEquals(3, result2[1]);
        Assert.assertEquals(1, result3[0]);
        Assert.assertEquals(2, result3[1]);
    }

    @Test
    public void testPlusTwo() {
        //Given

        //When
        int[] result1 = ArrayOne.plusTwo(new int[]{1, 2}, new int[]{3, 4});
        int[] result2 = ArrayOne.plusTwo(new int[]{4, 4}, new int[]{2, 2});
        int[] result3 = ArrayOne.plusTwo(new int[]{9, 2}, new int[]{3, 4});

        //Then
        Assert.assertEquals(1, result1[0]);
        Assert.assertEquals(2, result1[1]);
        Assert.assertEquals(3, result1[2]);
        Assert.assertEquals(4, result1[3]);

        Assert.assertEquals(4, result2[0]);
        Assert.assertEquals(4, result2[1]);
        Assert.assertEquals(2, result2[2]);
        Assert.assertEquals(2, result2[3]);

        Assert.assertEquals(9, result3[0]);
        Assert.assertEquals(2, result3[1]);
        Assert.assertEquals(3, result3[2]);
        Assert.assertEquals(4, result3[3]);
    }

    @Test
    public void testSwapEnds() {
        //Given

        //When
        int[] result1 = ArrayOne.swapEnds(new int[]{1, 2, 3, 4});
        int[] result2 = ArrayOne.swapEnds(new int[]{1, 2, 3});
        int[] result3 = ArrayOne.swapEnds(new int[]{8, 6, 7, 9, 5});

        //Then
        Assert.assertEquals(4, result1[0]);
        Assert.assertEquals(2, result1[1]);
        Assert.assertEquals(3, result1[2]);
        Assert.assertEquals(1, result1[3]);

        Assert.assertEquals(3, result2[0]);
        Assert.assertEquals(2, result2[1]);
        Assert.assertEquals(1, result2[2]);

        Assert.assertEquals(5, result3[0]);
        Assert.assertEquals(6, result3[1]);
        Assert.assertEquals(7, result3[2]);
        Assert.assertEquals(9, result3[3]);
        Assert.assertEquals(8, result3[4]);
    }
}