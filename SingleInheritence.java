package com.company;

class fun1 {
    void disp1() {
        System.out.println("Class A");
    }
}

class fun2 extends fun1 {
    void disp() {
        System.out.println("Class B");
    }
}

public class SingleInheritence {


    public static void main(String[] args) {
        fun1 f1 = new fun1();
        fun2 f2 = new fun2();
        f2.disp1();
        f2.disp();
    }
}
