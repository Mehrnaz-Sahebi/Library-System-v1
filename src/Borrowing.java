import java.util.Calendar;
import java.util.Date;

public class Borrowing {
    private String userId;
    private String libraryId;
    private String bookOrThesisId;
    private Date borrowingTime;

    public Borrowing(String userId, String libraryId, String bookOrThesisId, String date, String time) {
        this.userId = userId;
        this.libraryId = libraryId;
        this.bookOrThesisId = bookOrThesisId;
        String[] partsOfDate = date.split("-");
        String[] partsOfTime = time.split(":");
        this.borrowingTime = new Date(Integer.parseInt(partsOfDate[0]), Integer.parseInt(partsOfDate[1]),Integer.parseInt(partsOfDate[2]),Integer.parseInt(partsOfTime[0]),Integer.parseInt(partsOfTime[1]));
    }

    public String getUserId() {
        return userId;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public String getBookOrThesisId() {
        return bookOrThesisId;
    }

    public Date getBorrowingTime() {
        return borrowingTime;
    }
}
