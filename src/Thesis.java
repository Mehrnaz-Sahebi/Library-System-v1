public class Thesis {
    private String thesisId;
    private String title;
    private String studentName;
    private String Supervisor;
    private int yearOfDefense;
    private String category;
    private String libraryId;

    public Thesis(String thesisId, String title, String studentName, String supervisor, int yearOfDefense, String category, String libraryId) {
        this.thesisId = thesisId;
        this.title = title;
        this.studentName = studentName;
        Supervisor = supervisor;
        this.yearOfDefense = yearOfDefense;
        this.category = category;
        this.libraryId = libraryId;
    }
}
