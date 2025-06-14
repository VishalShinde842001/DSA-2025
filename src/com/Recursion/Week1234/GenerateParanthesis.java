package com.Recursion.Week1234;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {


    //they will give number you just need to create genuine combinations of bracket
    // if n = 2 ==> "()"
    // if n = 3 ==> ["((()))","(()())","(())()","()(())","()()()"]

    public static void main(String[] args) {
        GenerateParanthesis generateParanthesis = new GenerateParanthesis();
        System.out.println(generateParanthesis.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        return genParHelper(n, "(", new ArrayList<>(), 1, 0);
    }

    public List<String> genParHelper(int n, String currentString, List<String> currentList, int openingCount, int closingCount) {

        // 💥 Early termination condition to break recursion
        if (closingCount > 0 && openingCount < closingCount) {
            return currentList; // stop going deeper
        }

        if (currentString.length() == n * 2) {
            if (openingCount == closingCount) {
                currentList.add(currentString);
            }
            return currentList;
        }

        genParHelper(n, currentString + "(", currentList, openingCount + 1, closingCount);
        genParHelper(n, currentString + ")", currentList, openingCount, closingCount + 1);

        return currentList;
    }


}
