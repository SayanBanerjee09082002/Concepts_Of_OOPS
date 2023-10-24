package IX_ObjectClass;

class CloningExample implements Cloneable {
    private String word;
    private int number;

    CloningExample (String word, int number) {
        this.word = word;
        this.number = number;
    }

    public void changeWord(String newWord) {
        this.word = newWord;
    }

    public void changeNumber(int newNumber) {
        this.number = newNumber;
    }

    public void getData() {
        System.out.println(this.word + "\t" + this.number);
    }

    //Shallow cloning creates a new object and then copies the non-static fields of the current object to the new one. However, if the field is a reference to an object, the reference is copied, not the actual object.
    //This means changes to the objects referred to will be reflected in both the original and cloned objects.
    protected Object shallowClone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Deep cloning creates a new object and then recursively copies all fields, including the objects referenced by the current object.
    //Changes in the original object do not affect the cloned one.
    protected Object deepClone() throws CloneNotSupportedException {
        CloningExample cloningExample = (CloningExample) super.clone();
        return cloningExample;
    }
}

public class II_Cloning {
    public static void main (String[] args) {
        CloningExample original = new CloningExample("WORD", 1);
        CloningExample shallowClone;
        CloningExample deepClone;

        try {
            shallowClone = (CloningExample) original.shallowClone();
            deepClone = (CloningExample) original.deepClone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        original.changeWord("NEW WORD");
        shallowClone.changeNumber(2);

        original.getData();
        shallowClone.getData();
        deepClone.getData();
    }
}