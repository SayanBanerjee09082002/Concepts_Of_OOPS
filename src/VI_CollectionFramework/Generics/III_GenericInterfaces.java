package VI_CollectionFramework.Generics;

interface GenericInterface<T1, T2, T3> {
    //You cannot use generic attribute in interface
    T2 methodOne(T1 data);

    T3 methodTwo(T2 data);

    default void defaultMethod(T1 data1, T3 data2) {
        System.out.println(data1);
        System.out.println(data2);
    }
}

public class III_GenericInterfaces {
    public static void main(String[] args) {
        int num1 = 2;
        double num2 = 6.32;
        GenericInterface<Integer, Double, Integer> genericInterface = new GenericInterface<>() {
            public Double methodOne(Integer num) {
                return num * Math.random();
            }

            public Integer methodTwo(Double num) {
                return num.intValue();
            }
        };

        System.out.println(genericInterface.methodOne(num1));
        System.out.println(genericInterface.methodTwo(num2));
        genericInterface.defaultMethod(num1, num1 * 10);
    }
}
