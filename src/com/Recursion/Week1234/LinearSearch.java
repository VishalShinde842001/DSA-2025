package com.Recursion.Week1234;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr={6};
        int key=6;
        System.out.println(isPresent(arr,key));
    }

    public static boolean isPresent(int[] arr,int key){
        return isPresentHelper(arr,0,key);
    }

    public static boolean isPresentHelper(int[] arr,int index,int key){
        if(index==arr.length){
            return false;
        }

        return arr[index]==key || isPresentHelper(arr,++index,key);
    }
}
