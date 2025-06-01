package com.Recursion.RevisionWeek3;

public class CountAllOccurances {
    public static void main(String[] args) {
        System.out.println(counter("Vaisahal", 'a', 0, 0));
    }

    public static int counter(String str, char target, int currentIndex, int count) {
        int len = str.length();
        if (currentIndex >= len) {
            return count;
        }
        if (str.charAt(currentIndex) == target) {
            return counter(str, target, currentIndex + 1, count + 1);
        } else {
            return counter(str, target, currentIndex + 1, count);
        }
    }
}
