package InheritenceAndPolymorphism;

//Check and you will find if method name is same that of parent or grandparent they are overridden by child
class First {
    public void method1() {
        System.out.println("Method1 called from First");
    }

    public void methodCommon() {
        System.out.println("Common method called from First");
    }

    public  void methodForGrandChild() {
        System.out.println("Method for grandchild called from First");
    }
}

class Second extends First{
    public void method2() {
        System.out.println("Method2 called from Second");
    }

    public void methodCommon() {
        System.out.println("Common method called from Second");
    }
}

class Third extends Second{
    public void method3() {
        System.out.println("Method3 called from Third");
    }

    public void methodCommon() {
        System.out.println("Common method called from Third");
    }

    public  void methodForGrandChild() {
        System.out.println("Method for grandchild called from Third");
    }
}

class Forth extends First{
    public void method4() {
        System.out.println("Method4 called from Forth");
    }

    public void methodCommon() {
        System.out.println("Common method called from Forth");
    }
}

public class III_MethodOverriding {
    //NOTE: MethodOverriding is also called Compile Time Polymorphism
    public static void main(String[] args) {
        First a = new First();
        Second b = new Second();
        Third c = new Third();
        Forth d = new Forth();

        a.method1();
        a.methodCommon();
        a.methodForGrandChild();
        System.out.println();
        b.method1();
        b.method2();
        b.methodCommon();
        b.methodForGrandChild();
        System.out.println();
        c.method1();
        c.method2();
        c.method3();
        c.methodCommon();
        c.methodForGrandChild();
        System.out.println();
        d.method1();
        d.method4();
        d.methodForGrandChild();
        System.out.println();
    }
}
