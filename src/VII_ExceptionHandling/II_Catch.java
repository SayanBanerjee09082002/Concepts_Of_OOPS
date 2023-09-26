package VII_ExceptionHandling;

//NOTE: Catch is important if you want to continue the programme. Also, the suitable error should be mentioned otherwise the programme will terminate
class CatchExample {
    public static void taskOne(int a) {
        try {
            System.out.println("TASK INITIALISED");
            //Here we will get Arithmetic error and will exit try method
            int num = 32 / a;
            System.out.println(num);
            System.out.println("TASK COMPLETE");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static void taskTwo(int a) {
        try {
            System.out.println("TASK INITIALISED");
            int num = 32 + a;
            System.out.println(num);
            System.out.println("TASK COMPLETE");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void taskThree(int a) {
        //I have wrong exception handling here so programme will terminate
        try {
            System.out.println("TASK INITIALISED");
            //Here we will get Arithmetic error and will exit try method
            int num = 32 / a;
            System.out.println(num);
            System.out.println("TASK COMPLETE");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

public class II_Catch {
    public static void main(String[] args) {
        int a = 0;
        CatchExample.taskOne(a);
        System.out.println();
        CatchExample.taskTwo(a);
        System.out.println();
        CatchExample.taskThree(a);
        System.out.println();
        System.out.println("THIS WILL NOT GET PRINTED");
    }
}
