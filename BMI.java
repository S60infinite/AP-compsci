
/**
 * Ap Compsci
 *
 * MIchael Li
 * Problem set 1b q2
 */
import java.util.Scanner;
public class BMI
{
    public static void main (String[]args){
       Scanner input= new Scanner(System.in);
        System.out.println("Enter a weight in KG");
        double weight=input.nextDouble();
        System.out.println("Enter a height in meters");
       double height=input.nextDouble();
       double BMI=weight/height/height;
       System.out.println("BMI is "+ BMI);
       

       
       
       
       
       
    }
}
