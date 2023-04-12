import java.util.Date;

public class Borrowing {
    private String borrowerId;
    private String libraryId;
    private String bookOrThesisId;
    private Date borrowingTime;

    public Borrowing(String borrowerId, String libraryId, String bookId, String date, String time) {
        this.borrowerId = borrowerId;
        this.libraryId = libraryId;
        this.bookOrThesisId = bookId;
        String[] partsOfDate = date.split("-");
        String[] partsOfTime = time.split(":");
        this.borrowingTime = new Date(Integer.parseInt(partsOfDate[0]),Integer.parseInt(partsOfDate[1]),Integer.parseInt(partsOfDate[2]),Integer.parseInt(partsOfTime[0]),Integer.parseInt(partsOfTime[1]));
    }

    public String getBorrowerId() {
        return borrowerId;
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
