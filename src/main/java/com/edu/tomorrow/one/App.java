package com.edu.tomorrow.one;

public class App {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, "Fantasy", "Allen & Unwin", 3, "First", "0-395-19395-8");
        Movie movie = new Movie("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", 2001, "Fantasy", "New Line Cinema", 1, "Peter Jackson", "Elijah Wood", "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.", "178 minutes");

        Publish[] publish = new Publish[2];

        publish[0] = book;
        publish[1] = movie;

        for (Publish p : publish) {
            System.out.println(p.printData());
            System.out.println();
        }
    }
}
