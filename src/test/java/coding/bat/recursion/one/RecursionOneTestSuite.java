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

    @Test
    public void testCount7() {
        //Given

        //When

        //Then
        Assert.assertEquals(2, RecursionOne.count7(717));
        Assert.assertEquals(1, RecursionOne.count7(7));
        Assert.assertEquals(0, RecursionOne.count7(123));
    }

    @Test
    public void testCount8() {
        //Given

        //When

        //Then
        Assert.assertEquals(1, RecursionOne.count8(8));
        Assert.assertEquals(2, RecursionOne.count8(818));
        Assert.assertEquals(4, RecursionOne.count8(8818));
    }

    @Test
    public void testPowerN() {
        //Given

        //When

        //Then
        Assert.assertEquals(3, RecursionOne.powerN(3, 1));
        Assert.assertEquals(9, RecursionOne.powerN(3,2));
        Assert.assertEquals(27, RecursionOne.powerN(3,3));
    }

    @Test
    public void testCountX() {
        //Given

        //When

        //Then
        Assert.assertEquals(4, RecursionOne.countX("xxhixx"));
        Assert.assertEquals(3, RecursionOne.countX("xhixhix"));
        Assert.assertEquals(0, RecursionOne.countX("hi"));
    }

    @Test
    public void testCountHi() {
        //Given

        //When

        //Then
        Assert.assertEquals(1, RecursionOne.countHi("xxhixx"));
        Assert.assertEquals(2, RecursionOne.countHi("xhixhix"));
        Assert.assertEquals(1, RecursionOne.countHi("hi"));
    }

    @Test
    public void testChangeXY() {
        //Given

        //When

        //Then
        Assert.assertEquals("codey", RecursionOne.changeXY("codex"));
        Assert.assertEquals("yyhiyy", RecursionOne.changeXY("xxhixx"));
        Assert.assertEquals("yhiyhiy", RecursionOne.changeXY("xhixhix"));
    }

    @Test
    public void testChangePi() {
        //Given

        //When

        //Then
        Assert.assertEquals("x3.14x", RecursionOne.changePi("xpix"));
        Assert.assertEquals("3.143.14", RecursionOne.changePi("pipi"));
        Assert.assertEquals("3.14p", RecursionOne.changePi("pip"));
    }

    @Test
    public void testNoX() {
        //Given

        //When

        //Then
        Assert.assertEquals("ab", RecursionOne.noX("xaxb"));
        Assert.assertEquals("abc", RecursionOne.noX("abc"));
        Assert.assertEquals("", RecursionOne.noX("xx"));
    }

    @Test
    public void testArray6() {
        //Given

        //When

        //Then
        Assert.assertTrue(RecursionOne.array6(new int[]{1, 6, 4}, 0));
        Assert.assertFalse(RecursionOne.array6(new int[]{1, 4}, 0));
        Assert.assertTrue(RecursionOne.array6(new int[]{6},0));
        Assert.assertFalse(RecursionOne.array6(new int[]{}, 0));
    }

    @Test
    public void testArray11() {
        //Given

        //When

        //Then
        Assert.assertEquals(1, RecursionOne.array11(new int[]{1, 2, 11}, 0));
        Assert.assertEquals(2, RecursionOne.array11(new int[]{11, 11}, 0));
        Assert.assertEquals(0, RecursionOne.array11(new int[]{1, 2, 3, 4}, 0));
    }

    @Test
    public void testArray220() {
        //Given

        //When

        //Then
        Assert.assertTrue(RecursionOne.array220(new int[]{1, 2, 20}, 0));
        Assert.assertTrue(RecursionOne.array220(new int[]{3, 30}, 0));
        Assert.assertFalse(RecursionOne.array220(new int[]{3},0));
        Assert.assertFalse(RecursionOne.array220(new int[]{2, 19, 4}, 0));
    }

    @Test
    public void testAllStar() {
        //Given

        //When

        //Then
        Assert.assertEquals("h*e*l*l*o", RecursionOne.allStar("hello"));
        Assert.assertEquals("a*b*c", RecursionOne.allStar("abc"));
        Assert.assertEquals("a*b", RecursionOne.allStar("ab"));
    }

    @Test
    public void testPairSet() {
        //Given

        //When

        //Then
        Assert.assertEquals("hel*lo", RecursionOne.pairStar("hello"));
        Assert.assertEquals("x*xy*y", RecursionOne.pairStar("xxyy"));
        Assert.assertEquals("a*a*a*a", RecursionOne.pairStar("aaaa"));
    }

    @Test
    public void testEndX() {
        //Given

        //When

        //Then
        Assert.assertEquals("rexx", RecursionOne.endX("xxre"));
        Assert.assertEquals("hixxxx", RecursionOne.endX("xxhixx"));
        Assert.assertEquals("hihixxx", RecursionOne.endX("xhixhix"));
    }

    @Test
    public void testCountPairs() {
        //Given

        //When

        //Then
        Assert.assertEquals(1, RecursionOne.countPairs("axa"));
        Assert.assertEquals(2, RecursionOne.countPairs("axax"));
        Assert.assertEquals(1, RecursionOne.countPairs("axbx"));
    }

    @Test
    public void testCountAbc() {
        //Given

        //When

        //Then
        Assert.assertEquals(1, RecursionOne.countAbc("abc"));
        Assert.assertEquals(2, RecursionOne.countAbc("abcxxabc"));
        Assert.assertEquals(2, RecursionOne.countAbc("abaxxaba"));
    }

    @Test
    public void testCount11() {
        //Given

        //When

        //Then
        Assert.assertEquals(2, RecursionOne.count11("11abc11"));
        Assert.assertEquals(3, RecursionOne.count11("abc11x11x11"));
        Assert.assertEquals(1, RecursionOne.count11("111"));
    }

    @Test
    public void testStringClean() {
        //Given

        //When

        //Then
        Assert.assertEquals("yza", RecursionOne.stringClean("yyzzza"));
        Assert.assertEquals("abcd", RecursionOne.stringClean("abbbcdd"));
        Assert.assertEquals("Helo", RecursionOne.stringClean("Hello"));
    }

    @Test
    public void testCountHi2() {
        //Given

        //When

        //Then
        Assert.assertEquals(1, RecursionOne.countHi2("ahixhi"));
        Assert.assertEquals(2, RecursionOne.countHi2("ahibhi"));
        Assert.assertEquals(0, RecursionOne.countHi2("xhixhi"));
    }

    @Test
    public void testParenBit() {
        //Given

        //When

        //Then
        Assert.assertEquals("(abc)", RecursionOne.parenBit("xyz(abc)123"));
        Assert.assertEquals("(hello)", RecursionOne.parenBit("x(hello)"));
        Assert.assertEquals("(xy)", RecursionOne.parenBit("(xy)1"));
    }

    @Test
    public void testNestParen() {
        //Given

        //When

        //Then
        Assert.assertTrue(RecursionOne.nestParen("(())"));
        Assert.assertTrue(RecursionOne.nestParen("((()))"));
        Assert.assertFalse(RecursionOne.nestParen("(((x))"));
    }

    @Test
    public void testStrCount() {
        //Given

        //When

        //Then
        Assert.assertEquals(2, RecursionOne.strCount("catcowcat", "cat"));
        Assert.assertEquals(1, RecursionOne.strCount("catcowcat", "cow"));
        Assert.assertEquals(0, RecursionOne.strCount("catcowcat", "dog"));
    }

    @Test
    public void testStrCopies() {
        //Given

        //When

        //Then
        Assert.assertTrue(RecursionOne.strCopies("catcowcat", "cat", 2));
        Assert.assertFalse(RecursionOne.strCopies("catcowcat", "cow", 2));
        Assert.assertTrue(RecursionOne.strCopies("catcowcat", "cow", 1));
    }

    @Test
    public void testStrDist() {
        //Given

        //When

        //Then
        Assert.assertEquals(9, RecursionOne.strDist("catcowcat", "cat"));
        Assert.assertEquals(3, RecursionOne.strDist("catcowcat", "cow"));
        Assert.assertEquals(9, RecursionOne.strDist("cccatcowcatxx", "cat"));
        Assert.assertEquals(5, RecursionOne.strDist("hiHellohihihi", "hih"));
    }
}
