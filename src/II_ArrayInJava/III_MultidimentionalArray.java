package II_ArrayInJava;

import java.util.Arrays;

public class III_MultidimentionalArray {
    public static void main(String[] args) {
        //2D ARRAYS
        int[][] matrixA = new int[3][2];
        int[][] matrixB = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++)
                matrixA[i][j] = (int) (Math.random() * 1000);

        //Notice the output
        System.out.println("PRINTING MATRIX A");
        System.out.println();
        System.out.println(Arrays.toString(matrixA));
        System.out.println();
        for (int i = 0; i < 3; i++)
            System.out.println(Arrays.toString(matrixA[i]));
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(matrixA[i][j] + "\t");
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("PRINTING MATRIX B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrixB[i][j] + "\t");
            System.out.println();
        }
    }
}
