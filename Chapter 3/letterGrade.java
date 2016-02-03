/**
 * P3.12 Write a program that translates a letter grade into a number 
 * grade. Letter grades are A, B, C, D, and F, possibly followed by + or 
 * -. Their numberic values are 4,3,2,1, and 0. There is no F+ or F-. A+
 * increases the numeric value by 0.3, a- decreases it by 0.3. However, an
 * A+ has value 4.0.
 * 
 * Enter a letter grade: B-
 * The numeric value is 2.7.
 */
import java.util.Scanner;

public class letterGrade 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a letter grade: ");
		String letterGrade = in.nextLine();
		
		String grade = letterGrade.toUpperCase();
		
		final double GRADE_A = 4.0;
		final double GRADE_B = 3.0;
		final double GRADE_C = 2.0;
		final double GRADE_D = 1.0;
		final double GRADE_F = 0.0;
		final double GRADE_ADJUST = 0.3;
		
		double numValue = 0;
		
		if (grade.equals("A+"))
		{
			numValue = GRADE_A;
		}
		
		if (grade.charAt(0) == 'A')
		{
			numValue = GRADE_A;
		}
		else if (grade.charAt(0) == 'B')
		{
			numValue = GRADE_B;
		}
		else if (grade.charAt(0) == 'C')
		{
			numValue = GRADE_C;
		}
		else if (grade.charAt(0) == 'D')
		{
			numValue = GRADE_D;
		}
		else if (grade.charAt(0) == 'F')
		{
			numValue = GRADE_F;
		}else{System.out.println("Invalid letter grade");}
		
		if (grade.charAt(1) == '+')
		{
			numValue += GRADE_ADJUST;
		}
		else if (grade.charAt(1) == '-')
		{
			numValue -= GRADE_ADJUST;
		}
		
		System.out.printf("The letter grade %s is %1.1f.%n",
				grade, numValue);
		
		in.close();
		
	}
}
