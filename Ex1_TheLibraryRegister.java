/* 
Library System Description:

The developed library system allows for managing books and users. With it, you can register books, search for them by title, genre, or author, 
register users, keep track of books a user has borrowed, as well as make recommendations based on genres and sort books by title.

Integrated Concepts:

    Object-Oriented Programming (OOP): We use classes and objects to model entities like Book, User, and Library. These classes encapsulate data 
    for each entity and provide methods to interact with those data.

    Data Structures:
        Lists/ArrayList: Used to store collections of books and books borrowed by users.
        Hashmaps/Dictionaries: Employed to store registered users, allowing for quick retrieval based on the username.

    Search Functions: Methods were developed to search for books based on various criteria, like title, genre, and author.

    Sorting: A function is provided to sort books by title, implying the use of sorting algorithms and lambda (in Python) to specify the sort criterion.

    Flow Control: Conditional structures (like if) and loops (like for) are used to iterate through lists and perform searches.

    Encapsulation: The member data of the classes are protected (they're private by default in Java and protected in Python). The class methods are used to access and modify these data.

    Class Relationships: The User class has a relationship with the Book class as a user can have multiple books borrowed.

    Simple Recommendations: Though basic, the system has a function to recommend books based on genres, demonstrating an initial approach toward recommendation systems.

This library system, despite its simplicity, showcases a range of fundamental concepts in programming and software design. It can be extended to include 
more advanced features and serve as a foundation for a more complex library management system.

*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}

class User {
    private String username;
    private List<Book> borrowedBooks;
    private int fine;

    public User(String username) {
        this.username = username;
        this.borrowedBooks = new ArrayList<>();
        this.fine = 0;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getFine() {
        return fine;
    }
}

public class Library {
    private List<Book> books;
    private HashMap<String, User> users;

    public Library() {
        books = new ArrayList<>();
        users = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchByTitle(String title) {
        for(Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> searchByGenre(String genre) {
        List<Book> result = new ArrayList<>();
        for(Book book : books) {
            if(book.getGenre().equalsIgnoreCase(genre)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for(Book book : books) {
            if(book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public void registerUser(User user) {
        users.put(user.getUsername(), user);
    }

    public User getUser(String username) {
        return users.get(username);
    }

    public List<Book> recommendBooks(String genre) {
        // This is a simple recommendation based on genre. It can be enhanced.
        return searchByGenre(genre);
    }

    public void sortBooksByTitle() {
        books.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }

    public static void main(String[] args) {
        // Testing the system can be done here
    }
}
