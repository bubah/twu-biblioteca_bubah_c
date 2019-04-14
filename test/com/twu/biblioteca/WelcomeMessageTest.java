package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WelcomeMessageTest {
    
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void printMessageTest(){
        // Given
        WelcomeMessage welcomeMessage = new WelcomeMessage();

        // When
        welcomeMessage.printMessage();

        // Then
        assertThat(output.toString(), is("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n\n"));
    }
}
