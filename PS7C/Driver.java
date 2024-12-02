
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
        System.out.println(Sieve.findPrimes(100));
        Goldbach.goldbach(100);
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(9, 9, 9));  
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 0, 1));  
        ArrayList<Integer> result = BigInt.BigInts(list1, list2);
        System.out.println(result);
    }
}
