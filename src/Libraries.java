import java.util.ArrayList;
import java.util.HashSet;

public class Libraries {
    private HashSet<Library> librariesSet ;
    public Libraries (){
        librariesSet = new HashSet<Library>();
    }

    public void addLibrary(String libraryId, String name, int yearOfEstablishment, int countOfDesks, String address) {
        Library library = new Library(libraryId, name, yearOfEstablishment, countOfDesks, address);
        librariesSet.add(library);
    }


    public Library getLibrary(String libraryId){
        for (Library library:librariesSet) {
            if(library.getLibraryId().equals(libraryId)){
                return library;
            }
        }
        return null;
    }

    public void search(String searchKey){
        HashSet<String> searchResult = new HashSet<String>();
        String searchKeyToLowerCase = searchKey.toLowerCase();
        System.out.println("0");
        for (Library library:librariesSet) {
            for (Book book:library.getBooks()) {
                if(book.getBookId().toLowerCase().contains(searchKeyToLowerCase)||book.getPublisher().toLowerCase().contains(searchKeyToLowerCase)||book.getTitle().toLowerCase().contains(searchKeyToLowerCase))
                {
                    searchResult.add(book.getBookId());
                }
            }
            System.out.println("1");
            for (Thesis thesis:library.getTheses()) {
                if(thesis.getTitle().toLowerCase().contains(searchKeyToLowerCase)||thesis.getStudentName().toLowerCase().contains(searchKeyToLowerCase)||thesis.getSupervisor().contains(searchKeyToLowerCase))
                {
                    searchResult.add(thesis.getThesisId());
                }
            }
            System.out.println("2");
        }
        if(searchResult.size()==0){
            System.out.println("not-found");
            return;
        }
        ArrayList<String> sortedSearchResult = new ArrayList<String>();
        for (String element:searchResult) {
            sortedSearchResult.add(element);
        }
        System.out.println("3");
        sortedSearchResult.sort(String::compareToIgnoreCase);
        System.out.println("4");
        System.out.printf("%s",sortedSearchResult.get(0));
        for (int i = 1; i < sortedSearchResult.size(); i++) {
            System.out.printf("|%s",sortedSearchResult.get(i));
        }
        System.out.println();
    }
}
