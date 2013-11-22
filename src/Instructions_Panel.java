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

public class Instructions_Panel extends JPanel { //entire class by JD
	
	JButton bOk; //makes ok button
	JLabel InstructionLabel = new JLabel("1. Look at the map and memorize the path "); //instructions in a jlabel
	JLabel InstructionLabel2 = new JLabel("2. Click where you want to go to move your character"); //instruction part 2
	
	JLabel ititle = new JLabel("Instructions"); //text for title
	
	String buttontile = Back_Panel.getButtonTile();
	String fontStyle = Back_Panel.getFontStyle();
	
 public Instructions_Panel() { //Constructer
	 
       	setLayout(null);
       	
       	ititle.setBounds(90, 50, 400, 100); //sets location of title
		ititle.setFont(new Font(fontStyle, Font.ITALIC, 50)); //changes font of title
		
       	bOk= new JButton("Ok"); //creates ok button
       	
       	bOk.setFont(new Font(fontStyle, Font.BOLD,35));
       	bOk.setForeground(Color.white);
       	bOk.setBounds(170,230,150,50); //sets location of ok button
    	bOk.setIcon(new ImageIcon(buttontile)); //set icon image
    	bOk.setHorizontalTextPosition(AbstractButton.CENTER); //set text location
       	
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
	 }
}
