public class Staff {
    private String personnelId;
    private String password;
    private String firstName;
    private String lastName;
    private String nationalId;
    private int yearOfBirth;
    private String address;
    private int countOfBorrowedBooks;
    private int countOfBorrowedTheses;
    private long debt;

    public Staff(String personnelId, String password, String firstName, String lastName, String nationalId, int yearOfBirth, String address) {
        this.personnelId = personnelId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.countOfBorrowedTheses = 0;
        this.countOfBorrowedBooks = 0;
        this.debt = 0;
    }

    public void setPersonnelId(String personnelId) {
        this.personnelId = personnelId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCountOfBorrowedBooks(int countOfBorrowedBooks) {
        this.countOfBorrowedBooks = countOfBorrowedBooks;
    }

    public void setCountOfBorrowedTheses(int countOfBorrowedTheses) {
        this.countOfBorrowedTheses = countOfBorrowedTheses;
    }

    public void setDebt(long debt) {
        this.debt = debt;
    }

    public String getPersonnelId() {
        return personnelId;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public int getCountOfBorrowedBooks() {
        return countOfBorrowedBooks;
    }

    public int getCountOfBorrowedTheses() {
        return countOfBorrowedTheses;
    }

    public long getDebt() {
        return debt;
    }
}
