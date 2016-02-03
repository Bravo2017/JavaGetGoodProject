/*************************************************************************
 * Business P2.23 The following pseudocode describes how to turn a string
 * containing a ten-digit phone number(such as "4155551212") into a more
 * readable string with parentheses and dashes like this: "(415) 555-1212.
 * "Take the substring consisting of the first three characters and 
 *  surround it with "(" and ")". This is the area code.
 *  Concantenate the area code, the substring consisting of the next three
 *  characters, a hyphen, and the substring consisting the last four cha-
 *  racters."
 ************************************************************************/
import java.util.Scanner;

public class phoneNumber 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a phone number as such" +
		"(4155552212) : ");
		String phoneNumber = input.nextLine();
		
		String areaCode = phoneNumber.substring(0,3); //get area code
		String secondSet = phoneNumber.substring(3,6);//get the next three
		String lastSet = phoneNumber.substring(6);//get final numbers
		
		System.out.printf("(%s) %s-%s",areaCode, secondSet, lastSet);
		
		input.close();
	}
}
