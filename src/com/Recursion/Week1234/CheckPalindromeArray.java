package com.Recursion.Week1234;

public class CheckPalindromeArray {

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println("checkPalindrome(arr)===========>" + checkPalindrome(arr));
    }

    public static boolean checkPalindrome(int[] arr) {
        return checkPalindromeHelper(arr, 0, arr.length - 1);
    }

    public static boolean checkPalindromeHelper(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return true;
        }

        if (arr[startIndex] != arr[endIndex]) {
            return false;
        }
        return checkPalindromeHelper(arr, startIndex + 1, endIndex - 1);
    }
}
