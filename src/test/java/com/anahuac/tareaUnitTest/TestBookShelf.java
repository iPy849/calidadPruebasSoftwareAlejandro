package com.anahuac.tareaUnitTest;

import com.anahuac.tareaUnitTest.entities.Book;
import com.anahuac.tareaUnitTest.entities.BookShelf;
import com.anahuac.tareaUnitTest.entities.BookShelfCapacityReached;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class TestBookShelf {

    BookShelf bookShelf;
    Book book;

    @After
    public void tearDown() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        book = Mockito.mock(Book.class);
        bookShelf = new BookShelf();
    }

    @Test
    public void BookShelf_AddABookThenCheckSize_Test() {
        int expectedSize = 1;
        bookShelf.add(book);
        int bookShelfSizeResult = bookShelf.books().size();
        assertThat(bookShelfSizeResult, is(expectedSize));
    }

    @Test(expected = BookShelfCapacityReached.class)
    public void BookShelf_AddABookAndTriggerABookShelfCapacityReached_Test() {
        bookShelf = new BookShelf(3);
        for (int i = 0; i <= 3; i++)
            bookShelf.add(book);
    }

    @Test
    public void BookShelf_VerifyingBookShelfCanPerfomACorrectAlphabeticArrangement_Test() {
        // The following code generates book titles in descending order then they can be naturally
        // arranged in ascendant order.
        char alph = 'C';
        List<Book> expectedBookOrder = new ArrayList();

        for (int i = 0; i < 3; i++) {
            String title = String.format("%s%d book title", alph--, i);
            Book newBook = new Book(title, "Some author", LocalDate.now());

            // Every book will be added to the bookshelf and the expected results list.
            bookShelf.add(newBook);
            expectedBookOrder.add(newBook);
        }

        // The expected result list is sorted using the same way as the bookshelf do.
        expectedBookOrder = expectedBookOrder.stream().sorted(Comparator.naturalOrder()).collect(toList());
        assertThat(bookShelf.arrange(), is(expectedBookOrder));
    }
}
