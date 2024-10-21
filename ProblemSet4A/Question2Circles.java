
/**
 * Write a description of class Question2Circles here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question2Circles
{
     public static void main(String[] args) {
        StdDraw.setScale(0, 500);
        for (int radius = 500; radius >= 20; radius -= 20) {
            if (radius % (20 * 2) == 0) {
                StdDraw.setPenColor(StdDraw.BLACK);
            } else {
                StdDraw.setPenColor(StdDraw.WHITE);
            }
            StdDraw.filledCircle(250, 250, radius);
        }
    }
}

