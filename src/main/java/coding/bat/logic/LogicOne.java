package coding.bat.logic;

public class LogicOne {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return (cigars >= 40 && cigars <= 60) || (isWeekend && cigars >= 40);
    }

    public static int dateFashion(int you, int date) {
        if (you >= 8 || date >= 8) {
            return you <= 2 || date <=2 ? 0 : 2;
        } else if (you <= 2 || date <= 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        return (temp >= 60 && temp <= 90) || (isSummer && temp >= 60 && temp <= 100);
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (speed <= 60 || (isBirthday && speed <= 65)) {
            return 0;
        } else if (speed <= 80 || (isBirthday && speed <= 85)) {
            return 1;
        } else {
            return 2;
        }
    }

    public static int sortaSum(int a, int b) {
        return (a + b >= 10 && a + b <= 19) ? 20 : a + b;
    }

    public static String alarmClock(int day, boolean vacation) {
        if (vacation) {
            return day > 0 && day < 6 ? "10:00" : "off";
        } else {
            return day > 0 && day < 6 ? "7:00" : "10:00";
        }
    }

    public static boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6 || Math.abs(b - a) == 6;
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n >= 1 && n <= 10;
        }
    }

    public static boolean specialEleven(int n) {
        return n % 11 == 0 || (n - 1) % 11 == 0;
    }

    public static boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public static boolean old35(int n) {
        return (n % 3 == 0 && n % 5 != 0) || (n % 3 != 0 && n % 5 == 0);
    }

    public static boolean less20(int n) {
        return n % 20 == 18 || n % 20 == 19;
    }

    public static boolean nearTen(int num) {
        int expression = (num - (10 * (num / 10))) % 10;
        return expression <= 2 || expression >= 8;
    }

    public static int teenSum(int a, int b) {
        return (a >= 13 && a <= 19 || b >= 13 && b <= 19) ? 19 : a + b;
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return (!isMorning || isMom) && !isAsleep;
    }

    public static int teaParty(int tea, int candy) {
        if (tea >= 5 && candy >= 5) {
            return tea / candy >= 2 || candy / tea >= 2 ? 2 : 1;
        } else {
            return 0;
        }
    }

    public static String fizzString(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.substring(0,1).equals("f")) {
            sb.append("Fizz");
        }
        if (str.substring(str.length() - 1).equals("b")) {
            sb.append("Buzz");
        }

        return sb.length() > 0 ? sb.toString() : str;
    }

    public static String fizzString2(int n) {
        StringBuilder sb = new StringBuilder();

        if (n % 3 == 0) {
            sb.append("Fizz");
        }
        if (n % 5 == 0) {
            sb.append("Buzz");
        }

        return sb.length() == 0 ? (n + "!") : sb.append("!").toString();
    }

    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        return (b > a && c > b) || (bOk && c > b);
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return (b > a && c > b) || (equalOk && b >= a && c >= b);
    }

    public static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public static boolean lessBy10(int a, int b, int c) {
        return a - b >= 10 || a - c >= 10 || b - c >= 10 || b - a >= 10 || c - a >= 10 || c - b >= 10;
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (!noDoubles || die1 != die2) {
            return die1 + die2;
        } else {
            if (die1 == 6) {
                return 1 + die2;
            } else {
                return die1 + die2 + 1;
            }
        }
    }

    public static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else {
            if (a % 5 == b % 5) {
                return a > b ? b : a;
            } else {
                return a > b ? a : b;
            }
        }
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public static int blueTicket(int a, int b, int c) {
        if (a + b == 10 || a + c == 10 || b + c == 10) {
            return 10;
        } else if (a + b == b + c + 10 || a + b == a + c + 10) {
            return 5;
        } else {
            return 0;
        }
    }

    public static boolean shareDigit(int a, int b) {
        return a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b % 10 || a % 10 == b / 10;
    }

    public static int sumLimit(int a, int b) {
        if (String.valueOf(a + b).length() != String.valueOf(a).length()) {
            return a;
        } else {
            return a + b;
        }
    }
}
