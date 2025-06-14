package com.Recursion.Week5;

public class CountZeroInArray {
    public static void main(String[] args) {

    }

    int countZeroes(int[] arr) {
        return countHelper(arr, 0, 0);

    }

    int countHelper(int[] arr, int index, int count) {
        if (index == arr.length) {
            return count;
        }

        if (arr[index] == 0) {
            count++;
        }
        return countHelper(arr, index + 1, count);
    }
}
