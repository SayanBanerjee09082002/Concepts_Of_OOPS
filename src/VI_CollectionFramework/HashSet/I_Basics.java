package VI_CollectionFramework.HashSet;

import java.util.HashSet;

//Hash Set is basically Array List where duplication is prevented, entry sequence is not recorded and data is stored in the order of hash code

public class I_Basics {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("John");
        hashSet.add("Halsey");
        hashSet.add("Linda");
        hashSet.add("Keys");
        hashSet.add("Lassky");

        //Note the order of output
        System.out.println(hashSet);

        hashSet.add("Halsey");

        //Note duplicate element is not added
        System.out.println(hashSet);

        hashSet.remove("Keys");
        hashSet.add("Aman");

        //Now note the order of hash code
        System.out.println();
        for (String element : hashSet)
            System.out.println(element + "\t" + element.hashCode());
    }
}
