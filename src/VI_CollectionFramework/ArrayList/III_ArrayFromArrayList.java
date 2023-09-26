package VI_CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class III_ArrayFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Contents of list: " + list);

        Integer ia[] = new Integer[list.size()];
        list.toArray(ia);

        int sum = 0;
        for (int i : ia)
            sum += i;

        System.out.println(Arrays.toString(ia));
        System.out.println("Sum is: " + sum);
    }
}
