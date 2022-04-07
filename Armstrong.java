package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int a = n;
        String s = String.valueOf(n);
        int len = (int)s.length();
        System.out.println(len);
        int fsum=0;
        int r=0;
        while(n>0) {
            r = n%10;
            fsum = fsum +(int)Math.pow(r, len);
            n = n/10;
        }
        if(a == fsum) {
            System.out.println("It is an Armstrong Number");
        }
        else
            System.out.println("It is not an Armstrong Number");
    }
}
