/**
 * P2.8 Write a program that asks the user for the lengths of the sides 
 * of a rectangle. Then print the area and perimeter and the length of
 * the diagonal.
 */
import java.util.Scanner;

public class solvingRectangle
{
  public static void main(String[] args)
  {
    //initialize scanner input
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter integer sides of the rectangle, press "
                       + "Q to quit: ");
    //use while loop for continuous inputs and input validation
    while(in.hasNextInt())
    {
      int width = in.nextInt();
      int length = in.nextInt();
      //area of rectangle = lw
      int areaRect = width * length;
      //perimeter of rectangle = 2(l+w)
      int periRect = 2*(width + length);
      //length of diagonal(Pythagorean) = l^2 + w^2
      double diagonal = Math.sqrt((width * width) + (length * length));
      
      //print results via formating printf
      System.out.printf(" Area: %1d%n Perimeter: %1d%n Diagonal: %1.2f%n",
                        areaRect,periRect,diagonal);
      System.out.print("Please enter integer sides of the rectangle, press "
                       + "Q to quit: ");
    }
    in.close(); //close system in
  }
}
