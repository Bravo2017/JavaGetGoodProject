/**
 * Write a program that reads an integer and prints whether it's negative,
 * zero, or positive.
 */
import java.util.Scanner;


public class posNegZero 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int number = input.nextInt();
		
		String type = number > 0 ? "positive": number < 0? "negative":"zero";
		
		System.out.printf("The number is: %s%n", type);
		
		input.close();
	}
}
