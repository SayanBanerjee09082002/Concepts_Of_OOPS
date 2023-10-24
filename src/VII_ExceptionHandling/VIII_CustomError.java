package VII_ExceptionHandling;

class CustomExceptionExample extends Exception {
    public CustomExceptionExample(String message) {
        super(message);
    }

    public CustomExceptionExample(Throwable cause) {
        super(cause);
    }

    public CustomExceptionExample(String message, Throwable cause) {
        super(message, cause);
    }
}

public class VIII_CustomError {
    private static void exampleOne() {

    }

    private static void exampleTwo() throws CustomExceptionExample {

    }

    public static void main(String[] args) {
        try {
            System.out.println("This will be printed");
            throw new CustomExceptionExample("Custom Error");
        }
        catch (CustomExceptionExample e) {
            System.out.println(e);
        }

        try {
            int a = 23/0;
        }
        catch (ArithmeticException e) {

        }
    }
}
