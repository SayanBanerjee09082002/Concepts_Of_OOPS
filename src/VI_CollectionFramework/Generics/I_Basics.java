package VI_CollectionFramework.Generics;

import java.util.ArrayList;
import java.util.List;

//VI_CollectionFramework.Generics refer to a feature of the language that allows you to create classes, interfaces, and methods that operate on types as parameters
//VI_CollectionFramework.Generics adds type safety, ie, you cannot add any other data type to a particular attribute

public class I_Basics {
    //If you wonder, list basically is an array which can store multiple data types at different indexes
    //<> or the diamond operator makes a class, method, inter face etc. generic
    public static void main(String[] args) {
        List<Integer> genericList = new ArrayList<>();
        List nonGenericList = new ArrayList();

        genericList.add(4);
        genericList.add(5);
        //This will throw error
        //genericList.add("ERROR");

        //Multiple data types can be entered (no type safety)
        nonGenericList.add(2);
        nonGenericList.add(true);
        nonGenericList.add("NO ERROR");

        System.out.println(genericList);
        System.out.println(nonGenericList);
    }
}
