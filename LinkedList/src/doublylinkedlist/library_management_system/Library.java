package doublylinkedlist.library_management_system;

class Library {
    private Book head, tail;
    private int bookCount;

    public Library() {
        this.head = null;
        this.tail = null;
        this.bookCount = 0;
    }

    // Add book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        bookCount++;
    }

    // Add book at the end
    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        bookCount++;
    }

    // Add book at a specific position
    public void addBookAtPosition(String title, String author, String genre, int bookId, boolean isAvailable, int position) {
        if (position <= 1) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }
        if (position > bookCount) {
            addBookAtEnd(title, author, genre, bookId, isAvailable);
            return;
        }

        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        Book temp = head;

        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        newBook.next = temp.next;
        newBook.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newBook;
        }
        temp.next = newBook;
        bookCount++;
    }

    // Remove book by Book ID
    public void removeBook(int bookId) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Book temp = head;

        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found.");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        bookCount--;
        System.out.println("Book with ID " + bookId + " removed.");
    }

    // Search for a book by Title
    public void searchByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                printBookDetails(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Search for a book by Author
    public void searchByAuthor(String author) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                printBookDetails(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No books found by this author.");
        }
    }

    // Update book availability status
    public void updateAvailability(int bookId, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                System.out.println("Availability updated for Book ID " + bookId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Display all books in forward order
    public void displayBooksForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        Book temp = head;
        System.out.println("Books in Library (Forward Order):");
        while (temp != null) {
            printBookDetails(temp);
            temp = temp.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }
        Book temp = tail;
        System.out.println("Books in Library (Reverse Order):");
        while (temp != null) {
            printBookDetails(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    public int countBooks() {
        return bookCount;
    }

    // Helper method to print book details
    private void printBookDetails(Book book) {
        System.out.println("Title: " + book.title + ", Author: " + book.author +
                ", Genre: " + book.genre + ", ID: " + book.bookId +
                ", Available: " + (book.isAvailable ? "Yes" : "No"));
    }
}
