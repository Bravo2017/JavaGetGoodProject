/**
 * P1.3 Write a program that prints the product of the first
 * ten positive integers, 1*2*...*10.
 */
public class TenIntegersProduct
{
  public static void main(String[] args)
  {
    int product = 1;
    
    for (int i = 1; i <= 10; i++)
    {
      product = product * i;
    }
    
    System.out.println("Product of first ten integers is: "
                         + product);
  }
}
