package VII_ExceptionHandling;

//There are two ways to do it

class MultipleCatchExample {
    public static void taskOne(int a) {
        try {
            int[] array = {1, 2, 3, 4, 5};
            int num = array[a] / a;
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void taskTwo(int a) {
        try {
            int[] array = {1, 2, 3, 4, 5};
            int num = array[a] / a;
            System.out.println(num);
        } catch (NumberFormatException | ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

public class VI_MultipleCatchAction {
    public static void main (String[] args) {
        MultipleCatchExample.taskOne(0);
        MultipleCatchExample.taskOne((int) 2.2);
        MultipleCatchExample.taskOne(6);

        System.out.println();

        MultipleCatchExample.taskTwo(0);
        MultipleCatchExample.taskTwo((int) 2.2);
        MultipleCatchExample.taskTwo(6);
    }

}
