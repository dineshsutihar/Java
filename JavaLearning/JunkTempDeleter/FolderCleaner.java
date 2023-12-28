package JavaLearning.JunkTempDeleter;

import java.io.File;
import java.util.Scanner;

/* This interface defines the common behavior that all folder classes must implement */
interface Folder {
    void clean();
}

/*
 * This abstract class implements some common behavior that is shared by all
 * folder classes
 */
abstract class AbstractFolder implements Folder {
    protected String folderPath;

    /*
     * This is an example of abstraction, where common behavior is abstracted into a
     * parent class
     * that can be inherited by child classes
     */
    protected void deleteFiles(File[] files) {
        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            }
        }
    }
}

/*
 * This class represents the Temp folder and provides its own implementation of
 * the clean() method
 */
class TempFolder extends AbstractFolder {
    public TempFolder() {
        /*
         * This uses the System.getenv() method to get the value of the TEMP environment
         * variable.
         * This is an example of polymorphism, where the same method can be used with
         * different
         * inputs to produce different results
         */
        folderPath = "C:\\Windows\\Temp";
    }

    // This method overrides the clean() method in the Folder interface
    @Override
    public void clean() {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        deleteFiles(files);
    }
}

/*
 * This class represents the Prefetch folder and provides its own implementation
 * of the clean() method
 */
class PrefetchFolder extends AbstractFolder {
    public PrefetchFolder() {
        // This sets the folder path to a specific location
        folderPath = "C:\\Windows\\Prefetch";
    }

    // This method overrides the clean() method in the Folder interface
    @Override
    public void clean() {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        deleteFiles(files);
    }
}

// This is the main class that runs the program
public class FolderCleaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        /*
         * This is an example of a loop, where the user is prompted to select a folder
         * to clean
         * until they choose to exit the program
         */
        while (!exit) {
            System.out.println("Select a folder to clean:");
            System.out.println("1. Temp");
            System.out.println("2. Prefetch");
            System.out.println("3. Exit");

            /*
             * This is an example of a switch statement, where the user's input determines
             * which
             * folder to clean
             */
            switch (scanner.nextInt()) {
                case 1:
                    TempFolder tempFolder = new TempFolder();
                    tempFolder.clean();
                    System.out.println("Temp folder cleaned!");
                    break;
                case 2:
                    PrefetchFolder prefetchFolder = new PrefetchFolder();
                    prefetchFolder.clean();
                    System.out.println("Prefetch folder cleaned!\n");
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }

        scanner.close();
    }
}
