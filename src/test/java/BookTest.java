import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    public Book book = new Book("Название", new Author("Имя", "Фамилия"), 2022);

    @Test
    public void testRatingUp() {
        int expectedRating = 4;
        book.up();

        Assertions.assertEquals(expectedRating, book.rating);
    }

    @Test
    public void testRatingDown() {
        int expectedRating = 0;
        book.down();
        book.down();
        book.down();
        book.down();

        Assertions.assertEquals(expectedRating, book.rating);

    }

    @Test
    public void testAppendText() {
        String expectedText = "тестовая строка";
        book.append(expectedText);

        Assertions.assertEquals(expectedText, book.text);
    }
}
