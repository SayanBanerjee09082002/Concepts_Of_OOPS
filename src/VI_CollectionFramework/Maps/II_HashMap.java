package VI_CollectionFramework.Maps;

import java.util.Map;
import java.util.HashMap;

//In Hash map, Elements are not stored in any specific order, so iteration order may vary.
//It allows null values and one null key.

public class II_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(4, "Banana");
        map.put(3, "Melon");
        map.put(2, "Grapes");

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

        //Remove the element with key 3
        map.remove(3);

        System.out.println();

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

        map.put(3, "Orange");

        System.out.println();

        //Observe that map is sequenced according to key value
        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

        //Only unique keys are permitted so Orange will get overridden
        map.put(3, "Nuts");

        System.out.println();

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

        //Value duplication is allowed
        map.put(5, "Apple");

        System.out.println();

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

        map.put(6, "Mango");
        map.put(null, null);
        map.put(7, "Mango");
        map.put(8, null);

        System.out.println();

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
