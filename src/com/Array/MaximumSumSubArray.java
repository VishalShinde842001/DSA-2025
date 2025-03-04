package com.Array;

public class MaximumSumSubArray {

    public static void main(String[] args) {
        int[] arr={100,200,300,400};
        System.out.println(maximumSumSubarray(arr,2));
    }

    public static int maximumSumSubarray(int[] arr, int k) {
        // Step 1: Compute the sum of the first window
        int baseSum = 0;
        for (int i = 0; i < k; i++) {
            baseSum += arr[i];
        }

        int maxSum = baseSum;

        // Step 2: Slide the window across the array
        for (int i = k; i < arr.length; i++) {
            baseSum = baseSum + arr[i] - arr[i - k];  // ✅ Correct sliding window update

            if (baseSum > maxSum) {
                maxSum = baseSum;
            }
        }
        return maxSum;
    }



//    public static int maximumSumSubarray(int[] arr, int k) {
//        // Code here
//
//        int baseSum=0;
//        for(int i=0;i<k;i++){
//            baseSum =baseSum + arr[i];
//        }
//
//        System.out.println("BaseSum===>"+baseSum);
//
//        int maxSum=baseSum;
//
//        for(int i=k;i<arr.length-1;i++){
//            baseSum=baseSum+arr[i]-arr[i-k];
//            System.out.println("k========>"+i);
//            System.out.println("arr[i]==========>"+arr[i]);
//            System.out.println("arr[k-i]===========>"+arr[k-i]);
//            System.out.println("Base Sum=======>"+baseSum);
//            if(baseSum >maxSum){maxSum=baseSum;}
//        }
//        return maxSum;
//    }
}
