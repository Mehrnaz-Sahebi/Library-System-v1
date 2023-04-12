import java.util.ArrayList;
import java.util.HashSet;

public class Borrowings {
    private ArrayList<Borrowing> borrowings;

    public Borrowings() {
        this.borrowings = new ArrayList<Borrowing>();
    }
    public void addBorrowing(String userId, String libraryId, String bookOrThesisId, String date, String time){
        Borrowing borrowing = new Borrowing(userId,libraryId,bookOrThesisId,date,time);
        borrowings.add(borrowing);
    }
}
