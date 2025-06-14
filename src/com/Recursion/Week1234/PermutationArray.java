package com.Recursion.Week1234;

import java.util.List;
import java.util.ArrayList;

public class PermutationArray {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), used, result);
        return result;
    }

    private static void backtrack(int[] nums, List<Integer> path, boolean[] used, List<List<Integer>> result) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path)); // Found a full permutation
            return;
        }

        for (int i = 0; i < nums.length
                ; i++) {
            if (used[i]) continue; // Skip if already used

            // Choose
            used[i] = true;
            path.add(nums[i]);

            // Explore
            backtrack(nums, path, used, result);

            // Un-choose (Backtrack)
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

    // Driver code to test
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        List<List<Integer>> permutations = permute(array);
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }
}
