package VIII_FileHandling;

import java.io.File;

public class III_DeletingFile {
    public static void main (String[] args) {
        String rootDir = "C:\\Users\\User\\IdeaProjects\\Concepts_Of_OOPS\\src\\VIII_FileHandling";
        File directory = new File(rootDir, "RenamedDkr");
        File file = new File(directory, "Renamed.txt");

        //Deleting File
        try {
            file.delete();
        } catch (Exception e) {
            System.out.println(e);
        }

        //Deleting Directory
        try {
            directory.delete();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
