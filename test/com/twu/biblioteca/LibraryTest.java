package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Library;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LibraryTest {

    @Test
    public void testShouldShowWelcomeMessageWhenUserOpenApp(){
        Library library = new Library();
        String expectedWelcomeMessage = "Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!";

        String resultWelcomeMessage = library.showWelcomeMessage();

        assertThat(expectedWelcomeMessage, is(resultWelcomeMessage));
    }


    @Test
    public void testShouldListTitleBooksAfterWelcomeMessage(){
        String titleBook1 = "El amor en tiempos de Colera";
        String titleBook2 = "Los primeros tres minutos del universo";
        String titleBook3 = "Interestelar";
        String titleBook4 = "The 4 hour workweek";
        Book book1 = new Book(titleBook1);
        Book book2 = new Book(titleBook2);
        Book book3 = new Book(titleBook3);
        Book book4 = new Book(titleBook4);
        List<Book> bookList = new ArrayList<>(Arrays.asList(book1, book2, book3, book4));
        Library library = new Library();

        String resultBookList = library.displayBookList();

        assertThat(resultBookList, is(titleBook1 +"\n"+titleBook2+"\n"+titleBook3+"\n"+titleBook4));
    }
}
