package com.twu.biblioteca;

import java.util.ArrayList; // import the ArrayList class

public class LibraryBookCatalogue {

    private ArrayList<Books> listOfBooks = new ArrayList<Books>();

    LibraryBookCatalogue(){
        listOfBooks.add(new Books("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997));
        listOfBooks.add(new Books("The Cat in the Hat", "DR. Suess", 2003));
        listOfBooks.add(new Books("Horton Hears a Who!", "DR. Suess", 1970));
        listOfBooks.add(new Books("Dr. Seuss on the Loose", "DR. Suess", 1973));
    }

    public ArrayList<Books> getListOfBooks() {
        return listOfBooks;
    }
}
