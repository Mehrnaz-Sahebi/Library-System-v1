import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandLine = scanner.nextLine();
        String[] partsOfCommandLine = commandLine.split("[#|]+");
        while(!partsOfCommandLine[0].equals("finish")){
            if(partsOfCommandLine[0].equals("add-library")){

            }
            commandLine = scanner.nextLine();
            partsOfCommandLine = commandLine.split("[#|]+");

        }


    }
}
