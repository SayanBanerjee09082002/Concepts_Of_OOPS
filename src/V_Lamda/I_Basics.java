package V_Lamda;

//NOTE: Lambdas work on Functional interfaces which are the interfaces with one and only one abstract method
interface NumberGenerator {
    //Attributes can be declared in functional interface
    int num = 12;
    String word = "Allowed";

    //Only one abstract method is allowed
    double generateNumber();

    //Default methods are permissible in lambdas
    default void print() {
        System.out.println("You can still have default methods");
    }
}

public class I_Basics {
    public static void main(String[] args) {
        //Instantiate the interface
        NumberGenerator numberGenerator;

        numberGenerator = () -> 45.24;
        System.out.println(numberGenerator.generateNumber());

        numberGenerator = () -> 12 + NumberGenerator.num;
        System.out.println(numberGenerator.generateNumber());

        //This will give error as NumberGenerator.word is a string not a double
        //numberGenerator = ()->20+NumberGenerator.word;

        //When we instantiate a lambda, every time it is called it will call the method (if it has any) its having. See the output
        numberGenerator = () -> Math.random();
        System.out.println(numberGenerator.generateNumber());
        System.out.println(numberGenerator.generateNumber());
    }
}
