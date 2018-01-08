package coding.bat.array.one;

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
}
