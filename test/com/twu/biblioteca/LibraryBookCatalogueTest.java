package com.twu.biblioteca;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LibraryBookCatalogueTest {

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

    @Test
    public void unsuccessfulCheckOutTest(){
        // Given
        String bookTitle = "Harry Potter and the Philosopher's Stone";
        LibraryBookCatalogue bookCatalogue = new LibraryBookCatalogue();
        bookCatalogue.reduceBookQuantity(bookTitle); // reduce book quantity to zero so this book is no longer available
        // When
        bookCatalogue.checkOutBook(bookTitle); // Checkout book that is no longer available
        // Then
        Assert.assertThat(output.toString(), is("Sorry that book is not available\n"));
    }

    /*@Test
    public void checkInBookTest() {
        // Given
        String bookTitle = "Harry Potter and the Philosopher's Stone";
        LibraryBookCatalogue bookCatalogue = new LibraryBookCatalogue();
        bookCatalogue.reduceBookQuantity(bookTitle); // reduce book quantity to zero so this book is no longer available
        int initialBookQty = bookCatalogue.getBookQuantity(bookTitle);
        // When
        bookCatalogue.checkInBook(bookTitle); // Checkout book that is no longer available
        int qtyAfterCheckIn = bookCatalogue.getBookQuantity(bookTitle);
        // Then
        assertThat(initialBookQty, is(0)); // Zero books in inventory after customer checkout
        assertThat(qtyAfterCheckIn, is(1)); // After checkIn, book quantity should be back to 1

    }*/

    @Test
    public void successfulCheckInTest(){
        // Given
        String bookTitle = "Harry Potter and the Philosopher's Stone";
        LibraryBookCatalogue bookCatalogue = new LibraryBookCatalogue();

        // When
        bookCatalogue.checkIn(bookTitle);

        // Then
        assertThat(output.toString(), is("Thank you for returning the book\n"));
    }

}
