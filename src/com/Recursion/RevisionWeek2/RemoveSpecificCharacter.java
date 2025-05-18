package com.Recursion.RevisionWeek2;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        System.out.println(removeCharacter("VZIZSHZAZLZZ", 'Z', 0));
    }

    public static String removeCharacter(String str, char target, int currentIndex) {

        System.out.println("Current Index " + currentIndex);
        System.out.println("str.length()======>" + str.length());
        if (str.length() <= currentIndex) {
            return str;
        }

        char ch = str.charAt(currentIndex);

        if (ch == target) {
            return removeCharacter(str.substring(0, currentIndex) + str.substring(currentIndex + 1), target, currentIndex);
        } else {
            return removeCharacter(str, target, currentIndex + 1);
        }
    }

}
