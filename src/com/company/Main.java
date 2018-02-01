package com.company;

import java.util.Scanner;

public class Main {

    private static String[] _z;

    public static void main(String[] args) {
        // write your code here
        Main obj = new Main();
        obj.zodziuIvedimas();
        obj.rezultatas();

    }
    public void zodziuIvedimas(){
        System.out.println("Iveskite 5 zodzius");
        Scanner in = new Scanner(System.in);
        _z = new String[5];
        for (int i = 0; i < _z.length; i++){
            System.out.println("Iveskite zodi nr. " + (i + 1 ) );
            _z[i] = in.nextLine();
        }
    }
    public void rezultatas(){
        for (int i = 0; i < _z.length; i++){
            System.out.println(_z[i]);
        }
    }
}