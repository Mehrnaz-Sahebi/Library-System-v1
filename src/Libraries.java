import java.util.HashSet;

public class Libraries {
    private HashSet<Library> librariesSet ;
    public Libraries (){
        librariesSet = new HashSet<Library>();
    }

    public void addLibrary(String libraryId, String name, int yearOfEstablishment, int countOfDesks, String address) {
        Library library = new Library(libraryId, name, yearOfEstablishment, countOfDesks, address)
        librariesSet.add(library);
    }

    public boolean doesLibraryExists(String libraryId) {
        for (Library library: librariesSet) {
            if (library.getLibraryId().equals(libraryId)){
                return true;
            }
        }
        return false;
    }
    public Library getLibrary(String libraryId){
        for (Library library:librariesSet) {
            if(library.getLibraryId().equals(libraryId)){
                return library;
            }
        }
        return null;
    }

}
