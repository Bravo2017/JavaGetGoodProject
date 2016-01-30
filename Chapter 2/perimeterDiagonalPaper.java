/**
 * P2.2 Write a program that computes and displays the 
 * perimeter of a letter-size(8.5 X 11inches) sheets of 
 * paper and the length of its diagonal.
 */
public class perimeterDiagonalPaper
{
  public static void main(String[] args)
  {
    //initialize variables for length and width of paper
    double width = 8.5;
    double height = 11;
    
    //perimeter = 2(l+w)
    double perimeter = 2 * (width + height);
    
    //apply pythagorean theorem to find diagonal
    //c^2 = a^2 + b^2
    double diagonal = Math.sqrt((width*width)+(height*height));
    
    System.out.printf("Perimeter: %1.2f%n Diagonal: %1.2f%n",
                        perimeter, diagonal);
  }
}
