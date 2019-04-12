package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryMenue {

    private  ArrayList<String> menueOptions;
    private LibraryBookCatalogue listOfBooks;

    // Constructor
    LibraryMenue (){
        this.menueOptions = new ArrayList<String>();
        menueOptions.add("List of Books");
        this.listOfBooks = new LibraryBookCatalogue();
    }

    private void displayListOfMenueOptions(){
        ArrayList options = getMenueOptions();
        //System
    }

    private void displayListOfBooks(){
        ArrayList<Books> books = listOfBooks.getListOfBooks();

        //System.out.println("Banglore Library Menue Option (Select an option): ");
        System.out.println("A: " + books.get(0).getTitle() + " | " + books.get(0).getAuthor() + " | " + books.get(0).getPublishDate()
                + "\nB: " + books.get(1).getTitle() + " | " + books.get(1).getAuthor() + " | " + books.get(1).getPublishDate()
                + "\nC: " + books.get(2).getTitle() + " | " + books.get(2).getAuthor() + " | " + books.get(2).getPublishDate());
    }

    public ArrayList<String> getMenueOptions(){
        return menueOptions;
    }

    public void browseMenue(){
        Scanner scan = new Scanner(System.in);
        char choice = 'Z';
        //displayMenue();

        System.out.print("\nSelect a Book from the above list: ");
        choice = scan.next().charAt(0);

        while (choice != '0'){
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
            }

            //displayMenue();
            System.out.print("Select another Book from the library: ");
            choice = scan.next().charAt(0);
        }
    }
}
