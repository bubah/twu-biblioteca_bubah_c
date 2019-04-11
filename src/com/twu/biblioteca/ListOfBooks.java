package com.twu.biblioteca;

import java.awt.*;

public class ListOfBooks {

    String [] listOfBooks = new String[4];

    ListOfBooks(){
        listOfBooks[0] = "Harry Potter";
        listOfBooks[1] = "Cat In The Hat";
        listOfBooks[2] = "Green Eggs and Ham";
        listOfBooks[3] = "Lord of the Rings";

    }

    public void displayBookList(){
        System.out.println("Banglore Library Menue Option (Select an option): ");
        System.out.println("A: " + listOfBooks[0] + "\nB: " + listOfBooks[1] + "\nC: " + listOfBooks[2] + "\nD: " + listOfBooks[3]);
    }

    public String[] getListOfBooks() {
        return listOfBooks;
    }
}
