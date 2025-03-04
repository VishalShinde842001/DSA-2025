package com.SortingAlgorithm;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr={1,2,4,5,3,2,4};

        for(int i:bubbleSort(arr)){
            System.out.print(i+"==>");
        }
    }

    public static int[] bubbleSort(int[] arr){

        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n-1;j++)
            {
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
