
/**
 * Write a description of class Question2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question2Grid
{
    public static void main(String[] args){
        StdDraw.setScale(0,500);
        StdDraw.setPenColor(StdDraw.BLACK);
        for(int x = 0;x<=500;x=x+20){
            StdDraw.line(x,0,x,500);
        }
        for(int y = 0;y<=500;y=y+20){
            StdDraw.line(0,y,500,y);
        }
    }
}
