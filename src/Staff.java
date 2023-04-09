public class Staff {
    private String personnelId;
    private String password;
    private String firstName;
    private String lastName;
    private String nationalId;
    private int yearOfBirth;
    private String address;

    public Staff(String personnelId, String password, String firstName, String lastName, String nationalId, int yearOfBirth, String address) {
        this.personnelId = personnelId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }
}
