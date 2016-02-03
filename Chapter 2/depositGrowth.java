/**
 * BusinessP2.26 An online bank wants you to create a program that shows
 * prospective customers how their deposits will grow. Your program should
 * read the initial balance and the annual interest rate. Interest is com-
 * pounded monthly. Print out the balances after the first three months.
 */
import java.util.Scanner;

public class depositGrowth 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter initial balance: ");
		double balance = input.nextInt();
		System.out.print("Please enter interest rate in percent: ");
		double interest = input.nextDouble();
		
		double monthlyInterest = (interest/12/100) + 1;

		double firstMonth = balance * monthlyInterest;
		System.out.printf("After first month: %4.2f%n",firstMonth);
		double secondMonth = firstMonth * monthlyInterest;
		System.out.printf("After second month: %5.2f%n", secondMonth);
		double thirdMonth = secondMonth * monthlyInterest;
		System.out.printf("After third month: %4.2f%n", thirdMonth);
		
		input.close();
	}
}
