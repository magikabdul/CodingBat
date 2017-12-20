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



//    theEnd	 withouEnd2	 middleTwo
//    endsLy	 nTwice	 twoChar
//    middleThree	 hasBad	 atFirst
//    lastChars	 conCat	 lastTwo
//    seeColor	 frontAgain	 minCat
//    extraFront	 without2	 deFront
//    startWord	 withoutX	 withoutX2
}
