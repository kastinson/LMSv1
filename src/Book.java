/**
 * <h1>Book</h1>
 * The Book class represents a book. It encapsulates the attributes and provides methods to access and display the
 * book’s information.
 *
 * @author  Kelly Stinson
 * Course:  CEN-3024C-14320
 * @version 1.0
 * @since   2024-09-08
 */
class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    /**
     * toString()
     * This method prints the Book object.
     * @return String A String that contains the id, title, and author of the book, formatted as ID: <id>, Title: <title>,
     * Author: <author>.
     */
    @Override
    public String toString() {
        return String.format("ID: %d, Title: %s, Author: %s", id, title, author);
    }

    public int getId() {
        return id;
    }
}