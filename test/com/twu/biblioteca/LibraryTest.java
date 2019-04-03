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
    public void testShouldCreateBookListWhenCreateLibraryObject(){
        Library library = new Library();
        int sizeBookList = 4;

        int resultSizeBookList = library.getBookList().size();

        assertThat(sizeBookList, is(resultSizeBookList));
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
        int statusBook1 = 1;
        int idBook1 = 30;
        String titleBook2 = "Los primeros tres minutos del universo";
        String authorBook2 = "Steven Weinberg";
        int yearPublishedBook2 = 1977;
        int statusBook2 = 0;
        int idBook2 = 40;
        String titleBook3 = "The Science of Interstellar";
        String authorBook3 = "Kip Thorne";
        int yearPublishedBook3 = 2014;
        int statusBook3 = 1;
        int idBook3 = 50;
        String titleBook4 = "The 4 hour workweek";
        String authorBook4 = "Tim Ferriss";
        int yearPublishedBook4 = 2007;
        int statusBook4 = 0;
        int idBook4 = 60;
        Book book1 = new Book(titleBook1, authorBook1, yearPublishedBook1, statusBook1, idBook1);
        Book book2 = new Book(titleBook2, authorBook2, yearPublishedBook2, statusBook2, idBook2);
        Book book3 = new Book(titleBook3, authorBook3, yearPublishedBook3, statusBook3, idBook3);
        Book book4 = new Book(titleBook4, authorBook4, yearPublishedBook4, statusBook4, idBook4);
        List<Book> bookList = new ArrayList<>(Arrays.asList(book1, book2, book3, book4));
        Library library = new Library();

        String resultBookList = library.displayBookList();

        assertThat(bookList.get(0).getTitle()+"|" +bookList.get(0).getAuthor()+"|"+bookList.get(0).getYearPublished()+"\n"+bookList.get(1).getTitle()+"|" +bookList.get(1).getAuthor()+"|"+bookList.get(1).getYearPublished()+"\n"+bookList.get(2).getTitle()+"|" +bookList.get(2).getAuthor()+"|"+bookList.get(2).getYearPublished()+"\n"+bookList.get(3).getTitle()+"|" +bookList.get(3).getAuthor()+"|"+bookList.get(3).getYearPublished(), is(resultBookList));
    }


    /*@Test
    public void testShouldDisplayMenuAfterShowWelcomeMessage(){
        Library library = new Library();
        String menu = "(1) List of books";

        String resultMenu = library.showMenu();

        assertThat(menu, is(resultMenu));
    }*/


    @Test
    public void testShouldDisplayMenuAfterShowWelcomeMessage(){
        Library library = new Library();
        String menu = "(1) List of books\n(2) Checkout a book\n(3) Return a book\n(0) Quit";

        String resultMenu = library.showMenu();

        assertThat(menu, is(resultMenu));
    }


    @Test
    public void testShouldShowBookListWhenSelectOptionOne(){
        Library library = new Library();
        int optionMenu = 1;
        String titleBook1 = "El amor en tiempos de Colera";
        String authorBook1 = "Gabriel Garcia Marquez";
        int yearPublishedBook1 = 1985;
        int statusBook1 = 1;
        int idBook1 = 30;
        String titleBook2 = "Los primeros tres minutos del universo";
        String authorBook2 = "Steven Weinberg";
        int yearPublishedBook2 = 1977;
        int statusBook2 = 0;
        int idBook2 = 40;
        String titleBook3 = "The Science of Interstellar";
        String authorBook3 = "Kip Thorne";
        int yearPublishedBook3 = 2014;
        int statusBook3 = 1;
        int idBook3 = 50;
        String titleBook4 = "The 4 hour workweek";
        String authorBook4 = "Tim Ferriss";
        int yearPublishedBook4 = 2007;
        int statusBook4 = 0;
        int idBook4 = 60;
        Book book1 = new Book(titleBook1, authorBook1, yearPublishedBook1, statusBook1, idBook1);
        Book book2 = new Book(titleBook2, authorBook2, yearPublishedBook2, statusBook2, idBook2);
        Book book3 = new Book(titleBook3, authorBook3, yearPublishedBook3, statusBook3, idBook3);
        Book book4 = new Book(titleBook4, authorBook4, yearPublishedBook4, statusBook4, idBook4);
        List<Book> bookList = new ArrayList<>(Arrays.asList(book1, book2, book3, book4));

        String resultBookList = library.selectOption(optionMenu);

        assertThat(bookList.get(0).getTitle()+"|" +bookList.get(0).getAuthor()+"|"+bookList.get(0).getYearPublished()+"\n"+bookList.get(1).getTitle()+"|" +bookList.get(1).getAuthor()+"|"+bookList.get(1).getYearPublished()+"\n"+bookList.get(2).getTitle()+"|" +bookList.get(2).getAuthor()+"|"+bookList.get(2).getYearPublished()+"\n"+bookList.get(3).getTitle()+"|" +bookList.get(3).getAuthor()+"|"+bookList.get(3).getYearPublished(), is(resultBookList));
    }


    @Test
    public void testShouldShowErrorMessageWhenSelectInvalidOption(){
        Library library = new Library();
        int optionMenu = -6;
        String errorMessage = "Please select a valid option!";

        String resultErrorMessage = library.selectOption(optionMenu);

        assertThat(errorMessage, is(resultErrorMessage));
    }



    /*@Test
    public void testShouldExitWhenSelectQuitOption(){
        Library library = new Library();
        int optionMenu = 0;
        String exitMessage = "Exit...";

        String resultErrorMessage = library.selectOption(optionMenu);

        assertThat(exitMessage, is(resultErrorMessage));
    }*/


    /*@Test
    public void testShouldCheckOutAvailableBook(){
        Library library = new Library();
        int codBook = 30;
        int statusBook = 1;

        Book book = library.checkoutBook(codBook);

        assertThat(statusBook, is(book.getStatus()));
    }*/


    @Test
    public void testShouldListOnlyAvailableBook(){
        String titleBook1 = "El amor en tiempos de Colera";
        String authorBook1 = "Gabriel Garcia Marquez";
        int yearPublishedBook1 = 1985;
        int statusBook1 = 1;
        int idBook1 = 30;
        String titleBook2 = "Los primeros tres minutos del universo";
        String authorBook2 = "Steven Weinberg";
        int yearPublishedBook2 = 1977;
        int statusBook2 = 0;
        int idBook2 = 40;
        String titleBook3 = "The Science of Interstellar";
        String authorBook3 = "Kip Thorne";
        int yearPublishedBook3 = 2014;
        int statusBook3 = 1;
        int idBook3 = 50;
        String titleBook4 = "The 4 hour workweek";
        String authorBook4 = "Tim Ferriss";
        int yearPublishedBook4 = 2007;
        int statusBook4 = 0;
        int idBook4 = 60;
        Book book1 = new Book(titleBook1, authorBook1, yearPublishedBook1, statusBook1, idBook1);
        Book book2 = new Book(titleBook2, authorBook2, yearPublishedBook2, statusBook2, idBook2);
        Book book3 = new Book(titleBook3, authorBook3, yearPublishedBook3, statusBook3, idBook3);
        Book book4 = new Book(titleBook4, authorBook4, yearPublishedBook4, statusBook4, idBook4);
        List<Book> bookList = new ArrayList<>(Arrays.asList(book1, book2, book3, book4));
        Library library = new Library();
        library.getBookList().get(0).setStatus(1);
        library.getBookList().get(2).setStatus(1);

        String resultBookList = library.displayBookList();

        assertThat(bookList.get(1).getTitle()+"|" +bookList.get(1).getAuthor()+"|"+bookList.get(1).getYearPublished()+"\n"+bookList.get(3).getTitle()+"|" +bookList.get(3).getAuthor()+"|"+bookList.get(3).getYearPublished(), is(resultBookList));
    }


    @Test
    public void testShouldShowMessageWhenCheckOutAvailableBook(){
        Library library = new Library();
        int codBook = 30;
        String messageCheckedoutBook = "Thank you! Enjoy the book";

        String resultMessageCheckedoutBook = library.checkoutBook(codBook);

        assertThat(messageCheckedoutBook, is(resultMessageCheckedoutBook));
    }


    @Test
    public void testShouldShowMessageWhenTryCheckOutUnavailableBook(){
        Library library = new Library();
        int codBook = library.getBookList().get(0).getCod();
        library.getBookList().get(0).setStatus(1);
        String messageCheckedoutUnavailableBook = "Sorry, that book is not available";

        String resultMessageCheckedoutUnavailableBook = library.checkoutBook(codBook);

        assertThat(messageCheckedoutUnavailableBook, is(resultMessageCheckedoutUnavailableBook));
    }


    /*@Test
    public void testShouldReturnABook(){
        Library library = new Library();
        library.getBookList().get(0).setStatus(1);
        int codBook = library.getBookList().get(0).getCod();
        int expectedStatusReturnedBook = 0;

        Book book = library.returnBook(codBook);

        assertThat(expectedStatusReturnedBook, is(book.getStatus()));
    }*/


    @Test
    public void testShouldShowAMessageWhenReturnABook(){
        Library library = new Library();
        library.getBookList().get(0).setStatus(1);
        int codBook = library.getBookList().get(0).getCod();
        String messageReturnBookSuccessfully = "Thank you for returning the book";

        String expectedMessageReturnBookSuccessfully = library.returnBook(codBook);

        assertThat(expectedMessageReturnBookSuccessfully, is(messageReturnBookSuccessfully));
    }


    @Test
    public void testShouldShowAErrorMessageWhenReturnAInvalidBook(){
        Library library = new Library();
        int codBook = library.getBookList().get(0).getCod();
        library.getBookList().remove(0);
        String messageReturnBookSuccessfully = "That is not a valid book to return";

        String expectedMessageReturnBookSuccessfully = library.returnBook(codBook);

        assertThat(expectedMessageReturnBookSuccessfully, is(messageReturnBookSuccessfully));
    }


    /*@Test
    public void testShouldCallCheckoutOptionWhenSelectOptionTwo(){
        Library library = new Library();
        int optionMenu = 2;
        String expectedMessageOptionCheckoutBook = "Thank you! Enjoy the book";

        String resultMessageCheckedoutBook = library.selectOption(optionMenu);

        assertThat(expectedMessageOptionCheckoutBook, is(resultMessageCheckedoutBook));
    }*/


    @Test
    public void testShouldShowErrorMessageWhenABookIsNotInList(){
        Library library = new Library();
        int codBook = 68;
        String expectedMessageOptionCheckoutBook = "That is not a valid book to check out";

        String resultMessageCheckedoutBook = library.checkoutBook(codBook);

        assertThat(expectedMessageOptionCheckoutBook, is(resultMessageCheckedoutBook));
    }



}
