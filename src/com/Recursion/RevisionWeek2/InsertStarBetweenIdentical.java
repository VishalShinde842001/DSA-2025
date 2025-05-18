package com.Recursion.RevisionWeek2;

public class InsertStarBetweenIdentical {

    public static void main(String[] args) {
        String input = "aabbc";
        String result = insertStar(input);
        System.out.println(result); // Output: a*abb*c
    }

    public static String insertStar(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return insertHelper(str, 1, str.charAt(0) + "");
    }

    public static String insertHelper(String str, int index, String result) {
        if (index == str.length()) {
            return result;
        }

        char current = str.charAt(index);
        char previous = str.charAt(index - 1);

        if (current == previous) {
            result += "*";
        }
        result += current;

        return insertHelper(str, index + 1, result);
    }
}
