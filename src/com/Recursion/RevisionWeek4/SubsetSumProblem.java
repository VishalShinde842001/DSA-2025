package com.Recursion.RevisionWeek4;

public class SubsetSumProblem {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        System.out.println(isSubsetSum(arr, 120));
        ;
    }

    static Boolean isSubsetSum(int[] arr, int sum) {
        return helper(arr, sum, 0, 0);
    }

    static Boolean helper(int[] arr, int sum, int index, int currentSum) {
        System.out.println("Current Sum :" + currentSum);

        if (currentSum > sum) {
            return false;
        }
        if (sum == currentSum) {
            System.out.println("Sum :" + sum);
            System.out.println("Current Sum :" + currentSum);
            return true;
        }
        if (index == arr.length) {
            return false;
        }

        if (helper(arr, sum, index + 1, currentSum + arr[index])) {
            return true;
        }


        if (helper(arr, sum, index + 1, currentSum)) {
            return true;
        }
        return false;
    }
}
