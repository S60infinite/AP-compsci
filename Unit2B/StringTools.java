
/**
 * Write a description of class StringTools here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringTools
{
   //solution method for problem 1
public String lastLetter(String str) 
{
   return  str.substring(str.length()-1);
}   
  //solution method for problem 2
public String formatPhoneNumber(String str1)
{
     return "("+str1.substring(0,3)+") "+ str1.substring(3,5)+"-"+str1.substring(5,9);
    
}
}
