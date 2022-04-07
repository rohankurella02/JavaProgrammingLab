package com.company;

import java.util.Scanner;

public class QuadraticEqn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int delta = (b*b) - (4*a*c);
        if(delta < 0)
            System.out.println("Roots are not possible");
        else {
            float r1 = (float)(-b + delta)/(4*a*c);
            float r2 = (float)(-b - delta)/(4*a*c);
            System.out.println("The roots are " + r1 + " " + r2);
        }
    }
}
