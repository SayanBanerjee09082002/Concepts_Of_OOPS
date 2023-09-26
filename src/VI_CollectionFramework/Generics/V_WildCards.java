package VI_CollectionFramework.Generics;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class V_WildCards {
    private static void unboundedWildCard(List<?> list) {
        System.out.println(list);
    }

    private static void upperBoundedWildCard(List<? extends Number> list) {
        System.out.println(list);
    }

    private static void lowerBoundedWildCard(List<? super Integer> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Number> list2 = Arrays.asList(1.1, 2, 3.52);
        List<Double> list3 = Arrays.asList(1.1, 2.2, 3.3);
        List<String> list4 = Arrays.asList("s", "j", "r");

        unboundedWildCard(list1);
        unboundedWildCard(list2);
        unboundedWildCard(list3);
        unboundedWildCard(list4);

        System.out.println();

        upperBoundedWildCard(list1);
        upperBoundedWildCard(list2);
        upperBoundedWildCard(list3);
        //This is illegal as String is not subclass of Number
        //upperBoundedWildCard(list4);

        System.out.println();

        lowerBoundedWildCard(list1);
        lowerBoundedWildCard(list2);
        //Double is the sibling of Integer not super class so illegal
        //lowerBoundedWildCard(list3);
        //lowerBoundedWildCard(list4);
    }
}
