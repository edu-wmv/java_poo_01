package com.edu.tomorrow.one;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testPrintData() {
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, "Fantasy", "Allen & Unwin", 3, "First", "0-395-19395-8");
        String expectedBook = "Title: The Lord of the Rings\nAuthor: J.R.R. Tolkien\nYear: 1954\nKind: Fantasy\nPublisher: Allen & Unwin\nAvailable: 3\nEdition: First\nISBN: 0-395-19395-8";

        Movie movie = new Movie("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", 2001, "Fantasy", "New Line Cinema", 1, "Peter Jackson", "Elijah Wood", "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.", "178 minutes");
        String expectedMovie = "Title: The Lord of the Rings: The Fellowship of the Ring\nAuthor: Peter Jackson\nYear: 2001\nKind: Fantasy\nPublisher: New Line Cinema\nAvailable: 1\nDirector: Peter Jackson\nMain actor: Elijah Wood\nSynopsis: A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.\nDuration: 178 minutes";

        Publish[] publish = new Publish[2];

        publish[0] = book;
        publish[1] = movie;

        assertEquals(expectedBook, publish[0].printData());
        assertEquals(expectedMovie, publish[1].printData());
    }
}
