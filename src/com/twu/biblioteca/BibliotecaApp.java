package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        WelcomeMessage welcomeMessage = new WelcomeMessage();
        welcomeMessage.setMessage(message);
        System.out.println(welcomeMessage.getMessage());

        LibraryMenue libraryMenue = new LibraryMenue();
        libraryMenue.brownseMenue();
    }
}
