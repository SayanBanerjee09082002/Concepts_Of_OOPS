package VII_ExceptionHandling;

public class VII_NestedCatch {
    private static void task(int a) {
        try {
            int num = 32 / a;
            System.out.println(a);
            try {
                int[] array = {1, 2, 3, 4, 5};
                System.out.println(array[num]);
            } finally {
                //Finally is important cause with try you need a finally or catch
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        task(0);
        System.out.println();
        task(2);
        System.out.println();
        task(32);
    }
}
