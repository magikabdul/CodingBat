package coding.bat.map.two;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapTwo {

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 0);
            }
        }

        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, s.length());
            }
        }

        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s.substring(0, 1), s.substring(s.length() - 1));
            }
        }

        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, 1 + map.get(s));
            }
        }

        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        if (strings.length != 0) {
            for (String s : strings) {
                if (!map.containsKey(s.substring(0, 1))) {
                    map.put(s.substring(0, 1), s);
                } else {
                    String temp = map.get(s.substring(0, 1));
                    map.put(s.substring(0, 1), temp + s);
                }
            }
        }

        return map;
    }

    public String wordAppend(String[] strings) {
        StringBuilder sb = new StringBuilder();

        for (String s : strings) {
            long quantity = Arrays.stream(strings).filter(s1 -> s1.equals(s)).count();
            if (quantity > 0) {
                long loopend = quantity / 2;
                for (int i = 0; i < loopend; i++) {
                    if (!sb.toString().substring(0, s.length()).equals(s)) {
                        sb.append(s);
                    }
                }
            }
        }
        return sb.toString();
    }
}
