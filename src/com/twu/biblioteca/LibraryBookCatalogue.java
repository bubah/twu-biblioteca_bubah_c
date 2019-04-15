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

    protected HashMap getListOfBooks() {
        return listOfBooks;
    }

    private void displayListOfBooks(){
        for (Books book: listOfBooks.values()){
            if(book.quantity > 0) {
                System.out.printf("%-50s %-20s %-10s\n", book.getTitle(), book.getAuthor(), book.getPublishDate());
            }
        }
        System.out.println();
    }

    public void checkInBook(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert book title: ");
        String bookTitle = scan.nextLine();
        checkIn(bookTitle);
    }

    protected void checkIn(String bookTitle){
        if(listOfBooks.containsKey(bookTitle) && bookQuantityIncreased(bookTitle)){
            System.out.println("Thank you for returning the book\n");
            return;
        }
        System.out.println("That is not a valid book to return.\n");
    }

    protected Books checkOutBook(String bookTitle){
        if(listOfBooks.containsKey(bookTitle) && bookQuantityReduced(bookTitle)){
            System.out.println(bookTitle + " has been checkedout!\n" );
            return listOfBooks.get(bookTitle);
        }
        System.out.println("Sorry that book is not available\n");
        return null;
    }

    protected Boolean bookQuantityReduced(String bookTitle){
        Books book = listOfBooks.get(bookTitle);
        if(book.quantity > 0) {
            book.quantity--;
            return true;
        }
        return false;
    }

    protected Boolean bookQuantityIncreased(String bookTitle){
        Books book = listOfBooks.get(bookTitle);
        if(book.quantity == 1) {
            return false;
        }
        book.quantity++;
        return true;
    }

    public int getBookQuantity(String bookTitle){
        Books book = listOfBooks.get(bookTitle);
        return book.quantity;
    }

    public void selectBook() {
        displayListOfBooks();
        Scanner scan = new Scanner(System.in);
        System.out.print("Select a Book to checkout (1: exit book list): ");
        String choice = scan.nextLine();

        while (!choice.equals("1")) {

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
            System.out.print("Select a Book to checkout (1: exit book list): ");
            choice = scan.nextLine();

        }
        System.out.println();
    }

}
