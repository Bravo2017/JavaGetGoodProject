/**
 * P2.13 Write a program that reads a number between 1000 and 999999 from the user
 * where the user enters a comma in the input. Then print the number without a 
 * comma. 
 */
import java.util.Scanner;

public class comma
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter a number between 1000 and 999999, press q to quit: ");
    while(in.hasNextInt())
    {
      int number = in.nextInt();
      System.out.printf("%,d%n",number);
      System.out.print("Please enter a number between 1000 and 999999, press q to quit: ");
    }
      in.close();
  }
}
