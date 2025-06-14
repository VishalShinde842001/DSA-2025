package com.Recursion.Week1234;

public class OccuranceOfCharacter {

    public static void main(String[] args) {
        System.out.println(occurance("occurance",'c'));
    }

    public static int occurance(String str, char target) {
        return counter(str, 0, target);
    }

    public static int counter(String str, int count, char target) {
        if (str.isEmpty()) {
            return count;
        }

        char ch = str.charAt(0);
        if (ch == target) {
            return counter(str.substring(1), count + 1, target);
        } else {
            return counter(str.substring(1), count, target);
        }
    }
}
