import java.util.HashMap;
import java.util.HashSet;

public class Library {
    private final String libraryId;
    private final String name;
    private final int yearOfEstablishment;
    private final int countOfDesks;
    private final String address;
    private HashSet<Book> books;

    public Library(String libraryId, String name, int yearOfEstablishment, int countOfDesks, String address) {
        this.libraryId = libraryId;
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.countOfDesks = countOfDesks;
        this.address = address;
        this.books = new HashSet<Book>();
    }

    public String getLibraryId() {
        return libraryId;
    }

    public String getName() {
        return name;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public int getCountOfDesks() {
        return countOfDesks;
    }

    public String getAddress() {
        return address;
    }

    public HashSet<Book> getBooks() {
        return books;
    }
    public void addBook(String bookId, String title, String author, String publisher, int yearOfPublishing, int countOfCopies, String category, String libraryId){
        Book book = new Book(bookId,title,author,publisher,yearOfPublishing,countOfCopies,category,libraryId);
        books.add(book);
    }

    public Book getBook(String bookId){
        for (Book book:books) {
            if(book.getBookId().equals(bookId)){
                return book;
            }
        }
        return null;
    }
    public void editBook(String bookId, String title,String author, String publisher, String yearOfPublishing, String countOfCopies, String category){
        if(this.getBook(bookId)==null) {
            return;
        }
        Book book = this.getBook(bookId);
        if(!title.equals("-")){
            book.setTitle(title);
        }if(!author.equals("-")){
            book.setAuthor(author);
        }if(!publisher.equals("-")){
            book.setPublisher(publisher);
        }if(!yearOfPublishing.equals("-")){
            book.setYearOfPublishing(Integer.parseInt(yearOfPublishing));
        }if(!countOfCopies.equals("-")){
            book.setCountOfCopies(Integer.parseInt(countOfCopies));
        }
        if(!category.equals("-")){
            book.setCategory(category);
        }
        return;
    }

}
