package com.twu.biblioteca;

public class WelcomeMessage {
    private String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

    public String getMessage(){
        return message;
    }

    public void printMessage(){
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n");

    }
}
