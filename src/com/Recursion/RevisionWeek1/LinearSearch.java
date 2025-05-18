package com.Recursion.RevisionWeek1;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int target = 4;
        System.out.println(linearSearch(arr, target));
    }

    public static int linearSearch(int[] arr, int target) {
        return linearSearchHelper(arr, target, 0);
    }

    public static int linearSearchHelper(int[] arr, int target, int index) {
        if (arr.length <= index) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }

        return linearSearchHelper(arr, target, index + 1);
    }
}
