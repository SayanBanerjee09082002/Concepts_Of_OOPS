package II_ArrayInJava;

import java.util.Arrays;

public class II_ArrayInitialisation {
    public static void main(String[] args) {
        //Here's how can we initialize an array via hardcode
        int[] integerArray = {1, 2, 3, 4, 5};
        char[] characterArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};
        String[] stringArray = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight"};
        Boolean[] booleanArray = {true, true, false, true, false, false};

        //Here is how u can initialize an array without hardcoding
        double[] doubleArray = new double[12];
        for (int i = 0; i < 12; i++)
            doubleArray[i] = Math.random() * 1000;

        //Notice how I printed array without using a loop
        System.out.print(Arrays.toString(integerArray) + '\n');
        System.out.print(Arrays.toString(characterArray) + '\n');
        System.out.print(Arrays.toString(stringArray) + '\n');
        System.out.print(Arrays.toString(booleanArray) + '\n');
        System.out.print(Arrays.toString(doubleArray));
    }
}
