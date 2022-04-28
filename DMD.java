package com.company;


class D1 {
    void display() {
        System.out.println("D1 Class");
    }
}

class D2 extends D1 {
    void display() {
        System.out.println("D2 class invoked");
    }
}

public class DMD {
    public static void main(String[] args) {
        D1 obj = new D2();
        obj.display();


    }
}
