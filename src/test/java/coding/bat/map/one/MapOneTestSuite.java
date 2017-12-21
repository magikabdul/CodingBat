package coding.bat.map.one;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapOneTestSuite {
    private MapOne mapOne = new MapOne();

    @Test
    public void testMapBully() {
        //Given
        Map<String, String> stringMap1 = new HashMap<>();
        stringMap1.put("a", "candy");
        stringMap1.put("b", "dirt");

        Map<String, String> stringMap2 = new HashMap<>();
        stringMap2.put("a", "candy");

        Map<String, String> stringMap3 = new HashMap<>();
        stringMap3.put("a", "candy");
        stringMap3.put("b", "carrot");
        stringMap3.put("c", "meh");

        //When
        Map<String, String> resultMap1 = new HashMap<>();
        resultMap1.put("a", "");
        resultMap1.put("b", "candy");

        Map<String, String> resultMap2 = new HashMap<>();
        resultMap2.put("a", "");
        resultMap2.put("b", "candy");

        Map<String, String> resultMap3 = new HashMap<>();
        resultMap3.put("a", "");
        resultMap3.put("b", "candy");
        resultMap3.put("c", "meh");

        //Then
        Assert.assertEquals(resultMap1, mapOne.mapBully(stringMap1));
        Assert.assertEquals(resultMap2, mapOne.mapBully(stringMap2));
        Assert.assertEquals(resultMap3, mapOne.mapBully(stringMap3));
    }

    @Test
    public void testMapShare() {
        //Given
        Map<String, String> stringMap1 = new HashMap<>();
        stringMap1.put("a", "aaa");
        stringMap1.put("b", "bbb");
        stringMap1.put("c", "ccc");

        Map<String, String> stringMap2 = new HashMap<>();
        stringMap2.put("b", "xyz");
        stringMap2.put("c", "ccc");

        Map<String, String> stringMap3 = new HashMap<>();
        stringMap3.put("a", "aaa");
        stringMap3.put("d", "hi");
        stringMap3.put("c", "meh");

        //When
        Map<String, String> resultMap1 = new HashMap<>();
        resultMap1.put("a", "aaa");
        resultMap1.put("b", "aaa");

        Map<String, String> resultMap2 = new HashMap<>();
        resultMap2.put("b", "xyz");

        Map<String, String> resultMap3 = new HashMap<>();
        resultMap3.put("a", "aaa");
        resultMap3.put("b", "aaa");
        resultMap3.put("d", "hi");

        //Then
        Assert.assertEquals(resultMap1, mapOne.mapShare(stringMap1));
        Assert.assertEquals(resultMap2, mapOne.mapShare(stringMap2));
        Assert.assertEquals(resultMap3, mapOne.mapShare(stringMap3));
    }

    @Test
    public void testMapAB() {
        //Given
        Map<String, String> stringMap1 = new HashMap<>();
        stringMap1.put("a", "Hi");
        stringMap1.put("b", "There");

        Map<String, String> stringMap2 = new HashMap<>();
        stringMap2.put("a", "Hi");

        Map<String, String> stringMap3 = new HashMap<>();
        stringMap3.put("b", "There");

        //When
        Map<String, String> resultMap1 = new HashMap<>();
        resultMap1.put("a", "Hi");
        resultMap1.put("ab", "HiThere");
        resultMap1.put("b", "There");

        Map<String, String> resultMap2 = new HashMap<>();
        resultMap2.put("a", "Hi");

        Map<String, String> resultMap3 = new HashMap<>();
        resultMap3.put("b", "There");

        //Then
        Assert.assertEquals(resultMap1, mapOne.mapAB(stringMap1));
        Assert.assertEquals(resultMap2, mapOne.mapAB(stringMap2));
        Assert.assertEquals(resultMap3, mapOne.mapAB(stringMap3));
    }

    @Test
    public void testTopping1() {
        //Given
        Map<String, String> stringMap1 = new HashMap<>();
        stringMap1.put("ice cream", "peanuts");

        Map<String, String> stringMap2 = new HashMap<>();

        Map<String, String> stringMap3 = new HashMap<>();
        stringMap3.put("pancake", "syrup");

        //When
        Map<String, String> resultMap1 = new HashMap<>();
        resultMap1.put("bread", "butter");
        resultMap1.put("ice cream", "cherry");

        Map<String, String> resultMap2 = new HashMap<>();
        resultMap2.put("bread", "butter");

        Map<String, String> resultMap3 = new HashMap<>();
        resultMap3.put("bread", "butter");
        resultMap3.put("pancake", "syrup");

        //Then
        Assert.assertEquals(resultMap1, mapOne.topping1(stringMap1));
        Assert.assertEquals(resultMap2, mapOne.topping1(stringMap2));
        Assert.assertEquals(resultMap3, mapOne.topping1(stringMap3));
    }
}
