package com.twu.biblioteca;

import java.util.Scanner;

public class LibraryMenue {
    private ListOfBooks listOfBooks = new ListOfBooks();

    public void brownseMenue(){

        Scanner scan = new Scanner(System.in);

        int choice = -1;
        listOfBooks.displayBookList();
        System.out.print("Select a Book from the above list: ");
        choice = scan.nextInt();

        while (choice != 5){

            listOfBooks.displayBookList();
            choice = scan.nextInt();
        }
    }
}
