package coding.bat.map.two;

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
        Map<String, Integer> map = new HashMap<>();
        String result = "";

        for (int i = 0; i < strings.length; i++) {

            String key = strings[i];

            if (map.containsKey(key)) {
                int val = map.get(key);
                val++;
                if (val % 2 == 0) {
                    result += key;
                }
                map.put(key, val);
            } else {
                map.put(key, 1);
            }

        }

        return result;
    }

    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        String[] result = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i].substring(0, 1))) {

                int position = map.get(strings[i].substring(0, 1));

                if (position > -1) {
                    result[i] = strings[position];
                    result[position] = strings[i];
                    map.put(strings[i].substring(0, 1), -1);
                } else {
                    result[i] = strings[i];
                }
            } else {
                map.put(strings[i].substring(0, 1), i);
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] == null) {
                result[i] = strings[i];
            }
        }

        return result;
    }
}
