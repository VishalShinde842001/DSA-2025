package com.Recursion;

public class OccuranceOfPattern {
    public static void main(String[] args) {
        System.out.println("occurance=======>"+occurance("appleappleapple","app",0));
    }


    public static int occurance(String str, String target, int count) {
        if (str.isEmpty()) {
            return count;
        }

        if(str.startsWith(target)){
            return occurance(str.substring(1),target,count+1);
        }else{
            return occurance(str.substring(1),target,count);
        }
    }


}
