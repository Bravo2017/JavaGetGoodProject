/**
 * Write a program that reads in three integers and prints "in order" if
 * they are sorted in ascending or descending order, or "not in order"
 * otherwise. For example,
 * 
 * 1 2 5		in order
 * 1 5 2		not in order
 * 5 2 1		in order
 * 1 2 2		in order
 */
import java.util.Scanner;

public class orderOrNotOrder 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter three integer numbers: ");
		int firstNum = input.nextInt();
		int secNum = input.nextInt();
		int thirdNum = input.nextInt();
		
		if ((firstNum > secNum && secNum > thirdNum) ||
				(firstNum < secNum && secNum < thirdNum))
		{
			System.out.printf("%d %d %d		in order%n",
					firstNum, secNum, thirdNum);
		}
		else
		{
			System.out.printf("%d %d %d      not in order%n",
					firstNum, secNum, thirdNum);
		}
		input.close();
	}
}
