package II_ArrayInJava;

public class I_Basics {
    public static void main(String[] args) {
        //In C we declare array like int[], why not in Java? In Java arrays are objects of a class so a new array is declared just like we declare an object
        int[] intergerArray = new int[10];
        char[] characterArray = new char[10];
        String[] stringArray = new String[10];
        Boolean[] booleanArray = new Boolean[10];

        //Note I have not initiated the array, note the default values
        for (int i : intergerArray)
            System.out.print(i + " ");

        System.out.println();

        for (char i : characterArray)
            System.out.print(i + " ");

        System.out.println();

        for (String i : stringArray)
            System.out.print(i + " ");

        System.out.println();

        for (boolean i : booleanArray)
            System.out.print(i + " ");
    }
}
