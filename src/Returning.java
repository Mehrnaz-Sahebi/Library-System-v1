import java.util.Date;

public class Returning {
    private String returnerId;
    private String libraryId;
    private String bookOrThesisId;
    private Date returningTime;

    public Returning(String returnerId, String libraryId, String bookOrThesisId, String date,String time) {
        this.returnerId = returnerId;
        this.libraryId = libraryId;
        this.bookOrThesisId = bookOrThesisId;
        String[] partsOfDate = date.split("-");
        String[] partsOfTime = time.split(":");
        this.returningTime = new Date(Integer.parseInt(partsOfDate[0]),Integer.parseInt(partsOfDate[1]),Integer.parseInt(partsOfDate[2]),Integer.parseInt(partsOfTime[0]),Integer.parseInt(partsOfTime[1]));
    }

    public String getReturnerId() {
        return returnerId;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public String getBookOrThesisId() {
        return bookOrThesisId;
    }

    public Date getReturningTime() {
        return returningTime;
    }
}
