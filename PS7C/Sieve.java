
/**
 * Sieve of Eratosthenes 
 *
 * Michael Li
 * AP Computer Science
 */
import java.util.*;
public class Sieve
{
        public static ArrayList<Integer> findPrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i < isPrime.length; i++) {
        isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

}
 
