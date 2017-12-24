package coding.bat.recursion.one;

import org.junit.Assert;
import org.junit.Test;

public class RecursionOneTestSuite {

    @Test
    public void testFactorial() {
        //Given

        //When

        //Then
        Assert.assertEquals(1, RecursionOne.factorial(1));
        Assert.assertEquals(2, RecursionOne.factorial(2));
        Assert.assertEquals(6, RecursionOne.factorial(3));
        Assert.assertEquals(24, RecursionOne.factorial(4));
        Assert.assertEquals(120, RecursionOne.factorial(5));
        Assert.assertEquals(720, RecursionOne.factorial(6));
    }

    @Test
    public void testBunnyEars() {
        //Given

        //When

        //Then
        Assert.assertEquals(0, RecursionOne.bunnyEars(0));
        Assert.assertEquals(2, RecursionOne.bunnyEars(1));
        Assert.assertEquals(4, RecursionOne.bunnyEars(2));
        Assert.assertEquals(6, RecursionOne.bunnyEars(3));
    }

    @Test
    public void testFibonacci() {
        //Given

        //When

        //Then
        Assert.assertEquals(0, RecursionOne.fibonacci(0));
        Assert.assertEquals(1, RecursionOne.fibonacci(1));
        Assert.assertEquals(1, RecursionOne.fibonacci(2));
        Assert.assertEquals(2, RecursionOne.fibonacci(3));
    }

    @Test
    public void testBunnyEars2() {
        //Given

        //When

        //Then
        Assert.assertEquals(0, RecursionOne.bunnyEars2(0));
        Assert.assertEquals(2, RecursionOne.bunnyEars2(1));
        Assert.assertEquals(5, RecursionOne.bunnyEars2(2));
    }

    @Test
    public void testTriangle() {
        //Given

        //When

        //Then
        Assert.assertEquals(0, RecursionOne.triangle(0));
        Assert.assertEquals(1, RecursionOne.triangle(1));
        Assert.assertEquals(3, RecursionOne.triangle(2));
    }

    @Test
    public void testSumDigits() {
        //Given

        //When

        //Then
        Assert.assertEquals(9, RecursionOne.sumDigits(126));
        Assert.assertEquals(13, RecursionOne.sumDigits(49));
        Assert.assertEquals(3, RecursionOne.sumDigits(12));
    }
}
