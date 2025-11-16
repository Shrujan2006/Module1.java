class Cylinder {
    private double radius;
    private double height;

    // Setter methods
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Getter methods
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    // Method to calculate Volume
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate Total Surface Area
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
public class Main {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        // Set values
        c.setRadius(5);
        c.setHeight(10);

        // Print results
        System.out.println("Radius = " + c.getRadius());
        System.out.println("Height = " + c.getHeight());

        System.out.println("Volume = " + c.getVolume());
        System.out.println("Surface Area = " + c.getSurfaceArea());
    }
}
