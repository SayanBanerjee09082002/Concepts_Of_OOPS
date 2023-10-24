package XII_ObjectModel.CreationalDesignPattern;

// Singleton pattern is to ensure that a class has only one instance and to provide a global point of access to that instance.

class SingletonExample {
    private int timesInstantiated;
    private String message;

    public SingletonExample(int timesInstantiated, String message) {
        this.timesInstantiated = timesInstantiated;
        this.message = message;
    }

    private static class SingletonExampleHolder {
        private  static final SingletonExample INSTANCE = new SingletonExample(0, "Default Message");
    }

    public static SingletonExample getInstance(int timesInstantiated, String message) {
        SingletonExampleHolder.INSTANCE.timesInstantiated = timesInstantiated;
        SingletonExampleHolder.INSTANCE.message = message;
        return SingletonExampleHolder.INSTANCE;
    }

    public void printData() {
        System.out.println(timesInstantiated + "   " + message);
    }
}

public class I_SingletonPattern {
    public static void main (String[] args) {
        SingletonExample singleton = SingletonExample.getInstance(1, "User message");

        singleton.printData();

        //New data will override old data
        SingletonExample singleton2 = SingletonExample.getInstance(2, "User message 2");
        singleton.printData();
        singleton2.printData();
    }
}
