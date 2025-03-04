package com.SortingAlgorithm;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr={2,1,3,45,22};
        for(int i:selectionSort(arr)){
            System.out.print(i+"=>");
        }
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, findSmall(arr, i, arr.length));
        }
        return arr;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int findSmall(int[] arr, int start, int end) {
        int small = Integer.MAX_VALUE;
        int smallIndex = 0;
        for (int i = start; i < end; i++) {
            if (arr[i] < small) {
                small = arr[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }
}
