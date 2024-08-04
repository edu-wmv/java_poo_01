package com.edu.tomorrow.one;

public class Book extends Publish {
    private final String edition;
    private final String isbn;

    public Book (String title, String author, int year, String kind, String publisher, int available, String edition, String isbn) {
        super(title, author, year, kind, publisher, available);
        this.edition = edition;
        this.isbn = isbn;
    }

    @Override
    public String printData() {
        return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nYear: " + getYear() + "\nKind: " + getKind() + "\nPublisher: " + getPublisher() + "\nAvailable: " + getAvailable() + "\nEdition: " + edition + "\nISBN: " + isbn;
    }
}
