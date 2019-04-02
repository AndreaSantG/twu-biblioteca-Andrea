package com.twu.biblioteca;

import com.twu.biblioteca.model.Library;

public class BibliotecaApp {

    public static void main(String[] args) {

        Library library = new Library();
        System.out.println(library.displayBookList());
    }
}
