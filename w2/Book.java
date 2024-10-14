package w2;

/**
 * Book
 */
public class Book {
    String title;
    String author;
    int pubYear;

    Book() {
        title = "Watermelons";
        author = "Joe";
        pubYear = 1969;
    }

    Book(String title, String author, int pubYear) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
    }
}
