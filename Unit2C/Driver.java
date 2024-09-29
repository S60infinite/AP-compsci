

/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Driver
{
    public static void main (String[] args)
    {
        OrderedPair pair1= new OrderedPair();
        OrderedPair pair2 = new OrderedPair(3.0,4.0);
        System.out.println("OrderedPair 1:" + pair1);
        System.out.println("OrderedPair 2:" + pair2);
        System.out.println("pair1 X:" + pair1.getX()+",Y:"+pair1.getY());
        System.out.println("pair2 X:" + pair1.getX()+",Y:"+pair2.getY());
    
        Formula Formula = new Formula();
        Scanner scanner = new Scanner(System.in);
         // Quadratic Formula
        System.out.println("Find the roots of ax^2 + bx + c. Enter a, b, and c:");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        OrderedPair roots = Formula.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for " + a + "x^2 + " + b + "x + " + c + " are " + roots + ".");
        
        // Slope formula
        System.out.println("Find the slope between points (x1,y1) and (x2,y2)");
        System.out.print("x1:");
        double x1 = scanner.nextDouble();
        System.out.print("x2:");
        double x2 = scanner.nextDouble();
        System.out.print("y1:");
        double y1 = scanner.nextDouble();
        System.out.print("y2:");
        double y2 = scanner.nextDouble();
        OrderedPair pointA = new OrderedPair(x1, y1);
        OrderedPair pointB = new OrderedPair(x2, y2);
        double slope=Formula.findSlope(pointA, pointB);
        System.out.println("the slope is "+slope);
        
        //Midpoint formula
        System.out.println("find the midpoint between points (x1,y1) and (x2,y2)");
        OrderedPair midpoint = Formula.findMidpoint(pointA, pointB);
        System.out.println("The midpoint is"+midpoint);
        
        //Arithmetic Sum
        System.out.println("find the sum of the arithmetic seqenece");
        System.out.print("K terms");
        int k = scanner.nextInt();
        System.out.print("start of sequence");
         System.out.print("Starts with: ");
        double firstTerm = scanner.nextDouble();
        System.out.print("difference: ");
        double difference = scanner.nextDouble();
        double arithmeticSum = Formula.findArithmeticSeriesSum(firstTerm, difference, k);
        System.out.println("The sum of the first " + k + " terms of an arithmetic series that starts with " + firstTerm + " and increases by " + difference + " is " + arithmeticSum + ".");
        
        //Geometric Sum
        System.out.println("find the sum of the geometric sequence");
        System.out.println("ratio");
        double ratio = scanner.nextDouble();
        System.out.println("First Term");
        double Term1 = scanner.nextDouble();
        System.out.println("how many terms");
        int amount = scanner.nextInt();
        double geometricSum = Formula.findGeometricSeriesSum(Term1, ratio, amount);
        System.out.println("the sum of the geometric series is "+geometricSum);
        
        //Dice
        System.out.println("how many sides does your die have?");
        int sides = scanner.nextInt();
        int rollResult = Formula.rollDie(sides);
        System.out.println("you get " +rollResult);
        
        
        
        
        
        
        
        
        
    }
}
