package VII_ExceptionHandling;

//Finally get executed regardless if error is encountered or not

class FinallyExample {
    public static void taskOne(int a) {
        try {
            System.out.println("TASK INITIALISED");
            //Here we will get Arithmetic error and will exit try method
            int num = 32 / a;
            System.out.println(num);
        } catch (ArithmeticException e) {
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
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("TASK COMPLETE");
        }
    }

    public static void taskThree(int a) {
        //However in case of wrong error handling or no error handling with catch, the programme will terminate, but finally will be executed
        try {
            System.out.println("TASK INITIALISED");
            //Here we will get Arithmetic error and will exit try method
            int num = 32 / a;
            System.out.println(num);
            System.out.println("TASK COMPLETE");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("TASK COMPLETE");
        }
    }

}

public class III_Finally {
    public static void main(String[] args) {
        int a = 0;
        FinallyExample.taskOne(a);
        System.out.println();
        FinallyExample.taskTwo(a);
        System.out.println();
        FinallyExample.taskThree(a);
        System.out.println();
        System.out.println("THIS WILL NOT GET PRINTED");
    }
}
