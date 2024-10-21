
/**
 * Write a description of class Question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question3{
    public static void main(String[] args) {
        StdDraw.setScale(0, 1);
        double[] x = {0.0, 0.5, 1.0};
        double[] y = {0.0, Math.sqrt(3) / 2, 0.0};
        StdDraw.point(x[0], y[0]);
        StdDraw.point(x[1], y[1]);
        StdDraw.point(x[2], y[2]);
        double px = 0.25;
        double py = 0.25;
        int points = 10000;
        for (int i = 0; i < points; i++) {
            int vertex = (int) (Math.random() * 3);
            px = (px + x[vertex]) / 2.0;
            py = (py + y[vertex]) / 2.0;
            StdDraw.point(px, py);
        }
    }
}

