package com.Recursion.RevisionWeek2;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        System.out.println(reverse("ednihS lahsiV"));
    }

    public static String reverse(String str) {
        int length = str.length();
        if (length == 0) {
            return ""; // return empty string for base case
        }

        return str.charAt(length - 1) + reverse(str.substring(0, length - 1));
    }

}
