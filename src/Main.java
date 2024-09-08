import java.util.Scanner;

/**
 * <h1>Library Management System - LMS</h1>
 * <p>This LMS is a console-based application for managing a library's collection of books. The features implemented
 * are:</p>
 * <ul>
 * <li>Add new books to the collection from a text file (each book has a unique ID number, title, and author)</li?
 * <li>Remove a book from the collection using its ID number</li>
 * <li>List all books currently in the collection</li>
 * </ul>
 * <p>The text file should be formatted as follows: each line represents a book, and the id, title, and author are
 * separated by a comma. For instance:</p>
 * <p>1,To Kill a Mockingbird,Harper Lee</br>
 * 2,1984,George Orwell</br>
 * 3,The Great Gatsby,F. Scott Fitzgerald</p>
 *
 * @author  Kelly Stinson
 * Course:  CEN-3024C-14320
 * @version 1.0
 * @since   2024-09-08
 */
public class Main {
    /**
     * menu()
     * This method displays a menu to the user and captures their choice
     * @return int Returns the integer for the menu option selected by the user
     */
    public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);
        System.out.println("\nChoose from the following menu:");
        System.out.println("-------------------------------");
        System.out.println("1 - Add Books from File");
        System.out.println("2 - Remove Book");
        System.out.println("3 - List All Books");
        System.out.println("4 - Quit");
        System.out.println("-------------------------------");
        System.out.print("Enter selection: ");
        selection = input.nextInt();
        return selection;
    }

    /**
     * main()
     * This method is the entry point of the application,  controls the flow of the program
     */
    public static void main(String[] args) {
        // initialize variables
        Library library = new Library();
        Scanner input = new Scanner(System.in);
        int userChoice;
        String userInput;

        System.out.println("----------------------------------------------");
        System.out.println("Welcome to the Library Management System (LMS)");
        System.out.println("----------------------------------------------");

        userChoice = menu();

        while (userChoice != 4) {
            switch (userChoice) {
                case 1:
                    System.out.print("\nEnter the file including the path: ");
                    userInput = input.nextLine();
                    library.addBookFromFile(userInput);
                    break;
                case 2:
                    System.out.print("\nEnter the ID of the Book to be Removed: ");
                    userInput = input.nextLine();
                    if (library.removeBook(Integer.parseInt(userInput))) {
                        System.out.println("\nBook removed successfully.");
                    } else {
                        System.out.println("\nBook not found.");
                    }
                    break;
                case 3:
                    System.out.println("\nBooks in the library:");
                    System.out.println("----------------------------");
                    library.listBooks();
                    break;
                case 4:
                    // Perform "quit" case.
                    break;
                default:
                    // The user input an unexpected choice.
            }

        userChoice = menu();
    }

        System.out.println("----------------------------");
        System.out.println("Thank you for using the LMS");
        System.out.println("----------------------------");
    }
}