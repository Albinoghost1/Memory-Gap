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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Instructions_Panel extends JPanel { 

	JButton bOk; //makes ok button
	JTextArea InstructionLabel = new JTextArea("1. Look at the map and memorize the path \n2.Click to move around the map "); //instructions in a jTextField

	JLabel ititle = new JLabel("Instructions"); //text for title

<<<<<<< HEAD

=======
	String buttontile = Back_Panel.getButtonTile();
	String fontStyle = Back_Panel.getFontStyle();
>>>>>>> origin/master

	public Instructions_Panel() { //Constructer

		setLayout(null);

		ititle.setBounds(90, 50, 400, 100); //sets location of title
<<<<<<< HEAD
		ititle.setFont(new Font(Back_Panel.getFontStyle(), Font.ITALIC, 50)); //changes font of title

		bOk= new JButton("Ok"); //creates ok button

		bOk.setFont(new Font(Back_Panel.getFontStyle(), Font.BOLD,35));
		bOk.setForeground(Color.white);
		bOk.setBounds(170,230,150,50); //sets location of ok button
		bOk.setIcon(new ImageIcon(Back_Panel.getButtonTile())); //set icon image
=======
		ititle.setFont(new Font(fontStyle, Font.ITALIC, 50)); //changes font of title

		bOk= new JButton("Ok"); //creates ok button

		bOk.setFont(new Font(fontStyle, Font.BOLD,35));
		bOk.setForeground(Color.white);
		bOk.setBounds(170,230,150,50); //sets location of ok button
		bOk.setIcon(new ImageIcon(buttontile)); //set icon image
>>>>>>> origin/master
		bOk.setHorizontalTextPosition(AbstractButton.CENTER); //set text location

		InstructionLabel.setBounds(90,125,250,50); //sets location of instructions
		InstructionLabel.setOpaque(false);
		InstructionLabel.setEditable(false);
<<<<<<< HEAD
		
=======
>>>>>>> origin/master
		add(InstructionLabel); //adds instruction label
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
