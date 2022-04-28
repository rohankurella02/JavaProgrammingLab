package com.company;

interface inter {
    void display() ;
}

class ABC implements inter {
    public void display() {
        System.out.println("Class");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.display();
        //obj.display1();
        //inter obj1 = new ABC();

    }
}
