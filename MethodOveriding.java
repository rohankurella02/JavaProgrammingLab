package com.company;

class example1 {
    void display() {
        System.out.println("Example1");
    }
}

public class MethodOveriding extends example1{
    public static void main(String[] args) {
        MethodOveriding a1 = new MethodOveriding();
        example1 a2 = new example1();
        a1.display();
        a2.display();
    }
}
