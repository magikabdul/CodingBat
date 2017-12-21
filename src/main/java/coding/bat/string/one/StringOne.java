package coding.bat.string.one;

public class StringOne {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag +">";
    }

    public String makeOutWord(String out, String word) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(out.substring(0, 2));
        stringBuilder.append(word);
        stringBuilder.append(out.substring(2, 4));

        return stringBuilder.toString();
    }

    public String extraEnd(String str) {
        if (str.length() > 2) {
            return str.substring(str.length() - 2, str.length()) +
                    str.substring(str.length() - 2, str.length()) +
                    str.substring(str.length() - 2, str.length());
        } else {
            return str + str + str;
        }
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0,2);
        }
    }

    public String firstHalf(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length() / 2; i++){
            stringBuilder.append(str.substring(i, i + 1));
        }

        return stringBuilder.toString();
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return "";
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(str.substring(str.length() - 2, str.length()));

        for (int i = 0; i < str.length() - 2; i++){
            stringBuilder.append(str.substring(i, i + 1));
        }

        return stringBuilder.toString();
    }

    public String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public String withouEnd2(String str) {
        if (str.length() < 3) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str) {
        return (str.endsWith("ly"));
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    public String twoChar(String str, int index) {
        if (str.length() - 2 < index || index < 0) {
            return str.substring(0,2);
        } else {
            return str.substring(index, index + 2);
        }
    }

    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        final String CODE = "bad";

        if (str.length() < 3) {
            return false;
        } else if (str.length() == 3) {
            return (str.equals(CODE));
        } else if (str.length() == 4) {
            return (str.substring(0, 3).equals(CODE) || str.substring(1).equals(CODE)) ;
        } else {
            return (str.substring(0, 3).equals(CODE) || str.substring(1, 4).equals(CODE));
        }
    }

    public String atFirst(String str) {
        if (str.length() < 2){
            if (str.length() == 1) {
                return str + "@";
            } else {
                return "@@";
            }
        } else {
            return str.substring(0, 2);
        }
    }

    public String lastChars(String a, String b) {
        if (a.length() > 0 && b.length() > 0) {
            return a.substring(0, 1) + b.substring(b.length() - 1);
        } else {
            if (a.length() == 0 && b.length() == 0) {
                return "@@";
            } else if (a.length() == 0) {
                return "@" + b.substring(b.length() - 1);
            } else {
                return a.substring(0, 1) + "@";
            }
        }
    }

    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0) {
            if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
                return a + b.substring(1);
            } else {
                return a + b;
            }
        } else if (a.length() == 0 && b.length() == 0) {
            return "";
        } else if (a.length() == 0) {
            return b;
        } else {
            return a;
        }
    }

    public String lastTwo(String str) {
        if (str.length() > 1){
            return str.substring(0, str.length() - 2) + str.substring(str.length() - 1, str.length()) +
                    str.substring(str.length() - 2, str.length() - 1);
        } else {
            return str;
        }
    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    public boolean frontAgain(String str) {
        return (str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2, str.length())));
    }

    public String minCat(String a, String b) {
        if (a.length() == b.length()){
            return a + b;
        } else if (a.length() > b.length()){
            return a.substring(a.length() - b.length(), a.length()) + b;
        } else {
            return a + b.substring(b.length() - a.length(), b.length());
        }
    }

    public String extraFront(String str) {
        if (str.length() < 2){
            return str + str + str;
        } else {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
    }

    public String without2(String str) {
        if (str.length() == 1) {
            return str;
        } else if (str.length() < 3) {
            return "";
        } else if (str.substring(str.length() - 2).equals(str.substring(0, 2))) {
            return str.substring(2);
        } else {
            return str;
        }
    }

    public String deFront(String str) {
        StringBuilder sb = new StringBuilder();

        if (str.length() >= 1) {
            if (str.charAt(0) == 'a') {
                sb.append(str.substring(0, 1));
            }
        }
        if (str.length() >= 2) {
            if (str.charAt(1) == 'b') {
                sb.append(str.substring(1, 2));
            }
        }
        if (str.length() > 2) {

            sb.append(str.substring(2));
        }

        return sb.toString();
    }

    public String startWord(String str, String word) {
        int comparatorLength = word.length();

        if (str.length() < word.length()) {
            return "";
        } else if (str.length() == word.length()) {
            if (str.substring(1).equals(word.substring(1))) {
                return str.substring(0);
            }
        } else {
            if (str.substring(1, comparatorLength).equals(word.substring(1))) {
                return str.substring(0, comparatorLength);
            }
        }

        return "";
    }

    public String withoutX(String str) {
        if (str.startsWith("x") && str.endsWith("x")) {
            if (str.length() > 1) {
                return str.substring(1, str.length() - 1);
            } else {
                return "";
            }
        } else if (str.startsWith("x")) {
            if (str.length() > 0) {
                return str.substring(1);
            } else {
                return "";
            }
        } else if (str.endsWith("x")) {
            return str.substring(0, str.length() - 1);
        } else {
            return str;
        }
    }

    public String withoutX2(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            if (i < 2 && !str.substring(i, i+1).equals("x")){
                stringBuilder.append(str.substring(i, i + 1));
            }   else if (i >= 2){
                stringBuilder.append(str.substring(i, i + 1));
            }
        }
        return stringBuilder.toString();
    }
}
