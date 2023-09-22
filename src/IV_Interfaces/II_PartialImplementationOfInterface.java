package IV_Interfaces;

interface DailyTasks {
    void wakeUp();

    void shower();

    void doBreakfast();

    void doLunch();

    void doDinner();

    void sleep();
}

//Use abstract if you don't want to implement all methods
abstract class Routine implements DailyTasks {
    public void wakeUp() {
        System.out.println("WAKE UP");
    }

    public void doLunch() {
        System.out.println("DO LUNCH");
    }

    public void doDinner() {
        System.out.println("DO DINNER");
    }

    public void sleep() {
        System.out.println("SLEEP");
    }
}

//You have to declare the implement abstract method of interface later in concrete class
class ImplementRoutine extends Routine {
    String statusShower;
    String statusBreakfast;

    ImplementRoutine(String statusShower, String statusBreakfast) {
        this.statusShower = statusShower;
        this.statusBreakfast = statusBreakfast;
    }

    public void shower() {
        System.out.println(statusShower);
    }

    public void doBreakfast() {
        System.out.println(statusBreakfast);
    }
}

public class II_PartialImplementationOfInterface {
    public static void main(String[] args) {
        ImplementRoutine r1 = new ImplementRoutine("SKIPPED SHOWER", "SKIPPED BREAKFAST");
        ImplementRoutine r2 = new ImplementRoutine("SHOWER", "DO BREAKFAST");

        r1.wakeUp();
        r1.shower();
        r1.doBreakfast();
        r1.doLunch();
        r1.doDinner();
        r1.sleep();
        System.out.println();
        r2.wakeUp();
        r2.shower();
        r2.doBreakfast();
        r2.doLunch();
        r2.doDinner();
        r2.sleep();
    }
}
