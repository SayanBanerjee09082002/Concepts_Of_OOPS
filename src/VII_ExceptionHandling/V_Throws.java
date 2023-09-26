package VII_ExceptionHandling;

//Any exception that is thrown out of a method must be specified as such by a throws clause.

class ThrowsExample {
    public static void taskOne(int a) throws ArithmeticException {
        int num = 32 / a;
        System.out.println(num);
    }

    public static void taskTwo(int a) throws IndexOutOfBoundsException, ArithmeticException {
        int[] array = {1, 2, 3, 4, 5};
        int num = array[12];
        System.out.println(num / a);
    }
}

public class V_Throws {
    public static void main(String[] args) {
        //Change the order of task and notice the output
        int a = 0;
        ThrowsExample.taskOne(a);
        System.out.println();
        ThrowsExample.taskTwo(a);
        System.out.println();
    }
}
