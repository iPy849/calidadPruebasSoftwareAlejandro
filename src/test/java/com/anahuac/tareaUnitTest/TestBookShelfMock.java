package com.anahuac.tareaUnitTest;

import com.anahuac.tareaUnitTest.entities.Book;
import com.anahuac.tareaUnitTest.entities.BookShelf;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;

public class TestBookShelfMock {
    BookShelf bookShelf;

    @After
    public void tearDown() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        bookShelf = Mockito.mock(BookShelf.class);
    }

    @Test
    public void BookShelf_VerifyingBookAuthorsAreCollectedInAlphabeticalOrder_Test() {

        when(bookShelf.sortByAuthor()).thenAnswer(new Answer<List>() {
            @Override
            public List answer(InvocationOnMock invocationOnMock) throws Throwable {
                return Arrays.asList(new Book[]{
                                        new Book("The Kingdom Of This World", "Alejo Carpentier", LocalDate.of(1949, 1, 1)),
                                        new Book("The Alchemist", "Paulo Coelho", LocalDate.of(1988, 1, 1)),
                                        new Book("The Pillars of the Earth", "Ken Follett", LocalDate.of(1989, 1, 1)),
                                        new Book("Harry Potter and the Globet of Fire", "J. K. Rowling", LocalDate.of(2000, 8, 1)),
                                })
                        .stream()
                        .sorted(Comparator.comparing(book -> book.getAuthor()))
                        .collect(Collectors.toList());
            }
        });

        List<Book> authorSortedBooksResult = bookShelf.sortByAuthor();
        char lastLetter = 0;

        for (int i = 0; i < authorSortedBooksResult.size(); i++) {
            boolean result = authorSortedBooksResult.get(i).getAuthor().charAt(0) >= lastLetter;
            assertThat(result, is(true));
            lastLetter = authorSortedBooksResult.get(i).getAuthor().charAt(0);
        }
    }
}
