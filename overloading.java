package com.company;

class Add {
    public Add(int a, int b) {
        System.out.println(a+b);
    }
    Add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}

public class overloading {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 6;
        Add ac = new Add(a, b);
        Add ac1 = new Add(a, b, c);
    }
}
