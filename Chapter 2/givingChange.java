/**
 * Implement a program that directs a cashier how to give change. The pro-
 * gram has two inputs: the amount due and the amount received from the
 * customer. Display the dollars, quarters, dimes, nickels, and pennies
 * that the customer should receive in return. In order to avoid roundoff
 * errors, the program user should supply both amounts in pennies, for 
 * example 274 instead of 2.74.
 */
import java.util.Scanner;


public class givingChange 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter amount due in pennies " +
		"such as (2.74 will be inputted as 274): ");
		int amountDue = input.nextInt();
		System.out.print("Please enter amount received in pennies: ");
		int amountReceived = input.nextInt();
		
		int change = amountReceived - amountDue;
		
		int dollars = change / 100;
		change %= 100;
		int quarters = change / 25;
		change %= 25;
		int dimes = change / 10;
		change %= 10;
		int nickels = change / 5;
		change %= 5;
		int pennies = change;
		
		System.out.printf("%d dollars, %d quarters, %d dimes, %d nickels, %d pennies",
				dollars, quarters, dimes, nickels, pennies);
		
		input.close();
	}
}
