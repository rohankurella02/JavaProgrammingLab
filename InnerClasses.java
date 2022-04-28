package com.company;

public class InnerClasses {
    void display() {
        System.out.println("Inner Class Called");
    }

    static class A {
        void display() {
            System.out.println("Class A called");
        }
    }

    public static void main(String[] args) {
        InnerClasses obj = new InnerClasses();
        A obj1 = new A();
        //InnerClasses.A obj1 = obj.new A();
        obj.display();
        obj1.display();
    }
}
