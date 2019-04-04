package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Menu;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MenuTest {


    @Test
    public void givenAppStartsWhenWelcomeMessageShowThenShouldDisplayMenu(){
        Menu menu = new Menu();
        String menuOptions = "(1) List of books\n(2) Checkout a book\n(3) Return a book\n(0) Quit";

        String resultMenu = menu.showMenu();

        assertThat(menuOptions, is(resultMenu));
    }



    @Test
    public void givenMenuIsShownWhenSelectOptionOneThenShouldShowBookList(){
        Menu menu = new Menu();
        Library library = new Library();
        int optionMenu = 1;
        String titleBook1 = "El amor en tiempos de Colera";
        String authorBook1 = "Gabriel Garcia Marquez";
        int yearPublishedBook1 = 1985;
        int statusBook1 = 0;
        int idBook1 = 30;
        String titleBook2 = "Los primeros tres minutos del universo";
        String authorBook2 = "Steven Weinberg";
        int yearPublishedBook2 = 1977;
        int statusBook2 = 0;
        int idBook2 = 40;
        String titleBook3 = "The Science of Interstellar";
        String authorBook3 = "Kip Thorne";
        int yearPublishedBook3 = 2014;
        int statusBook3 = 0;
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

        String resultBookList = menu.selectOption(optionMenu, library);

        assertThat(bookList.get(0).getTitle()+"|" +bookList.get(0).getAuthor()+"|"+bookList.get(0).getYearPublished()+"\n"+bookList.get(1).getTitle()+"|" +bookList.get(1).getAuthor()+"|"+bookList.get(1).getYearPublished()+"\n"+bookList.get(2).getTitle()+"|" +bookList.get(2).getAuthor()+"|"+bookList.get(2).getYearPublished()+"\n"+bookList.get(3).getTitle()+"|" +bookList.get(3).getAuthor()+"|"+bookList.get(3).getYearPublished()+"\n", is(resultBookList));
    }



    @Test
    public void givenMenuIsShownWhenSelectInvalidOptionThenShouldShowErrorMessage(){
        Menu menu = new Menu();
        Library library = new Library();
        int optionMenu = -6;
        String errorMessage = "Please select a valid option!";

        String resultErrorMessage = menu.selectOption(optionMenu, library);

        assertThat(errorMessage, is(resultErrorMessage));
    }


    @Test
    public void givenMenuIsShownWhenSelectOptionTwoThenCallCheckoutOption(){
        Library library = new Library();
        Menu menu = new Menu();
        library.getBookList().get(30).setStatus(0);
        int codeBook = library.getBookList().get(30).getCode();
        String expectedMessage = "Checkout a Book";

        String resultCheckoutABook = menu.selectOption(2, library);

        assertThat(expectedMessage, is(resultCheckoutABook));
    }



    @Test
    public void givenMenuIsShownWhenSelectOptionThreeThenCallReturnOption(){
        Library library = new Library();
        Menu menu = new Menu();
        library.getBookList().get(30).setStatus(0);
        int codeBook = library.getBookList().get(30).getCode();
        String expectedMessage = "Checkout a Book";

        String resultCheckoutABook = menu.selectOption(2, library);

        assertThat(expectedMessage, is(resultCheckoutABook));
    }



    /*@Test
    public void givenMenuIsShownWhenSelectQuitOptionThenExitApp(){
        Library library = new Library();
        int optionMenu = 0;
        String exitMessage = "Exit...";

        String resultErrorMessage = library.selectOption(optionMenu);

        assertThat(exitMessage, is(resultErrorMessage));
    }*/

}
