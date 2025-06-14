package com.Recursion.Week1234;

public class MoveAllOccuranceToEnd {

    public static void main(String[] args) {
        System.out.println(moveAllToEnd("dddabcdabcabdc",'d'));
    }

    public static String moveAllToEnd(String str, char target) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);
        if (ch == target) {
            return moveAllToEnd(str.substring(1), target) + ch;
        } else {
            return ch + moveAllToEnd(str.substring(1), target);
        }
    }
}
