

/**
 * Ap Compsci
 *
 * MIchael Li
 * Problem set 1b q4
 */
import java.util.Scanner;
public class Price
{
    public static void main (String[]args){
       Scanner input= new Scanner(System.in);
        System.out.println("Enter price");
        double price=input.nextDouble();
        System.out.println("Enter Quantity");
       double quantity=input.nextDouble();
       System.out.println("Enter tax rate");
       double tax=input.nextDouble();
       double totalPrice= price*quantity*(tax/100+1);      
       System.out.println("total price is "+ totalPrice);
       

       
       
       
       
       
    }
}