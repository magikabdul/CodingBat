package coding.bat.logic.two;

import java.util.ArrayList;
import java.util.List;

public class LogicTwo {
    public boolean makeBricks(int small, int big, int goal) {
        return goal <= big * 5 + small && goal % 5 <= small;
    }

    public int loneSum(int a, int b, int c) {
        return (a == b && b == c) ? 0
                : (a == b) ? c
                : (a == c) ? b
                : (b == c) ? a
                : a + b + c;
    }

    public int luckySum(int a, int b, int c) {
        return  (a == 13) ? 0
                : (b == 13) ? a
                : (c == 13) ? a + b
                : a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        return list.stream()
                .filter(i -> (!(i >= 13 && i < 15) && !(i > 16 && i <= 19)))
                .reduce(0, Integer::sum);
    }

    public int roundSum(int a, int b, int c) {
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        return list.stream()
                .map(i -> (i % 10 > 0 && i % 10 < 5) ? (i / 10) * 10 : i)
                .map(i -> (i % 10) < 10 && (i % 10) > 4 ? ((i / 10) + 1) * 10 : i)
                .reduce(0, Integer::sum);
    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(b - a) <= 1) {
            return (Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2);
        } else
            return Math.abs(c - a) <= 1 && (Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2);
    }

    public int blackJack(int a, int b) {
        return  (a > 21 && b > 21) ? 0
                : a > 21 ? b
                : b > 21 ? a
                : 21 - a <= 21 - b ? a : b;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        int max = list.stream().reduce(Integer.MIN_VALUE, Integer::max);
        int min = list.stream().reduce(Integer.MAX_VALUE, Integer::min);;
        int mid = a != min && a != max ? a
                : b != min && b != max ? b
                : c;

        return mid - min == max - mid;
    }

    public int makeChocolate(int small, int big, int goal) {
        if (5 * big + small < goal) {
            return -1;
        }

        int size = 0;
        while (goal - size >= 5 && big > 0) {
            size += 5;
            big--;
        }

        return  (goal - size > small) ? -1 : goal - size;
    }
}
