import java.util.HashMap;

public class Library {
    private final String libraryId;
    private final String name;
    private final int yearOfEstablishment;
    private final int countOfDesks;
    private final String address;
    private HashMap<Book,Integer> books;

    public Library(String libraryId, String name, int yearOfEstablishment, int countOfDesks, String address) {
        this.libraryId = libraryId;
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.countOfDesks = countOfDesks;
        this.address = address;
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

    public HashMap<Book, Integer> getBooks() {
        return books;
    }
}
