public class Book {
    String title, text;
    int year, rating;
    Author author;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        rating = 3;
        text = "";
        System.out.println();
        System.out.println("создан объект класса Book: " + title + ", " + author + ", " + year + ", " + rating);
    }

    public void up() {
        if (rating < 5) {
            rating++;
        }
    }

    public void down() {
        if (rating > 0) {
            rating--;
        }
    }

    public void append(String moreText) {
        text += moreText;
    }
}
