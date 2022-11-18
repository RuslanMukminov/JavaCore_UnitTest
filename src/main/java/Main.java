public class Main {
    public static void main(String[] args) {
        System.out.println("Работа классов Book, Author");
        Author author1 = new Author("Имя1", "Фамилия1");
        Author author2 = new Author("Имя2", "Фамилия2");
        Book book1 = author1.newBook("Книга1");
        Book book2 = author2.newBook("Книга2");
        System.out.println();
        System.out.println("Изменение рейтинга:");
        System.out.println("текущий рейтинг " + book1.title + ": " + book1.rating);
        System.out.println("увеличиваем рейтинг");
        book1.up();
        System.out.println("рейтинг " + book1.title + " после увеличения: " + book1.rating);
        System.out.println();
        System.out.println("текущий рейтинг " + book2.title + ": " + book2.rating);
        System.out.println("уменьшаем рейтинг на 4 пункта");
        book2.down();
        book2.down();
        book2.down();
        book2.down();
        System.out.println("рейтинг " + book2.title + " после: " + book2.rating);
        System.out.println();
        System.out.println("добавляем в конец текста книги " + book1.title + " новый кусок текста: это первый новый кусок текста");
        book1.append("это первый новый кусок текста. ");
        System.out.println();
        System.out.println("добавляем в конец текста книги " + book1.title + " новый кусок текста: это второй новый кусок текста");
        book1.append("это второй новый кусок текста. ");
        System.out.println();
        System.out.println("текст книги " + book1.title + " после добавлений: " + book1.text);

    }
}
