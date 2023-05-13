import java.util.Random;

public class Genshin 
{
    private static Random rand = new Random();
    public static void main(String[] args)
    {
        int rolls = 200; //number of rolls
        System.out.println("Genshin Impact");
        System.out.println("Method 1:");
        Roll1(rolls);
        System.out.println("\nMethod 2:");
        Roll2(rolls);
    }
    
    /**
     * Method is for if 10 roll pity actually does increase probability of a 5 star
     * probability of a 5 star = 0.006
     * probability of a 4 star = 0.051
     * probability of a 4 or 5 star = 0.057
     * probability of a 5 star on a pity10roll = 0.006 / 0.057 = 0.6 / 5.7
     */
    public static void Roll1(int rolls)
    {
        int pity90roll=0; //pity tracker for 90 rolls without a 5 star
        int pity10roll=0; //pity tracker for 10 rolls without a 4 or 5 star
        int fiveStar=0; //counts total number of 5 stars
        int pityFiveStar=0; //counts number of 5 stars gained from the 90 roll pity
        int pity10RollFiveStar=0; //counts number of 5 stars gained from the 10 roll pity
        double x = 0.0;
        for (int i=0; i<rolls; i++)
        {
            pity90roll++;
            pity10roll++;
            x = rand.nextDouble(); //random decimal between 0 and 1, there are a lot of decimal places...
            if (pity90roll == 90 || (pity10roll==10 && x < 0.6/5.7) || x < 0.006) 
                // if reached 90 rolls w/o 5 star or 10 rolls w/o 4 or 5 star and roll a 5 star (roughly 10% chance on this pity) or roll a 5 star w/o pity
            {
                if (pity90roll == 90) //90 roll pity
                {
                    pityFiveStar++;
                }
                else if (pity10roll==10 && x <0.6/5.7) //10 roll pity and its a 5 star
                {
                    pity10RollFiveStar++;
                }
                pity90roll=0;
                pity10roll=0;
                fiveStar++;
            }
            if (pity10roll==10) //check if guaranteed 4 star
            {
                pity10roll=0;
            }
            else if (x < 0.057) //check if roll 4 or 5 star
            {
                pity10roll=0;
            }
        }
        System.out.println("Five Stars: " + fiveStar);
        System.out.println("10 Roll Pity Five Stars: " + pity10RollFiveStar);
        System.out.println("90 Roll Pity Five Stars: " + pityFiveStar);
        System.out.println("Probability: " + (double)(fiveStar)/(double)(rolls)*100 + "%");
    }
    
    /**
     * Method is for if 10 roll pity does not increase probability of a 5 star
     * probability of a 5 star = 0.006
     * probability of a 4 star = 0.051
     * same logic as above with less conditions
     */
    public static void Roll2(int rolls)
    {
        int pity90roll=0;
        int fiveStar=0;
        int pityFiveStar=0;
        double x = 0.0;
        for (int i=0; i<rolls; i++)
        {
            pity90roll++;
            x = rand.nextDouble();
            if (pity90roll == 90 || x < 0.006)
            {
                if (pity90roll == 90)
                {
                    pityFiveStar++;
                }
                pity90roll=0;
                fiveStar++;
            }
        }
        System.out.println("Five Stars: " + fiveStar);
        System.out.println("90 Roll Pity Five Stars: " + pityFiveStar);
        System.out.println("Probability: " + (double)(fiveStar)/(double)(rolls)*100 + "%");
    }
}