import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Instructions_Panel extends JPanel {
	
	JButton bOk;
	JLabel InstructionLabel = new JLabel("1. Look at the map and memorize the path");
	JLabel InstructionLabel2 = new JLabel("2. Use the Arrow key to guide your character");
	
	JLabel title = new JLabel("Instructions"); //text for title
	
 public Instructions_Panel() {
	 
       	setLayout(null);
       	
       	title.setBounds(260, 50, 400, 100);
		title.setFont(new Font("Serif", Font.BOLD, 45));
		
       	bOk= new JButton("Ok");
       	bOk.setBounds(217,500,150,50);
       	InstructionLabel.setBounds(150,300,600,20);
       	InstructionLabel2.setBounds(150,320,600,20);
       	add(InstructionLabel);
       	add(InstructionLabel2);
       	add(bOk);
       	add(title);
       	
 	}
 	
 	
 	
 	
	public void paintComponent (Graphics g)
	 {
	    super.paintComponent(g);
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.png");
	    g.drawImage(myImage, 0, 0, this);
	 }
}
