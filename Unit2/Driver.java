
/**
 * Write a description of class driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver {
    public static void main(String[] args) {
        // Test Circle class (from previous part)
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Circumference: " + circle1.circumference());
        System.out.println("Area: " + circle1.area());

        Circle circle2 = new Circle(5.0);
        System.out.println(circle2.toString());
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Circumference: " + circle2.circumference());
        System.out.println("Area: " + circle2.area());

        // Test Cylinder class
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1.toString());
        System.out.println("Base Radius: " + cylinder1.getRadius());
        System.out.println("Height: " + cylinder1.getHeight());
        System.out.println("Surface Area: " + cylinder1.surfaceArea());
        System.out.println("Volume: " + cylinder1.volume());

        Cylinder cylinder2 = new Cylinder(3.0, 7.0);
        System.out.println(cylinder2.toString());
        System.out.println("Base Radius: " + cylinder2.getRadius());
        System.out.println("Height: " + cylinder2.getHeight());
        System.out.println("Surface Area: " + cylinder2.surfaceArea());
        System.out.println("Volume: " + cylinder2.volume());
    }
}

