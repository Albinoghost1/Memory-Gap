import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Instructions_Panel extends JPanel {
	
	JButton bOk; //makes ok button
	JLabel InstructionLabel = new JLabel("1. Look at the map and memorize the path "); //instructions in a jlabel
	JLabel InstructionLabel2 = new JLabel("2. Use the Arrow key to guide your character"); //instruction part 2
	
	JLabel ititle = new JLabel("Instructions"); //text for title
	
 public Instructions_Panel() { //Constructer
	 
       	setLayout(null);
       	
       	ititle.setBounds(90, 50, 400, 100); //sets location of title
		ititle.setFont(new Font("Serif", Font.BOLD, 45)); //changes font of title
		//ititle.setForeground(Color.LIGHT_GRAY); //sets color of title
		
       	bOk= new JButton("Ok"); //creates ok button
       	bOk.setBounds(170,230,150,50); //sets location of ok button
    	bOk.setIcon(new ImageIcon("images/buttontile.png"));
    	bOk.setHorizontalTextPosition(AbstractButton.CENTER);
       	
       	InstructionLabel.setBounds(90,175,300,20); //sets location of instructions
     	InstructionLabel2.setBounds(90,200,300,20); //sets location of instructions part 2
       	add(InstructionLabel); //adds instruction label
       	add(InstructionLabel2); //adds instruction2 label
       	add(bOk); //adds ok button
       	add(ititle); //adds title button
       	
 	}
 	
	public void paintComponent (Graphics g) //method to set background
	 {
	    super.paintComponent(g);
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/background2.png");
	    g.drawImage(myImage, 0, 0, this);
        validate();
        repaint();
	 }
}
