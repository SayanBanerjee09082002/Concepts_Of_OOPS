package InheritenceAndPolymorphism;

class Alpha {
    //This int cannot be overridden
    public final int numAlpha = 1;
    public String wordAlpha;

    Alpha(String string) {
        this.wordAlpha = string;
    }

    public void printInteger() {
        System.out.println("Called form Alpha " + numAlpha);
    }

    //This method cannot be overridden
    final public void printWord() {
        System.out.println("Called form Alpha " + wordAlpha);
    }
}

//I can extend final class but it cannot be inherited
final class Beta extends Alpha {
    public Boolean bool;

    Beta(Boolean bool, String word) {
        super(word);
        this.bool = bool;
    }

    //FINAL METHODS CANNOT BE OVERRIDDEN
    //final public void printWord() {
    //    System.out.println("Called form Beta" + wordAlpha);
    //}
}

//NOT ALLOWED TO INHERIT FINAL CLASS
//class Gamma extends Beta {
//
//}

class Gamma extends Alpha {
    Gamma(String word) {
        super(word);
    }
}

public class VI_FinalKeyword {
    public static void main(String[] args) {
        Alpha a = new Alpha("Hello");
        Beta b = new Beta(false, "Hi");
        Gamma c = new Gamma("Boi");

        //NOT POSSIBLE numAlpha is final
        //a.numAlpha = 56;
        a.printInteger();
        a.printWord();
        System.out.println();
        System.out.println(b.bool);
        System.out.println(b.numAlpha);
        System.out.println(b.wordAlpha);
        System.out.println();
        System.out.println(c.numAlpha);
        System.out.println(c.wordAlpha);
    }
}
