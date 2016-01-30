/**
 * P2.3 Write a program that reads a number and displays
 * the square,cube, and fourth power. Use the Math.pow
 * only for the fourth power.
 */
import java.util.Scanner;

public class squareCubeFourth
{
  public static void main(String[] args)
  {
    //Get input from user and initialize number.
    Scanner in = new Scanner(System.in);
    
    System.out.print("Please enter an integer, press Q to quit: ");
    
    while(in.hasNextInt())//input validation if user inputs non-integer, program stops
    {
      int n = in.nextInt();
      int square = n * n;
      int cube = n * n * n;
      int fourth = (int) Math.pow(n,4);
      System.out.printf("Square: %1d%n Cube: %1d%n Fourth: %1d%n",
                        square, cube, fourth);
      System.out.print("Please enter an integer, press Q to quit: ");
    }
    in.close();
  }
}

      
      
    