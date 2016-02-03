/**
 * P3.10 and 3.11 The boiling point of water drops by about one degree centigrade
 * for every 300 meters (or 1,000 feet) of altitude. Improve the program
 * of Exercises P3.9 to allow the user to supply the altitude in meters 
 * or feet. Add error handling to Exercise P3.10. If the user does not enter
 * a number when expected, or provides an invalid unit for the altitude, print
 * an error message and end the program.
 */
import java.util.Scanner;

public class stateOfWaterAltitude 
{
	public static void main(String[] args)
	{
		final int CEL_FREEZE_POINT = 0;
		final int FAH_FREEZE_POINT = 32;
		int CEL_BOIL_POINT = 100;
		int FAH_BOIL_POINT = 100;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter C or F for temperature type: ");
		String tempType = in.next();
		
		System.out.print("Please enter temperature: ");
		int temp = in.nextInt();
		
		System.out.print("Please enter M for meters or F for feet: ");
		String altType = in.next();
		
		System.out.print("Please enter altitude: ");
		int altitude = in.nextInt();
		
		if (tempType.equals("C") || tempType.equals("c"))
		{
			if (altType.equals("M") || altType.equals("m"))
			{
				CEL_BOIL_POINT -= altitude / 300;
			}
			else if (altType.equals("F") || altType.equals("f"))
			{
				CEL_BOIL_POINT -= altitude / 1000;
			}
			else {System.out.println("Invalid input for unit of measure.");}
			
			if (temp >= CEL_BOIL_POINT)
			{
				System.out.println("Water is gas");
			}
			else if (temp <= CEL_FREEZE_POINT)
			{
				System.out.println("Water is solid");
			}else{System.out.println("Water is liquid");}
		}
		else if (tempType.equals("F") || tempType.equals("f"))
		{
			if (altType.equals("M") || altType.equals("m"))
			{
				FAH_BOIL_POINT -= (altitude / 300) * 34;
			}
			else if (altType.equals("F") || altType.equals("f"))
			{
				FAH_BOIL_POINT -= (altitude / 1000) * 34;
			}
			else{System.out.println("Invalid input for unit of measure.");}
			if (temp >= FAH_BOIL_POINT)
			{
				System.out.println("Water is gas");
			}
			else if (temp <= FAH_FREEZE_POINT)
			{
				System.out.println("Water is solid");
			}else{System.out.println("Water is liquid");}
		}else {System.out.println("Invalid input for type of temperature.");}
		
		in.close();
	}
}
