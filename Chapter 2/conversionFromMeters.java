/**
 * P2.6 Write a program that prompts the user for a measurement
 * in meters and then converts it to miles, feet, and inches.
 */
import java.util.Scanner;

public class conversionFromMeters
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Please enter a double measurement in meters "
                       + "press Q to quit: ");
    
    while(in.hasNextDouble())
    {
      //initialize input
      double measurement = in.nextDouble();
      //1609.34 meters in a mile
      double miles = measurement/1609.34;
      //3.28 feet in a meter
      double feet = measurement * 3.28;
      //39.37 inches in a meter
      double inches = measurement * 39.37;
      
      System.out.printf(" Miles: %1.2f%n Feet: %1.2f%n Inches: %1.2f%n",
                        miles, feet, inches);
      System.out.print("Please enter a double measurement in meters "
                       + "press Q to quit: ");
    }
    in.close();
  }
}