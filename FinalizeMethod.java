package com.company;


class Fin {
    int b = 5;
    Fin(int a) {
        System.out.println("Fin Object called" + a);
    }
    //@Override
    protected void finalize() {
        System.out.println("Finalize method invoked");
    }
}

public class FinalizeMethod {



    public static void main(String[] args) {
        Fin ac = new Fin(3);
        Fin ac2 = new Fin(4);
        Fin ac3 = new Fin(5);
        //ac = 5;
        //ac2 = 4;
        ac2 = ac;
        System.gc();

    }
}
