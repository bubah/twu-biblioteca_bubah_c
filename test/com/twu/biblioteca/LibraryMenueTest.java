package com.twu.biblioteca;

import org.hamcrest.core.IsCollectionContaining;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LibraryMenueTest {
    @Test
    public void GetMenueOptionsTest(){

        // Given
        LibraryMenue libraryMenue = new LibraryMenue();

        // When
        ArrayList<String> menueOptions = libraryMenue.getMenueOptions();

        //Then
        assertThat(menueOptions, IsCollectionContaining.hasItem("List of Books"));
    }

    @Test
    public void GetUserInputTest(){

        // Given
        LibraryMenue libraryMenue = new LibraryMenue();

        // When
        String input = "A";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        char userInput = libraryMenue.getUserInput();

        // Then
        assertThat(userInput, is('A'));
    }
}
