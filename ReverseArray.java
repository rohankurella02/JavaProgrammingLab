package grades;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n = sc.nextInt();
        int a[] = new int[50];
        System.out.println("Enter the Array Elements: ");
        for(int i=0 ; i<n ; i++) {
            int ele = sc.nextInt();
            a[i] = ele;
        }
        System.out.println("The Array in Reverse order is: ");
        for(int i=n-1 ; i>=0 ; i--) {
            System.out.println(a[i]);
        }
    }
}
