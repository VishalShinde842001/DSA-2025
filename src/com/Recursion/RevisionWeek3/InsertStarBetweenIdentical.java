package com.Recursion.RevisionWeek3;

public class InsertStarBetweenIdentical {
    public static void main(String[] args) {
        System.out.println(putStartIfConsecutiveDuplicate("Vissshhal", "", ' ', 0));
    }

    public static String putStartIfConsecutiveDuplicate(String str, String outputString, char previousChar, int currentIndex) {
        int length = str.length();
        System.out.println("Length :" + length);
        System.out.println("Current Index :" + currentIndex);
        if (currentIndex >= length) {
            return outputString;
        }

        char currentChar = str.charAt(currentIndex);

        if (previousChar != currentChar) {
            return putStartIfConsecutiveDuplicate(str, outputString + currentChar, currentChar, currentIndex + 1);
        } else {
            return putStartIfConsecutiveDuplicate(str, outputString + "*" + currentChar, currentChar, currentIndex + 1);
        }
    }
}
