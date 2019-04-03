package com.twu.biblioteca.model;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return this.bookList;
    }

    public String showWelcomeMessage() {
        return "Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!";
    }

    public Library(){
        Book book1 = new Book("El amor en tiempos de Colera", "Gabriel Garcia Marquez", 1985, 0, 30);
        Book book2 = new Book("Los primeros tres minutos del universo", "Steven Weinberg", 1977, 0, 40);
        Book book3 = new Book("The Science of Interstellar", "Kip Thorne", 2014, 0, 50);
        Book book4 = new Book("The 4 hour workweek", "Tim Ferriss",2007, 0, 60);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
    }

    public String displayBookList() {
        String displayAllBooks = "";
        for(int countBook = 0; countBook < bookList.size(); countBook++){
            if(countBook == bookList.size() -1 ){
                if(bookList.get(countBook).getStatus() == 0){
                    displayAllBooks += bookList.get(countBook).getTitle()+"|"+bookList.get(countBook).getAuthor()+"|"+bookList.get(countBook).getYearPublished();
                }
            }else {
                if(bookList.get(countBook).getStatus() == 0){
                    displayAllBooks += bookList.get(countBook).getTitle()+"|"+bookList.get(countBook).getAuthor()+"|"+bookList.get(countBook).getYearPublished() + "\n";
                }
            }
        }
        return displayAllBooks;
    }

    public String showMenu() {
        return "(1) List of books\n(2) Checkout a book\n(3) Return a book\n(0) Quit";
    }

    public String selectOption(int optionMenu) {
        String selectedOption = "";
        Scanner reader = new Scanner ( System.in );
        int codeBook;
        switch (optionMenu){
            case 1:
                selectedOption = displayBookList();
                break;
            case 2:
                System.out.println("Please enter the code of book you want to check out");
                codeBook = Integer.valueOf(reader.next());
                selectedOption = checkoutBook(codeBook);
                break;
            case 3:
                System.out.println("Please enter the code of book you want to return");
                codeBook = Integer.valueOf(reader.next());
                selectedOption = returnBook(codeBook);
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

    public String checkoutBook(int codBook) {
        for(Book book : bookList){
            if(book.getCod() == codBook){
                if(book.getStatus() == 0){
                    book.setStatus(1);
                    return "Thank you! Enjoy the book";
                }
                else {
                    return "Sorry, that book is not available";
                }
            }
        }
        return "That is not a valid book to check out";//Caso aidicional

    }


    public String returnBook(int codBook) {
        for(Book book : bookList){
            if(book.getCod() == codBook){
                book.setStatus(0);
                return "Thank you for returning the book";
            }
        }
        return "That is not a valid book to return";
    }
}
