package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        WelcomeMessage welcomeMessage = new WelcomeMessage();
        System.out.println(welcomeMessage.getMessage() + '\n');

        LibraryMenue libraryMenue = new LibraryMenue();
        libraryMenue.browseMenue();

    }
}
