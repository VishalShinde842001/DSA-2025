package com.Recursion.RevisionWeek3;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsets {
    public static void main(String[] args) {

    }

    public static List<String> printAllSubsetsOfString(String input) {
        ArrayList<String> outputList = new ArrayList<>();
        helper("", input, outputList);
        return outputList;
    }

    public static void helper(String output, String actual, ArrayList<String> outputList) {
        // Base case: when the input string is empty, add the current output to the list
        if (actual.length() == 0) {
            outputList.add(output);
            return;
        }

        // Take first character
        char ch = actual.charAt(0);
        String remaining = actual.substring(1);

        // Include the character
        helper(output + ch, remaining, outputList);

        // Exclude the character
        helper(output, remaining, outputList);
    }


}
