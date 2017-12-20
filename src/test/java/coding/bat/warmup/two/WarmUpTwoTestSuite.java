package coding.bat.warmup.two;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WarmUpTwoTestSuite {
    private WarmUpTwo warmUpTwo;

    @Before
    public void before() {
        warmUpTwo = new WarmUpTwo();
    }

    @Test
    public void testStringTimes() {

        //When
        String result1 = warmUpTwo.stringTimes("Hi", 2);
        String result2 = warmUpTwo.stringTimes("Hi", 3);
        String result3 = warmUpTwo.stringTimes("Hi", 1);

        //Then
        Assert.assertEquals("HiHi", result1);
        Assert.assertEquals("HiHiHi", result2);
        Assert.assertEquals("Hi", result3);
    }

    @Test
    public void testFrontTimes() {

        //When
        String result1 = warmUpTwo.frontTimes("Chocolate", 2);
        String result2 = warmUpTwo.frontTimes("Chocolate", 3);
        String result3 = warmUpTwo.frontTimes("Abc", 3);

        //Then
        Assert.assertEquals("ChoCho", result1);
        Assert.assertEquals("ChoChoCho", result2);
        Assert.assertEquals("AbcAbcAbc", result3);
    }

    @Test
    public void testCountXX() {

        //When
        int result1 = warmUpTwo.countXX("abcxx");
        int result2 = warmUpTwo.countXX("xxx");
        int result3 = warmUpTwo.countXX("xxxx");

        //Then
        Assert.assertEquals(1, result1);
        Assert.assertEquals(2, result2);
        Assert.assertEquals(3, result3);
    }

    @Test
    public void testDoubleX() {

        //When
        boolean result1 = warmUpTwo.doubleX("axxbb");
        boolean result2 = warmUpTwo.doubleX("axaxax");
        boolean result3 = warmUpTwo.doubleX("xxxxx");

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testStringBits() {

        //When
        String result1 = warmUpTwo.stringBits("Hello");
        String result2 = warmUpTwo.stringBits("Hi");
        String result3 = warmUpTwo.stringBits("Heeololeo");

        //Then
        Assert.assertEquals("Hlo", result1);
        Assert.assertEquals("H", result2);
        Assert.assertEquals("Hello", result3);
    }

    @Test
    public void testStringSplosion() {

        //When
        String result1 = warmUpTwo.stringSplosion("Code");
        String result2 = warmUpTwo.stringSplosion("abc");
        String result3 = warmUpTwo.stringSplosion("ab");

        //Then
        Assert.assertEquals("CCoCodCode", result1);
        Assert.assertEquals("aababc", result2);
        Assert.assertEquals("aab", result3);
    }

    @Test
    public void testLast2() {

        //When
        int result1 = warmUpTwo.last2("hixxhi");
        int result2 = warmUpTwo.last2("xaxxaxaxx");
        int result3 = warmUpTwo.last2("axxxaaxx");

        //Then
        Assert.assertEquals(1, result1);
        Assert.assertEquals(1, result2);
        Assert.assertEquals(2, result3);
    }

    @Test
    public void testArrayCount9() {

        //When
        int result1 = warmUpTwo.arrayCount9(new int[]{1, 2, 9});
        int result2 = warmUpTwo.arrayCount9(new int[]{1, 9, 9});
        int result3 = warmUpTwo.arrayCount9(new int[]{1, 9, 9, 3, 9});

        //Then
        Assert.assertEquals(1, result1);
        Assert.assertEquals(2, result2);
        Assert.assertEquals(3, result3);
    }

    @Test
    public void testArrayFront9() {

        //When
        boolean result1 = warmUpTwo.arrayFront9(new int[]{1, 2, 9, 3, 4});
        boolean result2 = warmUpTwo.arrayFront9(new int[]{1, 2, 3, 4, 9});
        boolean result3 = warmUpTwo.arrayFront9(new int[]{1, 2, 3, 4, 5});

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testArray123() {

        //When
        boolean result1 = warmUpTwo.array123(new int[]{1, 1, 2, 3, 1});
        boolean result2 = warmUpTwo.array123(new int[]{1, 1, 2, 4, 1});
        boolean result3 = warmUpTwo.array123(new int[]{1, 1, 2, 1, 2, 3});

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void testStringMatch() {

        //When
        int result1 = warmUpTwo.stringMatch("xxcaazz", "xxbaaz");
        int result2 = warmUpTwo.stringMatch("abc", "abc");
        int result3 = warmUpTwo.stringMatch("abc", "axc");

        //Then
        Assert.assertEquals(3, result1);
        Assert.assertEquals(2, result2);
        Assert.assertEquals(0, result3);
    }

    @Test
    public void testStringX() {

        //When
        String result1 = warmUpTwo.stringX("xxHxix");
        String result2 = warmUpTwo.stringX("abxxxcd");
        String result3 = warmUpTwo.stringX("xabxxxcdx");

        //Then
        Assert.assertEquals("xHix", result1);
        Assert.assertEquals("abcd", result2);
        Assert.assertEquals("xabcdx", result3);
    }

    @Test
    public void testAltPairs() {

        //When
        String result1 = warmUpTwo.altPairs("kitten");
        String result2 = warmUpTwo.altPairs("Chocolate");
        String result3 = warmUpTwo.altPairs("CodingHorror");

        //Then
        Assert.assertEquals("kien", result1);
        Assert.assertEquals("Chole", result2);
        Assert.assertEquals("Congrr", result3);
    }

    @Test
    public void testStringYak() {

        //When
        String result1 = warmUpTwo.stringYak("yakpak");
        String result2 = warmUpTwo.stringYak("pakyak");
        String result3 = warmUpTwo.stringYak("yak123ya");

        //Then
        Assert.assertEquals("pak", result1);
        Assert.assertEquals("pak", result2);
        Assert.assertEquals("123ya", result3);
    }

    @Test
    public void testArray667() {

        //When
        int result1 = warmUpTwo.array667(new int[]{6, 6, 2});
        int result2 = warmUpTwo.array667(new int[]{6, 6, 2, 6});
        int result3 = warmUpTwo.array667(new int[]{6, 7, 2, 6});

        //Then
        Assert.assertEquals(1, result1);
        Assert.assertEquals(1, result2);
        Assert.assertEquals(1, result3);
    }

    @Test
    public void testNoTriples() {

        //When
        boolean result1 = warmUpTwo.noTriples(new int[]{1, 1, 2, 2, 1});
        boolean result2 = warmUpTwo.noTriples(new int[]{1, 1, 2, 2, 2, 1});
        boolean result3 = warmUpTwo.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1});

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testHas271() {

        //When
        boolean result1 = warmUpTwo.has271(new int[]{1, 2, 7, 1});
        boolean result2 = warmUpTwo.has271(new int[]{1, 2, 8, 1});
        boolean result3 = warmUpTwo.has271(new int[]{2, 7, 1});

        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertTrue(result3);
    }
}
