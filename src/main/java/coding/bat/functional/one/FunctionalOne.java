package coding.bat.functional.one;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalOne {

    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(integer -> integer * 2)
                .collect(Collectors.toList());
    }

    public static List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(integer -> integer * integer)
                .collect(Collectors.toList());
    }

    public static List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(s -> s + "*")
                .collect(Collectors.toList());
    }

    public static List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(s -> s + s + s)
                .collect(Collectors.toList());
    }

    public static List<String> moreY(List<String> strings) {
        return strings.stream()
                .map(s -> "y" + s + "y")
                .collect(Collectors.toList());
    }

    public static List<Integer> math1(List<Integer> nums) {
        return nums.stream()
                .map(integer -> (integer + 1) * 10)
                .collect(Collectors.toList());
    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(integer -> integer % 10)
                .collect(Collectors.toList());
    }

    public static List<String> lower(List<String> strings) {
        return strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public static List<String> noX(List<String> strings) {
        return strings.stream()
                .map(s -> s.replace("x", ""))
                .collect(Collectors.toList());
    }
}
