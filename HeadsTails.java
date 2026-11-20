import java.util.Random;
public class HeadsTails
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        final int NUM_SETS = 1000;
        final int COINS_PER_SET = 4;
        int exactlyTwoHeads = 0;

        for(int set = 1; set <= NUM_SETS; set = set + 1)
        {
            int heads = 0;
            for(int coin = 1; coin <= COINS_PER_SET; coin = coin +1)
            {
                int toss = generator.nextInt(2);
                if(toss == 1)
                {
                    heads = heads + 1;
                }
            }
            if(heads == 2)
            {
                exactlyTwoHeads = exactlyTwoHeads + 1;
            }
        }
        double percent = exactlyTwoHeads * 100.0 / NUM_SETS;
        System.out.println("Sets of four tosses: " + NUM_SETS);
        System.out.println("Sets with two heads: " + exactlyTwoHeads);
        System.out.println("Percentage: " + percent + "%");
    }

}
    