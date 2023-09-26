package I_Basics;

//FOR ATTRIBUTES: A static attribute is common for all objects of a class. A non-static attribute is unique for each object of a class
//FOR METHOD: A static method may be called without creating an object but for non-static method you need to create an object

class StaticExample {
    static int integerStatic;
    int integerNonStatic;


    static void printStaticMethod() {
        System.out.println("Print static method");
    }

    void printNonStaticMethod() {
        System.out.println("Print non-static method");
    }
}

public class IV_StaticVsNonStatic {
    public static void main(String[] args) {
        StaticExample example = new StaticExample();
        StaticExample.integerStatic = 10;
        example.integerNonStatic = 1;

        System.out.println(StaticExample.integerStatic); //Iam calling this without creating an object
        //This is illegal
        //System.out.println(StaticExample.integerNonStatic);
        System.out.println(example.integerNonStatic);
        //You can still call static attribute as well as method by referring it via object
        System.out.println(example.integerStatic);

        StaticExample exampleNew = new StaticExample();
        exampleNew.integerNonStatic = 2;
        exampleNew.integerStatic = 20;

        //Notice the override in static attribute
        System.out.println(StaticExample.integerStatic);
        System.out.println(exampleNew.integerStatic);
        //Non statics are not overridden
        System.out.println(exampleNew.integerNonStatic);

        StaticExample.printStaticMethod();
        //This is illegal
        //StaticExample.printNonStaticMethod();
        example.printNonStaticMethod();
        exampleNew.printNonStaticMethod();
    }
}
