package III_InheritenceAndPolymorphism;

//Abstract class will provide framework to other classes. They itself cannot be called
//Abstract class can contain both concrete and abstract methods

abstract class Polygone {
    int sides;

    Polygone(int sides) {
        this.sides = sides;
    }

    int getSides() {
        return sides;
    }

    //Concrete Method
    public void printDiagonals() {
        System.out.println("Number of diagonals = " + sides * (sides - 3) / 2);
    }

    //Abstract Method, compulsory to define
    abstract void printArea();
}

class Rectangle extends Polygone {
    double length, breadth;

    Rectangle(int sides, double length, double breadth) {
        super(sides);
        this.length = length;
        this.breadth = breadth;
    }


    //If I don't define printArea() error will be thrown as method was abstract
    void printArea() {
        System.out.println("Area = " + length * breadth);
    }

    void printPerimeter() {
        System.out.println("Perimeter = " + 2 * (length + breadth));
    }
}

class Triangle extends Polygone {
    double base, height;

    Triangle(int sides, double base, double height) {
        super(sides);
        this.base = base;
        this.height = height;
    }

    void printArea() {
        System.out.println("Area = " + 0.5 * base * height);
    }
}


public class V_AbstractClasses {
    public static void main(String[] args) {
        //This will give error
        //Polygone polygone = new Polygon();

        Rectangle rectangle = new Rectangle(4, 6.2, 8.0);
        Triangle triangle = new Triangle(3, 8.0, 6.2);

        System.out.println("Sides = " + rectangle.getSides());
        rectangle.printDiagonals();
        rectangle.printArea();
        rectangle.printPerimeter();
        System.out.println();
        System.out.println("Sides = " + triangle.getSides());
        triangle.printDiagonals();
        triangle.printArea();
    }
}
