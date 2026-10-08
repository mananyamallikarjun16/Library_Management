public class LibraryBook {

    private String bookTitle;
    private String author;
    private boolean available;

    public LibraryBook(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.available = true;
    }

    // Operation 1: Check book availability
    public boolean isAvailable() {
        return available;
    }

    // Operation 2: Borrow the book
    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    // Operation 3: Return the book
    public void returnBook() {
        available = true;
    }

    // Operation 4: Calculate late fee
    public double calculateLateFee(int daysLate) {
        if (daysLate < 0) {
            throw new IllegalArgumentException(
                    "Days late cannot be negative"
            );
        }

        return daysLate * 5.0;
    }

    // Operation 5: Get book title
    public String getBookTitle() {
        return bookTitle;
    }

    // Operation 6: Get author
    public String getAuthor() {
        return author;
    }
}