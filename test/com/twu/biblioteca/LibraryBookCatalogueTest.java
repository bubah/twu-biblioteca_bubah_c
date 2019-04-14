package com.twu.biblioteca;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

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
    public void printSuccessMessageTest(){
        // Given
        String bookTitle = "Harry Potter and the Philosopher's Stone";
        LibraryBookCatalogue bookCatalogue = new LibraryBookCatalogue();
        // When
        bookCatalogue.checkOutBook(bookTitle);
        // Then
        Assert.assertThat(output.toString(), is("Harry Potter and the Philosopher's Stone has been checkedout!\n\n"));
    }

}
