/**
 * P3.5 Write a program that reads three numbers and prints "increasing"
 * if they are increasing order, "decreasing" if they are in decreasing
 * order, and "neither" otherwise. Here, "increasing" means "strictly in-
 * creasing", with each value larger that its predecessor. The sequence 
 * 3 4 4 would not be considered increasing.
 */
import java.util.Scanner;

public class increasingDecreasin 
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter three integer numbers: ");
		int firstNum = input.nextInt();
		int secNum = input.nextInt();
		int thirdNum = input.nextInt();
		
		if (firstNum < secNum && secNum < thirdNum)
		{
			System.out.println("Increasing");
		}
		else if (firstNum > secNum && secNum > thirdNum)
		{
			System.out.println("Decreasing");
		}
		else {System.out.println("Neither");}
		
		input.close();
	}
}
