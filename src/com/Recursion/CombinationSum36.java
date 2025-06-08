package com.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum36 {

    public static void main(String[] args) {
        CombinationSum36 cs = new CombinationSum36();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = cs.combinationSum(candidates, target);
        System.out.println(result);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSumHelper(0, 0, new ArrayList<>(), result, candidates, target);
        return result;
    }

    public void combinationSumHelper(int currentIndex, int currentSum, List<Integer> currentList,
                                     List<List<Integer>> result, int[] candidates, int target) {
        if (currentSum > target) {
            return;
        }

        if (currentSum == target) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = currentIndex; i < candidates.length; i++) {
            currentList.add(candidates[i]);
            combinationSumHelper(i, currentSum + candidates[i], currentList, result, candidates, target);
            currentList.remove(currentList.size() - 1); // Backtrack
        }
    }
}
