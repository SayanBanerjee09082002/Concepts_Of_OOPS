package VIII_FileHandling;

import java.io.File;

public class II_RenamingFile {
    public static void main(String[] args) {
        String rootDir = "C:\\Users\\User\\IdeaProjects\\Concepts_Of_OOPS\\src\\VIII_FileHandling";
        File directory = new File(rootDir, "dkr");
        File file = new File(directory, "SampleText.txt");

        //Rename file
        try {
            File renameFile = new File (directory, "Renamed.txt");
            file.renameTo(renameFile);
        } catch (Exception e) {
            System.out.println(e);
        }

        //Renaming directory
        try {
            File renameDkr = new File (rootDir, "RenamedDkr");
            directory.renameTo(renameDkr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
