public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        System.out.println("Fraction 1: " + f1);
        System.out.println("Fraction 2: " + f2);
        System.out.println("Addition: " + Fraction.add(f1, f2));
        System.out.println("Subtraction: " + Fraction.subtract(f1, f2));
        System.out.println("Multiplication: " + Fraction.multiply(f1, f2));
        System.out.println("Division: " + Fraction.divide(f1, f2));
    }
}
