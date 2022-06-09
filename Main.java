package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        int a = 2;

        try {
            FileInputStream f = new FileInputStream("D://folder");
            //System.out.println(a/0);
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception is " + e.getMessage());

        }

    }
}
