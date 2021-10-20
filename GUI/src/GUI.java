import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI extends JFrame {

	public GUI() {
		
		this.setTitle("Test");
		this.setSize(500,500);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.black);
		
		ImageIcon image = new ImageIcon("wwuHnRJT_400x400.png");
		this.setIconImage(image.getImage());
		
		
	}
}
