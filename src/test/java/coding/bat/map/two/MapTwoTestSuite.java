package coding.bat.map.two;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTwoTestSuite {
    private MapTwo mapTwo = new MapTwo();

    @Test
    public void testWord0() {
        //Given
        String[] s1 = {"a", "b", "a", "b"};
        String[] s2 = {"a", "b", "a", "c", "b"};
        String[] s3 = {"c", "b", "a"};

        //When
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 0);
        map1.put("b", 0);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("a", 0);
        map2.put("b", 0);
        map2.put("c", 0);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("a", 0);
        map3.put("b", 0);
        map3.put("c", 0);

        Map<String, Integer> result1 = mapTwo.word0(s1);
        Map<String, Integer> result2 = mapTwo.word0(s2);
        Map<String, Integer> result3 = mapTwo.word0(s3);

        //Then
        Assert.assertEquals(map1, result1);
        Assert.assertEquals(map2, result2);
        Assert.assertEquals(map3, result3);
    }

    @Test
    public void testWordLen() {
        //Given
        String[] s1 = {"a", "bb", "a", "bb"};
        String[] s2 = {"this", "and", "that", "and"};
        String[] s3 = {"code", "code", "code", "bug"};

        //When
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("bb", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("that", 4);
        map2.put("and", 3);
        map2.put("this", 4);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("code", 4);
        map3.put("bug", 3);

        Map<String, Integer> result1 = mapTwo.wordLen(s1);
        Map<String, Integer> result2 = mapTwo.wordLen(s2);
        Map<String, Integer> result3 = mapTwo.wordLen(s3);

        //Then
        Assert.assertEquals(map1, result1);
        Assert.assertEquals(map2, result2);
        Assert.assertEquals(map3, result3);
    }

    @Test
    public void testPairs() {
        //Given
        String[] s1 = {"code", "bug"};
        String[] s2 = {"man", "moon", "main"};
        String[] s3 = {"man", "moon", "good", "night"};

        //When
        Map<String, String> map1 = new HashMap<>();
        map1.put("b", "g");
        map1.put("c", "e");

        Map<String, String> map2 = new HashMap<>();
        map2.put("m", "n");

        Map<String, String> map3 = new HashMap<>();
        map3.put("g", "d");
        map3.put("m", "n");
        map3.put("n", "t");

        Map<String, String> result1 = mapTwo.pairs(s1);
        Map<String, String> result2 = mapTwo.pairs(s2);
        Map<String, String> result3 = mapTwo.pairs(s3);

        //Then
        Assert.assertEquals(map1, result1);
        Assert.assertEquals(map2, result2);
        Assert.assertEquals(map3, result3);
    }

    @Test
    public void testWordCount() {
        //Given
        String[] s1 = {"a", "b", "a", "c", "b"};
        String[] s2 = {"c", "b", "a"};
        String[] s3 = {"c", "c", "c", "c"};

        //When
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 2);
        map1.put("b", 2);
        map1.put("c", 1);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("a", 1);
        map2.put("b", 1);
        map2.put("c", 1);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("c", 4);

        Map<String, Integer> result1 = mapTwo.wordCount(s1);
        Map<String, Integer> result2 = mapTwo.wordCount(s2);
        Map<String, Integer> result3 = mapTwo.wordCount(s3);

        //Then
        Assert.assertEquals(map1, result1);
        Assert.assertEquals(map2, result2);
        Assert.assertEquals(map3, result3);
    }

    @Test
    public void testFirstChar() {
        //Given
        String[] s1 = {"salt", "tea", "soda", "toast"};
        String[] s2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        String[] s3 = {""};

        //When
        Map<String, String> map1 = new HashMap<>();
        map1.put("s", "saltsoda");
        map1.put("t", "teatoast");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aaaAA");
        map2.put("b", "bb");
        map2.put("c", "cccCC");
        map2.put("d", "d");

        Map<String, String> map3 = new HashMap<>();

        Map<String, String> result1 = mapTwo.firstChar(s1);
        Map<String, String> result2 = mapTwo.firstChar(s2);
        Map<String, String> result3 = mapTwo.firstChar(s3);

        //Then
        Assert.assertEquals(map1, result1);
        Assert.assertEquals(map2, result2);
        Assert.assertEquals(map3, result3);
    }

    @Test
    public void testWordAppend() {
        //Given
        String[] s1 = {"a", "b", "a"};
        String[] s2 = {"a", "b", "a", "c", "a", "d", "a"};
        String[] s3 = {"a", "", "a"};

        //When
        String str1 = "a";
        String str2 = "aa";
        String str3 = "a";

        String result1 = mapTwo.wordAppend(s1);
        String result2 = mapTwo.wordAppend(s2);
        String result3 = mapTwo.wordAppend(s3);

        //Then
        Assert.assertEquals(str1, result1);
//        Assert.assertEquals(str2, result2);
//        Assert.assertEquals(str3, result3);
    }
}
