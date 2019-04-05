package com.twu.biblioteca.model;

public class Menu {

    private String menuOptions;

    public Menu(){
        this.menuOptions = "(1) List books\n(2) Checkout a book\n(3) Return a book\n(4) List movies\n(0) Quit";
    }

    public String showMenu() {
        return this.menuOptions;
    }


    public String selectOption(int optionMenu, Library library) {
        String selectedOption;
        int codeBook;
        int codeMovie;
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
            case 4:
                selectedOption = library.displayMovieList();
                break;
            case 5:
                Utilitarian.print("Please enter the code of movie you want to check out");
                codeMovie = Integer.valueOf(Utilitarian.read());
                selectedOption = library.checkoutMovie(codeMovie);
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
