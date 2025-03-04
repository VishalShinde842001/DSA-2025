package com.Array;

import java.util.ArrayList;
import java.util.List;
public class UnionOfTwoArrays {

    public static void main(String[] args) {
//        int[] a={1, 2, 3, 4, 5};
//        int[] b={1, 2, 3, 6, 7};

        int[] a={-7,8};
        int[] b={-8,-3,8};
        for(Integer i:findUnion(a,b)){
            System.out.print(i+" ");
        }

    }

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        int i = 0, j = 0;
        Integer lastAdded = null;  // Keep track of the last added element

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                if (lastAdded == null || lastAdded != a[i]) {
                    myList.add(a[i]);
                    lastAdded = a[i];
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                if (lastAdded == null || lastAdded != a[i]) {
                    myList.add(a[i]);
                    lastAdded = a[i];
                }
                i++;
            } else {
                if (lastAdded == null || lastAdded != b[j]) {
                    myList.add(b[j]);
                    lastAdded = b[j];
                }
                j++;
            }
        }

        // Add remaining elements from array 'a'
        while (i < a.length) {
            if (lastAdded == null || lastAdded != a[i]) {
                myList.add(a[i]);
                lastAdded = a[i];
            }
            i++;
        }

        // Add remaining elements from array 'b'
        while (j < b.length) {
            if (lastAdded == null || lastAdded != b[j]) {
                myList.add(b[j]);
                lastAdded = b[j];
            }
            j++;
        }

        return myList;
    }
}
