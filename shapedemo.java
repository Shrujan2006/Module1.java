// Base class: Shape
class Shape {
    public void displayShape() {
        System.out.println("This is a generic shape.");
    }
}

// Subclass: Circle
class Circle extends Shape {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }

    // Override displayShape
    @Override
    public void displayShape() {
        System.out.println("This is a Circle.");
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    double length, width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of rectangle
    public void area() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }

    // Override displayShape
    @Override
    public void displayShape() {
        System.out.println("This is a Rectangle.");
    }
}

// Main class to test the program
public class shapedemo {
    public static void main(String[] args) {
        // Create Circle object
        Circle circle = new Circle(5.0);
        circle.displayShape();
        circle.area();

        System.out.println();

        // Create Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.displayShape();
        rectangle.area();
    }
}