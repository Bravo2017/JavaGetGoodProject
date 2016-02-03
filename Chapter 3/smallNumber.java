/**
 * P3.2 Write a program that reads a floating-point number and prints
 * "zero" if the number is zero. Otherwise, print "positive" or "negative"
 * Add "small" if the absolute value of the number is less than 1, or 
 * "large" if it exceeds 1,000,000.
 */
import java.util.Scanner;

public class smallNumber 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a floating-point number: ");
		double number = input.nextDouble();
		
		String type = number > 0 ? "positive":number < 0 ? "negative":"zero";
		String size = number < 1 ? "small":number > 1000000 ? "large":"";
		
		System.out.printf("%s %s number%n", size, type);
		
		input.close();
	}
}
