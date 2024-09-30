

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
     return "("+str1.substring(0,3)+") "+ str1.substring(3,6)+"-"+str1.substring(6,10);
    
}
//solution method for problem 3
public String middleThree(String str2)
{
    return str2.substring(str2.length()/2-1, str2.length()/2+2);
}
//solution method for problem 4
public String swapLastTwo(String str3)
{
    return str3.substring(0,str3.length()-2)+str3.substring(str3.length()-2,str3.length()-1);
}
//solution method for porblem 5
public boolean frontAgain (String str, int n)
{
    String frontString=str.substring(0,n);
    String backString=str.substring(str.length()-n);
    return frontString.equals(backString);
    
}
}
