
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
    System.out.println("Enter a word with at least one character: ");
    String answer1 = input.nextLine();
    System.out.println("The last letter is " + sTools.lastLetter(answer1));
    System.out.println("---------------------");
    System.out.println("Type phone number");
    String answer2 = input.nextLine();
    System.out.println(sTools.formatPhoneNumber(answer2));
    System.out.println("Type at least three letters with odd amount of letters");
    String answer3 = input.nextLine();
    System.out.println(sTools.middleThree(answer3));
    System.out.println("Type a word");
    String answer4 = input.nextLine();
    System.out.println(sTools.swapLastTwo(answer4));
    
    
}
}