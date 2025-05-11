package com.Recursion;

public class FindFirstOccuranceIndexInArray {
    public static void main(String[] args) {
        int[] arr={200};
        System.out.println(firstOccurance(arr,100,0));
    }

    public static int firstOccurance(int[] arr, int target, int curentIndex) {
        if (curentIndex == arr.length) {
            return -1;
        }
        if (arr[curentIndex] == target) {
            return curentIndex;
        }

        return firstOccurance(arr, target, curentIndex + 1);
    }
}
