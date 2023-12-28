package JavaLearning.Lab_Work;

class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author.getName());
    }
}

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Exp11Coupling {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling");
        Book book = new Book("Harry Potter", author);
        book.printDetails();
    }
}
