package com.twu.biblioteca.model;

import java.util.*;

public class Library {

    private Map<Integer, Book> bookHashMap;

    public Library(){
        bookHashMap = new LinkedHashMap<>();
        Book book1 = new Book("El amor en tiempos de Colera", "Gabriel Garcia Marquez", 1985, 0, 30);
        Book book2 = new Book("Los primeros tres minutos del universo", "Steven Weinberg", 1977, 0, 40);
        Book book3 = new Book("The Science of Interstellar", "Kip Thorne", 2014, 0, 50);
        Book book4 = new Book("The 4 hour workweek", "Tim Ferriss",2007, 0, 60);
        bookHashMap.put(30, book1);
        bookHashMap.put(40, book2);
        bookHashMap.put(50, book3);
        bookHashMap.put(60, book4);
    }

    public Map<Integer, Book> getBookList() {
        return this.bookHashMap;
    }

    public String showWelcomeMessage() {
        return "Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!";
    }

    public String displayBookList() {
        String displayAllBooks = "";
        for(Book book : bookHashMap.values()){
            if(book.getStatus() == 0){
             displayAllBooks += formatBookList(book);
            }
        }
        return displayAllBooks;
    }


    private String formatBookList(Book book){
        return book.getTitle()+"|"+book.getAuthor()+"|"+book.getYearPublished() + "\n";
    }


    public String checkoutBook(int codeBook) {
        for(Book book : bookHashMap.values()){
            if(book.getCode() == codeBook && book.getStatus() == 0){
                book.setStatus(1);
                return "Thank you! Enjoy the book";
            } else if(book.getCode() == codeBook && book.getStatus() != 0){
                return "Sorry, that book is not available"; }
            }

        return "That is not a valid book to check out";

    }


    public String returnBook(int codeBook) {
        for(Book book : bookHashMap.values()){
            if(book.getCode() == codeBook){
                book.setStatus(0);
                return "Thank you for returning the book";
            }
        }
        return "That is not a valid book to return";
    }
}
