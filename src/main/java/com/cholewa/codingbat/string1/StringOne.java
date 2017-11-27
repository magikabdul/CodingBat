package com.cholewa.codingbat.string1;

public class StringOne {

    public String helloName(String name) {

        return "Hello " + name + "!";
    }

    /*
    *   Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
    *   The string may be any length, including 0. Note: use .equals() to compare 2 strings.

        hasBad("badxx") → true
        hasBad("xbadxx") → true
        hasBad("xxbadxx") → false
    * */

    public boolean hasBad(String str) {
        final String CODE = "bad";

        if (str.length() < 3) {
            return false;
        } else if (str.length() == 3) {
            if (str.equals(CODE)) {
                return true;
            } else {
                return false;
            }
        } else if (str.length() == 4) {
            if (str.substring(0, 3).equals(CODE) || str.substring(1).equals(CODE)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (str.substring(0, 3).equals(CODE) || str.substring(1, 4).equals(CODE)) {
                return true;
            } else {
                return false;
            }
        }
    }

    /*
    *   Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string,
    *   except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string.
    *   So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
    *
    *   startWord("hippo", "hi") → "hi"
    *   startWord("hippo", "xip") → "hip"
    *   startWord("hippo", "i") → "h"
    *
    * */

    public String startWord(String str, String word) {

        if (str.length() >= word.length()) {
            if (str.substring(1, word.length() + 1).equals(word.substring(1))) {
                return str.substring(0, 1 + word.length());
            } else {
                return "";
            }
        } else {
            return "";
        }
    }
}
