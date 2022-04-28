package com.company;

interface A {
    void show11();
}

interface B {
    void show11();
}

class AB implements A, B {
    public void show11() {
        System.out.println("Hi");
    }
//    public void show21() {
//        System.out.println("Bi");
//    }
}

public class MultipleInheritence {
    public static void main(String[] args) {
        B obj = new AB();
        obj.show11();
//        obj.show21();
    }
}
