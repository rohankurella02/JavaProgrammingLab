package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0 ; i<n-2 ; i++) {
            a = a+b;
            System.out.println(a);
        }
    }
}
