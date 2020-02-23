import java.util.Scanner;
import java.math.BigDecimal;

public class gumball
{
    public static int NICKEL = 5;
    public static int DIME = 10;
    public static int QUARTER = 25;

    public static void main(String[] args)
    {
        int total = 0;
        int coin;
        int redCounter = 0;
        int yellowCounter = 0;
        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert any number of quarter, dime, and nickel, using the values: 5, 10, 25 enter 0 when you have finished");
        while ((coin = scanner.nextInt()) != 0)
        {
            if (coin != QUARTER && coin != NICKEL && coin != DIME)
            {
                System.out.println("Invalid Coin Inserted");
                break;
            }
            total = total + coin;
        }
        System.out.println("Your current total is " + total + " cents");
        System.out.println("Press 0 to dispense red gumballs, 1 to dispense yellow gumballs, and 3 to return your change");
        while((value = scanner.nextInt()) <= 3)
        {
            if(value == 0)
            {
                redCounter++;
                total = total - NICKEL;
                System.out.println("Current change is " + total);
                if (total == 0)
                {
                    break;
                }
            }
            if(value == 1)
            {
                yellowCounter++;
                total = total - DIME;
                System.out.println("Current change is " + total);
                if (total == 0)
                {
                    break;
                }
            }
            if (value == 3)
            {
                
                break;
            }
            
        }
        System.out.println("You received " + redCounter + " red gumballs, " + yellowCounter + " yellow gumballs, and " + total + " cents in change");
        
    }


}
