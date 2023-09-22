package IV_Interfaces;

interface example {
    void printConcreteMethod();

    default void printDefaultMethod() {
        System.out.println("DEFAULT METHOD");
    }

    default void anotherDefaultMethod() {
        System.out.println("ANOTHER DEFAULT METHOD");
    }

    //This will be overridden in class
    default void overrideThis() {
        System.out.println("CALLED FROM INTERFACE");
    }
}

class ImplementExample implements example {
    @Override
    public void printConcreteMethod() {
        System.out.println("CONCRETE METHOD");
    }

    @Override
    public void overrideThis() {
        System.out.println("CALLED FROM CLASS");
    }
}

public class V_DefaultMethodInInterface {
    public static void main(String[] args) {
        ImplementExample eg = new ImplementExample();

        eg.printConcreteMethod();
        eg.printDefaultMethod();
        eg.anotherDefaultMethod();
        eg.overrideThis();
    }
}
