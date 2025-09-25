public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add Books
        library.addBook(new Book("Java Basics", "James Gosling"));
        library.addBook(new Book("OOP Concepts", "Bjarne Stroustrup"));

        // Add User
        User user1 = new User("Alice", 101);
        System.out.println(user1);

        // Show books
        library.displayBooks();

        // Issue Book
        library.issueBook("Java Basics");
        library.issueBook("Java Basics");

        // Return Book
        library.returnBook("Java Basics");

        // Show books again
        library.displayBooks();
    }
}