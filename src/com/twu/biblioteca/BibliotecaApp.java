package com.twu.biblioteca;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Menu;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Library library = new Library();
        Menu menu = new Menu();
        System.out.println(library.showWelcomeMessage());
        System.out.println(menu.showMenu());
        int optionMenu = -1;
        do{
            System.out.println("***Please select an option");
            Scanner reader = new Scanner ( System.in ) ;
            optionMenu = Integer.valueOf(reader.next());
            System.out.println(menu.selectOption(optionMenu, library));
        }while (optionMenu != 0);


    }
}
