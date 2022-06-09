package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class Throws {

    public static void findFile() {
        // code that may produce IOException
        //File newFile=new File("test.txt");
        throw new ArithmeticException();
    }

    public static void main(String[] args) {
        try {
            findFile();
        }
        catch (Exception e) {
            System.out.println("Hii");
        }

        System.out.println("Main Function");
    }
}
