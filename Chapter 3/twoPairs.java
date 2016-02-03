/**
 * P3.8 Write a program that reads four integers and prints "two pairs"
 * if the input consists of two matching pairs (in some order) and
 * "not two pairs" otherwise. For example,
 * 
 * 1 2 2 1		two pairs
 * 1 2 2 3		not two pairs
 * 2 2 2 2		two pairs
 */
import java.util.Scanner;

public class twoPairs 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter four integer numbers: ");
		int firstNum = in.nextInt();
		int secNum = in.nextInt();
		int thirdNum = in.nextInt();
		int fourthNum = in.nextInt();
		
		if ((firstNum == secNum || firstNum == secNum ||
				firstNum == thirdNum || firstNum == fourthNum)
			&& (secNum == thirdNum || secNum == fourthNum))
		{
			System.out.println("two pairs");
		}
		else{System.out.println("not two pairs");}
		
		in.close();
	}
}
