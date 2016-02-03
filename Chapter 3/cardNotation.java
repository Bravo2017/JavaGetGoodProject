/**
 * P3.14 Write a program that takes user input describing a playing card
 * in the following shorthand notation:
 * 
 * A		Ace
 * 2...10	Card Values
 * J		Jack
 * Q		Queen
 * K		King
 * D		Diamonds
 * H		Hearts
 * S		Spades
 * C		Clubs
 * 
 * Your program should print the full description of the card For example,
 * 
 * Enter the card notation: QS
 * Queen of Spades
 */
import java.util.Scanner;

public class cardNotation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the card notation: ");
		String cardNotation = in.nextLine();
		
		String x = cardNotation.toUpperCase();
		
		String firstPart = "";
		String secondPart = "";
		
		if (x.charAt(0) == 'A')
		{
			firstPart = "Ace";
		}
		else if (x.charAt(0) == '2')
		{
			firstPart = "Two";
		}
		else if (x.charAt(0) == '3')
		{
			firstPart = "Three";
		}
		else if (x.charAt(0) == '4')
		{
			firstPart = "Four";
		}
		else if (x.charAt(0) == '5')
		{
			firstPart = "Five";
		}
		else if (x.charAt(0) == '6')
		{
			firstPart = "Six";
		}
		else if (x.charAt(0) == '7')
		{
			firstPart = "Seven";
		}
		else if (x.charAt(0) == '8')
		{
			firstPart = "Eight";
		}
		else if (x.charAt(0) == '9')
		{
			firstPart = "Nine";
		}
		else if (x.charAt(0) == 'T')
		{
			firstPart = "Ten";
		}
		else if (x.charAt(0) == 'J')
		{
			firstPart = "Jack";
		}
		else if (x.charAt(0) == 'Q')
		{
			firstPart = "Queen";
		}
		else if (x.charAt(0) == 'K')
		{
			firstPart = "King";
		}
		 else{System.out.println("Invalid!");}
		
		if (x.charAt(1) == 'D')
		{
			secondPart = "Diamonds";
		}
		else if (x.charAt(1) == 'C')
		{
			secondPart = "Club";
		}
		else if (x.charAt(1) == 'S')
		{
			secondPart = "Spades";
		}
		else if (x.charAt(1) == 'H')
		{
			secondPart = "Hearts";
		}else{System.out.println("Invalid!");}
		
		System.out.printf("%s of %s.", firstPart, secondPart);
		
		in.close();
	}
}
