package com.Recursion.RevisionWeek1;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Vishal"));
        System.out.println(processUnprocessedApproch("Vishal", "", 5));
    }

    public static String reverse(String str) {
        str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return new String(reverseCharArray(0, str.length() - 1, str.toCharArray()));
//        char[] charArr = str.toCharArray();
//        System.out.println(charArr);
//        char[] reversedCharArr = reverseCharArray(0, charArr.length-1, charArr);
//        System.out.println(reversedCharArr);
//        return new String(reversedCharArr);
    }

    public static char[] reverseCharArray(int start, int end, char[] arr) {
        if (start >= end) {
            return arr;
        }
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        System.out.println("Start : " + start);
        System.out.println("End :" + end);
        return reverseCharArray(start + 1, end - 1, arr);

    }

    public static String processUnprocessedApproch(String str, String newStr, int index) {
        if (index < 0) {
            return newStr;
        }
        char ch = str.charAt(index);
        return processUnprocessedApproch(str, newStr + ch, index - 1);

    }
}
