package com.twu.biblioteca;

import com.sun.tools.javac.util.List;
import org.hamcrest.core.IsCollectionContaining;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.core.IsCollectionContaining;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.core.StringContains.containsString;

public class LibraryMenueTest {
    @Test
    public void MenueListOfOptionTest(){

        // Given
        LibraryMenue libraryMenue = new LibraryMenue();

        // When
        ArrayList<String> menueOptions = libraryMenue.getMenueOptions();

        //Then
        assertThat(menueOptions, IsCollectionContaining.hasItem("List of Books"));
    }
}
