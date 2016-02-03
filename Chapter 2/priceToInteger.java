/*************************************************************************
 * BusinessP2.24 The following pseudocode describes how to extract the 
 * dollars and cents from a price given as a floating-point value. For
 * example, a price 2.95 yields values 2 and 95 for the dollars and cents.
 * -Assign the price to an integer variable dollars.
 * -Multiply the difference price - dollars by 100 and add 0.5.
 * -Assign the result to an integer variable cents.	
 */
import java.util.Scanner;

public class priceToInteger
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter price: ");
		float price = input.nextFloat();
		
		//cast both values to int to convert results to integers
		int dollars = (int)price;
		int cents = (int)((price - dollars) * 100 + 0.5);
		
		System.out.printf("%d dollars and %d cents", dollars,cents);
		
		input.close();
	}
}
