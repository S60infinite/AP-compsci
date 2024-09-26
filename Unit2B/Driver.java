
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Driver{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      StringTools sTools = new StringTools();

    System.out.println("lastLetter test cases:");
      System.out.println("Enter a word with at least one character: ");
      String answer1 = input.nextLine();
    System.out.println("The last letter is " + sTools.lastLetter(answer1));
    System.out.println("---------------------");

      Scanner input = new Scanner(System.in);
      StringTools sTools = new StringTools();

    System.out.println("Phone Number Syntax");
      System.out.println("Enter a phone number ");
      String answer1 = input.nextLine();
    System.out.println(sTools.formatPhoneNumber(answer1));
    
}
}