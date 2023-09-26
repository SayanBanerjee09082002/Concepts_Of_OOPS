package VIII_FileHandling;

import java.io.*;

class SampleClass implements Serializable {
    private int number;
    private String word;
    private boolean bool;

    SampleClass(int number, String word, boolean bool) {
        this.number = number;
        this.word = word;
        this.bool = bool;
    }

    public void getData() {
        System.out.println(number + " " + word + " " + bool);
    }
}

public class VI_SerializationAndDeserialization {
    public static void main(String[] args) {
        SampleClass sampleClass1 = new SampleClass(42, "One", true);
        SampleClass sampleClass2 = new SampleClass(12, "Two", true);
        SampleClass sampleClass3 = new SampleClass(8, "Three", false);
        String filename = "serialization.ser";

        //Serialization
        try {
            //Saving of object in a file
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            //Serializing
            outputStream.writeObject(sampleClass1);
            outputStream.writeObject(sampleClass2);
            outputStream.writeObject(sampleClass3);

            outputStream.close();
            fileOutputStream.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        //Deserialization
        try {
            //Comment out object 4 and observe the result (it will throw error as there are no object 4)
            //Reading the object from file
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //Deserialization
            SampleClass object1 = (SampleClass) objectInputStream.readObject();
            SampleClass object2 = (SampleClass) objectInputStream.readObject();
            SampleClass object3 = (SampleClass) objectInputStream.readObject();
            //SampleClass object4 = (SampleClass) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

            object1.getData();
            object2.getData();
            object3.getData();
            //object4.getData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
