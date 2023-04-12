public class Thesis {
    private String thesisId;
    private String title;
    private String studentName;
    private String Supervisor;
    private int yearOfDefense;
    private String category;
    private String libraryId;
    private boolean isBorrowed;

    public Thesis(String thesisId, String title, String studentName, String supervisor, int yearOfDefense, String category, String libraryId) {
        this.thesisId = thesisId;
        this.title = title;
        this.studentName = studentName;
        this.Supervisor = supervisor;
        this.yearOfDefense = yearOfDefense;
        this.category = category;
        this.libraryId = libraryId;
        this.isBorrowed = false;
    }

    public void setThesisId(String thesisId) {
        this.thesisId = thesisId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSupervisor(String supervisor) {
        Supervisor = supervisor;
    }

    public void setYearOfDefense(int yearOfDefense) {
        this.yearOfDefense = yearOfDefense;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getThesisId() {
        return thesisId;
    }

    public String getTitle() {
        return title;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSupervisor() {
        return Supervisor;
    }

    public int getYearOfDefense() {
        return yearOfDefense;
    }

    public String getCategory() {
        return category;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}
