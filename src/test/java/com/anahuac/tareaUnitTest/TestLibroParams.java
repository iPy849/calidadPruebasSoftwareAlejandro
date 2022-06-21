package com.anahuac.tareaUnitTest;

import com.anahuac.tareaUnitTest.entities.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(Parameterized.class)
public class TestLibroParams {
    private String bookTitle, bookAuthor;
    private LocalDate publishDate;
    private Book book;


    public TestLibroParams(String bookTitle, String bookAuthor, LocalDate publishDate) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publishDate = publishDate;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Harry Potter and the Globet of Fire", "J. K. Rowling", LocalDate.of(2000, 8, 1)},
                {"The Alchemist", "Paulo Coelho", LocalDate.of(1988, 1, 1)},
                {"The Kingdom Of This World", "Alejo Carpentier", LocalDate.of(1949, 1, 1)},
                {"The Pillars of the Earth", "Ken Follett", LocalDate.of(1989, 1, 1)},
        });
    }

    @Test
    public void Book_VerifyingBookAuthorIsCorrect_Test() {
        String resultAuthor = book.getAuthor();
        assertThat(resultAuthor, is(bookAuthor));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Before
    public void setUp() {
        book = new Book(bookTitle, bookAuthor, publishDate);
    }
}
