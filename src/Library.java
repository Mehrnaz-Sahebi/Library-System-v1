public class Library {
    private final String libraryId;
    private final String name;
    private final int yearOfEstablishment;
    private final int countOfDesks;
    private final String address;

    public Library(String libraryId, String name, int yearOfEstablishment, int countOfDesks, String address) {
        this.libraryId = libraryId;
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.countOfDesks = countOfDesks;
        this.address = address;
    }
}
