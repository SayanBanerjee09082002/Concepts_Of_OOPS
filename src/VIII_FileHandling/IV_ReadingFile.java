package VIII_FileHandling;

import java.io.File;
import java.util.Scanner;

public class IV_ReadingFile {
    public static void main(String[] args) {
        //Reading File
        try {
            File readFile = new File("C:\\Users\\User\\IdeaProjects\\Concepts_Of_OOPS\\src\\VIII_FileHandling\\SampleDirectory\\Read.txt");
            Scanner reader = new Scanner(readFile);
            while (reader.hasNextLine())
                System.out.println(reader.nextLine());
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println();

        //Getting file information
        try {
            File readFile = new File("C:\\Users\\User\\IdeaProjects\\Concepts_Of_OOPS\\src\\VIII_FileHandling\\SampleDirectory\\Read.txt");
            System.out.println("File Name: " + readFile.getName());
            System.out.println("Absolute Path: " + readFile.getAbsolutePath());
            System.out.println("Size: " + readFile.length() + " bytes or " + (double) readFile.length() / 1024 + " kilobytes");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
