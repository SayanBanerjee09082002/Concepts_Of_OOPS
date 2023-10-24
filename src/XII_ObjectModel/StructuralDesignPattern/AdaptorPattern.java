package XII_ObjectModel.StructuralDesignPattern;

//The Adapter Design Pattern is a structural pattern that allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting the interface of a class into another interface that a client expects.

class Adaptee {
    public String getData() {
        return "Message form the Adaptee";
    }
}

class Adpater {
    String message;

    Adpater (String message) {
        this.message = message;
    }

    public static Adpater parse(Adaptee adaptee) {
        return new Adpater(adaptee.getData());
    }
}

class Client {
    Adpater adpater;

    Client (Adpater adpater) {
        this.adpater = adpater;
    }

    public void message() {
        System.out.println(adpater.message);
    }
}

public class AdaptorPattern {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Client client = new Client(Adpater.parse(adaptee));
        client.message();
    }
}
