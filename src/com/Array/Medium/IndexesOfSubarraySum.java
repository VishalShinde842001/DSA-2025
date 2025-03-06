package com.Array.Medium;
import java.util.ArrayList;
public class IndexesOfSubarraySum {
    public static void main(String[] args) {
        int[] arr={12,18,5,11,30,5};
        int target=69;
        for (Integer i:subarraySum(arr,target)) {
            System.out.print(i+" ");
        }
    }

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> arrList=new ArrayList<Integer>();

        int j=0;
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            for(j=i+1;j<arr.length;j++){
                sum=sum+ arr[j];
            }

            System.out.println("Sum==>"+sum);
            if(sum==target){
                arrList.add(i);
                arrList.add(j);
                break;
            }
        }
        if(arrList.isEmpty()){
            arrList.add(-1);
        }
        return arrList;
    }
}
