package coding.bat.array.one;

import java.util.Arrays;

public class ArrayOne {

    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public static boolean sameFirstLast(int[] nums) {
        if (nums.length > 0) {
            return nums[0] == nums[nums.length - 1];
        } else {
            return false;
        }
    }

    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static int sum3(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    public static int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public static int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public static int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[nums.length - 1]) {
            return new int[]{nums[0], nums[0], nums[0]};
        } else {
            return new int[]{nums[nums.length - 1], nums[nums.length - 1], nums[nums.length - 1]};
        }
    }

    public static int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return nums[0] + nums[1];
        }
    }
}
