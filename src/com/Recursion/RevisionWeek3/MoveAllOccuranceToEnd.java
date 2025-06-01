package com.Recursion.RevisionWeek3;

public class MoveAllOccuranceToEnd {
    public static void main(String[] args) {
        System.out.println(moveAllOccurances("Visssshal", "", 's', 0));
    }

    public static String moveAllOccurances(String str, String newWord, char target, int index) {
//        System.out.println("String :" + newWord);
//        System.out.println("Index :" + index);
        if (index >= str.length()) {
            return newWord;
        }

        char currentChar = str.charAt(index);
        if (currentChar != target) {
            System.out.println("Inside If :" + index);
            return moveAllOccurances(str, newWord + currentChar, target, index + 1);
        } else {
            System.out.println("Inside else :" + index);
            return moveAllOccurances(str, newWord, target, index + 1) + currentChar;
        }
    }
}
