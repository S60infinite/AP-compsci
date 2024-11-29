
/**
 * Driver
 *
 * Michael
 * ps7c
 */
import java.util.*;
public class Driver
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer n to find all prime numbers up to n. ");
        int n = scanner.nextInt();
        ArrayList<Integer> primes = Sieve.findPrimes(n);
        System.out.println("Prime numbers up to " + n + ": " + primes);
        System.out.println("Goldbach Conjecture");
        Goldbach.goldbach(n); 
    
    }
}
