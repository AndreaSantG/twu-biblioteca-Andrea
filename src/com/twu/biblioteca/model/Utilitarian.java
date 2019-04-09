package com.twu.biblioteca.model;

import java.util.Scanner;

public class Utilitarian {

    public void print(String text){
        System.out.println(text);
    }

    public String read(){
        Scanner reader = new Scanner ( System.in );
        return reader.next();
    }
}
