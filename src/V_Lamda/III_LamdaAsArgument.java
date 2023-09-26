package V_Lamda;

interface DoubleGenerator {
    abstract  double generator(double n);
}

public class III_LamdaAsArgument {
    static double adder(DoubleGenerator doubleGenerator, double num1, double num2) {
        return doubleGenerator.generator(num1) + num2;
    }

    public static void main(String[] args) {
        System.out.println(adder((n) -> n, 12, 23));
        System.out.println(adder(
                (n) -> n * Math.random(), 34, 21
        ));
        System.out.println(adder(
                (n) -> {
                    double x = Math.random();
                    x += adder(
                            (y) -> y * Math.random(), 34, 21
                    );
                    return x;
                }, 23, 4
        ));
    }
}
