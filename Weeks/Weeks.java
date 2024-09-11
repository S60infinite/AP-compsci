
/**
 * Ap Compsci
 *
 * MIchael Li
 * Problem set 1b q3
 */
import java.util.Scanner;
public class Weeks
{
    public static void main (String[]args){
       Scanner input= new Scanner(System.in);
        System.out.println("Enter amount of days");
        int totalDays = input.nextInt();
        int weeks= totalDays/7;
        int Days= totalDays%7;
       System.out.println(+totalDays+ " Days is "+ weeks + " weeks and " +Days+" days");
       

       
       
       
       
       
    }
}
