package com.Recursion.RevisionWeek4;

import java.util.ArrayList;

public class StringPermutationWithSpace {
    public static void main(String[] args) {
        StringPermutationWithSpace s = new StringPermutationWithSpace();
        for (String str : s.permutation("ABC")) {
            System.out.println(str);
        }
    }

    ArrayList<String> permutation(String s) {
        // Code Here
        ArrayList<String> result = new ArrayList<>();
        permutationList(s, "", result, 0);
        return result;
    }

    public void permutationList(String s, String formed, ArrayList<String> result, int index) {
        System.out.println("Formed :" + formed);
        if (index == s.length()) {
            result.add(formed);
            return;
        }


        permutationList(s, formed + s.charAt(index), result, index + 1);
        if(index!=0){
        permutationList(s, formed + " " + s.charAt(index), result, index + 1);}
    }
}
