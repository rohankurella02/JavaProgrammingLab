package com.company;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int i, flag=0;
        System.out.print("Enter the value for n: ");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements: ");
        int a[] = new int[50];
        for(i=0 ; i<n ; i++) {
            int ele = sc.nextInt();
            a[i] = ele;
        }
        System.out.print("Enter The Element to be searched: ");
        int key = sc.nextInt();
        int lb = 0;
        int ub = n-1;
        int mid = (ub+lb)/2;
        while(lb<=mid && a[mid]!=key) {
            if(key < a[mid]) {
                ub = mid-1;
            }
            else
                lb = mid+1;
            mid = (lb+ub)/2;
        }
        if(a[mid] == key) {
            System.out.println("Element Found at " + mid);
        }
        else
            System.out.println("Element Not Found");
    }
}
