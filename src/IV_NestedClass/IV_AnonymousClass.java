package IV_NestedClass;

//Anonymous class are declared without naming them, hence anonymous

interface A {
    int num1 = 32;
    String word1 = "Interface A";

    void printAbstract1();

    void printAbstract2();

    default void printDefault() {
        System.out.println("Print default from interface A");
    }
}

class B {
    public int num2 = 12;
    public String word2 = "Interface B";

    void print1() {
        System.out.println("Print from class B");
    }

    void print2() {
        System.out.println("Print from class B");
    }
}

public class IV_AnonymousClass {
    public static void main(String[] args) {
        //Since anonymous class directly implements an interface or use a class you cannot implement two interfaces and for sure you cannot extend class multiple times
        //Declaring object of anonymous class
        A a = new A() {
            @Override
            public void printAbstract1() {
                System.out.println("Calling form main using A1");
            }

            @Override
            public void printAbstract2() {
                System.out.println("Calling form main using A2");
            }
        };
        System.out.println(a.word1);
        System.out.println(a.num1);
        a.printAbstract1();
        a.printAbstract2();
        a.printDefault();

        System.out.println();

        //Anonymous class using extending a class
        B b = new B() {
            @Override
            void print1() {
                System.out.println("Print from Main");
            }
        };

        System.out.println(b.word2);
        System.out.println(b.num2);
        b.print1();
        b.print2();
    }
}
