package com.twu.biblioteca;

import com.twu.biblioteca.model.Library;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Library library = new Library();
        System.out.println(library.showWelcomeMessage());
        System.out.println(library.showMenu());
        int optionMenu = -1;
        do{
            System.out.println("***Please select an option");
            Scanner reader = new Scanner ( System.in ) ;
            optionMenu = Integer.valueOf(reader.next());
            System.out.println(library.selectOption(optionMenu));
        }while (optionMenu != 0);


    }
}
