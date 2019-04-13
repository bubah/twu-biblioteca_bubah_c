package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Scanner;
public class LibraryBookCatalogue {

    private HashMap<Books, Integer> listOfBooks;
    //private ArrayList<Books> listOfBooks = new ArrayList<Books>();

    LibraryBookCatalogue(){
        listOfBooks = new HashMap<Books, Integer>();
        listOfBooks.put(new Books("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997), 1);
        listOfBooks.put(new Books("The Cat in the Hat", "DR. Suess", 2003), 1);
        listOfBooks.put(new Books("Horton Hears a Who!", "DR. Suess", 1970), 1);
        listOfBooks.put(new Books("Dr. Seuss on the Loose", "DR. Suess", 1973), 1);
    }

    public HashMap getListOfBooks() {
        return listOfBooks;
    }

    private void displayListOfBooks(){
        System.out.println(listOfBooks.get("h"));
        for (Books book: listOfBooks.keySet()){
            System.out.printf("%-2s %-50s %-20s %-10s\n", "1: ", book.getTitle(), book.getAuthor(), book.getPublishDate());
        }
        /*System.out.printf("%-2s %-50s %-20s %-10s\n", "1: ", listOfBooks.get(0).getTitle(), listOfBooks.get(0).getAuthor(), listOfBooks.get(0).getPublishDate());
        System.out.printf("%-2s %-50s %-20s %-10s\n", "2: ", listOfBooks.get(1).getTitle(), listOfBooks.get(1).getAuthor(), listOfBooks.get(1).getPublishDate());
        System.out.printf("%-2s %-50s %-20s %-10s\n", "3: ", listOfBooks.get(2).getTitle(), listOfBooks.get(2).getAuthor(), listOfBooks.get(2).getPublishDate());
        System.out.printf("%-2s %-50s %-20s %-10s\n", "4: ", listOfBooks.get(3).getTitle(), listOfBooks.get(3).getAuthor(), listOfBooks.get(3).getPublishDate());*/
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
                case 4:
                    System.out.println("You selected option 4");
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
