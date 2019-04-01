package com.twu.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList = new ArrayList<>();

    public String showWelcomeMessage() {
        return "Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!";
    }

    private void makeUpBookList(){
        Book book1 = new Book("El amor en tiempos de Colera");
        Book book2 = new Book("Los primeros tres minutos del universo");
        Book book3 = new Book("Interestelar");
        Book book4 = new Book("The 4 hour workweek");
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
                displayAllBooks += bookList.get(countBook).getTitle();
            }else {
                displayAllBooks += bookList.get(countBook).getTitle() + "\n ";
            }
        }
        return displayAllBooks;
    }
}