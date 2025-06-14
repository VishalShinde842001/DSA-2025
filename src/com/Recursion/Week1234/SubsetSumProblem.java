package com.Recursion.Week1234;

public class SubsetSumProblem {

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubsetSum(arr, sum));
    }

    public static Boolean solve(int[] arr, int num, int actualSum, int index) {
        if (num == actualSum) {
            return true;
        }
        if (index == arr.length) {
            return false;
        }
        int element = arr[index];

        boolean isSolve = solve(arr, num, actualSum + element, index + 1);
        if (isSolve) {
            return true;
        }
        boolean isSovled2 = solve(arr, num, actualSum, index + 1);

        if (isSovled2) {
            return true;
        }

        return false;

    }

    static Boolean isSubsetSum(int[] arr, int sum) {
        return solve(arr, sum, 0, 0);
    }
}
