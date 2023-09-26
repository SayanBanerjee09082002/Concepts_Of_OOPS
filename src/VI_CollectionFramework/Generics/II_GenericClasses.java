package VI_CollectionFramework.Generics;

//Multiple generics allowed
class GenericClassExample<T1, T2, T3> {
    private T1 data1;
    private T2 data2;
    public T3 data3;

    public GenericClassExample(T1 data1, T2 data2, T3 data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public T1 getData1() {
        return data1;
    }

    public T2 getData2() {
        return data2;
    }
}

public class II_GenericClasses {
    public static void main(String[] args) {
        //If diamond operator is not given it will actually make no sense and generic will act as concrete class
        GenericClassExample example1 = new GenericClassExample("String", 2, false);
        //Try changing data type to make them incompatible
        //NOTE: You cannot use primitive data types in generics
        GenericClassExample<Integer, String, Double> example2 = new GenericClassExample<>(1, "MOVIE", 2.0);
        GenericClassExample<String, String, String> example3 = new GenericClassExample<>("ONE", "TWO", "THREE");

        var var1 = example1.getData1();
        var var2 = example1.getData2();
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(example1.data3);

        System.out.println();

        var var3 = example2.getData1();
        var var4 = example2.getData2();
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(example2.data3);

        System.out.println();

        var var5 = example3.getData1();
        var var6 = example3.getData2();
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(example3.data3);
    }
}
