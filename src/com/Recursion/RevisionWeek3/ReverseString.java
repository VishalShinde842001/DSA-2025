package com.Recursion.RevisionWeek3;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Vishal", ""));
        System.out.println(reverseIterative("Vishal"));
    }

    public static String reverse(String actual, String output) {
        int length = actual.length();
        if (length == 0) {
            return output;
        }

        char lastChar = actual.charAt(length - 1);

        return reverse(actual.substring(0, length - 1), output + lastChar);
    }

    public static String reverseIterative(String str) {

        StringBuilder output = new StringBuilder();
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            output.append(str.charAt(i));
        }
        return output.toString();
    }
}
