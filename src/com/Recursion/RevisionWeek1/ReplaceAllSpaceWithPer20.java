package com.Recursion.RevisionWeek1;

public class ReplaceAllSpaceWithPer20 {

    public static void main(String[] args) {
        System.out.println(replaceAllSpaces("Vishal Shinde",""));
    }


    public static String replaceAllSpaces(String str, String newString) {
        if (str.isEmpty()) {
            return newString;
        }
        char ch = str.charAt(0);
        if (ch == ' ') {
            return replaceAllSpaces(str.substring(1), newString+"%20");
        } else {
            return replaceAllSpaces(str.substring(1), newString+ch);
        }
    }
}
