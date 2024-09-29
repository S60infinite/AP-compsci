
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
        return new OrderedPair(ans1,ans2);
    }
    public double findSlope (OrderedPair A, OrderedPair B)
    {
        return (B.getY()-A.getY())/(B.getX()-A.getX());
    }
    public OrderedPair findMidpoint (OrderedPair A, OrderedPair B)
    {
        double ans1, ans2;
        ans1=(B.getX()-A.getX())/2;
        ans2=(B.getY()-A.getY())/2;
        return new OrderedPair (ans1, ans2);
    }
    public double findArithmeticSeriesSum (double a, double d, int k)
    {
        return k/2.0*(2*a+(k-1)*d);
    }
    public double findGeometricSeriesSum (double a, double r, int k)
    {
        return a*((1-Math.pow(r,k))/(1-r));
    }
    public int rollDie (int sides)
    {
        return (int)(Math.random()*sides+1);
    }
}