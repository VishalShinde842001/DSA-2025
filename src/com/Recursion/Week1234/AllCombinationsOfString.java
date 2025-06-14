package com.Recursion.Week1234;

import java.util.ArrayList;
import java.util.List;

public class AllCombinationsOfString {
    public static void main(String[] args) {
        String ourStr = "abc";
        for (String str : combinations(ourStr)) {
            System.out.println(str);
        }
    }

    public static List<String> combinations(String str) {
        return combinationsHelper(str, 0, "");
    }

    public static ArrayList<String> combinationsHelper(String str, int index, String formedString) {
        int length = str.length();
        System.out.println("Index :" + index);
        System.out.println("Length :" + length);
        System.out.println("Formed String : " + formedString);
        System.out.println("=================================================");
        if (index >= length) {
            ArrayList<String> newArr = new ArrayList<>();
            newArr.add(formedString);
            return newArr;
        }
        char currentChar = str.charAt(index);
        ArrayList<String> includeList = combinationsHelper(str, index + 1, formedString + currentChar);
        ArrayList<String> excludeList = combinationsHelper(str, index + 1, formedString);

        includeList.addAll(excludeList);

        return includeList;
    }
}
