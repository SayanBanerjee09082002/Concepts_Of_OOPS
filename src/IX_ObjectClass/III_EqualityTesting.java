package IX_ObjectClass;

import java.util.Objects;

class EqualityTesting {
    private String word;
    private int number;

    EqualityTesting(String word, int number) {
        this.word = word;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            //Check if object is same
            System.out.print("Returning form if: ");
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            //Check if object belongs to same class or if it is null
            System.out.print("Returning form if: ");
            return false;
        }

        //Comparing the attributes of the objects
        EqualityTesting equalityTesting = (EqualityTesting) obj; //This is required as Java doesn't know the class of the object
        return word == equalityTesting.word && Objects.equals(number, equalityTesting.number);
    }
}

public class III_EqualityTesting {
    public static void main(String[] args) {
        EqualityTesting equalityTesting = new EqualityTesting("WORD", 1);
        EqualityTesting equalityTesting2 = new EqualityTesting("WORD", 2);
        ObjectExample objectExample = new ObjectExample("WORD", 1);

        System.out.println(equalityTesting.equals(equalityTesting));
        System.out.println(equalityTesting.equals(equalityTesting2));
        System.out.println(equalityTesting.equals(objectExample));
        System.out.println(equalityTesting.equals(null));
    }
}
