/**
 * Write a program that helps a person decide whether to buy a 
 * hybrid car. Inputs should be cost of a new car, estimated
 * miles driven per year, estimated gas price, efficiency in miles
 * per gallon, and estimated resale value after 5 years. Compute
 * total cost of owning the car for five years. Obtain realistic
 * prices for a new and used hybrid. Run program twice using 
 * today's gas price and 15000 miles per year.
 */
import java.util.Scanner;

public class toBuyOrNotToBuy
{
  public static void main(String[] args)
  {
    //initialize Scanner
    Scanner in = new Scanner(System.in);  
    System.out.print("Please enter (double) cost of a new car: ");
    double carCost = in.nextDouble();
    System.out.print("Please enter estimated miles driven per year: ");
    double miles = in.nextDouble();
    System.out.print("Please enter gas price: ");
    double gas = in.nextDouble();
    System.out.print("Please enter efficiency of miles per gallon: ");
    double mpg = in.nextDouble();
    System.out.print("Please enter resale value after 5 years: ");
    double resale = in.nextDouble();
    
    double efficiency = gas/mpg;
    double milesdriven = miles * efficiency * 5;
    double usedcarcost = carCost - resale;
    double total = usedcarcost + milesdriven;
    System.out.printf("The car will cost this much after 5 years: %1.2f.%n",
                      total);
    in.close();
  }
}