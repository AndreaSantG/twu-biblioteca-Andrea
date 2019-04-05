package com.twu.biblioteca.model;

import java.util.Scanner;

public class Utilitarian {

    public static void print(String text){
        System.out.println(text);
    }

    public static String read(){
        Scanner reader = new Scanner ( System.in );
        return reader.next();
    }
}
