package com.Recursion.RevisionWeek1;

public class MoveAllCharacterToEnd {
    public static void main(String[] args) {
        System.out.println(moveCharactersToEnd("VZIZSZZZHZZALZZ",'Z',""));
    }

    public static String moveCharactersToEnd(String str, char target, String newString) {
        if (str.isEmpty()) {
            return newString;
        }

        char ch = str.charAt(0);
        if (ch != target) {
            return moveCharactersToEnd(str.substring(1), target, newString+ch);
        } else {
            return moveCharactersToEnd(str.substring(1), target, newString)+ch;
        }
    }
}
