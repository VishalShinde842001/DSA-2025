package com.Recursion.Week1234;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("isSorted() =====> " + isSorted(arr, 0));
    }

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        if (arr[index] > arr[index + 1]) return false;
        return isSorted(arr, index + 1);
    }

}
