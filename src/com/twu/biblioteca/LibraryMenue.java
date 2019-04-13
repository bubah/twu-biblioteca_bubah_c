package com.twu.biblioteca;

import sun.tools.jconsole.ProxyClient;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryMenue {
    // Fields
    private  ArrayList<String> menueOptions;

    // Constructor
    LibraryMenue (){
        this.menueOptions = new ArrayList<String>();
        menueOptions.add("List of Books");
    }

    // DIsplay Library menue options
    private void displayListOfMenueOptions(){
        System.out.println("Menue options:");
        System.out.println("A: " + menueOptions.get(0));
        System.out.print("Select an Option: ");
    }

    // Returns an a list of menue options (for testing purpose only)
    public ArrayList<String> getMenueOptions(){
        return menueOptions;
    }

    private char getUserInput() {
        Scanner scan = new Scanner(System.in); // Set up Scanner
        displayListOfMenueOptions(); // Display menue
        char choice = scan.next().charAt(0); // Get user input
        return choice;
    }

    public void browseMenue(){
        char choice = getUserInput();
        switch (choice){
            case 'A':
                System.out.println("You selected Option A \n");
                LibraryBookCatalogue libraryBookCatalogue = new LibraryBookCatalogue();
                libraryBookCatalogue.displayListOfBooks();
                choice = 0;
                break;

                default:
                    System.out.println("wrong selection. Try again!");
            }
    }
}
