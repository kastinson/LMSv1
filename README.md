# Library Management System (LMS)

## Overview
The **Library Management System (LMS)** is a command-line application designed to manage a library's collection of books. It allows library staff or users to check books in, check books out, and display the list of available books. The system uses a CSV file to store book data, making it easy to load, manage, and update the book inventory.

The LMS is built using the **Model-View-Controller (MVC)** architectural pattern to ensure a clean separation of concerns, making it easier to maintain and extend.

## Features
- **Check Out Books**: Allows a user to check out a book by entering its barcode and specifying a due date.
- **Check In Books**: Allows a user to check in a book that was previously checked out.
- **View Book Collection**: Displays all books in the collection, including details like title, author, genre, barcode, status (Checked In or Checked Out), and due date (if applicable).
- **Data Storage**: Books are stored in a CSV file for easy management and persistence.

## Technologies Used
- **Java**: Core programming language used for building the application.
- **CSV File**: Used for persisting the list of books.
- **Model-View-Controller (MVC)**: Design pattern followed for better separation of concerns and maintainability.

## Prerequisites
- **Java 7 or later**: Make sure you have Java Development Kit (JDK) installed on your machine.
- **Text Editor or IDE**: You can use any text editor (e.g., Notepad++, VS Code) or an IDE (e.g., IntelliJ IDEA, Eclipse) to work with the source code.

## Setup Instructions

1. **Clone the Repository**
   ```
   git clone [https://github.com/ykastinson/Stinson_Kelly_LMS](https://github.com/kastinson/Stinson_Kelly_LMS/)
   cd library-management-system
   ```

2. **Ensure you have a CSV File**
   - The application expects a CSV file containing the book data. Ensure you have a file named `books.csv` in the root directory.
   - The CSV file should have the following columns:
     - `Title, Author, Barcode, Genre, Status, DueDate`
   - Example content of the `books.csv` file:
     ```
     Harry Potter,J.K. Rowling,123456,Fiction,Checked In,
     The Hobbit,J.R.R. Tolkien,789101,Fantasy,Checked Out,2024-12-12
     ```

3. **Compile the Program**
   Open your terminal or command prompt, navigate to the project folder, and compile the Java files:
   ```bash
   javac -d bin src/*.java
   ```

4. **Run the Program**
   After compilation, you can run the program:
   ```bash
   java -cp bin LibraryManagementSystem
   ```

5. **Interactive Menu**
   Once the program starts, it will display a menu with the following options:
   - Check out a book by barcode and assign a due date.
   - Check in a book by barcode.
   - Display all books and their current status (checked in or out).

## File Structure

```
|-- src/
|   |-- Book.java              # The Book class (Model)
|   |-- BookDatabase.java      # Manages the collection of books (Model)
|   |-- LMSController.java     # The Controller that processes user actions
|   |-- MainView.java          # The View that handles user interaction (CLI)
|   |-- LibraryManagementSystem.java  # Main class to start the application
|-- books.csv                  # CSV file containing the book data
|-- README.md                  # This ReadMe file
```

## Usage

### 1. Check Out a Book
- You will be prompted to enter the barcode of the book and a due date in the format `yyyy-mm-dd`.
- The system will check if the book is available and, if so, mark it as checked out with the specified due date.

### 2. Check In a Book
- You will be prompted to enter the barcode of the book.
- If the book is checked out, the system will mark it as checked in and clear its due date.

### 3. Display All Books
- You can view the entire book collection with details such as title, author, barcode, genre, status (checked in or out), and due date (if applicable).

## Contribution

Contributions are welcome! Feel free to fork this repository, make your changes, and submit a pull request. Please make sure that your code is well-documented and follows the project structure.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For any queries, feel free to reach out to:
- **GitHub**: [Your GitHub Profile](https://github.com/kastinson)
