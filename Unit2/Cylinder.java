
/**
 * Write a description of class Cylinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cylinder {
    // Instance variables
    private double height;
    private Circle base;

    // Default constructor: sets height to 1 and base radius to 1
    public Cylinder() {
        this.height = 1.0;
        this.base = new Circle(1.0);
    }

    // Constructor with parameters for radius and height
    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    // Method to return a string describing the cylinder
    public String toString() {
        return "Hello, I am a cylinder with a radius of " + base.getRadius() + " and height of " + height;
    }

    // Method to get the radius of the base
    public double getRadius() {
        return base.getRadius();
    }

    // Method to get the height of the cylinder
    public double getHeight() {
        return height;
    }

    // Method to calculate the surface area of the cylinder
    // Surface area = 2 * pi * r^2 (top and bottom) + 2 * pi * r * h (side)
    public double surfaceArea() {
        return 2 * Math.PI * base.getRadius() * (base.getRadius() + height);
    }

    // Method to calculate the volume of the cylinder
    // Volume = pi * r^2 * h
    public double volume() {
        return Math.PI * base.getRadius() * base.getRadius() * height;
    }
}

