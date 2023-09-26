package VI_CollectionFramework.Maps;

import java.util.TreeMap;
import java.util.Map;

//A map is an object that stores associations between keys and values, or key/value pairs.
//TreeMap is a sorted map implementation that maintains elements in ascending order based on their keys.
//It does not allow null keys but allows null values

public class I_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

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

        map.put(6, null);
        //This is illegal (Run the code to see)
        //map.put(null,null);

        System.out.println();

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
