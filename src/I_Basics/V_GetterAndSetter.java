package I_Basics;

//NOTES:
//1. Never declare getter and setter private. It makes no sense
//2. this keyword is used to point toward the attribute of the class, ie this.word = word, here this.word is the attribute 'word' not the functional argument 'word'
class GetterSetterExample {
    private int number;
    private String word;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getNumber() {
        return number;
    }

    public String getWord() {
        return word;
    }
}

public class V_GetterAndSetter {
    public static void main(String[] args) {
        GetterSetterExample example = new GetterSetterExample();

        example.setNumber(21);
        example.setWord("Hello");

        System.out.println(example.getNumber());
        System.out.println(example.getWord());
    }
}
