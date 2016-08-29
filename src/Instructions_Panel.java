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

public class Instructions_Panel extends JPanel { 
	private static final long serialVersionUID = 1L;
	
	private JButton bOk; //makes ok button
	private JTextArea InstructionLabel = new JTextArea(
			"1. Look at the map and memorize the path " +
			"\n2.Use arrow keys to move around the map "); //instructions in a jTextArea

	private JLabel ititle = new JLabel("Instructions"); //text for title



	public Instructions_Panel() { //Constructer

		setLayout(null);

		ititle.setBounds(300, 80, 470, 100); //sets location of title
		ititle.setFont(new Font(Back_Panel.getFontStyle(), Font.ITALIC, 50)); //changes font of title
		ititle.setForeground(Color.WHITE);
		
		setbOk(new JButton("Ok")); //creates ok button

		getbOk().setFont(new Font(Back_Panel.getFontStyle(), Font.PLAIN,0));
		getbOk().setForeground(Color.white);
		getbOk().setBounds(600,600,150,50); //sets location of ok button
		getbOk().setIcon(new ImageIcon("images/ReturnButton.png")); //set icon image
		getbOk().setHorizontalTextPosition(AbstractButton.CENTER); //set text location
		getbOk().setFocusPainted(false);
		getbOk().setContentAreaFilled(false);
		getbOk().setBorderPainted(false);
		getbOk().setOpaque(false);
		getbOk().setToolTipText("Return to Main Menu");

		InstructionLabel.setBounds(300,180,250,50); //sets location of instructions

		InstructionLabel.setEditable(false);
		InstructionLabel.setForeground(Color.BLACK);
		InstructionLabel.setBackground(Color.WHITE);
		
		add(InstructionLabel); //adds instruction label
		add(getbOk()); //adds ok button
		add(ititle); //adds title button

	}

	public void paintComponent (Graphics g) //method to set background
	{
		super.paintComponent(g);
		Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.jpg");
		g.drawImage(myImage, 0, 0, this);
	}

	public JButton getbOk() {
		return bOk;
	}

	public void setbOk(JButton bOk) {
		this.bOk = bOk;
	}
}
