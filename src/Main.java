import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libraries libraries = new Libraries();
        Categories categories = new Categories();
        Users users = new Users();
        Borrowings borrowings = new Borrowings();
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String[] poc= command.split("[#|]+");
        while(!poc[0].equals("finish")){

            //add-library

            if(poc[0].equals("add-library")){
                if(libraries.getLibrary(poc[1])!=null){
                    System.out.println("duplicate-id");
                }
                else {
                    libraries.addLibrary(poc[1],poc[2],Integer.parseInt(poc[3]),Integer.parseInt(poc[4]),poc[5]);
                    System.out.println("success");
                }
            }

            //add category

            if(poc[0].equals("add-category")){
                if(categories.getCategory(poc[1])!=null){
                    System.out.println("duplicate-id");
                }
                else {
                    categories.addCategory(poc[1],poc[2]);
                    System.out.println("success");
                }
            }

            //add-book

            if(poc[0].equals("add-book")){
                if (libraries.getLibrary(poc[8])==null||categories.getCategory(poc[7])==null){
                    System.out.println("not-found");
                }
                else if(libraries.getLibrary(poc[8]).getBook(poc[1])!=null){
                    System.out.println("duplicate-id");
                }
                else {
                    libraries.getLibrary(poc[8]).addBook(poc[1],poc[2],poc[3],poc[4],Integer.parseInt(poc[5]),Integer.parseInt(poc[6]),poc[7],poc[8]);
                    System.out.println("success");

                }
            }

            //edit-book

            if(poc[0].equals("edit-book")){
                if(libraries.getLibrary(poc[2])==null||libraries.getLibrary(poc[2]).getBook(poc[1])==null||categories.getCategory(poc[8])==null){
                    System.out.println("not-found");
                }
                else {
                    libraries.getLibrary(poc[2]).editBook(poc[1],poc[3],poc[4],poc[5],poc[6],poc[7],poc[8]);
                    System.out.println("success");
                }
            }

            //remove-book

            if(poc[0].equals("remove-book")){
                if(libraries.getLibrary(poc[2])==null||libraries.getLibrary(poc[2]).getBook(poc[1])==null){
                    System.out.println("not-found");
                }
                else if ((libraries.getLibrary(poc[2]).getBook(poc[1]).getRemaining())<(libraries.getLibrary(poc[2]).getBook(poc[1]).getCountOfCopies())){
                    System.out.println("not-allowed");
                }
                else {
                    libraries.getLibrary(poc[2]).removeBook(poc[1]);
                    System.out.println("success");
                }

            }

            //add-thesis

            if(poc[0].equals("add-thesis")){
                if (libraries.getLibrary(poc[7])==null||categories.getCategory(poc[6])==null){
                    System.out.println("not-found");
                }
                else if(libraries.getLibrary(poc[7]).getThesis(poc[1])!=null){
                    System.out.println("duplicate-id");
                }
                else {
                    libraries.getLibrary(poc[7]).addThesis(poc[1],poc[2],poc[3],poc[4],Integer.parseInt(poc[5]),poc[6],poc[7]);
                    System.out.println("success");
                }
            }

            //edit-thesis

            if(poc[0].equals("edit-thesis")){
                if(libraries.getLibrary(poc[2])==null||libraries.getLibrary(poc[2]).getThesis(poc[1])==null||categories.getCategory(poc[7])==null){
                    System.out.println("not-found");
                }
                else {
                    libraries.getLibrary(poc[2]).editThesis(poc[1],poc[3],poc[4],poc[5],poc[6],poc[7]);
                    System.out.println("success");
                }
            }

            //remove-thesis

            if(poc[0].equals("remove-thesis")){
                if(libraries.getLibrary(poc[2])==null||libraries.getLibrary(poc[2]).getThesis(poc[1])==null){
                    System.out.println("not-found");
                }
                else if (libraries.getLibrary(poc[2]).getThesis(poc[1]).isBorrowed()){
                    System.out.println("not-allowed");
                }
                else {
                    libraries.getLibrary(poc[2]).removeThesis(poc[1]);
                    System.out.println("success");
                }
            }

            //add-student

            if(poc[0].equals("add-student")){
                if(users.getUser(poc[1])!=null){
                    System.out.println("duplicate-id");
                }
                else {
                    users.addUser(poc[1],poc[2],poc[3],poc[4],poc[5],Integer.parseInt(poc[6]),poc[7],true);
                    System.out.println("success");
                }
            }

            //edit-student

            if(poc[0].equals("edit-student")){
                if(users.getUser(poc[1])==null){
                    System.out.println("not-found");
                }
                else {
                    users.editUser(poc[1],poc[2],poc[3],poc[4],poc[5],poc[6],poc[7]);
                    System.out.println("success");
                }
            }

            //remove-student

            if(poc[0].equals("remove-student")){
                if(users.getUser(poc[1])==null){
                    System.out.println("not-found");
                }
                else if (users.getUser(poc[1]).getDebt()>0||users.getUser(poc[1]).getCountOfBorrowedTheses()>0||users.getUser(poc[1]).getCountOfBorrowedBooks()>0) {
                    System.out.println("not-allowed");
                }
                else {
                    users.removeUser(poc[1]);
                    System.out.println("success");
                }
            }

            //add-staff

            if(poc[0].equals("add-staff")){
                if(users.getUser(poc[1])!=null){
                    System.out.println("duplicate-id");
                }
                else {
                    users.addUser(poc[1],poc[2],poc[3],poc[4],poc[5],Integer.parseInt(poc[6]),poc[7],false);
                    System.out.println("success");
                }
            }

            //edit-staff

            if(poc[0].equals("edit-staff")){
                if(users.getUser(poc[1])==null){
                    System.out.println("not-found");
                }
                else {
                    users.editUser(poc[1],poc[2],poc[3],poc[4],poc[5],poc[6],poc[7]);
                    System.out.println("success");
                }
            }

            //remove-staff

            if(poc[0].equals("remove-staff")){
                if(users.getUser(poc[1])==null){
                    System.out.println("not-found");
                }
                else if (users.getUser(poc[1]).getDebt()>0||users.getUser(poc[1]).getCountOfBorrowedTheses()>0||users.getUser(poc[1]).getCountOfBorrowedBooks()>0) {
                    System.out.println("not-allowed");
                }
                else {
                    users.removeUser(poc[1]);
                    System.out.println("success");
                }
            }

            //borrow

            if(poc[0].equals("borrow")){
                if(users.getUser(poc[1])==null){
                    System.out.println("not-found");
                }
                else if(libraries.getLibrary(poc[3])==null||libraries.getLibrary(poc[3]).getThesis(poc[4])==null&&libraries.getLibrary(poc[3]).getBook(poc[4])==null){
                    System.out.println("not-found");
                }
                else if(!users.getUser(poc[1]).getPassword().equals(poc[2])){
                    System.out.println("invalid-pass");
                }
                else if(users.getUser(poc[1]).getCountOfBorrowedBooks()+users.getUser(poc[1]).getCountOfBorrowedTheses()>=5&&users.getUser(poc[1]).isStudent()==false){
                    System.out.println("not-allowed");
                }
                else if (users.getUser(poc[1]).getCountOfBorrowedBooks()+users.getUser(poc[1]).getCountOfBorrowedTheses()>=3&&users.getUser(poc[1]).isStudent()) {
                    System.out.println("not-allowed");
                }
                else if (libraries.getLibrary(poc[3]).isBook(poc[4])==false&&libraries.getLibrary(poc[3]).getThesis(poc[4]).isBorrowed()) {
                    System.out.println("not-allowed");
                }
                else if (libraries.getLibrary(poc[3]).isBook(poc[4])&&libraries.getLibrary(poc[3]).getBook(poc[4]).getRemaining()==0){
                    System.out.println("not-allowed");
                }
                else{
                    borrowings.addBorrowing(poc[1],poc[3],poc[4],poc[5],poc[6]);
                    if(libraries.getLibrary(poc[3]).isBook(poc[4])==false){
                        users.borrowsAThesis(poc[1]);
                        libraries.getLibrary(poc[3]).getThesis(poc[4]).setBorrowed(true);
                    }
                    if(libraries.getLibrary(poc[3]).isBook(poc[4])){
                        users.borrowsABook(poc[1]);
                        libraries.getLibrary(poc[3]).getBook(poc[4]).setRemaining(libraries.getLibrary(poc[3]).getBook(poc[4]).getRemaining()-1);
                    }
                    System.out.println("success");
                }
            }

            //return

            if(poc[0].equals("return")){
                if(users.getUser(poc[1])==null){
                    System.out.println("not-found");
                }
                else if(libraries.getLibrary(poc[3])==null||libraries.getLibrary(poc[3]).getThesis(poc[4])==null&&libraries.getLibrary(poc[3]).getBook(poc[4])==null){
                    System.out.println("not-found");
                }
                else if(borrowings.doesBorrowingExists(poc[1],poc[3],poc[4])==false){
                    System.out.println("not-found");
                }
                else if(!users.getUser(poc[1]).getPassword().equals(poc[2])){
                    System.out.println("invalid-pass");
                }
                else{
                    long debt = borrowings.returning(poc[1],poc[3],poc[4],poc[5],poc[6],libraries.getLibrary(poc[3]).isBook(poc[4]),users.getUser(poc[1]).isStudent());
                    users.getUser(poc[1]).addToDebt(debt);
                    if(libraries.getLibrary(poc[3]).isBook(poc[4])==false){
                        users.returnsAThesis(poc[1]);
                        libraries.getLibrary(poc[3]).getThesis(poc[4]).setBorrowed(false);
                    }
                    if(libraries.getLibrary(poc[3]).isBook(poc[4])){
                        users.returnsABook(poc[1]);
                        libraries.getLibrary(poc[3]).getBook(poc[4]).setRemaining(libraries.getLibrary(poc[3]).getBook(poc[4]).getRemaining()+1);
                    }
                    if(debt!=0){System.out.println(debt);}
                    if(debt==0){System.out.println("success");}
                }
            }

            //search

            if(poc[0].equals("search")){
                libraries.search(poc[1]);
            }

            //search-user

            if(poc[0].equals("search-user")){
                if(users.getUser(poc[1])==null){
                    System.out.println("not-found");
                }
                else if (!users.getUser(poc[1]).getPassword().equals(poc[2])) {
                    System.out.println("invalid-pass");
                }
                else {
                    users.searchUser(poc[3]);
                }
            }

            //category-report

            if(poc[0].equals("category-report")){
                if(categories.getCategory(poc[1])==null){
                    System.out.println("not-found");
                }
                else{
                    libraries.categoryReport(poc[1]);
                }
            }

            //library-report

            if(poc[0].equals("library-report")){
                if(libraries.getLibrary(poc[1])==null){
                    System.out.println("not-found");
                }
                else {
                    libraries.libraryReport(poc[1]);
                }
            }

            command = scanner.nextLine();
            poc = command.split("[#|]+");
        }
    }
}
