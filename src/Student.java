public class Student {
    private String studentId;
    private String password;
    private String firstName;
    private String lastName;
    private String nationalId;
    private int yearOfBirth;
    private String address;

    public Student(String studentId, String password, String firstName, String lastName, String nationalId, int yearOfBirth, String address) {
        this.studentId = studentId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }
}
