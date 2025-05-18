package com.Recursion.RevisionWeek2;

public class CheckStringPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalidrome("ABCCBA", 0));
    }

    public static boolean isPalidrome(String str, int firstIndex) {

        int length = str.length();
        int lastIndex = length - 1 - firstIndex;

        System.out.println("First Index :" + firstIndex);
        System.out.println("Last Index :" + lastIndex);
        if (firstIndex >= lastIndex) {
            return true;
        }

        if (str.charAt(firstIndex) != str.charAt(lastIndex)) {
            return false;
        }
        return isPalidrome(str, firstIndex + 1);

    }
}
