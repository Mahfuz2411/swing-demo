import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class home extends JFrame implements ActionListener{
  JButton button1;
  home() {
    // JFrame frame = new JFrame();
    setTitle("Home");
    setSize(500, 500);
    // setLocation(0, 0);
    setLocationRelativeTo(null);
    setVisible(true);
    setLayout(null);
    setResizable(false);
    getContentPane().setBackground(Color.gray);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    button1 = new JButton("Text Editor");
    button1.setOpaque(true);
    button1.setBackground(Color.DARK_GRAY);
    button1.setForeground(Color.WHITE);
    button1.setSize(300, 60);
    button1.setLocation(100, 100);
    button1.setFont(new Font("Poppins", Font.BOLD, 20));
    add(button1);

    button1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent event) {
    String cmd = event.getActionCommand();

    try {
      dispose();
      test ob = new test();
    } catch (Exception ext) {
      String errorMssg = ext.getMessage();
      JOptionPane.showMessageDialog(null, errorMssg, "Error", 2);
    }
  }
  public static void main(String[] args) {
    home ob = new home();
  }
}
