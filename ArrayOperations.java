package grades;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        int n = sc.nextInt();
        int a[] = new int[50];
        int sum = 0;
        System.out.println("Enter the Array Elements: ");
        for(int i=0 ; i< n ; i++)
        {
            int ele = sc.nextInt();
            a[i] = ele;
        }
        int min = a[0];
        for(int i=0 ; i<n ; i++) {
            if(a[i]<min)
                min = a[i];
        }
        System.out.println("The sum of the Array Elements is: " + Arrays.stream(a).sum());
        System.out.println("The Greatest element in the Array is: " + Arrays.stream(a).max());
        System.out.println("The Smallest element in the Array is: " + min);
    }
}
