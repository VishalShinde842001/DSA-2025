package com.Recursion.Week1234;

public class InsertStartIfConsecutiveSameChars {
    public static void main(String[] args) {
        System.out.println(putStar("VVishaall"));
    }

    public static String putStar(String str) {
        return doOperation(str, ' ');
    }

    public static String doOperation(String str, char prev) {
        if (str.isEmpty()) {
            return "";
        }

        char current = str.charAt(0);
        if (prev == current) {
            return "*" + current + doOperation(str.substring(1), current);
        } else {
            return current + doOperation(str.substring(1), current);
        }
    }
}
