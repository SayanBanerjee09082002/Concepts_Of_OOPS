package VIII_FileHandling;

import java.io.File;

public class I_CreatingFile {
    public static void main(String[] args) {
        String rootDir = "C:\\Users\\User\\IdeaProjects\\Concepts_Of_OOPS\\src\\VIII_FileHandling";

        //Create a directory
        File directory = new File(rootDir, "dkr");
        try {
            directory.mkdir();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println();

        //Create a file
        File file = new File(directory, "SampleText.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
