package com.Array;
import java.util.ArrayList;
public class MinimumAndRepeating {

    public static void main(String[] args) {

        MinimumAndRepeating mar=new MinimumAndRepeating();
        int[] arr={2,2};
       for(Integer i: mar.findTwoElement(arr)){
           System.out.println(i);
       }
    }

    ArrayList<Integer> findTwoElement(int[] arr) {
        int[] isPresentArray=new int[arr.length+1];

        ArrayList<Integer> arrList=new ArrayList<Integer>();

        for(int i=0;i<arr.length;i++){
            isPresentArray[arr[i]]=isPresentArray[arr[i]]+1;
        }
        for(int i=1;i<isPresentArray.length;i++){
            if(isPresentArray[i]==2){
                arrList.add(0,i);
            }else if(isPresentArray[i]==0){
                arrList.add(i);
            }
        }
        return arrList;
    }
}
