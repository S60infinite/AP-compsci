
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    public class Circle {
    // Instance variable
    private double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to return a string describing the circle
    public String toString() {
        return "Hello, I am a circle with a radius of " + radius;
    }

    // Method to get the radius of the circle
    public double getRadius() {
        return radius;
    }

    // Method to calculate the circumference of the circle
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate the area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }
}


