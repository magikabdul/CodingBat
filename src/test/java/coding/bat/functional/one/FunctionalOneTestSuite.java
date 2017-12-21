package coding.bat.functional.one;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FunctionalOneTestSuite {

    @Test
    public void testDoubling() {
        //Given
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        List<Integer> result3 = new ArrayList<>();

        //When
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(6);
        list2.add(8);
        list2.add(6);
        list2.add(8);
        list2.add(-1);

        result1.add(2);
        result1.add(4);
        result1.add(6);

        result2.add(12);
        result2.add(16);
        result2.add(12);
        result2.add(16);
        result2.add(-2);

        //Then
        Assert.assertEquals(result1, FunctionalOne.doubling(list1));
        Assert.assertEquals(result2, FunctionalOne.doubling(list2));
        Assert.assertEquals(result3, FunctionalOne.doubling(list3));
    }

    @Test
    public void testSquare() {
        //Given
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        List<Integer> result3 = new ArrayList<>();

        //When
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(6);
        list2.add(8);
        list2.add(-6);
        list2.add(-8);
        list2.add(1);

        result1.add(1);
        result1.add(4);
        result1.add(9);

        result2.add(36);
        result2.add(64);
        result2.add(36);
        result2.add(64);
        result2.add(1);

        //Then
        Assert.assertEquals(result1, FunctionalOne.square(list1));
        Assert.assertEquals(result2, FunctionalOne.square(list2));
        Assert.assertEquals(result3, FunctionalOne.square(list3));
    }

    @Test
    public void testAddStar() {
        //Given
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        List<String> result1 = new ArrayList<>();
        List<String> result2 = new ArrayList<>();
        List<String> result3 = new ArrayList<>();

        //When
        list1.add("a");
        list1.add("bb");
        list1.add("ccc");

        list2.add("hello");
        list2.add("there");

        list3.add("*");


        result1.add("a*");
        result1.add("bb*");
        result1.add("ccc*");

        result2.add("hello*");
        result2.add("there*");

        result3.add("**");

        //Then
        Assert.assertEquals(result1, FunctionalOne.addStar(list1));
        Assert.assertEquals(result2, FunctionalOne.addStar(list2));
        Assert.assertEquals(result3, FunctionalOne.addStar(list3));
    }

    @Test
    public void testCopies3() {
        //Given
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        List<String> result1 = new ArrayList<>();
        List<String> result2 = new ArrayList<>();
        List<String> result3 = new ArrayList<>();

        //When
        list1.add("a");
        list1.add("bb");
        list1.add("ccc");

        list2.add("24");
        list2.add("a");
        list2.add("");

        list3.add("hello");
        list3.add("there");


        result1.add("aaa");
        result1.add("bbbbbb");
        result1.add("ccccccccc");

        result2.add("242424");
        result2.add("aaa");
        result2.add("");

        result3.add("hellohellohello");
        result3.add("theretherethere");

        //Then
        Assert.assertEquals(result1, FunctionalOne.copies3(list1));
        Assert.assertEquals(result2, FunctionalOne.copies3(list2));
        Assert.assertEquals(result3, FunctionalOne.copies3(list3));
    }

    @Test
    public void testMoreY() {
        //Given
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        List<String> result1 = new ArrayList<>();
        List<String> result2 = new ArrayList<>();
        List<String> result3 = new ArrayList<>();

        //When
        list1.add("a");
        list1.add("b");
        list1.add("c");

        list2.add("hello");
        list2.add("there");

        list3.add("yay");


        result1.add("yay");
        result1.add("yby");
        result1.add("ycy");

        result2.add("yhelloy");
        result2.add("ytherey");

        result3.add("yyayy");

        //Then
        Assert.assertEquals(result1, FunctionalOne.moreY(list1));
        Assert.assertEquals(result2, FunctionalOne.moreY(list2));
        Assert.assertEquals(result3, FunctionalOne.moreY(list3));
    }

    @Test
    public void testMath1() {
        //Given
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        List<Integer> result3 = new ArrayList<>();

        //When
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(6);
        list2.add(8);
        list2.add(6);
        list2.add(8);
        list2.add(1);

        list3.add(10);

        result1.add(20);
        result1.add(30);
        result1.add(40);

        result2.add(70);
        result2.add(90);
        result2.add(70);
        result2.add(90);
        result2.add(20);

        result3.add(110);

        //Then
        Assert.assertEquals(result1, FunctionalOne.math1(list1));
        Assert.assertEquals(result2, FunctionalOne.math1(list2));
        Assert.assertEquals(result3, FunctionalOne.math1(list3));
    }

    @Test
    public void testRightDigit() {
        //Given
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        List<Integer> result3 = new ArrayList<>();

        //When
        list1.add(1);
        list1.add(22);
        list1.add(93);

        list2.add(16);
        list2.add(8);
        list2.add(886);
        list2.add(8);
        list2.add(1);

        list3.add(10);
        list3.add(0);

        result1.add(1);
        result1.add(2);
        result1.add(3);

        result2.add(6);
        result2.add(8);
        result2.add(6);
        result2.add(8);
        result2.add(1);

        result3.add(0);
        result3.add(0);

        //Then
        Assert.assertEquals(result1, FunctionalOne.rightDigit(list1));
        Assert.assertEquals(result2, FunctionalOne.rightDigit(list2));
        Assert.assertEquals(result3, FunctionalOne.rightDigit(list3));
    }

    @Test
    public void testLower() {
        //Given
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        List<String> result1 = new ArrayList<>();
        List<String> result2 = new ArrayList<>();
        List<String> result3 = new ArrayList<>();

        //When
        list1.add("Hello");
        list1.add("Hi");

        list2.add("AAA");
        list2.add("BBB");
        list2.add("ccc");

        list3.add("KitteN");
        list3.add("ChocolaTE");


        result1.add("hello");
        result1.add("hi");

        result2.add("aaa");
        result2.add("bbb");
        result2.add("ccc");

        result3.add("kitten");
        result3.add("chocolate");

        //Then
        Assert.assertEquals(result1, FunctionalOne.lower(list1));
        Assert.assertEquals(result2, FunctionalOne.lower(list2));
        Assert.assertEquals(result3, FunctionalOne.lower(list3));
    }

    @Test
    public void testNoX() {
        //Given
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        List<String> result1 = new ArrayList<>();
        List<String> result2 = new ArrayList<>();
        List<String> result3 = new ArrayList<>();

        //When
        list1.add("ax");
        list1.add("bb");
        list1.add("cx");

        list2.add("xxax");
        list2.add("xbxbx");
        list2.add("xxcx");

        list3.add("x");


        result1.add("a");
        result1.add("bb");
        result1.add("c");

        result2.add("a");
        result2.add("bb");
        result2.add("c");

        result3.add("");

        //Then
        Assert.assertEquals(result1, FunctionalOne.noX(list1));
        Assert.assertEquals(result2, FunctionalOne.noX(list2));
        Assert.assertEquals(result3, FunctionalOne.noX(list3));
    }
}
