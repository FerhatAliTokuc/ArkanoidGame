import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
//https://mkyong.com/swing/java-swing-how-to-make-a-simple-dialog/
public class MessageDialogInFrame extends JFrame 
{
	 public MessageDialogInFrame() 
	 {
	        getContentPane().setBackground(Color.DARK_GRAY);
	        setTitle("Message Dialog in Frame");
	        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(false);
	        //setVisible(true);
	        setResizable(false);
	        setSize(100, 100);
	        getContentPane().setLayout(null);
	    }
}
