/**
 * <h1>TestLibrary</h1>
 * The tests for Library and Book classes.
 *
 * @author  Kelly Stinson
 * Course:  CEN-3024C-14320
 * @version 1.0
 * @since   2024-09-08
 */
public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        // Test adding books
        library.addBookFromFile("C:\\books1.txt");
        library.addBookFromFile("C:\\books.txt");
        System.out.println("Testing listBooks after adding books:");
        library.listBooks();

        // Test removing a book
        System.out.println("Testing removeBook with ID 2:");
        boolean removed = library.removeBook(2);
        System.out.println("Book removed: " + removed);

        // Test listing books after removal
        System.out.println("Testing listBooks after removing a book:");
        library.listBooks();
    }
}

