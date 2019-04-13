package com.twu.biblioteca;

import sun.tools.jconsole.ProxyClient;

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

    public void displayListOfMenueOptions(){
        System.out.println("Select a menue option:");
        System.out.println("A: " + menueOptions.get(0));
    }


    public ArrayList<String> getMenueOptions(){
        return menueOptions;
    }

    public char getUserInput() {
        Scanner scan = new Scanner(System.in); // Set up Scanner
        displayListOfMenueOptions(); // Display menue
        char choice = scan.next().charAt(0); // Get user input
        return choice;
    }

    public void browseMenue(){

        Scanner scan = new Scanner(System.in);
        char choice = getUserInput(scan);

        while (choice != '0'){
            switch (choice){
                case 'A':
                    System.out.println("You selected Option A");
                    break;

                default:
                    System.out.println("wrong selection. Try again!");
            }
        }
    }
}
