package com.twu.biblioteca.model;

public class Menu {

    private String menuOne;
    private String menuTwo;
    private String menuThree;
    private String menuFour;
    private String menuFive;
    private String menuSix;
    private String menuZero;
    private Utilitarian utilitarian;

    public Menu(){
        this.menuOne = "(1) List books\n";
        this.menuTwo = "(2) Checkout a book\n";
        this.menuThree = "(3) Return a book\n";
        this.menuFour = "(4) List movies\n";
        this.menuFive = "(5) Checkout a movie\n";
        this.menuSix = "(6) View my information\n";
        this.menuZero = "(0) Quit\n";
        utilitarian = new Utilitarian();
    }

    public String showMenu() {
        return this.menuOne+this.menuTwo+this.menuThree+this.menuFour+this.menuFive+this.menuSix+this.menuZero;
    }


    public String selectOption(int optionMenu, Library library, User user) {
        String selectedOption;
        int codeBook;
        int codeMovie;
        switch (optionMenu){
            case 1:
                selectedOption = library.displayBookList();
                break;
            case 2:
                selectedOption = "Checkout a Book";
                utilitarian.print("Please enter the code of book you want to check out");
                codeBook = Integer.valueOf(utilitarian.read());
                selectedOption = library.checkoutBook(codeBook, user);
                break;
            case 3:
                utilitarian.print("Please enter the code of book you want to return");
                codeBook = Integer.valueOf(utilitarian.read());
                selectedOption = library.returnBook(codeBook);
                break;
            case 4:
                selectedOption = library.displayMovieList();
                break;
            case 5:
                utilitarian.print("Please enter the code of movie you want to check out");
                codeMovie = Integer.valueOf(utilitarian.read());
                selectedOption = library.checkoutMovie(codeMovie);
                break;
            case 6:
                selectedOption = user.showContactInformation();
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

    public void setUtilitarian(Utilitarian utilitarian) {
        this.utilitarian = utilitarian;
    }
}
