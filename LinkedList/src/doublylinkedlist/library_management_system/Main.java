package doublylinkedlist.library_management_system;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBookAtBeginning("The Alchemist", "Paulo Coelho", "Fiction", 101, true);
        library.addBookAtEnd("Harry Potter", "J.K. Rowling", "Fantasy", 102, false);
        library.addBookAtEnd("Inferno", "Dan Brown", "Thriller", 103, true);
        library.addBookAtBeginning("The Hobbit", "J.R.R. Tolkien", "Fantasy", 104, true);
        library.addBookAtPosition("1984", "George Orwell", "Dystopian", 105, false, 3);

        // Displaying books
        library.displayBooksForward();
        library.displayBooksReverse();

        // Searching
        library.searchByTitle("Inferno");
        library.searchByAuthor("J.K. Rowling");

        // Updating availability
        library.updateAvailability(102, true);

        // Removing a book
        library.removeBook(103);

        // Displaying updated books
        library.displayBooksForward();

        // Counting books
        System.out.println("Total books in library: " + library.countBooks());
    }
}
