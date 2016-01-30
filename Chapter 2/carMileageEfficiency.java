/**
 * P2.11 Write a program that asks the user to input the number
 * of gallons of gas in the tank, the fuel efficiency in miles
 * per gallon, and the price of gas per gallon. Then print the
 * cost per 100 miles and how the car can go with the gas in the tank.
 */
import java.util.Scanner;

public class carMileageEfficiency
{
  public static void main(String[] args)
  {
    
    //initialize the scanner and variables
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter the number of gallons of gas in the tank: ");
    double gasLeft = in.nextDouble();
    System.out.print("Please enter the fuel efficiency in miles per gallon: ");
    double efficiency = in.nextDouble();
    System.out.print("Please enter price of gas per gallon: ");
    double gasPrice = in.nextDouble();
    
    //process 
    double gallonPerMile = 1 / efficiency;
    double per100Miles = gallonPerMile * 100;
    double costPer100Miles = per100Miles * gasPrice;
    double gasInTank = gasLeft / gallonPerMile;
    
    //output using printf for formatting
    System.out.printf("The cost per 100 miles is $%1.2f.%n", costPer100Miles);
    System.out.printf("Gas in the tank can take you %1.2f miles.%n",gasInTank);
    in.close();
  }
}
