import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class GUIMain implements ActionListener {
  
  GUIMain() {
    
  }
  
  // public void paint(Graphics g) {
  //   Toolkit t=Toolkit.getDefaultToolkit();
  //   Image i=t.getImage("1.jpg");
  //   g.drawImage(i, 120,100,this);
  // }
  
  public static void main(String[] args) {
    GUIMain m =  new GUIMain();
    JFrame f = new JFrame("Button Example");
    JButton b = new JButton("Select files");
    b.addActionListener(m);
    b.setBounds(50, 100, 95, 30);
    // f.add(m);
    f.add(b);
    f.setSize(400, 400);
    f.setLayout(new GridBagLayout());
    f.setVisible(true);


  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // System.out.println(e.getSource());
    JFileChooser jfc = new JFileChooser();
    jfc.showOpenDialog(null);

  }
}
