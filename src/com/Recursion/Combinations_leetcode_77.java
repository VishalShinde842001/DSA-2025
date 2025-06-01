package com.Recursion;

import java.util.List;
import java.util.ArrayList;

public class Combinations_leetcode_77 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combineHelper(n, k, 1, new ArrayList<>(), result);
        return result;
    }

    public void combineHelper(int n, int k, int current, List<Integer> currentList, List<List<Integer>> result) {
        if (currentList.size() == k) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        if (current > n) {
            return;
        }

        currentList.add(current);
        combineHelper(n, k, current + 1, currentList, result);
        currentList.remove(currentList.size() - 1);
        combineHelper(n, k, current + 1, currentList, result);
    }
}
