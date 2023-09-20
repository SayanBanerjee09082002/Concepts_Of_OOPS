package Interfaces;

interface OuterInterface {
    interface InnerInterface1 {
        void printSomething1();
    }

    interface InnerInterface2 {
        void printSomething2();
    }
}

class ImplementInterface {
    interface ClassOuterInterface {
        interface ClassInnerInterface1 {
            void printSomething3();
        }

        interface ClassInnerInterface2 {
            void printSomething4();
        }
    }
}

class ImplementationOne implements OuterInterface.InnerInterface1 {
    @Override
    public void printSomething1() {
        System.out.println("SHOULD CALL INNER INTERFACE 1");
    }
}

class ImplementationTwo implements OuterInterface.InnerInterface2, ImplementInterface.ClassOuterInterface.ClassInnerInterface2 {
    @Override
    public void printSomething2() {
        System.out.println("SHOULD CALL INNER INTERFACE 2");
    }

    @Override
    public void printSomething4() {
        System.out.println("SHOULD CALL CLASS INNER INTERFACE 4");
    }
}

public class III_NestedInterface {
    public static void main(String[] args) {
        ImplementationOne a = new ImplementationOne();
        ImplementationTwo b = new ImplementationTwo();

        a.printSomething1();
        b.printSomething2();
        b.printSomething4();
    }
}
