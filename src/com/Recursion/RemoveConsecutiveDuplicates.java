package com.Recursion;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("AAABBCCCAdd"));
    }


    public static String removeConsecutiveDuplicates(String str) {
        return removeCons(str, ' ', "");
    }

    public static String removeCons(String str, char prev, String newString) {
        if (str.isEmpty()) {
            return "";
        }
        char firstChar = str.charAt(0);

        if (firstChar == prev) {
            return removeCons(str.substring(1), firstChar, newString);
        } else {
            return firstChar + removeCons(str.substring(1), firstChar, newString);
        }
    }
}
