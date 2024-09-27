
/**
 * Write a description of class Formula here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Formula
{
    public OrderedPair findQuadraticRoots (double a, double b, double c)
    {
        double ans1, ans2;
        ans1=(-b+Math.sqrt(b*b-4*a*c))/2/a;
        ans2=(-b-Math.sqrt(b*b-4*a*c))/2/a;
        return new OrderedPair (ans1,ans2);
    }
    
}
