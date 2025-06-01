package com.Recursion;

public class ClimbingStairs {

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(3));
    }

    public int climbStairs(int n) {
        return climbStairsHelper(0, n);
    }

    public int climbStairsHelper(int sum, int n) {
        if (sum > n) {
            return 0;
        }
        if (sum == n) {
            return 1;
        }

        int addingOne = climbStairsHelper(sum + 1, n);

        int addingTow = climbStairsHelper(sum + 2, n);

        return addingOne + addingTow;
    }
}
