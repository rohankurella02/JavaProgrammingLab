package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    //String s[] = new String[10];
        List<String> list=new ArrayList<String>();
        //String temp = new String();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++) {
            list.add(sc.next());
        }
        Collections.sort(list);
        for(int i=0 ; i<n ; i++) {
            System.out.println(list.get(i));
        }
    }
}
