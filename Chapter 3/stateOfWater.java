/**
 * P3.9 Write a program that reads a temperature value and letter C for
 * Celsius or F for Fahrenheit. Print whether water is liquid, solid, or
 * gaseous at the given temperature at sea level.
 */
import java.util.Scanner;

public class stateOfWater 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter C for celsius or F" + 
		" for Fahrenheit: ");
		String tempValue = in.nextLine();
		
		System.out.print("Please enter temperature: ");
		int temperature = in.nextInt();
		
		final int CELSIUS_BOILING_POINT = 100;
		final int CELSIUS_FREEZING_POINT = 0;
		final int FAHRENHEIT_BOILING_POINT = 212;
		final int FAHRENHEIT_FREEZING_POINT = 32;
		
		if (tempValue.equals("C") || tempValue.equals("c"))
		{
			if (temperature <= CELSIUS_FREEZING_POINT)
			{
				System.out.println("The water is solid.");
			}
			else if (temperature >= CELSIUS_BOILING_POINT)
			{
				System.out.println("The water is gaseous.");
			}
			else{System.out.println("The water is liquid.");}
		}
		else if (tempValue.equals("F") || tempValue.equals("f"))
		{
			if (temperature <= FAHRENHEIT_FREEZING_POINT)
			{
				System.out.println("The water is solid.");
			}
			else if (temperature >= FAHRENHEIT_BOILING_POINT)
			{
				System.out.println("The water is gaseous.");
			}
			else{System.out.println("The water is liquid");}
		}
		
		in.close();
	}
}
