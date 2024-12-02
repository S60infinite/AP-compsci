
/**
 * Write a description of class BigInt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class BigInt
{
   public static ArrayList<Integer> BigInts(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int carry = 0;
        int sum = 0;
        int start = 0;
        if (list1.size() < list2.size()) {
            ArrayList<Integer> temp = list1;
            list1 = list2;
            list2 = temp;
        }
        for (int i = list1.size() - 1, j = list2.size() - 1; j >= 0; i--, j--) {
            sum = list1.get(i) + list2.get(j) + carry;
            ans.add(0, sum % 10);  
            carry = sum / 10;  
        }
        for (int i = list1.size() - list2.size() - 1; i >= 0; i--) {
            sum = list1.get(i) + carry;
            ans.add(0, sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            ans.add(0, carry);
        }
        return ans;
    }   
}

