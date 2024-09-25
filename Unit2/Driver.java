
/**
 * Write a description of class driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver {
    public static void main(String[] args) {
        // Create circle using default constructor
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Circumference: " + circle1.circumference());
        System.out.println("Area: " + circle1.area());

        // Create circle using parameterized constructor
        Circle circle2 = new Circle(5.0);
        System.out.println(circle2.toString());
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Circumference: " + circle2.circumference());
        System.out.println("Area: " + circle2.area());
    }
}
