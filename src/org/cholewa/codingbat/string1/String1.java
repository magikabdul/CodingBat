package org.cholewa.codingbat.string1;

public class String1 {

    public String firstHalf(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length()/2; i++){
            stringBuilder.append(str.substring(i, i + 1));
        }

        return stringBuilder.toString();
    }

    public String right2(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(str.substring(str.length()-2, str.length()));

        for (int i = 0; i < str.length()-2; i++){
            stringBuilder.append(str.substring(i, i+1));
        }

        return stringBuilder.toString();
    }

    public String makeOutWord(String out, String word) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(out.substring(0,2));
        stringBuilder.append(word);
        stringBuilder.append(out.substring(2,4));

        return stringBuilder.toString();
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

    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n, str.length());
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }   else {
            return str.substring(0,2);
        }
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public boolean frontAgain(String str) {
        if (str.length() > 1 && str.substring(0,2).equals(str.substring(str.length()-2, str.length()))){
            return true;
        }   else{
            return false;
        }
    }

    public String lastTwo(String str) {
        if (str.length() > 1){
            return str.substring(0, str.length()-2) + str.substring(str.length()-1, str.length()) +
                    str.substring(str.length()-2, str.length()-1);
        }   else {
            return str;
        }
    }

    public String atFirst(String str) {
        if (str.length() < 2){
            if (str.length() == 1) {
                return str + "@";
            }   else{
                return "@@";
            }
        }   else {
            return str.substring(0, 2);
        }
    }

    public String extraFront(String str) {
        if (str.length() < 2){
            return str + str + str;
        }   else {
            return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
        }
    }

    public String minCat(String a, String b) {
        if (a.length() == b.length()){
            return a + b;
        }   else if (a.length() > b.length()){
            return a.substring(a.length()-b.length(), a.length()) + b;
        }   else {
            return a + b.substring(b.length() - a.length(), b.length());
        }
    }


}

class Application{
    public static void main(String[] args) {
        String1 string1 = new String1();

        System.out.println(string1.minCat("Hello", "Hi"));
        System.out.println(string1.minCat("Hello", "java"));
        System.out.println(string1.minCat("java", "Hello"));
    }
}
