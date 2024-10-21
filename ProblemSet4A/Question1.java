
/**
 * Write a description of class Questions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Question1
{
   public static void main (String[] args){
       Scanner intScanner  = new Scanner(System.in);
       int x = (int)(Math.random()*100)+1;
       System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
       int k = 1;
       int guess = intScanner.nextInt();
       while(x!=guess){
                if (x<guess){
                    System.out.println("Nope, that guess is too high.");
                }else if(x>guess){
                    System.out.println("Nope, that guess is too low.");
                } 
                guess = intScanner.nextInt();
                k++;
       }
       System.out.println("You guessed it! It took you "+k+" tries");   
           
       }
   }
   

