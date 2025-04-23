package com.Array;

import java.util.Stack;

public class ReverseUsingStack {
    public static void main(String[] args) {
        ReverseUsingStack r=new ReverseUsingStack();
        System.out.println(r.reverse("vishal"));
    }
    public String reverse(String S){
        //code here

        Stack<Character> myStack=new Stack<Character>();

        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<S.length();i++){
            myStack.add(S.charAt(i));
        }

        while(!myStack.isEmpty()){
            sb.append(myStack.pop());
        }

        return sb.toString();
    }
}
