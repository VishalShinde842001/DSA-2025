package com.LinkedListCodes;

import java.util.HashMap;
import java.util.Map;

public class LinkedList1 {

    public static boolean IS_PRINT_REMOVED_ITEM = false;
    public static boolean IS_PRINT_SIZE = false;
    public static boolean IS_PRINT_LIST = true;

    public static void main(String[] args) {

        operationsRelatedList();

    }


    public static void operationsRelatedList() {
        LinkedList1 linkedList11 = LinkedList1.linkedListProvider();
        linkedList11.printLinkedList();
        System.out.println();
//        System.out.println(linkedList11.isPresent(100) ? "Data Present" : "Data Not Present");
        System.out.println(linkedList11.nthNodeFromLast(8).data);

    }

    public static LinkedList1 linkedListProvider() {
        LinkedList1 linkedList = new LinkedList1();
        linkedList.insertFirst(20);
        linkedList.insertFirst(15);
        linkedList.insertFirst(10);
        linkedList.insertFirst(5);
        linkedList.insertFirst(0);
        linkedList.insertLast(25);
        linkedList.insertLast(30);
        return linkedList;

    }

    private Node head;
    private Node tail;
    private int size;

    LinkedList1() {
        this.size = 0;
    }

    class Node {
        public int data;
        public Node next;

        Node(int value) {
            this.data = value;
        }
    }



    public Map<Integer, Integer> occuranceOfEveryValue() {
        Node temp = head;
        Map<Integer, Integer> occurance = new HashMap<Integer, Integer>();
        while (temp != null) {
            if (occurance.containsKey(temp.data)) {
                occurance.put(temp.data, occurance.get(temp.data) + 1);
            } else {
                occurance.put(temp.data, 1);
            }
            temp = temp.next;
        }
        return occurance;
    }

    public Node reverseList() {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }


    public Node middleNode() {
        if (head == null || head.next == null) {
            return head;
        }
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public Node nthNodeFromLast(int n) {
        if (n > length()) {
            return new Node(-1);
        }
        Node fast = head;
        Node slow = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }


    public boolean isPresent(int value) {
        // System.out.println("Value======>" + value);
        if (head == null) {
            return false;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Node nthNode(int index) {
        if (head == null || index == length()) {
            return null;
        }

        if (index == 0) {
            return head;
        }
        Node temp = head;
        int myIndex = 0;
        while (temp.next != null) {
            if (index == myIndex) {
                return temp;
            }
            myIndex++;
            temp = temp.next;
        }
        return null;
    }

    public int length() {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public void removeLast(int time) {
        if (IS_PRINT_REMOVED_ITEM) {
            Node removedNode = null;
            for (int i = 1; i <= time; i++) {
                removedNode = removeLast();
                if (removedNode == null) {
                    if (this.size > 0) {
                        this.size = 0;
                    }
                    break;
                }
                System.out.println("Removed Last Node " + i + ":" + removedNode.data
                );
            }
        }

    }

    public Node removeLast() {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        Node removedNode = temp.next;
        temp.next = null;
        size--;
        return removedNode;

    }

    public void removeFirst(int time) {
        Node removedItem = null;
        for (int i = 1; i <= time; i++) {
            removedItem = this.removeFirst();
            if (removedItem == null) {
                break;
            }
            if (IS_PRINT_REMOVED_ITEM) {
                System.out.println("Removed Item " + i + " :" + removedItem.data);
            }
        }

    }

    public Node removeFirst() {
        if (head == null) {
            this.size = 0;
            return null;
        }
        Node temp = head;
        head = head.next;
        size--;
        return temp;
    }

    public void insertLast(int value) {
        Node lastNode = new Node(value);
        if (head == null) {
            head = lastNode;
            tail = lastNode;
            this.size = 1;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = lastNode;
        tail = lastNode;
        size++;
    }

    public void insertFirst(int value) {
        //If head is null simply means LinkedList is empty in that case simply add node to head
        Node firstNode = new Node(value);
        if (head == null) {
            this.size = 1;
            head = firstNode;
            tail = firstNode;
            return;
        }
        //In case If there are multiple elements in LinkedList
        //We simply need to make linking between our node and head node
        //Actually currently our node is like 'firstNode->null'
        //We will simply assign head to the next of firstNode so firstNode will point to head
        //And we simply make firstNode as head so our head is also shifted
        firstNode.next = head;
        head = firstNode;
        size++;
    }

    public void printLinkedList() {
        // if (IS_PRINT_LIST) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        //  }
    }

    public void printLinkedList(Node head) {
        // if (IS_PRINT_LIST) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        //  }
    }

    public void printSize() {
        if (IS_PRINT_SIZE) {
            System.out.println(this.size);
        }
    }
}
