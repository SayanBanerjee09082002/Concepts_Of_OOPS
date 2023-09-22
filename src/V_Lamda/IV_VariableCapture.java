package V_Lamda;

//Variable capture in Java lambdas refers to the ability of a lambda expression to access and use local variables from its enclosing scope.

interface VariableCapture {
    double captureVariable(int x, int y);
}

public class IV_VariableCapture {
    public static void main(String[] args) {
        int outerVariable = 23; //This is the variable
        VariableCapture output = (x, y) -> {
            return (double) x * outerVariable / y;
        };
        System.out.println(output.captureVariable(outerVariable, 12));
    }
}
