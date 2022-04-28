package com.company;

public class VLA {
    public static void main(String... arg) {
        int sum=0;
        for(int i=0 ; i<arg.length ; i++) {
            sum = sum + Integer.parseInt(arg[i]);
        }
        System.out.println("Sum is "+sum);
    }
}
