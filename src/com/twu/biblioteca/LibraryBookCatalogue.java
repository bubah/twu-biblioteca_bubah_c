package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Scanner;
public class LibraryBookCatalogue {

    private HashMap<String, Books> listOfBooks;

    LibraryBookCatalogue(){
        listOfBooks = new HashMap<String, Books>();
        listOfBooks.put("Harry Potter and the Philosopher's Stone", new Books("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997, 1));
        listOfBooks.put("The Cat in the Hat", new Books("The Cat in the Hat", "DR. Suess", 2003, 1));
        listOfBooks.put("Horton Hears a Who!", new Books("Horton Hears a Who!", "DR. Suess", 1970, 1));
        listOfBooks.put("Dr. Seuss on the Loose", new Books("Dr. Seuss on the Loose", "DR. Suess", 1973, 1));
    }

    public HashMap getListOfBooks() {
        return listOfBooks;
    }

    private void displayListOfBooks(){
        for (Books book: listOfBooks.values()){
            System.out.printf("%-50s %-20s %-10s\n", book.getTitle(), book.getAuthor(), book.getPublishDate());
        }
    }

    public Books checkOutBook(String bookTitle){
        if(!listOfBooks.containsKey(bookTitle)){
            return null;
        }
        reduceBookQuantity(bookTitle);
        printSuccessMessage(bookTitle);
        return listOfBooks.get(bookTitle);
    }

    protected void reduceBookQuantity(String bookTitle){
        Books book = listOfBooks.get(bookTitle);
        if(book.quantity > 0) {
            book.quantity--;
        }
    }

    public int getBookQuantity(String bookTitle){
        Books book = listOfBooks.get(bookTitle);
        return book.quantity;
    }

    private void printSuccessMessage(String bookTitle){
        System.out.println(bookTitle + " has been checkedout!\n" );
    }

    public void selectBook() {
        displayListOfBooks();
        Scanner scan = new Scanner(System.in);
        System.out.print("Select a Book to checkout (select -1 to exit or -2 to checkout): ");
        String choice = scan.nextLine();
        while (!choice.equals("-1")) {

            //System.out.println("Choice " + choice);

            if(choice.equals("Harry Potter and the Philosopher's Stone")){
                checkOutBook(choice);
            } else if(choice.equals("The Cat in the Hat")){
                checkOutBook(choice);
            } else if(choice.equals("Horton Hears a Who!")){
                checkOutBook(choice);
            } else if(choice.equals("Dr. Seuss on the Loose")) {
                checkOutBook(choice);
            } else {
                System.out.println("wrong selection. Try again!");
            }
            /*switch (choice) {
                case "Harry Potter and the Philosopher's Stone":
                    System.out.println("You selected Option A");
                    break;
                case "The Cat in the Hat":
                    System.out.println("You selected Option B");
                    break;
                case "Horton Hears a Who!":
                    System.out.println("You selected Option C");
                    break;
                case "Dr. Seuss on the Loose":
                    System.out.println("You selected option 4");
                    break;
                default:
                    System.out.println("wrong selection. Try again!");
            }*/

            System.out.print("Select a Book to checkout (select -1 to exit app): ");
            choice = scan.nextLine();

        }

        System.out.print("Successfuly exited the application");
    }
}
