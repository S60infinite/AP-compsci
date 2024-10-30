
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main (String[] args){
        System.out.println(Review.sentimentVal("accessible"));
        System.out.println(Review.totalSentiment("README.TXT"));
        System.out.println( Review.starRating("README.TXT"));
        String positiveFakeReview = Review.fakeReview("README.TXT", true);
        System.out.println(positiveFakeReview);
        String negativeFakeReview = Review.fakeReview("README.TXT", false);
        System.out.println(negativeFakeReview);
    }
}
