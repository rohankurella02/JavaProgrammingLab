package com.company;

import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int n) {
        int flag = 0;
        for(int i=2 ; i<=Math.pow(n, 0.5) ; i++) {
            if(n%i == 0) {
                //flag = 1;
                return false;
            }
        }
        return true;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a ; i<b ; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }
}
