import java.util.*;

class Book {
    private String title;
    private String author;
    private String publisher;
    private int year;
    private double price;

    public Book(String title, String author, String publisher, int year, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + " by " + author + ", Publisher: " + publisher + ", Year: " + year + ", Price: " + price;
    }
}

public class Task6 {
    public static void main(String[] args) {
        HashMap<Integer, Book> books = new HashMap<>();

        // Початкові записи
        books.put(1001, new Book("Java Basics", "John Doe", "TechBooks", 2020, 29.99));
        books.put(1002, new Book("Advanced Java", "Jane Smith", "TechBooks", 2021, 39.99));
        books.put(1003, new Book("Spring Framework", "Charlie Brown", "Springer", 2019, 49.99));
        books.put(1004, new Book("Java EE", "Emily White", "OraclePress", 2018, 59.99));
        books.put(1005, new Book("Kotlin for Java", "Michael Black", "JetBrains", 2022, 34.99));

        // Унікальні автори
        TreeSet<String> authors = new TreeSet<>();
        books.values().forEach(book -> authors.add(book.getAuthor()));
        System.out.println("Unique authors: " + authors);

        // Перегляд списку книг
        books.forEach((isbn, book) -> System.out.println("ISBN: " + isbn + ", " + book));
    }
}
