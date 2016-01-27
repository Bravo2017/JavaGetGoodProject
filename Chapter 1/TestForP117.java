/**
 * P1.17 Type and run the following program then modify to
 * show a different greeting.
 */
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TestForP117
{
  public static void main(String[] args) throws Exception
  {
    URL imageLocation = new URL("http://www.sideshowtoy.com/wp-content/uploads/2014/07/902220-product-thumb.jpg");
    JOptionPane.showMessageDialog(null, "I am Groot!", "I am Groot",
                                  JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
  }
}

                                