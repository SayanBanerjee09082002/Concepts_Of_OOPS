package VI_CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;

public class II_IteratorsInArrayList {
    static int getCapacity(ArrayList<?> arrayList) throws Exception {
        if (arrayList == null) {
            return 0;
        }

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);

        return ((Object[]) field.get(arrayList)).length;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        //This method ensure allocation of a minimum capacity to Array List
        list.ensureCapacity(16);

        for (int i = 0; i <= 9; i++)
            list.add(i);

        // Check the size and capacity
        System.out.println(getCapacity(list));       // Size: 3// Capacity: 10 (example capacity, may vary)

        //By default, when you add elements to an ArrayList, it may allocate more memory than needed to accommodate future additions efficiently. trimToSize() removes this extra memory
        list.trimToSize();

        // Check the size and capacity again
        System.out.println("Size after trim: " + list.size());       // Size after trim: 3// Capacity after trim: 3
    }
}
