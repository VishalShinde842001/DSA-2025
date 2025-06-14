package com.Recursion.Week1234;

public class ReplacePiWith3Point14 {

    public static void main(String[] args) {
        System.out.println(replacePiWithValue("pi*pi"));
    }

    public static String replacePiWithValue(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);
        if (str.startsWith("pi")) {
            return "3.14" + replacePiWithValue(str.substring(2));
        } else {
            return ch + replacePiWithValue(str.substring(1));
        }
    }
}
