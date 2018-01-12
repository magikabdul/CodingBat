package coding.bat.array.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOne {

    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public static boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length - 1];
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

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public static int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public static boolean has23(int[] nums) {
        return nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3;
    }

    public static boolean no23(int[] nums) {
        return nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3;
    }

    public static int[] makeLast(int[] nums) {
        int[] a = new int[2 * nums.length];

        for (int i = 0; i < nums.length * 2;i++) {
            a[i] = 0;
        }

        a[2 * nums.length - 1] = nums[nums.length - 1];
        return a;
    }

    public static boolean double23(int[] nums) {
        return nums.length == 2 && (nums[0] == 2 || nums[0] == 3) && nums[0] == nums[1];
    }

    public static int[] fix23(int[] nums) {
        int[] array = new int[3];

        array[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 2 && nums[i] == 3) {
                array[i] = 0;
            } else {
                array[i] = nums[i];
            }
        }
        return array;
    }

    public static int start1(int[] a, int[] b) {
        int result = 0;

        if (a.length > 0 && a[0] == 1) {
            result++;
        }
        if (b.length > 0 && b[0] == 1) {
                result++;
        }

        return result;
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        return Arrays.stream(a).sum() >= Arrays.stream(b).sum() ? a : b;
    }

    public static int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }

    public static int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public static int[] swapEnds(int[] nums) {
        int[] ints = new int[nums.length];

        if (nums.length > 1) {
            ints[0] = nums[nums.length - 1];
            System.arraycopy(nums, 1, ints, 1, nums.length - 1);
            ints[nums.length - 1] = nums[0];
        } else {
            ints = nums;
        }

        return ints;
    }

    public static int[] midThree(int[] nums) {
        if (nums.length == 3) {
            return nums;
        } else {
            int middlePos = nums.length / 2;
            return new int[]{nums[middlePos - 1], nums[middlePos], nums[middlePos + 1]};
        }
    }

    public static int maxTriple(int[] nums) {
        int middlePos = nums.length / 2;
        return Arrays.stream(new int[]{nums[0], nums[middlePos], nums[nums.length - 1]}).max().getAsInt();
    }

    public static int[] frontPiece(int[] nums) {
        if (nums.length < 3) {
            return nums;
        } else {
            return new int[]{nums[0], nums[1]};
        }
    }

    public static boolean unlucky1(int[] nums) {
        if (nums.length < 2) {
            return false;
        } else if (nums.length == 2) {
            return nums[0] == 1 && nums[1] == 3;
        } else {
            return (nums[0] == 1 && nums[1] == 3)
                    || (nums[1] == 1 && nums[2] == 3)
                    || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)
                    || (nums[nums.length - 3] == 1 && nums[nums.length - 2] == 3);
        }
    }

    public static int[] make2(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();

        if (a.length == 1) {
            list.add(a[0]);
        } else if (a.length > 1) {
            list.add(a[0]);
            list.add(a[1]);
        }

        if (list.size() == 0) {
            list.add(b[0]);
            list.add(b[1]);
        } else if (list.size() == 1) {
            list.add(b[0]);
        }

        return new int[]{list.get(0), list.get(1)};
    }

    public static int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};
        } else if (a.length > 0) {
            return new int[]{a[0]};
        } else if (b.length > 0) {
            return new int[]{b[0]};
        } else {
            return a;
        }
    }


}
