/**
 * P2.12 Write a program that prompts the user for the drive letter
 * (C), the path(\Windows\System), the file name(Readme), and the
 * extension(txt). Then print the complete file name C:\Windows\System\Readme.txt.
 */
import java.util.Scanner;

public class fileExtension
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    //initialize scanner and prompt for inputs
    System.out.print("Please enter drive name: ");
    String drive = in.nextLine();
    String upperDrive = drive.toUpperCase();
    System.out.print("Please enter path such as (\\Windows\\System): ");
    String path = in.nextLine();
    System.out.print("Please enter file name: ");
    String fileName = in.nextLine();
    System.out.print("Please enter extension such as (txt,jpg,gif): ");
    String extension = in.nextLine();
    
    //output concantenation or printf
    System.out.printf("%s:%s\\%s.%s%n",upperDrive,path,fileName,extension);
    in.close();
  }
}
