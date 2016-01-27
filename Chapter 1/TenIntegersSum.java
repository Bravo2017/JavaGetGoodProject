/**
 * P1.2 Write a program that prints the sum of the first ten
 * positive integers, 1 + 2 + ... + 10.
 */
public class TenIntegersSum
{
  public static void main(String[] args)
  {
    int sum = 0;
    for (int i = 1; i <= 10; i++)
    {
      sum += i;
    }
    System.out.println("Sum of first ten integers" +
                       "is: " + sum);
  }
}
