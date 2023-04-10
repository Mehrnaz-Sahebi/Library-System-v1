import java.util.HashSet;

public class Libraries {
    private HashSet<String> librariesList = new HashSet<String>();
    public void addLibrary(String libraryId){
        librariesList.add(libraryId);
    }
    public static boolean doesLibraryExists(String libraryId ){
        return librariesList.contains(libraryId);
    }

}
