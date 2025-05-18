package com.Recursion;

public class BubbleSortNormal {

    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 9, 8, 6, 10, 25, 1, 30};

        for (int i : bubbleSort(arr)) {
            System.out.println(i);
        }
    }



    public static int[] bubbleSort(int[] arr) {
        for (int i =  0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
