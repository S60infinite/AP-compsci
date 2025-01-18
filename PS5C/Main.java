
/**
 * Write a description of class FractionDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //PS5A
        Fraction f1=new Fraction(1, 2);
        Fraction f2=new Fraction(1, 3);
        System.out.println("Fraction 1:"+f1);
        System.out.println("Fraction 2:"+f2);
        System.out.println("Addition:"+Fraction.add(f1, f2));
        System.out.println("Subtraction:"+Fraction.subtract(f1, f2));
        System.out.println("Multiplication:"+Fraction.multiply(f1, f2));
        System.out.println("Division:"+Fraction.divide(f1, f2));
        //Pi
        Fraction MILU=new Fraction(355,113);
        double EPSILON=Math.abs(Math.PI-MILU.toDouble());
        int numerator=MILU.getNum();
        int denominator=MILU.getDenom();
        Fraction approximation=new Fraction(numerator,denominator);
        while (Math.abs(Math.PI-approximation.toDouble())>=EPSILON) {
            if (approximation.toDouble() < Math.PI) {
                numerator++;
            } else {
                denominator++; 
            }
            approximation=new Fraction(numerator, denominator);
        }
        System.out.println(approximation);
        //game
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
        int correctAnswers = 0;
        int totalQuestions = 0;
        while (true) {
            Fraction correctAnswer = null;
            int randomFraction=random.nextInt(4); 
            String operator="";
            Fraction f3=new Fraction();
            Fraction f4=new Fraction();
            if(randomFraction==0){
                operator="+";
                correctAnswer=Fraction.add(f3, f4);
            } else if(randomFraction==1){
                operator="-";
                correctAnswer=Fraction.subtract(f3, f4);
            } else if(randomFraction== 2){
                operator="*";
                correctAnswer=Fraction.multiply(f3, f4);
            } else if(randomFraction== 3){
                operator="/";
                correctAnswer=Fraction.divide(f3, f4);
            }
            System.out.println(f3+ " " +operator+ " "+f4 +" = ");
            String userInput=scanner.nextLine();
            if (userInput.equals("quit")){
                break;
            }
            Fraction userAnswer = new Fraction(userInput);
            if((userAnswer.toString()).equals(correctAnswer.toString())){
                System.out.println("Correct!");
                correctAnswers++;
            }else{
                System.out.println("Wrong, the answer was " + correctAnswer);
            }
            totalQuestions++;
        }
        if(totalQuestions > 0){
            Fraction winLossRatio = new Fraction(correctAnswers, totalQuestions);
            double percentage = ((double) correctAnswers / totalQuestions) * 100;
            System.out.println("Your win/loss ratio was " + winLossRatio + ", for a score of " + Math.round(percentage) + " percent!");
        }
    }
}