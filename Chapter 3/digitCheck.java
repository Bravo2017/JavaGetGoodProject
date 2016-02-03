/**
 * P3.3Write a program that reads an integer and prints how many digits
 * the number has, by checking wether the number is >= 10,>=100, and so
 * on.(Assume that all integers are less than ten billion.)If the number
 * is negative, first multiply it with -1.
 */
import java.util.Scanner;

public class digitCheck 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		long num = input.nextLong();
		
		if (num < 0)
		{
			num *= -1;
		}
		
		int digit = 0;
		if (num >= 10 && num < 100)
		{
			digit = 2;
		}
		else if (num >= 100 && num < 1000)
		{
			digit = 3;
		}
		else if (num >= 1000 && num < 10000)
		{
			digit = 4;
		}
		else if (num >= 10000 && num < 100000)
		{
			digit = 5;
		}
		else if (num >= 100000 && num < 1000000)
		{
			digit = 6;
		}
		else if (num >= 1000000 && num < 10000000)
		{
			digit = 7;
		}
		else if (num >= 10000000 && num < 100000000)
		{
			digit = 8;
		}
		else if (num >= 100000000 && num < 1000000000)
		{
			digit = 9;
		}
		else if (num >= 1000000000)
		{
			digit = 10;
		}
		else {digit = 11;}

		System.out.printf("%d digit/s", digit);
		input.close();
	}

}
