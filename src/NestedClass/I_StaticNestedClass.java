package NestedClass;


class OuterClass {
    static class StaticInnerClass1 {
        public static int num = 2;
    }

    static class StaticInnerClass2 {
        private static String word;

        StaticInnerClass2(String word) {
            StaticInnerClass2.word = word;
        }

        static void print() {
            System.out.println(word);
        }
    }

    //This class cannot be access form outside of this class as it is private
    static class Private {
        private final boolean bool;
        private final double rational = 12.5;

        Private(boolean bool) {
            this.bool = bool;
        }

        boolean getBoolean() {
            return bool;
        }
    }

    //By this way you can instantiate this private class
    OuterClass(boolean bool) {
        Private pvt = new Private(bool);
    }
}

class OuterClass2 {
    static class StaticInnerClass1 {
        public int num = 2;
    }

    static class StaticInnerClass2 {
        private final String word;

        StaticInnerClass2(String word) {
            this.word = word;
        }

        void print() {
            System.out.println(word);
        }
    }

    private static class Private {
        private final boolean bool;
        private final double rational = 12.5;

        Private(boolean bool) {
            this.bool = bool;
        }

        boolean getBoolean() {
            return bool;
        }
    }

    OuterClass2(boolean bool) {
        OuterClass.Private pvt = new OuterClass.Private(bool);
    }
}

public class I_StaticNestedClass {
    public static void main(String[] args) {
        //Note Iam not creating the object of outer class
        OuterClass.StaticInnerClass2 innerClass2 = new OuterClass.StaticInnerClass2("INNER");
        //INNER2 will override INNER due to static keyword (static keyword is shared with all objects of the class)
        OuterClass.StaticInnerClass2 innerClass3 = new OuterClass.StaticInnerClass2("INNER2");
        //This is illegal as the inner class is private
        //OuterClass.Private private = new OuterClass.Private();
        OuterClass outerClass = new OuterClass(true);
        OuterClass2.StaticInnerClass1 privateInnerClass1 = new OuterClass2.StaticInnerClass1();
        OuterClass2.StaticInnerClass2 privateInnerClass2 = new OuterClass2.StaticInnerClass2("PRIVATE INNER");
        OuterClass2.StaticInnerClass2 privateInnerClass3 = new OuterClass2.StaticInnerClass2("PRIVATE INNER2");

        //Observe the output
        System.out.println(OuterClass.StaticInnerClass1.num);
        OuterClass.StaticInnerClass2.print();
        innerClass2.print();
        innerClass3.print();
        System.out.println(privateInnerClass1.num);
        privateInnerClass2.print();
        privateInnerClass3.print();
    }
}
