package grades;

import java.util.Scanner;

public class Grades {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        float per = sc.nextFloat();
        if(per>90) {
            System.out.println("Your grade is 'A'");
        }
        else if(per<90 && per>80) {
            System.out.println("Your grade is 'B'");
        }
        else if(per<80 && per>70) {
            System.out.println("Your grade is 'C'");
        }
        else if(per<70 && per>60) {
            System.out.println("Your grade is 'D'");
        }
        else if(per<60 && per>50) {
            System.out.println("Your grade is 'E'");
        }
        else
            System.out.println("You Have Failed");
    }
}
