package com.twu.biblioteca;

import java.util.Scanner;

public class LibraryMenue {
    private ListOfBooks listOfBooks = new ListOfBooks();

    public void brownseMenue(){

        Scanner scan = new Scanner(System.in);

        char choice = 'Z';
        listOfBooks.displayBookList();
        System.out.print("Select a Book from the above list: ");
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

            listOfBooks.displayBookList();
            System.out.print("Select another Book from the library: ");
            choice = scan.next().charAt(0);
        }
    }
}
