package com.twu.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList = new ArrayList<>();

    public String showWelcomeMessage() {
        return "Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!";
    }

    private void makeUpBookList(){
        Book book1 = new Book("El amor en tiempos de Colera", "Gabriel Garcia Marquez", 1985);
        Book book2 = new Book("Los primeros tres minutos del universo", "Steven Weinberg", 1977);
        Book book3 = new Book("The Science of Interstellar", "Kip Thorne", 2014);
        Book book4 = new Book("The 4 hour workweek", "Tim Ferriss",2007);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
    }

    public String displayBookList() {
        makeUpBookList();
        String displayAllBooks = "";
        for(int countBook = 0; countBook < bookList.size(); countBook++){
            if(countBook == bookList.size() -1 ){
                displayAllBooks += bookList.get(countBook).getTitle()+"|"+bookList.get(countBook).getAuthor()+"|"+bookList.get(countBook).getYearPublished();
            }else {
                displayAllBooks += bookList.get(countBook).getTitle()+"|"+bookList.get(countBook).getAuthor()+"|"+bookList.get(countBook).getYearPublished() + "\n";
            }
        }
        return displayAllBooks;
    }

    public String showMenu() {
        return "(1) List of books";
    }

    public String selectOption(int optionMenu) {
        switch (optionMenu){
            case 1:
                return displayBookList();
            default:
                return "Please select a valid option!";
        }

    }
}
