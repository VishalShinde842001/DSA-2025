package com.Recursion.AdvancePermutation;

import java.util.ArrayList;

public class NoVowelAtFirst {
    public static void main(String[] args) {
        System.out.println(permutations("ABC"));
    }

    public static ArrayList<String> permutations(String str) {
        return permutationsHelper(str, "", new ArrayList<>(), 0);
    }

    public static ArrayList<String> permutationsHelper(String input, String current, ArrayList<String> result, int index) {
        if (index == input.length()) {
            if (!isVowel(current.charAt(0))) {
                result.add(current);
            }
            return result;
        }

        char ch = input.charAt(index);
        int i = 0;

        while (i <= current.length()) {
            String firstPart = current.substring(0, i);
            String lastPart = current.substring(i);
            permutationsHelper(input, firstPart + ch + lastPart, result, index + 1);
            i++;
        }

        return result;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

}
