package Interfaces;

//If you are extending then you also have to define abstract methods of super interface
interface InterfaceA {
    void methodA();

    void commonMethod();

    void methodCommonWithC();
}

interface InterfaceB {
    void methodB();

    void commonMethod();
}

//Multiple inheritance possible
interface InterfaceC extends InterfaceA, InterfaceB {
    void methodC();

    void commonMethod();

    void methodCommonWithC();
}

interface InterfaceD extends InterfaceA {
    void methodD();

    void commonMethod();
}

interface InterfaceE {
    void methodE();

    void commonMethod();
}

class Implements1 implements InterfaceC, InterfaceE {
    @Override
    public void methodA() {
        System.out.println("METHOD A");
    }

    @Override
    public void methodB() {
        System.out.println("METHOD B");
    }

    @Override
    public void methodC() {
        System.out.println("METHOD C");
    }

    @Override
    public void commonMethod() {
        System.out.println("COMMON 1");
    }

    @Override
    public void methodCommonWithC() {
        System.out.println("COMMON A AND C");
    }

    @Override
    public void methodE() {
        System.out.println("METHOD E");
    }
}

class Implements2 implements InterfaceD {
    @Override
    public void methodD() {
        System.out.println("METHOD D");
    }

    @Override
    public void commonMethod() {
        System.out.println("COMMON 2");
    }

    @Override
    public void methodA() {
        System.out.println("METHOD A");
    }

    @Override
    public void methodCommonWithC() {
        System.out.println("Called from A COMMON C");
    }
}

public class IV_ExtendingInterface {
    public static void main(String[] args) {
        Implements1 a = new Implements1();
        Implements2 b = new Implements2();

        a.methodA();
        a.methodB();
        a.methodC();
        a.methodE();
        a.methodCommonWithC();
        a.commonMethod();
        System.out.println();
        b.methodA();
        b.methodD();
        b.methodCommonWithC();
        b.commonMethod();
    }
}
