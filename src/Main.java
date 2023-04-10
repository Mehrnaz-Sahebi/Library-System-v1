import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libraries libraries = new Libraries();
        Categories categories = new Categories();
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String[] partsOfCommand= command.split("[#|]+");
        while(!partsOfCommand[0].equals("finish")){

            //add-library

            if(partsOfCommand[0].equals("add-library")){
                if(libraries.getLibrary(partsOfCommand[1])!=null){
                    System.out.println("duplicate-id");
                }
                else {
                    libraries.addLibrary(partsOfCommand[1],partsOfCommand[2],Integer.parseInt(partsOfCommand[3]),Integer.parseInt(partsOfCommand[4]),partsOfCommand[5]);
                    System.out.println("success");
                }
            }

            //add category

            if(partsOfCommand[0].equals("add-category")){
                if(categories.getCategory(partsOfCommand[1])!=null){
                    System.out.println("duplicate-id");
                }
                else {
                    categories.addCategory(partsOfCommand[1],partsOfCommand[2]);
                    System.out.println("success");
                }
            }

            //add-book

            if(partsOfCommand[0].equals("add-book")){
                if (libraries.getLibrary(partsOfCommand[8])==null||categories.getCategory(partsOfCommand[7])==null){
                    System.out.println("not-found");
                }
                else if(libraries.getLibrary(partsOfCommand[8]).getBook(partsOfCommand[1])!=null){
                    System.out.println("duplicate-id");
                }
                else {
                    libraries.getLibrary(partsOfCommand[8]).addBook(partsOfCommand[1],partsOfCommand[2],partsOfCommand[3],partsOfCommand[4],Integer.parseInt(partsOfCommand[5]),Integer.parseInt(partsOfCommand[6]),partsOfCommand[7],partsOfCommand[8]);
                    System.out.println("success");
                }
            }

            //edit-book

            if(partsOfCommand[0].equals("edit-book")){
                if(libraries.getLibrary(partsOfCommand[2])==null||libraries.getLibrary(partsOfCommand[2]).getBook(partsOfCommand[1])==null){
                    System.out.println("not-found");
                }
                else {
                    libraries.getLibrary(partsOfCommand[2]).editBook(partsOfCommand[1],partsOfCommand[3],partsOfCommand[4],partsOfCommand[5],partsOfCommand[6],partsOfCommand[7],partsOfCommand[8]);
                    System.out.println("success");
                }
            }

            command = scanner.nextLine();
            partsOfCommand = command.split("[#|]+");

        }


    }
}
