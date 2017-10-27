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
}


class Application {

    public static void main(String[] args) {
        WarmUp1 w = new WarmUp1();

        System.out.println(w.delDel("del"));

    }


}


