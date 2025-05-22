package com.Recursion;

import java.util.List;
import java.util.ArrayList;

public class GenerateAllBinaryString {

    public static void main(String[] args) {
        System.out.println(generateBinaryStrings(3));
    }
    public static List<String> generateBinaryStrings(int n) {
        return generateAll("", n, '0', 0); // start with '0' as dummy previous char
    }

    public static List<String> generateAll(String processed, int n, char prevChar, int index) {
        if (index == n) {
            ArrayList<String> result = new ArrayList<>();
            result.add(processed);
            return result;
        }

        List<String> results = new ArrayList<>();
        results.addAll(generateAll(processed + "0", n, '0', index + 1));

        if (prevChar != '1') {
            results.addAll(generateAll(processed + "1", n, '1', index + 1));
        }

        return results;
    }
}


