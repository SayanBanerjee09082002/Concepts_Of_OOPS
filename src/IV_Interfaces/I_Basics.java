package IV_Interfaces;

//Interface provide blue-print to the class
//Interface attributes and methods are automatically abstract, public and final

interface Engine {
    //Compulsory to initialize attributes
    boolean canPassengerEnter = false;

    //NOTE: We cannot define method in interface. Also check I didn't used abstract keyword
    void startEngine();

    void stopEngine();
}

interface Compartment {
    boolean canPassengerEnter = true;
}

//Multiple inheritance is possible in-case of Interface
class Train implements Engine, Compartment {
    public String name;
    public int compartments;

    Train(String name, int compartments) {
        this.name = name;
        this.compartments = compartments;
    }

    @Override
    public void startEngine() {
        System.out.println("ENGINE STARTED");
    }

    @Override
    public void stopEngine() {
        System.out.println("ENGINE STOPPED");
    }

    public boolean enginePermissions() {
        return Engine.canPassengerEnter;
    }

    public boolean compartmentPermissions() {
        return Compartment.canPassengerEnter;
    }
}

public class I_Basics {
    public static void main(String[] args) {
        Train t1 = new Train("Sealdah Bikanir Duronto", 16);
        System.out.println(t1.name);
        System.out.println(t1.compartments);
        t1.startEngine();
        t1.stopEngine();
        System.out.println("Can passenger enter engine: " + t1.enginePermissions());
        System.out.println("Can passenger enter compartment: " + t1.compartmentPermissions());
    }
}
