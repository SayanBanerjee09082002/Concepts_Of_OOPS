package VI_CollectionFramework.ArrayList;

import java.util.ArrayList;

//The ArrayList class implements the List interface.
//It uses a dynamic array to store the duplicate element of different data types.
//The ArrayList class maintains the insertion order.

public class I_Basics {
    public static void main(String[] args) {
        //Primitive data types cannot be used in ArrayList
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Number> numberList = new ArrayList<>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        numberList.add(1);
        numberList.add(1.5);
        numberList.add(2);
        numberList.add(2.5);
        numberList.add(3);

        System.out.println(stringList);
        System.out.println(numberList);

        stringList.add("FOUR");

        numberList.remove(1.5);
        numberList.add(0);
        numberList.remove(2.5);

        System.out.println(stringList);
        System.out.println(numberList);
    }
}
