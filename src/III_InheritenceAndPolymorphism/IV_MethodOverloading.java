package III_InheritenceAndPolymorphism;

import java.util.Arrays;

//Same name different data types
class array {
    public static int length(int[] arr) {
        return arr.length;
    }

    public static int[] subArray(int[] arr, int start, int stop) {
        int[] temp = new int[stop - start + 1];
        for (int i = 0; i <= stop - start; i++)
            temp[i] = arr[i + start];
        return temp;
    }

    public static int length(char[] arr) {
        return arr.length;
    }

    public static char[] subArray(char[] arr, int start, int stop) {
        char[] temp = new char[stop - start + 1];
        for (int i = 0; i <= stop - start; i++)
            temp[i] = arr[i + start];
        return temp;
    }
}

public class IV_MethodOverloading {
    //NOTE: This is also called Compile Time Polymorphism
    public static void main(String[] args) {
        int[] integerArray = {1,2,3,4,5,6,7,8,9};
        char[] characterArray = {'a','b','c','d','e','f','g','h','i','j','k'};

        System.out.println("INTEGER");
        System.out.println(array.length(integerArray));
        System.out.println(Arrays.toString(array.subArray(integerArray, 4, 7))); //Arrays.toString() is basically printing array, otherwise we had to use for loop
        System.out.println();
        System.out.println("CHARACTER");
        System.out.println(array.length(characterArray));
        System.out.println(array.subArray(characterArray, 2,8));
    }
}
