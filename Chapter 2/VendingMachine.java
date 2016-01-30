/**
 * P2.9 This program simulates a vending machine that 
 * gives change based on user input and what they bought.
 */
import java.util.Scanner;

public class VendingMachine
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    final int PENNIES_PER_DOLLAR = 100;
    final int PENNIES_PER_QUARTER = 25;
    
    System.out.print("Enter bill value (1.00 = $1 bill, 5.00 = $5 bill 0.25 = 25 cents): ");
    double billValue = in.nextDouble();
    System.out.print("Enter item price in pennies: ");
    double itemPrice = in.nextDouble();
    
    //compute change due
    double changeDue = PENNIES_PER_DOLLAR * billValue - itemPrice;
    int dollarCoins = (int) changeDue/PENNIES_PER_DOLLAR;
    changeDue = changeDue % PENNIES_PER_DOLLAR; //remainder of change/100 is quarters
    int quarters = (int)changeDue / PENNIES_PER_QUARTER; //new change/25 to calculate amount of quarters
    
    System.out.printf("Dollar: %1d %nQuarter/s: %1d%n",
                      dollarCoins, quarters);
    in.close();
  }
}
