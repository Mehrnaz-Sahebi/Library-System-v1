public class Book {
    private String bookId;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int countOfCopies;
    private String category;
    private String libraryId;
    private int remaining;

    public Book(String bookId, String title, String author, String publisher, int yearOfPublishing, int countOfCopies, String category, String libraryId) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.countOfCopies = countOfCopies;
        this.category = category;
        this.libraryId = libraryId;
        this.remaining = countOfCopies;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setCountOfCopies(int countOfCopies) {
        this.countOfCopies = countOfCopies;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getCountOfCopies() {
        return countOfCopies;
    }

    public String getCategory() {
        return category;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public int getRemaining() {
        return remaining;
    }
}
