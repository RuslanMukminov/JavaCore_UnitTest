import java.time.LocalDate;

public class Author {
    String name, surname;
    int numBooks;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
        numBooks = 0;
    }

    public Book newBook(String title) {
        Book book = new Book(title, this, LocalDate.now().getYear());
        numBooks++;
        return book;
    }

    public String toString() {
        return " " + name + " " + surname;
    }
}
