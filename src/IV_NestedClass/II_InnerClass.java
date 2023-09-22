package IV_NestedClass;

class Outer {
    class Inner1 {
        public int integer;
    }

    class Inner2 {
        private String word;

        Inner2(String word) {
            this.word = word;
        }

        public String getWord() {
            return word;
        }
    }
}

public class II_InnerClass {
    public static void main(String[] args) {
        //Note Iam creating the object of outer class
        //Outer.Inner1 a = new Outer.Inner1();  <- This is illegal as inner classes are not static
        Outer outer = new Outer();
        Outer.Inner1 inner1 = outer.new Inner1();
        inner1.integer = 2;
        Outer.Inner2 inner2 = outer.new Inner2("WORD");

        System.out.println(inner1.integer);
        System.out.println(inner2.getWord());
    }
}
