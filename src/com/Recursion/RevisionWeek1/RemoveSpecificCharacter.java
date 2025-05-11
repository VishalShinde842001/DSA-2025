package com.Recursion.RevisionWeek1;

public class RemoveSpecificCharacter {

    public static void main(String[] args) {
        System.out.println(removeSpecificCharacter("Vishal", 'a', "", 0));
    }

    public static String removeSpecificCharacter(String str, char target, String formedString, int index) {
        if (index == str.length()) {
            return formedString;
        }

        char ch = str.charAt(index);
        if (ch != target) {
            return ch+removeSpecificCharacter(str, target, formedString, index + 1) ;
        } else {
            return removeSpecificCharacter(str, target, formedString, index + 1);
        }
    }
}
