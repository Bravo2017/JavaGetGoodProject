/**
 * P2.15 Write a program that prints a grid to play tic-tac-toe.
 */
public class ticTacToeBoard
{
  public static void main(String[] args)
  {
    String line = "+--+--+--+";
    String nextLine = "|  |  |  |";
    
    for (int i = 1; i <= 7; i++)
    {
      if (i % 2 == 0)
      {
        System.out.println(nextLine);
      }
      else {System.out.println(line);}
    }
  }
}
