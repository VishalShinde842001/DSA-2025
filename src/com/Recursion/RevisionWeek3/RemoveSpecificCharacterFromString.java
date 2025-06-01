package com.Recursion.RevisionWeek3;

public class RemoveSpecificCharacterFromString {

    public static void main(String[] args) {
        System.out.println(removeChar("Vxxxxxixxxxxsxxxxxhxxxalxxxxxxxxxxxxx", 'x', 0));
    }

    public static String removeChar(String str, char target, int index) {
        if (index >= str.length()) {
            return str;
        }

        char ch = str.charAt(index);
        if (ch != target) {
            return removeChar(str, target, index + 1);
        } else {
            String firstString = str.substring(0, index);
            String lastString = str.substring(index + 1);
            System.out.println("First :" + firstString);
            System.out.println("Second :" + lastString);
            System.out.println("Index :" + index);
            return removeChar(firstString + lastString, target, index );
        }
    }
}
