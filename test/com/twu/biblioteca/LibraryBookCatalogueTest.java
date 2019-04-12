package com.twu.biblioteca;

import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.MatcherAssert.assertThat;


public class LibraryBookCatalogueTest {

    @Test
    public void CataglogueHasFourBooks () {

        // Given
        LibraryBookCatalogue bookCatalogue = new LibraryBookCatalogue();

        // When
        ArrayList<Books> books = bookCatalogue.getListOfBooks();

        // Then
        assertThat(books.size(), is(4));
    }

    @Test
    public void CataglogueHasAtleastOneBook () {

        // Given
        int zero = 0;
        LibraryBookCatalogue bookCatalogue = new LibraryBookCatalogue();

        // When
        ArrayList<Books> books = bookCatalogue.getListOfBooks();

        // Then
        assertThat(books.size(),greaterThan(0));

    }

    @Test
    public void CataloguesHaveAuthorAndPublishYear () {

        //Given
        LibraryBookCatalogue bookCatalogue = new LibraryBookCatalogue();

        // When
        ArrayList<Books> books = bookCatalogue.getListOfBooks();

        // Then
        assertThat(books.get(0).getAuthor(), is("J. K. Rowling"));
        assertThat(books.get(0).getPublishDate(), is(1997 ));
    }

}
