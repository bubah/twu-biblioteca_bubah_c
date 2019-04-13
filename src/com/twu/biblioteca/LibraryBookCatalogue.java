package com.twu.biblioteca;

import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;

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

    private void displayListOfBooks(){
        System.out.printf("%-2s %-50s %-20s %-10s\n", "1: ", listOfBooks.get(0).getTitle(), listOfBooks.get(0).getAuthor(), listOfBooks.get(0).getPublishDate());
        System.out.printf("%-2s %-50s %-20s %-10s\n", "2: ", listOfBooks.get(1).getTitle(), listOfBooks.get(1).getAuthor(), listOfBooks.get(1).getPublishDate());
        System.out.printf("%-2s %-50s %-20s %-10s\n", "3: ", listOfBooks.get(2).getTitle(), listOfBooks.get(2).getAuthor(), listOfBooks.get(2).getPublishDate());
    }

    public void selectBook() {
        displayListOfBooks();
        Scanner scan = new Scanner(System.in);
        System.out.print("Select a Book to checkout (select -1 to exit app): ");
        int choice = scan.nextInt();
        while (choice != -1) {
            switch (choice) {
                case 1:
                    System.out.println("You selected Option A");
                    break;
                case 2:
                    System.out.println("You selected Option B");
                    break;
                case 3:
                    System.out.println("You selected Option C");
                    break;
                default:
                    System.out.println("wrong selection. Try again!");
            }

            System.out.print("Select a Book to checkout (select -1 to exit app): ");
            choice = scan.nextInt();

        }

        System.out.print("Successfuly exited the application");
    }
}
