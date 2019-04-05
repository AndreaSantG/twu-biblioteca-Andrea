package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Menu;
import com.twu.biblioteca.model.Movie;
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
        String menuOptions = "(1) List books\n(2) Checkout a book\n(3) Return a book\n(4) List movies\n(0) Quit";

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
    public void givenMenuIsShownWhenSelectOptionTwoThenCallCheckoutBookOption(){
        Library library = new Library();
        Menu menu = new Menu();
        library.getBookList().get(30).setStatus(0);
        int codeBook = library.getBookList().get(30).getCode();
        int menuOption = 2;
        String expectedMessage = "Checkout a Book";

        String resultCheckoutABook = menu.selectOption(menuOption, library);

        assertThat(expectedMessage, is(resultCheckoutABook));
    }



    @Test
    public void givenMenuIsShownWhenSelectOptionThreeThenCallReturnBookOption(){
        Library library = new Library();
        Menu menu = new Menu();
        library.getBookList().get(30).setStatus(0);
        int codeBook = library.getBookList().get(30).getCode();
        int menuOption = 3;
        String expectedMessage = "Return a Book";

        String resultCheckoutABook = menu.selectOption(menuOption, library);

        assertThat(expectedMessage, is(resultCheckoutABook));
    }



    @Test
    public void givenMenuIsShownWhenSelectOptionFourThenShouldShowOnlyAvailableMovieList(){
        Menu menu = new Menu();
        Library library = new Library();
        library.getMovieList().get(600).setStatus(1);
        int optionMenu = 4;
        String nameMovie1 = "Titanic";
        int yearMovie1 = 1997;
        String directorMovie1 = "James Cameron";
        int ratingMovie1 = 9;
        int statusMovie1 = 0;
        int codeMovie1 = 300;
        Movie movie1 = new Movie(nameMovie1, yearMovie1, directorMovie1, ratingMovie1, statusMovie1, codeMovie1);
        String nameMovie2 = "El Rey Leon";
        int yearMovie2 = 1994;
        String directorMovie2 = "Rob Minkoff, Roger Allers";
        int ratingMovie2 = 10;
        int statusMovie2 = 0;
        int codeMovie2 = 400;
        Movie movie2 = new Movie(nameMovie2, yearMovie2, directorMovie2, ratingMovie2, statusMovie2, codeMovie2);
        String nameMovie3 = "Avatar";
        int yearMovie3 = 2009;
        String directorMovie3 = "James Cameron";
        int ratingMovie3 = 0;
        int statusMovie3 = 0;
        int codeMovie3 = 500;
        Movie movie3 = new Movie(nameMovie3, yearMovie3, directorMovie3, ratingMovie3, statusMovie3, codeMovie3);
        List<Movie> bookList = new ArrayList<>(Arrays.asList(movie1, movie2, movie3));

        String resultBookList = menu.selectOption(optionMenu, library);

        assertThat(bookList.get(0).getName()+"|"+bookList.get(0).getYearMovie()+"|"+bookList.get(0).getDirector()+"|"+bookList.get(0).getRating()+"\n"+bookList.get(1).getName()+"|"+bookList.get(1).getYearMovie()+"|"+bookList.get(1).getDirector()+"|"+bookList.get(1).getRating()+"\n"+bookList.get(2).getName()+"|"+bookList.get(2).getYearMovie()+"|"+bookList.get(2).getDirector()+"|"+bookList.get(2).getRating()+"\n", is(resultBookList));
    }


    @Test
    public void givenMenuIsShownWhenSelectOptionFiveThenCallCheckoutBookOption(){
        Library library = new Library();
        Menu menu = new Menu();
        library.getMovieList().get(300).setStatus(0);
        int codeMovie = library.getMovieList().get(300).getCode();
        int menuOption = 5;
        String expectedMessage = "Checkout a Movie";

        String resultCheckoutABook = menu.selectOption(menuOption, library);

        assertThat(expectedMessage, is(resultCheckoutABook));
    }


}
