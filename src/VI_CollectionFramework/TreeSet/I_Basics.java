package VI_CollectionFramework.TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class I_Basics {
    public static void main(String[] args) {
        // Create a TreeSet to store strings
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("John");
        treeSet.add("Halsey");
        treeSet.add("Linda");
        treeSet.add("Keys");
        treeSet.add("Lassky");
        treeSet.add("Lassky");
        treeSet.add("Linda");

        // Print the elements in sorted order
        System.out.println(treeSet);

        // Add a duplicate element (it will not be added)
        treeSet.add("Halsey");
        System.out.println(treeSet);

        // Remove an element and add a new one
        treeSet.remove("Keys");
        treeSet.add("Aman");

        // Print the elements and their hash codes
        System.out.println();
        for (String element : treeSet) {
            System.out.println(element + "\t" + element.hashCode());
        }
    }
}
