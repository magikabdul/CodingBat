package coding.bat.functional.two;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FunctionalTwoTestSuite {

    @Test
    public void testNoNeg() {
        //Given
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        List<Integer> result3 = new ArrayList<>();

        //When
        list1.add(1);
        list1.add(-2);

        list2.add(-3);
        list2.add(-3);
        list2.add(3);
        list2.add(3);

        list3.add(-1);
        list3.add(-1);
        list3.add(-1);

        result1.add(1);

        result2.add(3);
        result2.add(3);

        //Then
        Assert.assertEquals(result1, FunctionalTwo.noNeg(list1));
        Assert.assertEquals(result2, FunctionalTwo.noNeg(list2));
        Assert.assertEquals(result3, FunctionalTwo.noNeg(list3));
    }

    @Test
    public void testNo9() {
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
        list1.add(19);

        list2.add(9);
        list2.add(19);
        list2.add(29);
        list2.add(3);

        list3.add(1);
        list3.add(2);
        list3.add(3);

        result1.add(1);
        result1.add(2);

        result2.add(3);

        result3.add(1);
        result3.add(2);
        result3.add(3);

        //Then
        Assert.assertEquals(result1, FunctionalTwo.no9(list1));
        Assert.assertEquals(result2, FunctionalTwo.no9(list2));
        Assert.assertEquals(result3, FunctionalTwo.no9(list3));
    }

    @Test
    public void testNoTeen() {
        //Given
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        List<Integer> result3 = new ArrayList<>();

        //When
        list1.add(12);
        list1.add(13);
        list1.add(19);
        list1.add(20);

        list2.add(1);
        list2.add(14);
        list2.add(1);

        list3.add(15);

        result1.add(12);
        result1.add(20);

        result2.add(1);
        result2.add(1);

        //Then
        Assert.assertEquals(result1, FunctionalTwo.noTeen(list1));
        Assert.assertEquals(result2, FunctionalTwo.noTeen(list2));
        Assert.assertEquals(result3, FunctionalTwo.noTeen(list3));
    }

    @Test
    public void testNoLong() {
        //Given
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        List<String> result1 = new ArrayList<>();
        List<String> result2 = new ArrayList<>();
        List<String> result3 = new ArrayList<>();

        //When
        list1.add("this");
        list1.add("not");
        list1.add("too");
        list1.add("long");

        list2.add("a");
        list2.add("bbb");
        list2.add("cccc");

        list3.add("cccc");
        list3.add("cccc");
        list3.add("cccc");

        result1.add("not");
        result1.add("too");

        result2.add("a");
        result2.add("bbb");

        //Then
        Assert.assertEquals(result1, FunctionalTwo.noLong(list1));
        Assert.assertEquals(result2, FunctionalTwo.noLong(list2));
        Assert.assertEquals(result3, FunctionalTwo.noLong(list3));
    }

    @Test
    public void testNoZ() {
        //Given
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        List<String> result1 = new ArrayList<>();
        List<String> result2 = new ArrayList<>();
        List<String> result3 = new ArrayList<>();

        //When
        list1.add("aaa");
        list1.add("bbb");
        list1.add("aza");

        list2.add("hziz");
        list2.add("hzello");
        list2.add("hi");

        list3.add("hello");
        list3.add("howz");
        list3.add("are");
        list3.add("youz");

        result1.add("aaa");
        result1.add("bbb");

        result2.add("hi");

        result3.add("hello");
        result3.add("are");

        //Then
        Assert.assertEquals(result1, FunctionalTwo.noZ(list1));
        Assert.assertEquals(result2, FunctionalTwo.noZ(list2));
        Assert.assertEquals(result3, FunctionalTwo.noZ(list3));
    }

    @Test
    public void testNo34() {
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

        list2.add("a");
        list2.add("bb");
        list2.add("ccc");
        list2.add("dddd");

        list3.add("ccc");
        list3.add("dddd");
        list3.add("apple");

        result1.add("a");
        result1.add("bb");

        result2.add("a");
        result2.add("bb");

        result3.add("apple");

        //Then
        Assert.assertEquals(result1, FunctionalTwo.no34(list1));
        Assert.assertEquals(result2, FunctionalTwo.no34(list2));
        Assert.assertEquals(result3, FunctionalTwo.no34(list3));
    }

    @Test
    public void testNoYY() {
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

        list2.add("a");
        list2.add("b");
        list2.add("cy");

        list3.add("xx");
        list3.add("ya");
        list3.add("zz");

        result1.add("ay");
        result1.add("by");
        result1.add("cy");

        result2.add("ay");
        result2.add("by");

        result3.add("xxy");
        result3.add("yay");
        result3.add("zzy");

        //Then
        Assert.assertEquals(result1, FunctionalTwo.noYY(list1));
        Assert.assertEquals(result2, FunctionalTwo.noYY(list2));
        Assert.assertEquals(result3, FunctionalTwo.noYY(list3));
    }

    @Test
    public void testTwo2() {
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

        list2.add(2);
        list2.add(6);
        list2.add(11);

        list3.add(0);

        result1.add(4);
        result1.add(6);

        result2.add(4);

        result3.add(0);

        //Then
        Assert.assertEquals(result1, FunctionalTwo.two2(list1));
        Assert.assertEquals(result2, FunctionalTwo.two2(list2));
        Assert.assertEquals(result3, FunctionalTwo.two2(list3));
    }

    @Test
    public void testSquare56() {
        //Given
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        List<Integer> result3 = new ArrayList<>();

        //When
        list1.add(3);
        list1.add(1);
        list1.add(4);

        list2.add(1);

        list3.add(2);

        result1.add(19);
        result1.add(11);

        result2.add(11);

        result3.add(14);

        //Then
        Assert.assertEquals(result1, FunctionalTwo.square56(list1));
        Assert.assertEquals(result2, FunctionalTwo.square56(list2));
        Assert.assertEquals(result3, FunctionalTwo.square56(list3));
    }
}
