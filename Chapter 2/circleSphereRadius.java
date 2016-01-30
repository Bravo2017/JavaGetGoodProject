/**
 * P2.7 Write a program that prompts the user for a radius and
 * then prints the area and circumference of a circle and the
 * volume and surface area of a sphere.
 */
import java.util.Scanner;

public class circleSphereRadius
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    //Prompt the user to enter a integer radius
    System.out.print("Please enter an integer radius, press Q to quit: ");
    
    //use while loop to check for input validation
    while(in.hasNextInt())
    {
      int radius = in.nextInt();
      
      //circumference of circle = 2PIr
      double circumference = 2 * Math.PI * radius;
      //area of circle = PIr^2
      double areaCircle = Math.PI * radius * radius;
      //volume of sphere = 4/3PIr^3
      double volumeSphere = (4/3.0)*Math.PI*(Math.pow(radius,3));
      //surface area of sphere = 4PIr^2
      double surfAreaSphere = 4*Math.PI*radius*radius;
      
      //print using printf for format
      System.out.printf(" Circum: %1.2f%n Area: %1.2f%n Vol: %1.2f%n SA: %1.2f%n",
                        circumference,areaCircle,volumeSphere,surfAreaSphere);
      System.out.print("Please enter an integer radius, press Q to quit: ");
    }
    in.close();
  }
}