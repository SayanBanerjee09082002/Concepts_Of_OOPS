package VI_CollectionFramework.Generics;

//Bounded type parameter is used to restrict the range of types that can be used as arguments when instantiating a generic class or invoking a generic method

//Number makes T take the type of integer, double, float etc. basically the subclasses of Number
//This is an example of upper bounded type parameter
class UpperBoundedExample<T extends Number> {
    private T data;

    public UpperBoundedExample(T data) {
        this.data = data;
    }

    public T getValue() {
        return data;
    }
}



public class IV_BoundTypes {
}
