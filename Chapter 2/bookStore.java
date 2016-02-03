/*************************************************************************
 * Business P2.22 The following pseudocode describes how a bookstore 
 * computes the price of an order from the total price and the number
 * of the books that were ordered.
 * "Read the total book price and the number of books.
 *  Compute the tax (7.5 percent of the book price).
 *  Compute the shipping charge ($2 per book).
 *  The price of the order is the sum of the total book price, the tax,
 *  and the shipping charge.
 *  Print the price of the order."
 ************************************************************************/
import java.util.Scanner;

public class bookStore 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the price of the book: ");
		double bookPrice = input.nextDouble();
		
		final double TAX = 1.075;
		final double SHIPPING_CHARGE = 2.0;
		
		double totalPrice = (bookPrice * TAX) + SHIPPING_CHARGE;
		System.out.printf("Total Price: %1.2f%n", totalPrice);
		
		input.close();
	}
}
