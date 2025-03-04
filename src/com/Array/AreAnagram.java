package com.Array;

import java.util.HashMap;

public class AreAnagram {
    public static void main(String[] args) {
        System.out.println(areAnagrams("geeks", "kseeg"));
    }

    public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s1.length(); i++) {
            if (myMap.containsKey(s1.charAt(i))) {
                myMap.put(s1.charAt(i), myMap.get(s1.charAt(i)) + 1);
            } else {
                myMap.put(s1.charAt(i), 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (myMap.containsKey(s2.charAt(i))) {
                if (myMap.get(s2.charAt(i)) == 0) {
                    return false;
                }
                myMap.put(s2.charAt(i), myMap.get(s2.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
