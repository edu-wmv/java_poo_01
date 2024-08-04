package com.edu.tomorrow.one;

public class Movie extends Publish {
    private final String director;
    private final String mainActor;
    private final String synopsis;
    private final String time;

    public Movie(String title, String author, int year, String kind, String publisher, int available, String director, String mainActor, String synopsis, String time) {
        super(title, author, year, kind, publisher, available);
        this.director = director;
        this.mainActor = mainActor;
        this.synopsis = synopsis;
        this.time = time;
    }

    @Override
    public String printData() {
        return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nYear: " + getYear() + "\nKind: " + getKind() + "\nPublisher: " + getPublisher() + "\nAvailable: " + getAvailable() + "\nDirector: " + director + "\nMain actor: " + mainActor + "\nSynopsis: " + synopsis + "\nTime: " + time;
    }
}
