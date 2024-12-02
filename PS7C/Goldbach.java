
/**
 * Goldbach Conjecture
 *
 * Michael
 * APCSA
 */
import java.util.*;
public class Goldbach
{
        public static void goldbach(int n) {
        if (n <= 2|| n % 2 != 0) {
            System.out.println("Input must be an even number greater than 2.");
            return;
        }
        ArrayList<Integer> primes = Sieve.findPrimes(n);
       for (int i = 0; i < primes.size(); i++) {
            int prime = primes.get(i);
            int complement = n - prime;
            if (primes.contains(complement)) {
                System.out.println(n + " = " + prime + " + " + complement);
                break;
            }
        }
    }
}