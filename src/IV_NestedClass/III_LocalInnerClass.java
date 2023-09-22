package IV_NestedClass;

class Example {
    public static void method() {
        class LocalInnerClassA {
            private int num;
            private String word;

            LocalInnerClassA(int num, String word) {
                this.num = num;
                this.word = word;
            }

            public void printData() {
                System.out.println(num);
                System.out.println(word);
            }
        }

        class LocalInnerClassB {
            private int num;
            private String word;

            LocalInnerClassB(int num, String word) {
                this.num = num;
                this.word = word;
            }

            public void printData() {
                System.out.println(num);
                System.out.println(word);
            }
        }

        LocalInnerClassA a = new LocalInnerClassA(2, "A");
        LocalInnerClassB b = new LocalInnerClassB(3, "B");

        a.printData();
        b.printData();

    }
}

public class III_LocalInnerClass {
    public static void main(String[] args) {
        Example.method();
    }
}
