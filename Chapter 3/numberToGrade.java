/**
 * P3.13 Write a program that translates a number between 0 and 4 into the
 * closest letter grade. For example, the number 2.8 (which might have been
 * the average of several grades) would be converted to B-. Break ties in
 * favor of the better grade; for example 2.85 should be a B.
 */
import java.util.Scanner;

public class numberToGrade 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a double number from 0 to 4: ");
		double grade = in.nextDouble();
		
		String letterGrade = "";
		
		if (grade == 4.0)
		{
			letterGrade = "A+";
		}
		else if (grade > 3.7 && grade < 4.0)
		{
			letterGrade = "A";
		}
		else if (grade > 3.3 && grade <= 3.7)
		{
			letterGrade = "A-";
		}
		else if (grade > 3.0 && grade <= 3.3)
		{
			letterGrade = "B+";
		}
		else if (grade > 2.7 && grade <= 3.0)
		{
			letterGrade = "B";
		}
		else if (grade > 2.3 && grade <= 2.7)
		{
			letterGrade = "B-";
		}
		else if (grade > 2.0 && grade <= 2.3)
		{
			letterGrade = "C+";
		}
		else if (grade > 1.7 && grade <= 2.0)
		{
			letterGrade = "C";
		}
		else if (grade > 1.3 && grade <= 1.7)
		{
			letterGrade = "C-";
		}
		else if (grade > 1.0 && grade <= 1.3)
		{
			letterGrade = "D+";
		}
		else if (grade > 0.7 && grade <= 1.0)
		{
			letterGrade = "D";
		}
		else if (grade > 0.0 && grade <= 0.7)
		{
			letterGrade = "D-";
		}
		else if (grade == 0.0)
		{
			letterGrade = "F";
		}else{System.out.println("Invalid input.");}
		
		System.out.printf("Grade %1.2f is a %s", grade, letterGrade);
		in.close();
	
	}
}
