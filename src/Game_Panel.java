import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game_Panel extends JPanel {
	JButton bMenu;
	
	JLabel gtitle = new JLabel("Level 1"); //text for title need a variable here for each lvl

	//Options_Panel options = new Options_Panel();
	//not sure how to do this part
	//it pulls the info right when the game starts and doesnt update with changes
	
	//String Race = options.getRace();
	//String Sex = options.getSex();
	//String Difficulty = options.getDifficulty();
	
  	public Game_Panel() {
  		super();
		setLayout(null);
		
       	gtitle.setBounds(260, 50, 400, 100);
		gtitle.setFont(new Font("Serif", Font.BOLD, 45));
		
		bMenu = new JButton("Menu");
		bMenu.setBounds(720, 25, 100, 50);
		
       	add(gtitle);
		add(bMenu);

		}


  	
	public void paintComponent (Graphics g)
	 {
	    super.paintComponent(g);
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.png");
	    g.drawImage(myImage, 0, 0, this);

	 }

}

