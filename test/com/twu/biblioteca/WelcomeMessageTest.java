package com.twu.biblioteca;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WelcomeMessageTest {

    @Test
    public void ReturnWelcomeMessage() {
        String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        WelcomeMessage welcomeMessage = new WelcomeMessage();
        welcomeMessage.setMessage(message);
        assertThat(welcomeMessage.getMessage(), is("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!"));
    }
}
