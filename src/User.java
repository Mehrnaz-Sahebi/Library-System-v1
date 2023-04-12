public class User {
    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private String nationalId;
    private int yearOfBirth;
    private String address;
    private boolean isStudent;
    private int countOfBorrowedBooks;
    private int countOfBorrowedTheses;
    private long debt;

    public User(String userId, String password, String firstName, String lastName, String nationalId, int yearOfBirth, String address , boolean isStudent) {
        this.userId = userId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.isStudent = isStudent;
        this.countOfBorrowedTheses = 0;
        this.countOfBorrowedBooks = 0;
        this.debt = 0;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getUserId() {
        return userId;
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

    public boolean isStudent() {
        return isStudent;
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

    public void addToDebt(long newDebt){
        this.setDebt(this.getDebt()+newDebt);
    }
}
