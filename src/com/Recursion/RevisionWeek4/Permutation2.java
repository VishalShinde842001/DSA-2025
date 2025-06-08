package com.Recursion.RevisionWeek4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation2 {

    public static void main(String[] args) {
        int[] nums = {1, 1,2};
        Permutation2 p = new Permutation2();
        for (List<Integer> li : p.permuteUnique(nums)) {
            System.out.println(li);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visitedIndex = new boolean[nums.length];
        Set<String> duplicate = new HashSet<String>();
        solve(nums, new ArrayList<>(), result, visitedIndex, duplicate);
        return result;
    }

    public void solve(int[] nums, ArrayList<Integer> currentList, List<List<Integer>> result, boolean[] visitedIndex, Set<String> duplicate) {
        int n = nums.length;

        if (currentList.size() >= 1) {
            String create = create(currentList);
            System.out.println("Created :" + create);
            if (duplicate.contains(create)) {
                System.out.println("Duplicate :" + duplicate);
                return;
            }
            duplicate.add(create);
        }
        // System.out.println("List Size :" + currentList);
        // System.out.println("List :" + currentList);
        // System.out.println("Current Length :" + n);


        if (currentList.size() == n) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visitedIndex[i]) {
                continue;
            }

            System.out.println("Current Size :" + currentList.size());


            currentList.add(nums[i]);
            visitedIndex[i] = true;
            solve(nums, currentList, result, visitedIndex, duplicate);
            currentList.remove(currentList.size() - 1);
            visitedIndex[i] = false;
        }
    }

    public String create(List<Integer> currentList) {

        StringBuilder str = new StringBuilder("");
        for (Integer i : currentList) {
            str.append("_").append(i).append("_");
        }
        return str.toString();
    }
}
