package com.edu.tomorrow.one;

public abstract class Publish {
    private final String title;
    private final String author;
    private final int year;
    private final String kind;
    private final String publisher;
    private final int available;

    public Publish(String title, String author, int year, String kind, String publisher, int available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.kind = kind;
        this.publisher = publisher;
        this.available = available;
    }

    public String printData() {
        return "Print publish data";
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public int getYear() {
        return year;
    }

    public String getKind() {
        return kind;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getAvailable() {
        return available;
    }
}
