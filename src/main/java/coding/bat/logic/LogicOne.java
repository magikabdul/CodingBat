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
}
