package com.Recursion.TowerOnHanoi;

public class CountMovesRequired {


    public static void main(String[] args) {
        CountMovesRequired c = new CountMovesRequired();
        System.out.println(c.towerOfHanoi(3, 'A', 'B', 'C'));
    }

    public int towerOfHanoi(int n, int from, int to, int aux) {
        // Your code here
        return helper(n, from, to, aux, 0);
    }

    public int helper(int n, int from, int to, int aux, int count) {
        count = count + 1;
        if (n == 1) {
            return count;
        }

        return helper(n - 1, from, aux, to, count);

    }
}
