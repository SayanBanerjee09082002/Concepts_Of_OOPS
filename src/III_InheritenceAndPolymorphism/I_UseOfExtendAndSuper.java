package III_InheritenceAndPolymorphism;

//Class A is the super class or parent
class A {
    private int integer;
    private String string;

    //if we don't use this constructor, it will be compulsory to pass its value from child i.e B
    A() {

    }

    A(int integer, String string) {
        this.integer = integer;
        this.string = string;
    }

    public void printA() {
        System.out.println("Integer of A = " + this.integer);
        System.out.println("String of A = " + this.string);
    }
}

//class B is the child of A
class B extends A {
    //NOTE: Private attributes are not inherited, however since we are using constructor it makes an object of superclass and by using getters we can extract it
    private double rational;
    private boolean bool;

    B(double rational, boolean bool) {
        //See I didn't passed supper as I created empty constructor in A
        this.rational = rational;
        this.bool = bool;
    }

    B(double rational, boolean bool, int integer, String string) {
        //super() is used to class parent constructor
        super(integer, string);
        this.rational = rational;
        this.bool = bool;
    }

    public void printB() {
        System.out.println("Double of B = " + this.rational);
        System.out.println("Boolean of B = " + this.bool);
    }
}

public class I_UseOfExtendAndSuper {
    public static void main(String[] args) {
        A a = new A(12, "Hi");
        B b1 = new B(12.12, false);
        B b2 = new B(34.34, true, 4, "Hello");

        //B will have the methods of A also. See the output
        a.printA();
        System.out.println();
        b1.printA();
        b1.printB();
        System.out.println();
        b2.printA();
        b2.printB();
    }
}
