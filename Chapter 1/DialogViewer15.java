/**
 * P1.16 Modify the program so that the dialog continues with the message
 * "My name is Hal! What would you like me to do?" then discard the user's
 * input and display a message "I'm sorry, Dave. I'm afraid I can't do that".
 */
import javax.swing.JOptionPane;

public class DialogViewer15
{
  public static void main(String[] args)
  {
    String name = JOptionPane.showInputDialog("What is your name?");
    System.out.println(name);
    JOptionPane.showMessageDialog(null, "Hello " + name + "!");
    JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
    JOptionPane.showMessageDialog(null, "I'm sorry " + name +
                                  ". " + "I'm afraid I can't do that.");
  }
}