import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class test extends JFrame implements ActionListener {
  JLabel demo;
  JButton button1, button2;

  test() {
    // JFrame frame = new JFrame();
    setTitle("Hello");
    setSize(500, 500);
    // setLocation(0, 0);
    setLocationRelativeTo(null);
    
    setLayout(null);
    setResizable(false);
    getContentPane().setBackground(Color.gray);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Image scaledImage2 = Toolkit.getDefaultToolkit().getImage("home.png");
    setIconImage(scaledImage2);

    demo = new JLabel("0", JLabel.CENTER);
    demo.setSize(500, 30);
    demo.setLocation(0, 0);
    demo.setOpaque(true);
    demo.setBackground(Color.DARK_GRAY);
    demo.setForeground(Color.WHITE);
    Font font = new Font("Courier New", Font.BOLD, 25);
    demo.setFont(font);
    add(demo);

    button1 = new JButton("Add");
    button1.setOpaque(true);
    button1.setBackground(Color.DARK_GRAY);
    button1.setForeground(Color.WHITE);
    button1.setSize(300, 60);
    button1.setLocation(100, 100);
    button1.setFont(new Font("Poppins", Font.BOLD, 20));
    add(button1);

    button1.addActionListener(this);


    button2 = new JButton("Reduce");
    button2.setOpaque(true);
    button2.setBackground(Color.DARK_GRAY);
    button2.setForeground(Color.WHITE);
    button2.setSize(300, 60);
    button2.setLocation(100, 180);
    button2.setFont(new Font("Poppins", Font.BOLD, 20));
    add(button2);

    button2.addActionListener(this);

    setVisible(true);

  }

  public void actionPerformed(ActionEvent event) {
    String cmd = event.getActionCommand();
    String text = demo.getText();
    

    try {
      int result = Integer.parseInt(text);
      if(cmd.equals("Add")) result+=1;
      else result-=1;
      demo.setText(""+result);
    } catch (Exception ext) {
      String errorMssg = ext.getMessage();
      JOptionPane.showMessageDialog(null, errorMssg, "Error", 2);
    }
  }

  public static void main(String[] args) {
    test ob = new test();
  }
}


