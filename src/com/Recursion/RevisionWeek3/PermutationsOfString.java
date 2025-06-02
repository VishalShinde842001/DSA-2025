package com.Recursion.RevisionWeek3;

import java.util.ArrayList;

public class PermutationsOfString {
    public static void main(String[] args) {
        System.out.println(permutations("ABC"));
    }

    public static ArrayList<String> permutations(String normal) {
        return permutationHelper(normal, "", 0, new ArrayList<>());
    }

    public static ArrayList<String> permutationHelper(String normal, String formed, int index, ArrayList<String> newArr) {
        if (index >= normal.length()) {
            System.out.println("In :" + index);
            newArr.add(formed);
            return newArr;
        }

        int lengthOfFormed = formed.length();
        char ch = normal.charAt(index);
        for (int i = 0; i <= lengthOfFormed; i++) {
            String firstPart = formed.substring(0, i);
            String lastPart = formed.substring(i);
            permutationHelper(normal, firstPart + ch + lastPart, index + 1, newArr);
        }
        return newArr;
    }


}
