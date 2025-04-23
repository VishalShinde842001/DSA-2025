package com.Array;

import java.util.HashMap;


public class Test1 {

//    public static void main(String[] args) {
//        User u1 = new User("Jay", 24);
//        User u2 = new User("Jay", 24);
//
////        Question
//        System.out.println(u1 == u2);
//        System.out.println(u1.equals(u2));
//
////        Question
//        HashMap<User, String> myHashMap = new HashMap();
//        myHashMap.put(u1, "u1");
//        myHashMap.put(u2, "u2");
//        System.out.println(myHashMap.get(u1));
//
//    }
public static void main(String[] args) {
    A obj1 = new A();
    obj1.print();  // Output: A

    B obj2 = new B();
    obj2.print();  // Output: B

    A obj3 = new B();
    obj3.print();  // Output: B (Runtime Polymorphism)

}
}


class User {
    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class A {
    void print() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    void print() {
        System.out.println("B");
    }
}
