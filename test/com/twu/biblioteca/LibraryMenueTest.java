package com.twu.biblioteca;

import org.hamcrest.core.IsCollectionContaining;
import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;

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
}
