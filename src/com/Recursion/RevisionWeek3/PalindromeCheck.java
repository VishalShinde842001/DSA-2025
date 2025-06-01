package com.Recursion.RevisionWeek3;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "aa";
        System.out.println(palindromeCheck(str, 0, str.length() - 1) ? "Palindrome" : "No Palindrome");
        System.out.println(palindromeCheckIterative("aaa"));
    }

    public static boolean palindromeCheck(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return palindromeCheck(str, start + 1, end - 1);
    }

    public static boolean palindromeCheckIterative(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
