package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class LibraryBookCatalogueTest {

    @Test
    public void CataglogueHasFourBooks () {

        // Given
        LibraryBookCatalogue bookCatalogue = new LibraryBookCatalogue();

        // When
        HashMap<Books, Integer> books = bookCatalogue.getListOfBooks();

        // Then
        assertThat(books.size(), is(4)); // Four Distinct Books in Catalogue
    }


    @Test
    public void EachBookInCatalogueHasQtyOneInitiallyTest () {

        // Given
        int zero = 0;
        LibraryBookCatalogue bookCatalogue = new LibraryBookCatalogue();

        // When
        HashMap<String, Books> books = bookCatalogue.getListOfBooks();

        // Then
        for (Books b : books.values()) {
            assertThat(b.quantity, equalTo(1));
        }

    }

    @Test
    public void ReduceBookQuantityTest () {

        // Given
        String title = "Harry Potter and the Philosopher's Stone";
        LibraryBookCatalogue bookCatalogue = new LibraryBookCatalogue();

        // When
        int initialBookQty = bookCatalogue.getBookQuantity(title);
        bookCatalogue.reduceBookQuantity(title);
        int currentBookQty = bookCatalogue.getBookQuantity(title);

        // Then
        assertThat(initialBookQty, is(1));
        assertThat(currentBookQty, is(0));

    }

    @Test
    public void checkOutBookTest(){
        // Given
        String title = "Harry Potter and the Philosopher's Stone";
        LibraryBookCatalogue bookCatalogue = new LibraryBookCatalogue();

        // When
        int initialBookQty = bookCatalogue.getBookQuantity(title);
        Books book = bookCatalogue.checkOutBook(title);
        int currentBookQty = bookCatalogue.getBookQuantity(title);

        // Then
        assertThat(initialBookQty, is(1)); // Assert Qty is 1 before checkout
        assertThat(currentBookQty, is(0));// Assert Qty reduce by 1 after checkout
        assertThat(book.getTitle(), is("Harry Potter and the Philosopher's Stone"));
    }


}
