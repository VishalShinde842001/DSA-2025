package com.Recursion.RevisionWeek3;

import java.util.ArrayList;

public class AllCombinationsOfString {
    public static void main(String[] args) {
        String input = "ABC";
        for (String str : combinations(input)) {
            System.out.println(str);
        }
    }

    public static ArrayList<String> combinations(String input) {
        ArrayList<String> outputList = new ArrayList<>();
        combinationsHelper(input, "", 0, outputList);
        return outputList;
    }

    public static void combinationsHelper(String input, String output, int index, ArrayList<String> outputList) {
        if (index == input.length()) {
            outputList.add(output);
            return;
        }

        // Include current character
        combinationsHelper(input, output + input.charAt(index), index + 1, outputList);

        // Exclude current character
        combinationsHelper(input, output, index + 1, outputList);
    }
}
