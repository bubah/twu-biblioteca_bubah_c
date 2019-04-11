package com.twu.biblioteca;

import java.awt.*;

public class ListOfBooks {

    Books [] listOfBooks = new Books[4];

    ListOfBooks(){
        listOfBooks[0] = new Books("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997);
        listOfBooks[1] = new Books("The Cat in the Hat", "DR. Suess", 2003);
        listOfBooks[2] = new Books("Horton Hears a Who!", "DR. Suess", 1970);
        listOfBooks[3] = new Books("Dr. Seuss on the Loose", "DR. Suess", 1973);

    }

    public void displayBookList(){
        System.out.println("Banglore Library Menue Option (Select an option): ");
        System.out.println("A: " + listOfBooks[0].getTitle() + " | " + listOfBooks[0].getAuthor() + " | " + listOfBooks[0].getPublishDate()
                + "\nB: " + listOfBooks[1].getTitle() + " | " + listOfBooks[1].getAuthor() + " | " + listOfBooks[1].getPublishDate()
                + "\nC: " + listOfBooks[2].getTitle() + " | " + listOfBooks[2].getAuthor() + " | " + listOfBooks[2].getPublishDate());
    }

    public Books[] getListOfBooks() {
        return listOfBooks;
    }
}
