package com.Array;

import java.sql.Array;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr){
        int n=arr.length;
        int expectedSum=(n+1)*(n+2)/2;

        int actualSum=0;
        for(int i=0;i<n;i++){
            actualSum+=arr[i];
        }

        return expectedSum-actualSum;
    }
}
