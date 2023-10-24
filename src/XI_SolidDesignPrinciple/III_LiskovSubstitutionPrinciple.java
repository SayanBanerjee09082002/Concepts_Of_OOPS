package XI_SolidDesignPrinciple;

class Shape {
    // Common code for all shapes

    public double getArea() {
        return 0.0; // Default implementation, to be overridden by subclasses
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}


public class III_LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(7);

        printArea(rectangle); // Output: Area of Rectangle: 50.0
        printArea(square);    // Output: Area of Square: 49.0
    }

    static void printArea(Shape shape) {
        System.out.println("Area of " + shape.getClass().getSimpleName() + ": " + shape.getArea());
    }
}
