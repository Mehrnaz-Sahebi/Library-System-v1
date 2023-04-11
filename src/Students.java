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
}
