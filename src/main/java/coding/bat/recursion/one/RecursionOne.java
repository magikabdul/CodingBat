package coding.bat.recursion.one;

public class RecursionOne {

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            if (bunnies % 2 == 0) {
                return 3 + bunnyEars2(bunnies - 1);
            } else {
                return 2 + bunnyEars2(bunnies - 1);
            }
        }
    }

    public static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }
        return rows + triangle(rows - 1);
    }

    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }

        if (n % 10 == 0) {
            return sumDigits(n / 10);
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }

    public static int count7(int n) {
        if (n < 7) {
            return 0;
        } else {
            if (n % 10 == 7) {
                return 1 + count7(n / 10);
            } else {
                return count7(n / 10);
            }
        }
    }

    public static int count8(int n) {
        if (n < 8) {
            return 0;
        } else {
            if (n % 10 == 8 && (n / 10) % 10 == 8) {
                return 2 + count8(n / 10);
            } else if (n % 10 == 8) {
                return 1 + count8(n / 10);
            } else {
                return count8(n / 10);
            }
        }
    }

    public static int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        } else {
            return base * powerN(base, n - 1);
        }
    }

    public static int countX(String str) {
        if (str.length() == 0) {
            return 0;
        } else {
            if (str.startsWith("x")) {
                return 1 + countX(str.substring(1));
            } else {
                return countX(str.substring(1));
            }
        }
    }

    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        } else {
            if (str.startsWith("hi")) {
                return 1 + countHi(str.substring(2));
            } else {
                return countHi(str.substring(1));
            }
        }
    }

    public static String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        } else {
            if (str.startsWith("x")) {
                return "y" + changeXY(str.substring(1));
            } else {
                return str.substring(0, 1) + changeXY(str.substring(1));
            }
        }
    }

    public static String changePi(String str) {
        if (str.length() == 0) {
            return "";
        } else {
            if (str.startsWith("pi")) {
                return "3.14" + changePi(str.substring(2));
            } else {
                return str.substring(0, 1) + changePi(str.substring(1));
            }
        }
    }

    public static String noX(String str) {
        if (str.length() == 0) {
            return "";
        } else {
            if (str.startsWith("x")) {
                return noX(str.substring(1));
            } else {
                return str.substring(0, 1) + noX(str.substring(1));
            }
        }
    }

    public static boolean array6(int[] nums, int index) {
        if (nums.length == 0) {
            return false;
        }
        if (index == nums.length - 1) {
            return nums[index] == 6;
        } else {
            if (nums[index] == 6) {
                return true;
            } else {
                return array6(nums, index + 1);
            }
        }
    }

    public static int array11(int[] nums, int index) {
        if (nums.length == 0) {
            return 0;
        }
        if (index > nums.length - 1) {
            return 0;
        }
        if (index == nums.length - 1) {
            return nums[index] == 11 ? 1 : 0;
        } else {
            if (nums[index] == 11) {
                return 1 + array11(nums, index + 1);
            } else {
                return array11(nums, index + 1);
            }
        }
    }

    public static boolean array220(int[] nums, int index) {
        if (nums.length < 2) {
            return false;
        }

        if (index == nums.length - 2) {
            return nums[index] * 10 == nums[index + 1];
        } else {
            return (nums[index] * 10 == nums[index + 1]) || array220(nums, index + 1);
        }
    }

    public static String allStar(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 1) + "*" + allStar(str.substring(1));
        }
    }

    public static String pairStar(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            if (str.substring(0, 1).equals(str.substring(1, 2))) {
                return str.substring(0, 1) + "*" + pairStar(str.substring(1));
            } else {
                return str.substring(0,1) + pairStar(str.substring(1));
            }
        }
    }

    public static String endX(String str) {
        if (str.length() < 1) {
            return "";
        } else {
            if (str.startsWith("x")) {
                return endX(str.substring(1)) + "x";
            } else {
                return str.substring(0, 1) + endX(str.substring(1));
            }
        }
    }

    public static int countPairs(String str) {
        if (str.length() < 3) {
            return 0;
        } else {
            if (str.substring(0, 1).equals(str.substring(2, 3))) {
                return 1 + countPairs(str.substring(1));
            } else {
                return countPairs(str.substring(1));
            }
        }
    }

    public static int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        } else if (str.length() == 3) {
            if (str.equals("abc") || str.equals("aba")) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
                if (str.length() < 4) {
                    return 1;
                } else
                    return 1 + countAbc(str.substring(1));
            } else {
                return countAbc(str.substring(1));
            }
        }
    }

    public static int count11(String str) {
        if (str.length() < 2) {
            return 0;
        } else if (str.length() == 2) {
            if (str.equals("11")) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (str.substring(0, 2).equals("11")) {
                if (str.length() < 4) {
                    return 1;
                } else {
                    return 1 + count11(str.substring(2));
                }
            } else {
                return count11(str.substring(1));
            }
        }
    }

    public static String stringClean(String str) {
        if (str.length() < 1) {
            return "";
        } else if (str.length() < 2) {
            return str;
        } else {
            if (str.substring(0, 1).equals(str.substring(1, 2))) {
                return stringClean(str.substring(1));
            } else {
                return str.substring(0, 1) + stringClean(str.substring(1));
            }
        }
    }

    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        } else if (str.length() == 2) {
            return str.equals("hi") ? 1 : 0;
        } else {
            if (str.substring(0, 1).equals("x")) {
                if (str.substring(1, 3).equals("hi")) {
                    return str.length() < 3 ? 0 : countHi2(str.substring(3));
                } else {
                    return countHi2(str.substring(1));
                }
            } else if (str.substring(0, 2).equals("hi")) {
                return str.length() < 2 ? 1 : 1 + countHi2(str.substring(2));
            } else {
                return countHi2(str.substring(1));
            }
        }
    }

    public static String parenBit(String str) {
        if (str.length() < 1) {
            return "";
        } else {
            if (str.contains(")")) {
                if (str.startsWith("(") || !str.contains("(")) {
                    return str.substring(0, 1) + parenBit(str.substring(1));
                } else {
                    return parenBit(str.substring(1));
                }
            } else {
                return "";
            }
        }
    }

    public static boolean nestParen(String str) {
        if (str.length() < 1) {
            return true;
        } else if (str.length() == 2) {
            return str.contains("(") && str.contains(")");
        }

        if (str.contains("(") && str.contains(")")) {
            return nestParen(str.substring(str.indexOf("(") + 1, str.lastIndexOf(")")));
        } else {
            return false;
        }
    }

    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        } else if (str.length() == sub.length()) {
            return str.equals(sub) ? 1 : 0;
        } else {
            if (str.contains(sub)) {
                return 1 + strCount(str.substring(str.indexOf(sub) + sub.length()), sub);
            } else {
                return 0;
            }
        }
    }

    public static boolean strCopies(String str, String sub, int n) {
        if (n == 0) {
            return true;
        } else if (str.length() < sub.length()) {
            return false;
        } else if (str.length() == sub.length()) {
            return n == 1 && str.contains(sub);
        } else {
            return str.contains(sub) && strCopies(str.substring(1 + str.indexOf(sub)), sub, n - 1);
        }
    }

    public static int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        } else if (str.length() == sub.length()) {
            return str.equals(sub) ? sub.length() : 0;
        } else {
            if (str.contains(sub)) {
                if (str.substring(1).contains(sub)) {
                    if (str.startsWith(sub)) {
                        return sub.length() + str.substring(0, str.lastIndexOf(sub)).length();
                    } else {
                        return strDist(str.substring(1), sub);
                    }
                } else {
                    return sub.length();
                }
            } else {
                return 0;
            }
        }
    }
}
