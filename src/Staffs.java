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
    public void editStaff(String personnelId, String password, String firstName, String lastName, String nationalId, String yearOfBirth, String address){
        if(this.getStaff(personnelId)==null){
            return;
        }
        Staff staff = this.getStaff(personnelId);
        if(!password.equals("-")){
            staff.setPassword(password);
        }
        if(!firstName.equals("-")){
            staff.setFirstName(firstName);
        }
        if(!lastName.equals("-")){
            staff.setLastName(lastName);
        }
        if(!nationalId.equals("-")){
            staff.setNationalId(nationalId);
        }
        if(!yearOfBirth.equals("-")){
            staff.setYearOfBirth(Integer.parseInt(yearOfBirth));
        }
        if(!address.equals("-")){
            staff.setAddress(address);
        }
        return;
    }
}
