package com.Array;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(binarysearch(arr,4));
    }
    public static int binarysearch(int[] arr, int k) {

        int start=0;
        int end=arr.length-1;

        while(start<end){
            int  mid=(start+end)/2;
            System.out.println(start+","+end);
            System.out.println("Mid==>"+mid);
            if(arr[mid]<k){
                start=mid;
            }else if(arr[mid] > k){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return 0;
    }
}
