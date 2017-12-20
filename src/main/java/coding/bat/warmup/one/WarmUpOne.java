package coding.bat.warmup.one;

public class WarmUpOne {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday == false || vacation == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == bSmile) {
            return true;
        } else {
            return false;
        }
    }

    public int sumDouble(int a, int b) {
        if(a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }

    public int diff21(int n) {
        if(n > 21) {
            return 2*(n - 21);
        } else {
            return 21 - n;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return(talking == true && (hour < 7 || hour > 20));
    }

    public boolean makes10(int a, int b) {
        return (a + b == 10) || a == 10 || b == 10;
    }

    public boolean nearHundred(int n) {
        return( (n >= 90 && n <= 110) || (n >= 190 && n <= 210) );
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if(negative == true) {
            return (a < 0 && b < 0);
        } else {
            return (a >= 0 && b < 0) || (a < 0 && b >= 0);
        }
    }

    public String notString(String str) {
        if(str.length() < 3) {
            return "not " + str;
        }
        else if(str.substring(0, 3).equals("not")) {
            return str;
        }
        else {
            return "not " + str;
        }
    }

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1, str.length());
    }

    public String frontBack(String str) {
        if(str.length() == 0) {
            return "";
        } else if(str.length() == 1) {
            return str;
        } else if(str.length() == 2) {
            return str.substring(1) + str.substring(0, 1);
        } else  {
            return str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        }
    }

    public String front3(String str) {
        if(str.length() < 3) {
            return str.substring(0, str.length()) + str.substring(0, str.length()) + str.substring(0, str.length());
        } else {
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        }
    }

    public String backAround(String str) {
        StringBuilder s = new StringBuilder();

        s.append(str.charAt(str.length() - 1));
        s.append(str.substring(0, str.length()));
        s.append(str.charAt(str.length() - 1));

        return s.toString();
    }

    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }

    public String front22(String str) {
        if(str.length() < 3) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
    }

    public boolean startHi(String str) {
        if(str.length() > 1) {
            return str.substring(0, 2).equals("hi");
        }   else {
            return false;
        }
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || ( b >= 10 && b <= 20);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
    }

    public boolean loneTeen(int a, int b) {
        if ( (a >= 13 && a <= 19) && ( b < 13 || b > 19 )) {
            return true;
        } else if ( (b >= 13 && b <= 19) && ( a < 13 || a > 19 )) {
            return true;
        } else {
            return false;
        }
    }

    public String delDel(String str) {
        if (str.length() <= 3) {
            return str;
        } else if(str.substring(1, 4).equals("del")) {
            if(str.length() <= 4) {
                return str.substring(0, 1);
            } else {
                return str.substring(0, 1) + str.substring(4, str.length());
            }
        } else {
            return str;
        }
    }

    public boolean mixStart(String str) {
        char a;
        char b;

        if(str.length() >= 3) {
            a = str.charAt(1);
            b = str.charAt(2);

            return (a == 'i' && b == 'x');
        } else {
            return false;
        }
    }

    public String startOz(String str) {
        String s = "";

        if (str.length() > 0 && str.charAt(0) == 'o') {
            s = "o";
        }

        if (str.length() > 1 && str.charAt(1) == 'z') {
            if(s.length() > 0) {
                s = s + 'z';
            } else {
                s = "z";
            }
        }

        return s;
    }

    public int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public int close10(int a, int b) {
        if (Math.abs( a - 10) == Math.abs(b - 10)) {
            return 0;
        } else if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        } else {
            return b;
        }
    }

    public boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40) ) || ( (a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    public int max1020(int a, int b) {
        if( ((a > 9 && a < 21) ) && ((b > 9 && b < 21) )) {
            if(a>b) {
                return a;
            } else {
                return b;
            }
        } else if (a > 9 && a < 21) {
            return a;
        } else if (b > 9 && b < 21) {
            return b;
        } else {
            return 0;
        }
    }

    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }

        return (count > 0 && count < 4);
    }

    public boolean lastDigit(int a, int b) {

        if (a < 10 && b < 10) {
            return a == b;
        } else if (a < 10) {
            return a == b % 10;
        } else if (b < 10) {
            return a % 10 == b;
        } else {
            return a % 10 == b % 10;
        }
    }

    public String endUp(String str) {String toChange = null;

        if(str.length() < 4) {
            return str.toUpperCase();
        } else {
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
        }
    }

    public String everyNth(String str, int n) {
        StringBuilder s = new StringBuilder();

        s.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if(i%n == 0) {
                s.append(str.charAt(i));
            }
        }

        return s.toString();
    }








}
