package grades;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[50][50];
        int b[][] = new int[50][50];
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements for a: ");
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                int ele = sc.nextInt();
                a[i][j] = ele;
            }
        }
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                b[i][j] = a[j][i];
            }
        }
        System.out.println("The Transpose of the matrix is: ");
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
