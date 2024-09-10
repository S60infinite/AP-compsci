
/**
 * AP Computer Science
 * Michael Li
 * First Project
 */
import java.util.Scanner;

public class Helloworld
{
  public static void main (String[] args) {        
        Scanner in= new Scanner(System.in);
        System.out.print("What is your favorite course at school ");
        String course=in.nextLine();
        System.out.println("What is your favorite tv show" );
        String show=in.nextLine();
        System.out.println("How many hours do you spend studying each day");
        int studyhours=in.nextInt();
        System.out.println("How many hours do you spend watching shows each day");
        int showhours=in.nextInt();
        System.out.println("Summary: Favourite show: "+show+", Favourite course: "+course+", Hours studied per day: "+studyhours+", Hours spent watching shows each day: "+studyhours);
        
        System.out.println("Hours studying per day: "+studyhours+", Hours watching shows per day;"+showhours);
        System.out.println("total hours studied per week: "+studyhours*7+", Total hours spent watching shows per week: "+showhours*7);
        
        
        
        

    }
}


