package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class LibraryMenueTest {
    @Test
    public void CheckLibraryHasBooks () {

        ListOfBooks listOfBooks = new ListOfBooks();

        Books [] books = listOfBooks.getListOfBooks();

        assertThat(books.length,is(equalTo(4)));
    }
}
