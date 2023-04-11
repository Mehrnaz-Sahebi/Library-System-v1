import java.util.HashSet;

public class Staffs {
    HashSet<Staff> staffs;
    public Staffs (){
        staffs = new HashSet<Staff>();
    }
    public void addStaff(String personnelId, String password, String firstName, String lastName, String nationalId, int yearOfBirth, String address){
        Staff staff = new Staff(personnelId,password,firstName,lastName,nationalId,yearOfBirth,address);
        staffs.add(staff);
    }
    public Staff getStaff(String personnelId){
        for (Staff staff:staffs) {
            if(staff.getPersonnelId().equals(personnelId)){
                return staff;
            }
        }
        return null;
    }
}
