package com.company;
import static java.lang.System.out;

class fun {
    private int a = 5;
    private int b = 7;
    int sum() {
        return this.a+this.b;
    }
    int sum(int... a1) {
        int sum = 0;
        for(int i:a1)
            sum += i;
        return sum;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        fun f = new fun();
        out.println(f.sum(2, 3, 4));
        out.println(f.sum(2, 3, 4, 6, 7, 9));
    }
}
