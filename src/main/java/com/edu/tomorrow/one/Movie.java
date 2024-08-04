package com.edu.tomorrow.one;

public class Movie extends Publish {
    private final String director;
    private final String mainActor;
    private final String synopsis;
    private final String duration;

    public Movie(String title, String author, int year, String kind, String publisher, int available, String director, String mainActor, String synopsis, String duration) {
        super(title, author, year, kind, publisher, available);
        this.director = director;
        this.mainActor = mainActor;
        this.synopsis = synopsis;
        this.duration = duration;
    }

    @Override
    public String printData() {
        return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nYear: " + getYear() + "\nKind: " + getKind() + "\nPublisher: " + getPublisher() + "\nAvailable: " + getAvailable() + "\nDirector: " + director + "\nMain actor: " + mainActor + "\nSynopsis: " + synopsis + "\nDuration: " + duration;
    }
}
