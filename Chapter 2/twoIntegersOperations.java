/**
 * P2.4 and P2.5 Write a program that prompts the user for two integers
 * and then prints the sum, difference, product, average,
 * distance, maximum, and minimum.
 */
import java.util.Scanner;

public class twoIntegersOperations
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter two integers as such (10 20)" +
                     " press Q to quit: ");
    //use a while loop for continuous input
    while(in.hasNextInt())
    {
      int firstNum = in.nextInt();
      int secondNum = in.nextInt();
      
      int sum = firstNum + secondNum;
      int difference = firstNum - secondNum;
      int product = firstNum * secondNum;
      double average = (firstNum + secondNum)/2.0;
      
      int distance = Math.abs(firstNum - secondNum);
      //use if statements to find maximum and minimum
      
      int maximum = 0, minimum = 0;
      if (firstNum > secondNum)
      {
        maximum = firstNum;
        minimum = secondNum;
      }
      else{maximum = secondNum; minimum = firstNum;}
      //printf to solve P2.5 as well and align the results
      System.out.printf(" Sum: %2d%n Diff: %d%n Prod: %d%n Ave:  %2.2f%n Dist: %d%n Max: %2d%n Min: %2d%n",
                        sum, difference, product, average, distance, maximum, minimum);
      System.out.print("Please enter two integers as such (10 20)" +
                       " press Q to quit: ");
    }
    in.close();
  }
}

      