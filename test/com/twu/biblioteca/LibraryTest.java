package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Movie;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LibraryTest {

    @Test
    public void whenOpenAppThenShouldShowWelcomeMessage(){
        Library library = new Library();
        String expectedWelcomeMessage = "Welcome to Biblioteca. Your one stop-shop for great book titles in Bangalore!";

        String resultWelcomeMessage = library.showWelcomeMessage();

        assertThat(expectedWelcomeMessage, is(resultWelcomeMessage));
    }


    @Test
    public void whenOpenAppThenCreateABookList(){
        Library library = new Library();
        int sizeBookList = 4;

        int resultSizeBookList = library.getBookList().size();

        assertThat(sizeBookList, is(resultSizeBookList));
    }


    @Test
    public void whenOpenAppThenShouldListTitleAuthorAndYearPublishedA(){
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

        assertThat(bookList.get(0).getTitle()+"|" +bookList.get(0).getAuthor()+"|"+bookList.get(0).getYearPublished()+"\n"+bookList.get(1).getTitle()+"|" +bookList.get(1).getAuthor()+"|"+bookList.get(1).getYearPublished()+"\n"+bookList.get(2).getTitle()+"|" +bookList.get(2).getAuthor()+"|"+bookList.get(2).getYearPublished()+"\n"+bookList.get(3).getTitle()+"|" +bookList.get(3).getAuthor()+"|"+bookList.get(3).getYearPublished()+"\n", is(resultBookList));
    }


    @Test
    public void givenAVailableBookWhenCheckoutTheBookThenShowSuccessfulMessage(){
        Library library = new Library();
        int codBook = 30;
        String messageCheckedoutBook = "Thank you! Enjoy the book";

        String resultMessageCheckedoutBook = library.checkoutBook(codBook);

        assertThat(messageCheckedoutBook, is(resultMessageCheckedoutBook));
    }


    @Test
    public void givenThereAreCheckedoutBooksWhenDisplayBooksThenShouldListOnlyAvailableBook(){
        String titleBook2 = "Los primeros tres minutos del universo";
        String authorBook2 = "Steven Weinberg";
        int yearPublishedBook2 = 1977;
        int statusBook2 = 1;
        int idBook2 = 40;
        String titleBook4 = "The 4 hour workweek";
        String authorBook4 = "Tim Ferriss";
        int yearPublishedBook4 = 2007;
        int statusBook4 = 1;
        int idBook4 = 60;
        Book book2 = new Book(titleBook2, authorBook2, yearPublishedBook2, statusBook2, idBook2);
        Book book4 = new Book(titleBook4, authorBook4, yearPublishedBook4, statusBook4, idBook4);
        List<Book> bookList = new ArrayList<>(Arrays.asList(book2, book4));
        Library library = new Library();
        library.getBookList().get(30).setStatus(1);
        library.getBookList().get(50).setStatus(1);

        String resultBookList = library.displayBookList();

        assertThat(bookList.get(0).getTitle()+"|" +bookList.get(0).getAuthor()+"|"+bookList.get(0).getYearPublished()+"\n"+bookList.get(1).getTitle()+"|" +bookList.get(1).getAuthor()+"|"+bookList.get(1).getYearPublished()+"\n", is(resultBookList));
    }


    @Test
    public void givenAnUnavailableBookWhenCheckoutTheBookThenShowUnsuccessfulMessage(){
        Library library = new Library();
        int codeBook = library.getBookList().get(30).getCode();
        library.getBookList().get(30).setStatus(1);
        String messageCheckedoutUnavailableBook = "Sorry, that book is not available";

        String resultMessageCheckedoutUnavailableBook = library.checkoutBook(codeBook);

        assertThat(messageCheckedoutUnavailableBook, is(resultMessageCheckedoutUnavailableBook));
    }


    @Test
    public void givenAValidBookWhenReturnTheBookThenShowSuccessfulMessage(){
        Library library = new Library();
        library.getBookList().get(30).setStatus(1);
        int codeBook = library.getBookList().get(30).getCode();
        String messageReturnBookSuccessfully = "Thank you for returning the book";

        String expectedMessageReturnBookSuccessfully = library.returnBook(codeBook);

        assertThat(expectedMessageReturnBookSuccessfully, is(messageReturnBookSuccessfully));
    }


    @Test
    public void givenAnInvalidBookWhenReturnTheBookThenShowSuccessfulMessage(){
        Library library = new Library();
        int codeBookForReturning = 90;
        String messageReturnBookSuccessfully = "That is not a valid book to return";

        String expectedMessageReturnBookSuccessfully = library.returnBook(codeBookForReturning);

        assertThat(expectedMessageReturnBookSuccessfully, is(messageReturnBookSuccessfully));
    }


    @Test
    public void givenBookDoNotBelongToLibraryWhenReturnTheBookThenShowSuccessfulMessage(){
        Library library = new Library();
        int codBook = 68;
        String expectedMessageOptionCheckoutBook = "That is not a valid book to check out";

        String resultMessageCheckedoutBook = library.checkoutBook(codBook);

        assertThat(expectedMessageOptionCheckoutBook, is(resultMessageCheckedoutBook));
    }


    @Test
    public void whenOpenAppThenCreateAMovieList(){
        Library library = new Library();
        int sizeMovieList = 4;

        int resultSizeMovieList = library.getMovieList().size();

        assertThat(sizeMovieList, is(resultSizeMovieList));
    }


    @Test
    public void givenThereAreCheckedoutMoviesWhenDisplayMoviesThenShouldListOnlyAvailableMovies(){
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
        List<Movie> bookList = new ArrayList<>(Arrays.asList(movie1, movie2));
        Library library = new Library();
        library.getMovieList().get(500).setStatus(1);
        library.getMovieList().get(600).setStatus(1);

        String resultBookList = library.displayMovieList();

        assertThat(bookList.get(0).getName()+"|"+bookList.get(0).getYearMovie()+"|"+bookList.get(0).getDirector()+"|"+bookList.get(0).getRating()+"\n"+bookList.get(1).getName()+"|"+bookList.get(1).getYearMovie()+"|"+bookList.get(1).getDirector()+"|"+bookList.get(1).getRating()+"\n", is(resultBookList));
    }


    @Test
    public void givenAVailableMovieWhenCheckoutTheMovieThenShowSuccessfulMessage(){
        Library library = new Library();
        int codeMovie = 300;
        String messageCheckedoutBook = "Thank you! Enjoy the movie";

        String resultMessageCheckedoutMovie = library.checkoutMovie(codeMovie);

        assertThat(messageCheckedoutBook, is(resultMessageCheckedoutMovie));
    }


    @Test
    public void givenAnUnavailableMovieWhenCheckoutTheMovieThenShowUnsuccessfulMessage(){
        Library library = new Library();
        int codeMovie = library.getMovieList().get(300).getCode();
        library.getMovieList().get(300).setStatus(1);
        String messageCheckedoutUnavailableMovie= "Sorry, that movie is not available";

        String resultMessageCheckedoutUnavailableMovie = library.checkoutMovie(codeMovie);

        assertThat(messageCheckedoutUnavailableMovie, is(resultMessageCheckedoutUnavailableMovie));
    }


    @Test
    public void givenMovieDoNotBelongToLibraryWhenCheckoutTheMovieTheShowUnsuccessfulMessage(){
        Library library = new Library();
        int codeMovie = 990;
        String messageCheckedoutUnavailableMovie= "That is not a valid movie to check out";

        String resultMessageCheckedoutUnavailableMovie = library.checkoutMovie(codeMovie);

        assertThat(messageCheckedoutUnavailableMovie, is(resultMessageCheckedoutUnavailableMovie));
    }


    @Test
    public void whenAppStartsThenCreateADefaultUserList(){
        Library library = new Library();
        int expectedSizeList = 2;

        int sizeList = library.getUserList().size();

        assertThat(expectedSizeList, is(sizeList));
    }



}
