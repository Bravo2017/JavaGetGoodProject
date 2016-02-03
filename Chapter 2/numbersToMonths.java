/*********************************************************
 * P2.19 Write a program that transforms numbers 1,2,...12
 * into the corresponding month names January, February,...,
 * December.
 ********************************************************/
import java.util.Scanner;

public class numbersToMonths {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer from (0-12): ");
		int number = input.nextInt();
		
		String months[] = {"January","February","March",
				"April","May","June","July","August","September",
				"October", "November", "December"};
		number -= 1;
		System.out.println(months[number]);
		
		input.close();
		
	}
}
