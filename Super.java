package com.company;

class A1{
    void display() {
        System.out.println("HI");
    }
}

class B1 extends A1 {
    void show(){
        super.display();
    }
}

public class Super {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.show();
    }
}
