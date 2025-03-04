package com.Recursion;

public class IsSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        return isSortedHelper(0, 1, arr);
    }

    public static boolean isSortedHelper(int start, int nex, int[] arr) {
        System.out.println("=========================================");
        System.out.println("Start==>" + start + "   " + "End==>" + nex);
        System.out.println("arr[start]==>" + arr[start] + "   " + "arr[nex]==>" + arr[nex]);
        System.out.println("=========================================");
        if (arr[start] > arr[nex]) {
            return false;
        }

        if (nex == arr.length - 1) {
            return true;
        }

        return isSortedHelper(++start, ++nex, arr);
    }
}
