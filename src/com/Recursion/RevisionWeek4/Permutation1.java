package com.Recursion.RevisionWeek4;

import java.util.List;
import java.util.ArrayList;

public class Permutation1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Permutation1 p = new Permutation1();
        for (List<Integer> li : p.permute(nums)) {
            System.out.println(li);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visitedIndex = new boolean[nums.length];
        solve(nums, new ArrayList<>(), result, visitedIndex);
        return result;
    }

    public void solve(int[] nums, ArrayList<Integer> currentList, List<List<Integer>> result, boolean[] visitedIndex) {
        int n = nums.length;
        System.out.println("List Size :" + currentList);
        System.out.println("List :" + currentList);
        System.out.println("Current Length :" + n);
        if (currentList.size() == n) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visitedIndex[i]) {
                continue;
            }
            currentList.add(nums[i]);
            visitedIndex[i] = true;
            solve(nums, currentList, result, visitedIndex);
            currentList.remove(currentList.size() - 1);
            visitedIndex[i] = false;
        }
    }
}
