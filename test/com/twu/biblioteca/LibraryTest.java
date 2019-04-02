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


    /*@Test
    public void testShouldListTitleBooksAfterWelcomeMessage(){
        String titleBook1 = "El amor en tiempos de Colera";
        String authorBook1 = "Gabriel Garcia Marquez";
        int yearPublishedBook1 = 1985;
        String titleBook2 = "Los primeros tres minutos del universo";
        String authorBook2 = "Steven Weinberg";
        int yearPublishedBook2 = 1977;
        String titleBook3 = "The Science of Interstellar";
        String authorBook3 = "Kip Thorne";
        int yearPublishedBook3 = 2014;
        String titleBook4 = "The 4 hour workweek";
        String authorBook4 = "Tim Ferriss";
        int yearPublishedBook4 = 2007;
        Book book1 = new Book(titleBook1, authorBook1, yearPublishedBook1);
        Book book2 = new Book(titleBook2, authorBook2, yearPublishedBook2);
        Book book3 = new Book(titleBook3, authorBook3, yearPublishedBook3);
        Book book4 = new Book(titleBook4, authorBook4, yearPublishedBook4);
        List<Book> bookList = new ArrayList<>(Arrays.asList(book1, book2, book3, book4));
        Library library = new Library();

        String resultBookList = library.displayBookList();

        assertThat(resultBookList, is(bookList.get(0).getTitle() +"\n"+bookList.get(1).getTitle()+"\n"+bookList.get(2).getTitle()+"\n"+bookList.get(3).getTitle()));
    }*/


    @Test
    public void testShouldListTitleAuthorAndYearPublishedAfterWelcomeMessage(){
        String titleBook1 = "El amor en tiempos de Colera";
        String authorBook1 = "Gabriel Garcia Marquez";
        int yearPublishedBook1 = 1985;
        String titleBook2 = "Los primeros tres minutos del universo";
        String authorBook2 = "Steven Weinberg";
        int yearPublishedBook2 = 1977;
        String titleBook3 = "The Science of Interstellar";
        String authorBook3 = "Kip Thorne";
        int yearPublishedBook3 = 2014;
        String titleBook4 = "The 4 hour workweek";
        String authorBook4 = "Tim Ferriss";
        int yearPublishedBook4 = 2007;
        Book book1 = new Book(titleBook1, authorBook1, yearPublishedBook1);
        Book book2 = new Book(titleBook2, authorBook2, yearPublishedBook2);
        Book book3 = new Book(titleBook3, authorBook3, yearPublishedBook3);
        Book book4 = new Book(titleBook4, authorBook4, yearPublishedBook4);
        List<Book> bookList = new ArrayList<>(Arrays.asList(book1, book2, book3, book4));
        Library library = new Library();

        String resultBookList = library.displayBookList();

        assertThat(bookList.get(0).getTitle()+"|" +bookList.get(0).getAuthor()+"|"+bookList.get(0).getYearPublished()+"\n"+bookList.get(1).getTitle()+"|" +bookList.get(1).getAuthor()+"|"+bookList.get(1).getYearPublished()+"\n"+bookList.get(2).getTitle()+"|" +bookList.get(2).getAuthor()+"|"+bookList.get(2).getYearPublished()+"\n"+bookList.get(3).getTitle()+"|" +bookList.get(3).getAuthor()+"|"+bookList.get(3).getYearPublished(), is(resultBookList));
    }


    @Test
    public void testShouldDisplayMenuAfterShowWelcomeMessage(){
        Library library = new Library();
        String menu = "List of books";

        String resultMenu = library.showMenu();

        assertThat(menu, is(resultMenu));
    }


}
