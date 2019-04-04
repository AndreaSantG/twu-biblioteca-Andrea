package com.twu.biblioteca.model;

import java.util.Scanner;

public class Menu {

    private String menuOptions;

    public Menu(){
        this.menuOptions = "(1) List of books\n(2) Checkout a book\n(3) Return a book\n(0) Quit";
    }

    public String showMenu() {
        return this.menuOptions;
    }


    public String selectOption(int optionMenu, Library library) {
        String selectedOption;
        int codeBook;
        switch (optionMenu){
            case 1:
                selectedOption = library.displayBookList();
                break;
            case 2:
                selectedOption = "Checkout a Book";
                Utilitarian.print("Please enter the code of book you want to check out");
                codeBook = Integer.valueOf(Utilitarian.read());
                selectedOption = library.checkoutBook(codeBook);
                break;
            case 3:
                Utilitarian.print("Please enter the code of book you want to return");
                codeBook = Integer.valueOf(Utilitarian.read());
                selectedOption = library.returnBook(codeBook);
                break;
            case 0:
                selectedOption = "Exit...";
                System.exit(0);
                break;
            default:
                selectedOption = "Please select a valid option!";
        }
        return selectedOption;
    }
}
