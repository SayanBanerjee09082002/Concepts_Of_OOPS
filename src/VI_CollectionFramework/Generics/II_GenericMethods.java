package VI_CollectionFramework.Generics;

import java.util.ArrayList;
import java.util.List;

class GenericMethodExample {
    public static <T1, T2, T3> List<String> returnData(T1 data1, T2 data2, T3 data3) {
        List<String> list = new ArrayList<>();
        list.add(data1.toString());
        list.add(data2.toString());
        list.add(data3.toString());
        return list;
    }
}

public class II_GenericMethods {
    public static void main(String[] args) {
        List<String> result1 = GenericMethodExample.returnData(42, "HELL", 3.14);
        List<String> result2 = GenericMethodExample.returnData("BYE", "NOPES", false);
        System.out.println(result1);
        System.out.println(result2);
    }
}
