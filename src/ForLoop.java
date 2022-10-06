import java.util.Scanner;
import java.util.Random;
public class ForLoop
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();


        //for(;;) will run until it breaks, or you force stop it
        for(int x=0; x <= 10; x++)
        {
            //x is a counter variable
            System.out.println(x);
        }


        for(int l=0; l < 3; l++)
             System.out.println();

        for(int x=10; x >= 0; x--)
        {
            //x is a counter variable
            System.out.println(x);
        }

        int reps = in.nextInt();
        for(int x=1; x<= reps; x++){
            System.out.println("re:" + x);
        }

        int rndA = rnd.nextInt(6) +1;
        int rndB = rnd.nextInt(6) +1;

        while(rndA != rndB)
        {
            rndA = rnd.nextInt(6) +1;
            rndB = rnd.nextInt(6) +1;
            System.out.printf("\n%3d%3d", rndA, rndB);
        }
    }

}
