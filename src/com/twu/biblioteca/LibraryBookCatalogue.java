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
            if(book.quantity > 0) {
                System.out.printf("%-50s %-20s %-10s\n", book.getTitle(), book.getAuthor(), book.getPublishDate());
            }
        }
    }

    protected Books checkOutBook(String bookTitle){
        if(listOfBooks.containsKey(bookTitle)){
            if(reduceBookQuantity(bookTitle)) {
                printSuccessMessage(bookTitle);
                return listOfBooks.get(bookTitle);
            }
        }

        return null;
    }

    public void checkInBook(String bookTitle){

    }

    protected Boolean reduceBookQuantity(String bookTitle){
        Books book = listOfBooks.get(bookTitle);
        if(book.quantity > 0) {
            book.quantity--;
            return true;
        }

        System.out.println("Sorry that book is not available");
        return false;
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
        System.out.print("Select a Book to checkout (select -1 to exit app): ");
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
                System.out.println("Sorry that book is not available");
            }
            displayListOfBooks();
            System.out.print("Select a Book to checkout (select -1 to exit app): ");
            choice = scan.nextLine();

        }

        System.out.print("Successfuly exited the application");
    }
}
