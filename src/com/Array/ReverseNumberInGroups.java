package com.Array;

public class ReverseNumberInGroups {

    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k=3;

        for(int i:revArrInGroups(arr,k)){
            System.out.print(i+" ");
        }

    }

    public static int[] revArrInGroups(int[] arr,int k){

        int n=arr.length;
        int lastIndex=0;
        for(int i=0;i<n;i=i+k){
            if(n/k==0){
                lastIndex=n-1;
            }else{
                lastIndex=(n/k)+i-1;
            }
            System.out.println("LastIndex==>"+lastIndex);
            reverseArrayGroup(arr,i,lastIndex);
        }
        return arr;
    }

    public static void reverseArrayGroup(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
