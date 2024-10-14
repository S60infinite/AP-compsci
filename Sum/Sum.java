

/**
 * Ap Compsci
 *
 * MIchael Li
 * Problem set 1b q2
 * jvm java virtual machine
 * jdk java development kit jdk1.8
 * package. java.util.Scanner.class
 * 
 * 8, 4
 * 8 + 4 = 12
 * 8 - 4 = 4
 * 8 * 4 = 32
 * 8 / 4 = 2
 */
import java.util.Scanner;
public class Sum
{
    public static void main (String[] args){ // entry method in a class
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int Number = input.nextInt();
    
        int Hundreds= Number/100; // Hundreds = 5; %

        int Tens=(Number-Hundreds*100)/10;
        int Ones=Number-Hundreds*100-Tens*10;
        int Sum=Hundreds+Tens+Ones;
        System.out.println("sum of "+Number+" digits is "+Sum);
    }
    
    
    }
}