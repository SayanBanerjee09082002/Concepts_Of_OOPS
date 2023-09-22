package V_Lamda;

//Iam defining the abstract method in block lambda
interface EvenNumberChecker {
    boolean isEven(int n);
}
public class II_BlockLamda {
    public static void main(String[] args) {
        EvenNumberChecker evenNumberChecker = (n) -> {
            return n % 2 == 0;
        };

        System.out.println("23 is even: " + evenNumberChecker.isEven(23));
        System.out.println("24 is even: " + evenNumberChecker.isEven(24));
        System.out.println("-21 is even: " + evenNumberChecker.isEven(-21));
    }
}
