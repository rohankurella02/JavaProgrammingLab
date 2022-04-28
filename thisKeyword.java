package com.company;

class function {
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

public class thisKeyword {
    public static void main(String[] args) {
        function f = new function();
        System.out.println(f.sum());
        System.out.println(f.sum(2, 3, 5));
    }
}
