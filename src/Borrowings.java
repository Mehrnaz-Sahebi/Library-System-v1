import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class Borrowings {
    private ArrayList<Borrowing> borrowings;

    public Borrowings() {
        this.borrowings = new ArrayList<Borrowing>();
    }
    public void addBorrowing(String userId, String libraryId, String bookOrThesisId, String date, String time){
        Borrowing borrowing = new Borrowing(userId,libraryId,bookOrThesisId,date,time);
        borrowings.add(borrowing);
    }
    public boolean doesBorrowingExists(String userId,String libraryId,String bookOrThesisId){
        for (Borrowing borrowing:borrowings) {
            if(borrowing.getUserId().equals(userId)&&borrowing.getLibraryId().equals(libraryId)&&borrowing.getBookOrThesisId().equals(bookOrThesisId)){
                return true;
            }
        }
        return false;
    }
    public Borrowing getBorrowing(String userId,String libraryId,String bookOrThesisId){
        for (Borrowing borrowing:borrowings) {
            if(borrowing.getUserId().equals(userId)&&borrowing.getLibraryId().equals(libraryId)&&borrowing.getBookOrThesisId().equals(bookOrThesisId)){
                return borrowing;
            }
        }
        return null;
    }
    public long returning(String userId, String libraryId, String bookOrThesisId, String date, String time , boolean isBook , boolean isStudent){
        Borrowing borrowing = getBorrowing(userId,libraryId,bookOrThesisId);
        borrowings.remove(borrowing);
        String[] partsOfDate = date.split("-");
        String[] partsOfTime = time.split(":");
        Date returnDate = new Date(Integer.parseInt(partsOfDate[0])-1900, Integer.parseInt(partsOfDate[1])-1,Integer.parseInt(partsOfDate[2]),Integer.parseInt(partsOfTime[0]),Integer.parseInt(partsOfTime[1]));
        long differenceOFDays = returnDate.getTime() - borrowing.getBorrowingTime().getTime();
        differenceOFDays = TimeUnit.HOURS.convert(differenceOFDays, TimeUnit.MILLISECONDS);
        if(isBook && isStudent){
            if(differenceOFDays<=240){
                return 0;
            }
            else {
                return (differenceOFDays-240)*50;
            }
        }
        if(!isBook && isStudent){
            if(differenceOFDays<=168){
                return 0;
            }
            else {
                return (differenceOFDays-168)*50;
            }
        }
        if(isBook && !isStudent){
            if(differenceOFDays<=336){
                return 0;
            }
            else {
                return (differenceOFDays-336)*100;
            }
        }
        if(differenceOFDays<=240){
                return 0;
        }
        else {
            return (differenceOFDays-240)*100;
        }
    }
    public void reportPassedDeadline(Library library,String date,String time, Users users){
        HashSet<String> result = new HashSet<String>();
        String[] partsOfDate = date.split("-");
        String[] partsOfTime = time.split(":");
        Date currentTime = new Date(Integer.parseInt(partsOfDate[0])-1900, Integer.parseInt(partsOfDate[1])-1,Integer.parseInt(partsOfDate[2]),Integer.parseInt(partsOfTime[0]),Integer.parseInt(partsOfTime[1]));
        for (Borrowing borrowing:borrowings) {
            if(borrowing.getLibraryId().equals(library.getLibraryId())){
                long differenceOFDays = currentTime.getTime() - borrowing.getBorrowingTime().getTime();
                differenceOFDays = TimeUnit.HOURS.convert(differenceOFDays, TimeUnit.MILLISECONDS);
                if ( library.isBook(borrowing.getBookOrThesisId()) && users.getUser(borrowing.getUserId()).isStudent() && differenceOFDays > 240) {
                    result.add(borrowing.getBookOrThesisId());
                }
                if( !library.isBook(borrowing.getBookOrThesisId()) && users.getUser(borrowing.getUserId()).isStudent() && differenceOFDays > 168){
                    result.add(borrowing.getBookOrThesisId());
                }
                if(library.isBook(borrowing.getBookOrThesisId()) && !users.getUser(borrowing.getUserId()).isStudent() && differenceOFDays > 336){
                    result.add(borrowing.getBookOrThesisId());
                }
                if(!library.isBook(borrowing.getBookOrThesisId()) && !users.getUser(borrowing.getUserId()).isStudent() && differenceOFDays > 240){
                    result.add(borrowing.getBookOrThesisId());
                }
            }
        }
        if(result.size()==0){
            System.out.println("none");
            return;
        }
        ArrayList<String> sortedResult = new ArrayList<String>();
        for (String element:result) {
            sortedResult.add(element);
        }
        sortedResult.sort(String::compareToIgnoreCase);
        System.out.printf("%s",sortedResult.get(0));
        for (int i = 1; i < sortedResult.size(); i++) {
            System.out.printf("|%s",sortedResult.get(i));
        }
        System.out.println();
    }
}
