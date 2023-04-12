import java.util.HashSet;

public class Users {
    HashSet<User> users;
    public Users(){
        users = new HashSet<User>();
    }
    public void addUser(String userId, String password, String firstName, String lastName, String nationalId, int yearOfBirth, String address ,boolean isStudent){
        User user = new User(userId,password,firstName,lastName,nationalId,yearOfBirth,address , isStudent);
        users.add(user);
    }
    public User getUser(String userId){
        for (User user : users) {
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }
    public void editUser(String userId, String password, String firstName, String lastName, String nationalId, String yearOfBirth, String address){
        if(this.getUser(userId)==null){
            return;
        }
        User user = this.getUser(userId);
        if(!password.equals("-")){
            user.setPassword(password);
        }
        if(!firstName.equals("-")){
            user.setFirstName(firstName);
        }
        if(!lastName.equals("-")){
            user.setLastName(lastName);
        }
        if(!nationalId.equals("-")){
            user.setNationalId(nationalId);
        }
        if(!yearOfBirth.equals("-")){
            user.setYearOfBirth(Integer.parseInt(yearOfBirth));
        }
        if(!address.equals("-")){
            user.setAddress(address);
        }
        return;
    }
    public void removeUser(String userId){
        if (this.getUser(userId)==null){
            return;
        }
        User user = this.getUser(userId);
        users.remove(user);
        return;
    }
    public void borrowsABook(String userId){
        User user = this.getUser(userId);
        if(user==null){
            return;
        }
        user.setCountOfBorrowedBooks(user.getCountOfBorrowedBooks()+1);
        return;
    }
    public void borrowsAThesis(String userId){
        User user = this.getUser(userId);
        if(user==null){
            return;
        }
        user.setCountOfBorrowedTheses(user.getCountOfBorrowedTheses()+1);
        return;
    }
    public void returnsABook(String userId){
        User user = this.getUser(userId);
        if(user==null){
            return;
        }
        user.setCountOfBorrowedBooks(user.getCountOfBorrowedBooks()-1);
        return;
    }
    public void returnsAThesis(String userId){
        User user = this.getUser(userId);
        if(user==null){
            return;
        }
        user.setCountOfBorrowedTheses(user.getCountOfBorrowedTheses()-1);
        return;
    }
}

