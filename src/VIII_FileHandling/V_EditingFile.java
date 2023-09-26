package VIII_FileHandling;

import java.io.FileWriter;


public class V_EditingFile {
    public static void main(String[] args) {
        //Overriding a file
        try {
            FileWriter overrider = new FileWriter("C:\\Users\\User\\IdeaProjects\\Concepts_Of_OOPS\\src\\VIII_FileHandling\\SampleDirectory\\Override.txt");
            String content = """
                    This multi-line string gonna override the file
                    Iam tiered of Java
                    Lets do some C++
                    And make our own library
                    """;
            overrider.write(content);
            overrider.flush();
            overrider.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        //Appending a file (notice the true in FileWriter instantiation)
        try {
            FileWriter appender = new FileWriter("C:\\Users\\User\\IdeaProjects\\Concepts_Of_OOPS\\src\\VIII_FileHandling\\SampleDirectory\\Append.txt", true);
            String content = """
                    \n                    
                    This multi-line string gonna not override the file
                    Iam tiered of Java
                    Lets do some C++
                    And make our own library
                    """;
            appender.write(content);
            appender.flush();
            appender.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
