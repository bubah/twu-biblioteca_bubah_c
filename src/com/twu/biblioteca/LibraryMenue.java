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
        menueOptions.add("CheckIn Book");
        menueOptions.add("Quit App");
    }

    // DIsplay Library menue options
    private void displayListOfMenueOptions(){
        System.out.println("Menue options:");
        for(int optionNumber = 0; optionNumber< menueOptions.size(); optionNumber++) {
            System.out.println(optionNumber + ": " + menueOptions.get(optionNumber));
        }

        System.out.print("Select an Option: ");
    }

    // Returns an a list of menue options (for testing purpose only)
    public ArrayList<String> getMenueOptions(){
        return menueOptions;
    }

    private int getUserInput() {
        Scanner scan = new Scanner(System.in); // Set up Scanner
        int choice = scan.nextInt(); // Get user input
        return choice;
    }

    public void browseMenue(){
        displayListOfMenueOptions(); // Display menue
        int choice = getUserInput();
        LibraryBookCatalogue libraryBookCatalogue = new LibraryBookCatalogue();
        while (!(choice == 2) ) {
            switch (choice) {
                case 0:
                    libraryBookCatalogue.selectBook();
                    break;
                case 1:
                    libraryBookCatalogue.checkInBook();
                    break;

                default:
                    System.out.println("Wrong selection. Try again!");
            }
            displayListOfMenueOptions();
            choice = getUserInput();
        }
    }
}
