package com.Array;

import java.util.HashMap;
import java.util.Map;

public class CheckEqual {

    public static void main(String[] args) {
        int[] arr1={1,1,4,10,9,10};
        int[] arr2={10,4,10,1,10};
        System.out.println(checkEqual(arr1,arr2));
    }

    public static boolean checkEqual(int[] a, int[] b) {

        HashMap<Integer,Integer> myMap=new HashMap();

        for(int i=0;i<a.length;i++){
            if(myMap.containsKey(a[i])){
                myMap.put(a[i],myMap.get(a[i])+1);
            }else{
                myMap.put(a[i],1);
            }
        }

       for(Map.Entry<Integer,Integer> my:myMap.entrySet()){
           System.out.println(my.getKey()+" "+my.getValue());
       }


        for(int i=0;i<b.length;i++){
            if(!myMap.containsKey(b[i])){
                return false;
            }else{
                if(myMap.get(b[i]) == 0){
                    return false;
                }
                myMap.put(b[i],myMap.get(b[i])-1);
            }
        }
        return true;
    }
}
