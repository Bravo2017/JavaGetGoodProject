/***********************************************************
 * P2.21 Easter Sunday is the first Sunday after the first
 * full moon of spring. To compute the date, you can use the
 * algorithm, invented by the mathematicain Carl Friedrich
 * Gauss in 1800.
 **********************************************************/
import java.util.Scanner;

public class easterSunday 
{
	public static void main(String[] ars)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a year: ");
		
		
		//Let y be the year(such as 1800 or 2001)
		int y = input.nextInt();
		
		//Divide y by 19 and the call the remainder a
		int a = y % 19;
		
		//Divide y by 100 to get a quotient b and a remainder c
		int b = y / 100;
		int c = y % 100;
		
		//Divide b by 4 to get a quotient d and a remainder e
		int d = b / 4;
		int e = b % 4;
		
		//Divide 8 * b + 13 by 25 to get a quotient g
		int g = (8 * b + 13) / 25;
		
		//Divide 19 * a + b - d - g + 15 by 30 to get a remainder of h
		int h = (19 * a + b - d - g + 15) % 30;
		
		//Divide c by 4 to get a quotient j and a remainder k
		int j = c / 4;
		int k = c % 4;
		
		//Divide a + 11 * h by 319 to get a quotient m
		int m = (a + 11 * h)/319;
		
		//Divide 2 * e + 2 * j - k - h + m + 32 by 7 to get a remainder r
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		
		//Divide h - m + r + 90 by 25 to get a quotient n
		int n = (h - m + r + 90) / 25;
		
		//Divide h - m + r + n + 19 by 32 to get a remainder p
		int p = (h - m + r + n + 19) % 32;
		
		String month[] = {"January", "February", "March", "April",
				"May", "June", "July", "August", "September",
				"October", "November", "December"};
		n -= 1; //To print the month
		
		System.out.printf("Easter Sunday will fall on %s %d, %d.%n"
				,month[n],p,y);
		
		input.close();
	}
}
