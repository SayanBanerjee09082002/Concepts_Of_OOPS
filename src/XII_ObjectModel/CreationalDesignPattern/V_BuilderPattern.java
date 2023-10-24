//package XII_ObjectModel;
//
////The Builder Design Pattern is a creation pattern that provides a way to construct a complex object step by step. It separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
//
//// Builder interface is basically a manual that names all steps in product creation
//interface Builder {
//    String model(String model);
//
//    void color(String color);
//
//    void doors(int doors);
//
//    void engine(String engine);
//
//    void type(String type);
//}
//
//// Director writes the steps mentioned in the interface
//class Director {
//    public Car buildMustang(Builder builder) {
//        builder.model("Mustang GT");
//        builder.color("Yellow");
//        builder.doors(2);
//        builder.engine("V8");
//        builder.type("Sport");
//        return new Car(builder);
//    }
//
//    public Bus buildSchoolBus(Builder builder) {
//        builder.model("School Bus");
//        builder.color("Yellow");
//        builder.doors(2); // School buses often have 2 doors
//        builder.engine("Diesel");
//        builder.type("School Bus");
//        return new Bus(builder);
//    }
//}
//
//// CarBuilder follows the steps in the interface defined by the director and makes the product
//class CarBuilder implements Builder {
//    private String model;
//    private String color;
//    private int doors;
//    private String engine;
//    private String type;
//
//    @Override
//    public void model(String model) {
//        this.model = model;
//    }
//
//    @Override
//    public void color(String color) {
//        this.color = color;
//    }
//
//    @Override
//    public void doors(int doors) {
//        this.doors = doors;
//    }
//
//    @Override
//    public void engine(String engine) {
//        this.engine = engine;
//    }
//
//    @Override
//    public void type(String type) {
//        this.type = type;
//    }
//
//    public Car build() {
//        return new Car(this);
//    }
//}
//
//// BusBuilder follows the steps in the interface defined by the director and makes the product
//class BusBuilder implements Builder {
//    private String model;
//    private String color;
//    private int doors;
//    private String engine;
//    private String type;
//
//    @Override
//    public void model(String model) {
//        this.model = model;
//    }
//
//    @Override
//    public void color(String color) {
//        this.color = color;
//    }
//
//    @Override
//    public void doors(int doors) {
//        this.doors = doors;
//    }
//
//    @Override
//    public void engine(String engine) {
//        this.engine = engine;
//    }
//
//    @Override
//    public void type(String type) {
//        this.type = type;
//    }
//
//    public Bus build() {
//        return new Bus(this);
//    }
//}
//
//class Car {
//    private String model;
//    private String color;
//    private int doors;
//    private String engine;
//    private String type;
//
//    public Car(Builder builder) {
//        this.model = builder.model;
//        this.color = builder.color;
//        this.doors = builder.doors;
//        this.engine = builder.engine;
//        this.type = builder.type;
//    }
//
//    public void startCar() {
//        System.out.println("Vroom");
//    }
//}
//
//class Bus {
//    private String model;
//    private String color;
//    private int doors;
//    private String engine;
//    private String type;
//
//    public Bus(Builder builder) {
//        this.model = builder.model;
//        this.color = builder.color;
//        this.doors = builder.doors;
//        this.engine = builder.engine;
//        this.type = builder.type;
//    }
//
//    public void startBus() {
//        System.out.println("Broom");
//    }
//}
//
//public class V_BuilderPattern {
//    public static void main(String[] args) {
//        // Create Car using CarBuilder
//        CarBuilder carBuilder = new CarBuilder();
//        Director carDirector = new Director();
//        Car myCar = carDirector.buildMustang(carBuilder);
//        myCar.startCar();
//
//        // Create Bus using BusBuilder
//        BusBuilder busBuilder = new BusBuilder();
//        Director busDirector = new Director();
//        Bus myBus = busDirector.buildSchoolBus(busBuilder);
//        myBus.startBus();
//    }
//}
