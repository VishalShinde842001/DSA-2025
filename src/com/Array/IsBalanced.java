package com.Array;

import java.util.Stack;

public class IsBalanced {

    public static void main(String[] args) {
        System.out.println(isBalanced("[{()}]"));
    }

    static boolean isBalanced(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> myStack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            Character ch=s.charAt(i);
            if(isOpeningBracket(ch)){
                myStack.push(ch);
            }else{
                if(myStack.isEmpty()){
                    return false;
                }

                if(!isAbleToRemove(myStack.peek(),ch)){
                    return false;
                }else{
                    myStack.pop();
                }
            }
        }

        if(myStack.isEmpty())
        {
            return true;
        }
        return false;

    }

    public static boolean isOpeningBracket(Character ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    public static boolean isAbleToRemove(Character topElement,Character elementToRemove){
        return (topElement=='(' && elementToRemove==')') || (topElement=='[' && elementToRemove==']') || (topElement=='{' && elementToRemove=='}');
    }


}
