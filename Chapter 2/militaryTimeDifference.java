/*****************************************************************
  * P2.17 Write a program that reads two times in military format
  * (0900, 1730) and prints the number of hours and minutes between
  * the two times.
  ****************************************************************/
import java.util.Scanner;

public class militaryTimeDifference
{
	public static void main(String[] args)
	{
		//initialize scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first time: ");
		int firstTime = input.nextInt();
		System.out.print("Please enter the second time: ");
		int secondTime = input.nextInt();
		
		//firstTime - secondTime = timeDifference
		int timeDifference = Math.abs(firstTime - secondTime);
		//time is always positive
		
		int fHour = timeDifference / 100;
		int fMinute = timeDifference % 100;
		
		System.out.printf("%d hours %d minutes%n",fHour,fMinute);
		
		input.close();
	}
}