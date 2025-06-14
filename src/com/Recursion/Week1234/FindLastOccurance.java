package com.Recursion.Week1234;

public class FindLastOccurance {
    public static void main(String[] args) {
        int[] arr={100};
        System.out.println(lastOccurrence(arr,100,arr.length-1));
    }

    public static int lastOccurrence(int[] arr, int target, int currentIndex) {
        if (currentIndex < 0) {
            return -1;
        }
        if (arr[currentIndex] == target) {
            return currentIndex;
        }

        return lastOccurrence(arr, target, currentIndex - 1);
    }
}
