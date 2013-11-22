import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game_Panel extends JPanel { //entire class by JD
	
	JButton bmenu; //menu button
	JButton bnewGame; // new game button
	JButton bcontinue; // continue button

	JLabel gtitle = new JLabel("Memory Gap"); //text for title need a variable here for each lvl
	
	String buttontile = Back_Panel.getButtonTile();
	String fontStyle = Back_Panel.getFontStyle();
	
	static String[] ComboboxStrings = { "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6", "Level 7", "Level 8", "Level 9", "Level 10"  };

	static JComboBox cblevelList = new JComboBox(ComboboxStrings);
	
  	public Game_Panel() { //Constructer
  		
  		super();
		setLayout(null);

       	gtitle.setBounds(245, 70, 400, 100); //sets location of title
		gtitle.setFont(new Font(fontStyle, Font.BOLD, 50)); //sets font of title
		
		bmenu = new JButton("Main Menu");
		bnewGame = new JButton("New Game");
		bcontinue = new JButton("Continue");

		
		
		bmenu.setBounds(200,350,150,50); //sets location of menu button
		bnewGame.setBounds(200, 400, 150, 50); //sets location of new game button
		cblevelList.setBounds(130, 450, 70, 50); //sets location of levellist combobox
		bcontinue.setBounds(200, 450, 150, 50); //sets location of continue button
		
		bmenu.setFont(new Font(fontStyle, Font.BOLD,20));
		bmenu.setForeground(Color.white);
		bmenu.setIcon(new ImageIcon(buttontile));
		bmenu.setHorizontalTextPosition(AbstractButton.CENTER);
    	
		bnewGame.setFont(new Font(fontStyle, Font.BOLD,20));
		bnewGame.setForeground(Color.white);
		bnewGame.setIcon(new ImageIcon(buttontile));
		bnewGame.setHorizontalTextPosition(AbstractButton.CENTER);
    	
		bcontinue.setFont(new Font(fontStyle, Font.BOLD,20));
		bcontinue.setForeground(Color.white);
		bcontinue.setIcon(new ImageIcon(buttontile));
		bcontinue.setHorizontalTextPosition(AbstractButton.CENTER);
		
       	add(gtitle); //adds title
		add(bmenu); //adds menu button
		add(bnewGame); //adds new game button
		add(cblevelList);//adds combobox
		add(bcontinue); //adds continue button

		
		}

	public void paintComponent (Graphics g) //method to set background 
	 {
	    super.paintComponent(g);
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.jpg");
	    g.drawImage(myImage, 0, 0, this);

	 }
}

