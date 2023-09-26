package VII_ExceptionHandling;

//Try block permits execution of code even in case of a failure
class TryExample {
    public static void taskOne(int a) {
        try {
            System.out.println("TASK INITIALISED");
            //Here we will get Arithmetic error and will exit try method
            int num = 32 / a;
            System.out.println(num);
            System.out.println("TASK COMPLETE");
        }
        catch (ArithmeticException e) {
            System.out.println();
        }
    }

    public static void taskTwo(int a) {
        try {
            System.out.println("TASK INITIALISED");
            int num = 32 + a;
            System.out.println(num);
            System.out.println("TASK COMPLETE");
        }
        finally {
            System.out.println();
        }
    }
}

public class I_Try {
    public static void main (String[] args) {
        int a = 0;
        //Notice even after having error the programme didn't terminate
        TryExample.taskOne(a);
        TryExample.taskTwo(a);
    }
}
