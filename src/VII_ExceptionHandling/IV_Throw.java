package VII_ExceptionHandling;

import java.io.IOException;

//To manually throw an exception, use the keyword throw.

class ThrowExample {
    public static void taskOne(int a) {
        try {
            System.out.println("TASK INITIALISED");
            int num = 32 + a;
            System.out.println(num);
            throw new Exception("EXCEPTION 1");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("TASK COMPLETE");
        }
    }

    public static void taskTwo(int a) {
        try {
            System.out.println("TASK INITIALISED");
            int num = 32 + a;
            System.out.println(num);
            throw new IOException("EXCEPTION 2");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("TASK COMPLETE");
        }
    }

    public static void taskThree(int a) {
        //Notice output for this one, throw will not get executed
        try {
            System.out.println("TASK INITIALISED");
            int num = 32 / a;
            System.out.println(num);
            System.out.println("TASK COMPLETE");
            throw new ArithmeticException("EXCEPTION 2");
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("TASK COMPLETE");
        }
    }
}

public class IV_Throw {
    public static void main(String[] args) {
        int a = 0;
        ThrowExample.taskOne(a);
        System.out.println();
        ThrowExample.taskTwo(a);
        System.out.println();
        ThrowExample.taskThree(a);
        System.out.println();
        System.out.println("THIS WILL GET PRINTED");
    }
}
