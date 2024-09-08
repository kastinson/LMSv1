import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <h1>Library</h1>
 * The Library class encapsulates a collection of Book objects and provides methods to manipulate this collection.
 *
 * @author  Kelly Stinson
 * Course:  CEN-3024C-14320
 * @version 1.0
 * @since   2024-09-08
 */
class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    /**
     * addBookFromFile()
     * This method is used to find average of three integers.
     * @param filePath The path to the text file that contains the books to be added to the Library
     */
    public void addBookFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",", 3);
                int id = Integer.parseInt(parts[0].trim());
                String title = parts[1].trim();
                String author = parts[2].trim();
                books.add(new Book(id, title, author));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    /**
     * removeBook()
     * This method removes a book with the specified ID from the books list.
     * @param bookId The ID of the Book to be removed from the Library
     * @return boolean This returns true is the Book was removed and false if it was not
     */
    public boolean removeBook(int bookId) {
        boolean b = false;
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId() == bookId) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }

    /**
     * lisBooks()
     * This method prints all the books currently in the books list.
     */
    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}