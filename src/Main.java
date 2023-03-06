import javax.swing.*;
import java.awt.Color;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Login Page");
    frame.setBackground(Color.black);
    frame.setResizable(false);
    frame.setSize(800,555);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    String email = JOptionPane.showInputDialog("Enter email");
    System.out.println(email);

    if(email.length()>0)
    {

      JLabel label = new JLabel("not Error!");
      label.setBounds(50,50,80,80);
      label.setVisible(true);
      frame.add(label);
      String pass = JOptionPane.showInputDialog("Enter password");
      System.out.println(pass);
    }
    else
    {
      System.out.println("in");
      JLabel label = new JLabel("Error!");
      label.setBounds(50,50,80,80);
      label.setVisible(true);
      frame.add(label);
    }

  }
}
