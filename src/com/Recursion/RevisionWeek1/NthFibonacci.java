package com.Recursion.RevisionWeek1;

import java.util.Map;

// Fibonacci series starts with 0, 1 and then adds the previous two numbers to get the next
public class NthFibonacci {

    public static void main(String[] args) {
        System.out.println(nthFibo(4));  // Expected Output: 3
    }

    // 0 is the 0th index: 0, 1, 1, 2, 3, 5, 8, ...
    public static int nthFibo(int n) {
        if (n < 2) {
            return n;  // Base case: 0 or 1
        }
        return nthFibo(n - 1) + nthFibo(n - 2);  // Recursive case
    }

}
