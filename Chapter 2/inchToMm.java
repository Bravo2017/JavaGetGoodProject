/**
 * P2.1 Write a program that displays the dimensions of a letter
 * size (8.5 x 11inches) sheet of paper in millimeters. There
 * are 25.4 millimeters per inch. Use constants and comments in
 * your program.
 */
public class inchToMm
{
  public static void main(String[] args)
  {
    //initialize the measurements in inches for the paper
    double inchesWidth = 8.5;
    double inchesHeight = 11.0;
    
    //convert to mm by multiplying initial inces by 25.4
    double mmWidth = inchesWidth * 25.4;
    double mmHeight = inchesHeight * 25.4;
    
    //print results using printf to format the result
    System.out.printf("The dimension in millimeters is %1.2f X %1.2f mm.%n",
                      mmWidth, mmHeight);
  }
}
