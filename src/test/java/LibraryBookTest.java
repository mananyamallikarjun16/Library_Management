import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryBookTest {

    @Test
    void testBookInitiallyAvailable() {

        LibraryBook book =
                new LibraryBook("Clean Code", "Robert Martin");

        assertTrue(book.isAvailable());
    }

    @Test
    void testBorrowBook() {

        LibraryBook book =
                new LibraryBook("Clean Code", "Robert Martin");

        assertTrue(book.borrowBook());
        assertFalse(book.isAvailable());
    }

    @Test
    void testBorrowUnavailableBook() {

        LibraryBook book =
                new LibraryBook("Clean Code", "Robert Martin");

        book.borrowBook();

        assertFalse(book.borrowBook());
    }

    @Test
    void testReturnBook() {

        LibraryBook book =
                new LibraryBook("Clean Code", "Robert Martin");

        book.borrowBook();
        book.returnBook();

        assertTrue(book.isAvailable());
    }

    @Test
    void testCalculateLateFee() {

        LibraryBook book =
                new LibraryBook("Clean Code", "Robert Martin");

        assertEquals(25.0, book.calculateLateFee(5));
    }

    @Test
    void testInvalidLateDays() {

        LibraryBook book =
                new LibraryBook("Clean Code", "Robert Martin");

        assertThrows(
                IllegalArgumentException.class,
                () -> book.calculateLateFee(-2)
        );
    }
}