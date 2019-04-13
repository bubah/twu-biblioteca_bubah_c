package com.twu.biblioteca;

import org.hamcrest.collection.IsMapContaining;
import org.hamcrest.collection.IsMapWithSize;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.MatcherAssert.assertThat;


public class LibraryBookCatalogueTest {

    @Test
    public void CataglogueHasFourDistinctBooks () {

        // Given
        LibraryBookCatalogue bookCatalogue = new LibraryBookCatalogue();

        // When
        HashMap<Books, Integer> books = bookCatalogue.getListOfBooks();

        // Then
        assertThat(books.size(), is(4));
    }

    @Test
    public void CataglogueHasAtleastOneBook () {

        // Given
        int zero = 0;
        LibraryBookCatalogue bookCatalogue = new LibraryBookCatalogue();

        // When
        HashMap<Books, Integer> books = bookCatalogue.getListOfBooks();

        // Then
        assertThat(books.size(),greaterThan(0));

    }
}
