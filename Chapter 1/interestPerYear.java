/**
 * P1.4 Write a program that prints the balance of an account
 * after the first, second, and third year. The account has
 * an initial balance of $1,000 and earns 5 percent interest
 * per year.
 */
public class interestPerYear
{
  public static void main(String[] args)
  {
    double balance = 1000.0;
    
    for (int i = 1; i <= 3; i++)
    {
      balance = balance * 1.05;
      System.out.printf("$ %1.2f%n",balance);
    }
  }
}
