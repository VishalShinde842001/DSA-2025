package com.Recursion.RevisionWeek4;

import java.util.List;
import java.util.ArrayList;

public class GenerateParanthesis {

    public static void main(String[] args) {
        GenerateParanthesis gp = new GenerateParanthesis();
        System.out.println(gp.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generator(n, "", result, 0, 0);
        return result;
    }

    public void generator(int n, String str, List<String> strList, int openCount, int closeCount) {

        System.out.println("Str :" + str);
        System.out.println("Close Count :" + closeCount);
        System.out.println("Open Count :" + openCount);
        if (closeCount > openCount || openCount > n) {
            return;
        }
        if (str.length() == 2 * n) {
            strList.add(str);
            return;
        }


        generator(n, str + "(", strList, openCount+1, closeCount );
        generator(n, str + ")", strList, openCount, closeCount + 1);
    }

}
