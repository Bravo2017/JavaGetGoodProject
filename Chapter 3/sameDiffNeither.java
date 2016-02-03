/**
 * P3.4 Write a program that reads three numbers and prints "all the same"
 * if they are all the same, "all different", and "neither" otherwise.
 */
import java.util.Scanner;

public class sameDiffNeither 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter three integer numbers: ");
		int firstNum = input.nextInt();
		int secNum = input.nextInt();
		int thirdNum = input.nextInt();
		
		if (firstNum == secNum && firstNum == thirdNum)
		{
			System.out.println("all the same");
		}
		else if (firstNum != secNum && firstNum != thirdNum)
		{
			System.out.println("all different");
		}
		else{System.out.println("neither");}
		
		input.close();
	}
}
