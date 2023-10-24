package IX_ObjectClass;

//Object class is a fundamental class in the Java programming language.
//It is the root class for all other classes in Java. Every class in Java is a direct or indirect subclass of the Object class. As such, the Object class provides a set of methods that are inherited by all Java classes.

class ObjectExample {
    private String word;
    private int number;

    ObjectExample(String word, int number) {
        this.word = word;
        this.number = number;
    }
}

public class I_BasicMethods {
    public static void main(String[] args) {
        ObjectExample objectExample = new ObjectExample("WORD", 1);
        ObjectExample objectExample2 = new ObjectExample("WORD", 1);

        System.out.println("String representation of this object: " + objectExample.toString());
        System.out.println("Runtime object of this object: " + objectExample.getClass());
        System.out.println("Hashcode of the object: " + objectExample.hashCode());
        System.out.println("Same objects as objectExample: " + objectExample.equals(objectExample));
        System.out.println("Same objects as objectExample2: " + objectExample.equals(objectExample2));
    }
}
