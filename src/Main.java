import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libraries libraries = new Libraries();
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String[] partsOfCommand= command.split("[#|]+");
        while(!partsOfCommand[0].equals("finish")){
            if(partsOfCommand[0].equals("add-library")){
                if(libraries.doesLibraryExists(partsOfCommand[1])){
                    System.out.println("duplicate-id");
                }
                else {
                    libraries.addLibrary(partsOfCommand[1],partsOfCommand[2],Integer.parseInt(partsOfCommand[3]),Integer.parseInt(partsOfCommand[4]),partsOfCommand[5]);
                    System.out.println("success");
                }
            }

            command = scanner.nextLine();
            partsOfCommand = command.split("[#|]+");

        }


    }
}
