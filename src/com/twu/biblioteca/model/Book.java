package com.twu.biblioteca.model;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private int status;
    private int cod;

    public Book(String title, String author, int yearPublished, int status, int cod) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.status = status;
        this.cod = cod;
    }

    public String getTitle() { return this.title; }
    public String getAuthor() {
        return author;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public int getStatus() { return this.status; }
    public int getCod() { return this.cod; }

    public void setStatus(int status) {
        this.status = status;
    }
}
