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

    
}


class Application {

    public static void main(String[] args) {
        WarmUp1 w = new WarmUp1();

        System.out.println(w.front22("do"));

    }


}


