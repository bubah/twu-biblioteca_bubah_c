package com.twu.biblioteca;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WelcomeMessageTest {

    @Test
    public void ReturnWelcomeMessage() {

        // Given
        WelcomeMessage welcomeMessage = new WelcomeMessage();

        // When
        String message = welcomeMessage.getMessage();

        // Then
        assertThat(message, is("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!"));
    }
}
