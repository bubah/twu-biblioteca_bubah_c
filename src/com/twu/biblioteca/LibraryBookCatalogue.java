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

    public void displayListOfBooks(){
        System.out.printf("%-50s %-50s %-50s\n", listOfBooks.get(0).getTitle(), listOfBooks.get(0).getAuthor(), listOfBooks.get(0).getPublishDate());
        System.out.printf("%-50s %-50s %-50s\n", listOfBooks.get(1).getTitle(), listOfBooks.get(1).getAuthor(), listOfBooks.get(1).getPublishDate());
        System.out.printf("%-50s %-50s %-50s\n", listOfBooks.get(2).getTitle(), listOfBooks.get(2).getAuthor(), listOfBooks.get(2).getPublishDate());
    }

    /*while (choice != '0'){
        switch (choice){
            case 'A':
                System.out.println("You selected Option A");
                break;
            case 'B':
                System.out.println("You selected Option B");
                break;
            case 'C':
                System.out.println("You selected Option C");
                break;
            case 'D':
                System.out.println("You selected Option D");
                break;
            case '0':
                System.out.println("You Exited the Console");
                break;
            default:
                System.out.println("wrong selection. Try again!");
        }*/
}
