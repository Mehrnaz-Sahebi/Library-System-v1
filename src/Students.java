import java.util.HashSet;

public class Students {
    HashSet<Student> students;
    public Students (){
        students = new HashSet<Student>();
    }
    public void addStudent(String studentId, String password, String firstName, String lastName, String nationalId, int yearOfBirth, String address){
        Student student = new Student(studentId,password,firstName,lastName,nationalId,yearOfBirth,address);
        students.add(student);
    }
    public Student getStudent(String studentId){
        for (Student student:students) {
            if(student.getStudentId().equals(studentId)){
                return student;
            }
        }
        return null;
    }
    public void editStudent(String studentId, String password, String firstName, String lastName, String nationalId, String yearOfBirth, String address){
        if(this.getStudent(studentId)==null){
            return;
        }
        Student student = this.getStudent(studentId);
        if(!password.equals("-")){
            student.setPassword(password);
        }
        if(!firstName.equals("-")){
            student.setFirstName(firstName);
        }
        if(!lastName.equals("-")){
            student.setLastName(lastName);
        }
        if(!nationalId.equals("-")){
            student.setNationalId(nationalId);
        }
        if(!yearOfBirth.equals("-")){
            student.setYearOfBirth(Integer.parseInt(yearOfBirth));
        }
        if(!address.equals("-")){
            student.setAddress(address);
        }
        return;
    }
}
