package III_InheritenceAndPolymorphism;

//Multiple inheritance is not allowed, so we use successive inheritance as shown
class Integer {
    private int integer;

    Integer(int integer) {
        this.integer = integer;
    }

    public void printInteger() {
        System.out.println("Integer = " + integer);
    }

    public int getInteger() {
        return integer;
    }
}

class Word extends Integer {
    private String word;

    Word(String word, int integer) {
        super(integer);
        this.word = word;
    }

    public void printWord() {
        System.out.println("Word = " + word);
        System.out.println("Integer = " + super.getInteger()); //Using super to get parent's attributes
    }

    public String getWord() {
        return word;
    }
}

class Bool extends Word {
    private boolean bool;

    Bool(Boolean bool, String word, int integer) {
        super(word, integer);
        this.bool = bool;
    }

    public void printBool() {
        System.out.println("Boolean = " + bool);
        System.out.println("Word = " + super.getWord());
        System.out.println("Integer = " + super.getInteger()); //Using super to get grandparent's attribute
    }
}


public class II_MultilevelInheritance {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Word b = new Word("Good", 2);
        Bool c = new Bool(true, "Very Good", 3);

        a.printInteger();
        System.out.println();
        b.printWord();
        System.out.println();
        c.printBool();
    }
}
