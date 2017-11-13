package org.cholewa.codingbat.warmup1;

public class WarmUp1 {

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1, str.length());
    }

    public String frontBack(String str) {
        if(str.length() == 0) {
            return "";
        }
        else if(str.length() == 1) {
            return str;
        }
        else if(str.length() == 2) {
            return str.substring(1) + str.substring(0, 1);
        }   else  {
            return str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        }
    }

    public boolean or35(int n) {
        if(n % 3 == 0 || n % 5 == 0) {
            return true;
        }   else {
            return false;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if(talking == true && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }

    public String delDel(String str) {
        if(str.length() <= 3) {
            return str;
        }

        else if(str.substring(1, 4).equals("del")) {
            if(str.length() <= 4) {
                return str.substring(0, 1);
            }   else {
                return str.substring(0, 1) + str.substring(4, str.length());
            }
        }   else {
            return str;
        }
    }

    public boolean in1020(int a, int b) {
        if((a >= 10 && a <= 20) || ( b >= 10 && b <= 20)) {
            return true;
        }   else { return false; }
    }

    public boolean mixStart(String str) {
        char a;
        char b;

        if(str.length() >= 3) {
            a = str.charAt(1);
            b = str.charAt(2);

            if(a == 'i' && b == 'x') {
                return true;
            }   else {
                return false;
            }
        }

        else
            return false;
    }

    public String endUp(String str) {String toChange = null;

        if(str.length() < 4) {
            return str.toUpperCase();
        }

        else {
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
        }
    }

    public boolean lastDigit(int a, int b) {

        if(a < 10 && b < 10) {
            return a == b;
        }
        else if(a < 10) {
            return a == b % 10;
        }
        else if(b < 10) {
            return a % 10 == b;
        }
        else{
            return a % 10 == b % 10;
        }
    }

    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e') {
                count++;
            }
        }

        if(count > 0 && count < 4) { return true; }
        else { return false; }
    }

    public int sumDouble(int a, int b) {
        if(a == b) { return 2 * (a + b); }
        else return a + b;
    }

    public String front22(String str) {
        if(str.length() < 3) {
            return str + str + str;
        } else {
            return str.substring(0,2) + str + str.substring(0,2);
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

    public String startOz(String str) {
        String s = "";

        if(str.length() > 0 && str.charAt(0) == 'o') {
            s = "o";
        }

        if(str.length() > 1 && str.charAt(1) == 'z') {
            if(s.length() > 0) {
                s = s + 'z';
            }   else {
                s = "z";
            }

        }

        return s;
    }

    public boolean in3050(int a, int b) {
        if( ( (a >= 30 && a <= 40) && (b >= 30 && b <= 40) ) || ( (a >= 40 && a <= 50) && (b >= 40 && b <= 50) ) ) {
            return true;
        }   else {
            return false;
        }
    }

    public boolean makes10(int a, int b) {
        return (a + b == 10) || a == 10 || b == 10;
    }

    public String everyNth(String str, int n) {
        StringBuilder s = new StringBuilder();

        s.append(str.charAt(0));

        for(int i = 1; i < str.length(); i++) {
            if(i%n == 0) {
                s.append(str.charAt(i));
            }
        }

        return s.toString();
    }

    public String backAround(String str) {
        StringBuilder s = new StringBuilder();

        s.append(str.charAt(str.length() - 1));
        s.append(str.substring(0, str.length()));
        s.append(str.charAt(str.length() - 1));

        return s.toString();
    }

    public boolean startHi(String str) {
        if(str.length() > 1) {
            return str.substring(0,2).equals("hi");
        }   else {
            return false;
        }
    }

    public int close10(int a, int b) {
        if( Math.abs( a - 10) == Math.abs(b - 10)) {
            return 0;
        }   else if( Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        }   else {
            return b;
        }
    }

    public String front3(String str) {
        if(str.length() < 3) {
            return str.substring(0,str.length()) + str.substring(0,str.length()) + str.substring(0,str.length());
        }   else {
            return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
        }
    }

}


class Application {

    public static void main(String[] args) {
        WarmUp1 w = new WarmUp1();

        System.out.println(w.front3("qw"));

    }


}

