public class Book {
    private String bookId;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int countOfCopies;
    private String category;
    private String libraryId;

    public Book(String bookId, String title, String author, String publisher, int yearOfPublishing, int countOfCopies, String category, String libraryId) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.countOfCopies = countOfCopies;
        this.category = category;
        this.libraryId = libraryId;
    }
}
