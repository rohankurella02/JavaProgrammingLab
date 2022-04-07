package com.company;

import java.util.Scanner;

public class Adam {

    public static int reverse(int n) {
        int r = 0, rev=0;
        while(n>0) {
            rev = rev*10 + n%10;
            n = n/10;
        }
        return rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqr = (int)Math.pow(n, 2);
        int rev = reverse(n);
        int revSqr = (int)Math.pow(rev, 2);
        if(reverse(revSqr) == sqr) {
            System.out.println("It is an Adam Number");
        }
        else
            System.out.println("It is not an Adam Number");
    }
}
