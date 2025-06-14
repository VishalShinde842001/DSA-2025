package com.Recursion.Week1234;

public class RemoveAllCharacter {

    public static void main(String[] args) {
        System.out.println(removeSpecificCharacter("AVishAlshinde",'h'));
    }

    public static String removeSpecificCharacter(String string, char ch) {
        return removeHelper(string, ch, "");
    }

    public static String removeHelper(String str, char target, String newString) {

        if (str.isEmpty()) {
            return newString;
        }
        char ch = str.charAt(0);

        if (str.charAt(0) != target) {
            return removeHelper(str.substring(1), target, newString + ch);
        } else {
            return removeHelper(str.substring(1), target, newString);
        }
    }
    public static String removeHelper(String str, char target) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        // If the current character is the target, skip it
        if (ch == target) {
            return removeHelper(str.substring(1), target);
        } else {
            // Include current character and continue
            return ch + removeHelper(str.substring(1), target);
        }
    }

}
