package com.Recursion.RevisionWeek4;

import java.util.List;
import java.util.ArrayList;

public class GenerateAllBinaryString {

    public static void main(String[] args) {
        for (String str : generateBinaryStrings(3)) {
            System.out.println(str);
        }
    }

    public static List<String> generateBinaryStrings(int n) {
        List<String> result = new ArrayList<>();
        generateAll(n, 0, result, "", ' ');
        return result;

    }

    public static void generateAll(int n, int index, List<String> result, String current, char previous) {
        if (index == n) {
            result.add(current);
            return;
        }

        generateAll(n, index + 1, result, current + "0", '0');

        if (previous != '1') {
            generateAll(n, index + 1, result, current + "1", '1');
        }

    }
}
