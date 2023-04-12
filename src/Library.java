import java.util.HashMap;
import java.util.HashSet;

public class Library {
    private final String libraryId;
    private final String name;
    private final int yearOfEstablishment;
    private final int countOfDesks;
    private final String address;
    private HashSet<Book> books;
    private HashSet<Thesis> theses;

    //constructor

    public Library(String libraryId, String name, int yearOfEstablishment, int countOfDesks, String address) {
        this.libraryId = libraryId;
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.countOfDesks = countOfDesks;
        this.address = address;
        this.books = new HashSet<Book>();
        this.theses = new HashSet<Thesis>();
    }

    //getters

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

    public HashSet<Thesis> getTheses() {
        return theses;
    }

    //methods related to books

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
            book.setRemaining(Integer.parseInt(countOfCopies));
        }if(!category.equals("-")){
            book.setCategory(category);
        }
        return;
    }
    public void removeBook(String bookId){
        if(this.getBook(bookId)==null){
            return;
        }
        Book book = this.getBook(bookId);
        books.remove(book);
        return;
    }

    //methods related to theses
    public void addThesis(String thesisId, String title, String studentName, String supervisor, int yearOfDefense, String category, String libraryId){
        Thesis thesis = new Thesis(thesisId,title,studentName,supervisor,yearOfDefense,category,libraryId);
        theses.add(thesis);
    }
    public Thesis getThesis(String thesisId){
        for (Thesis thesis: theses) {
            if(thesis.getThesisId().equals(thesisId)){
                return thesis;
            }
        }
        return null;
    }
    public void editThesis(String thesisId, String title, String studentName, String supervisor, String yearOfDefense, String category){
        if(this.getThesis(thesisId)==null){
            return;
        }
        Thesis thesis = this.getThesis(thesisId);
        if(!title.equals("-")){
            thesis.setTitle(title);
        }if(!studentName.equals("-")){
            thesis.setStudentName(studentName);
        }if(!supervisor.equals("-")){
            thesis.setSupervisor(supervisor);
        }if(!yearOfDefense.equals("-")){
            thesis.setYearOfDefense(Integer.parseInt(yearOfDefense));
        }if(!category.equals("-")){
            thesis.setCategory(category);
        }
        return;
    }
    public void removeThesis(String thesisId){
        if(this.getThesis(thesisId)==null){
            return;
        }
        Thesis thesis = this.getThesis(thesisId);
        theses.remove(thesis);
        return;
    }

    public boolean isBook(String bookOrThesisId){
        if(this.getBook(bookOrThesisId)==null){
            return false;
        }
        return true;
    }
}
