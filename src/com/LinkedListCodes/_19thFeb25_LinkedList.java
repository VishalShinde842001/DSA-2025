package com.LinkedListCodes;

import java.util.Map;

public class _19thFeb25_LinkedList {

    public static void main(String[] args) {
        occurances();
    }

    public static void middleNodeTesting() {
        LinkedList1 list1 = new LinkedList1();
        list1.insertFirst(1);
        list1.insertLast(2);
        list1.insertLast(3);
        list1.insertLast(4);

        // list1.printLinkedList(list1.reverseList());
    }

    public static void occurances() {
        LinkedList1 list1 = new LinkedList1();
        list1.insertFirst(1);
        list1.insertLast(2);
        list1.insertLast(3);
        list1.insertLast(4);
        list1.insertLast(4);
        list1.insertLast(4);
        for (Map.Entry<Integer, Integer> entry : list1.occuranceOfEveryValue().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

