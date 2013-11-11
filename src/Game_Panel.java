import java.awt.*;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game_Panel extends JPanel {
	
	JButton bMenu; //menu button
	JButton blvl1; // level 1 button
	JButton blvl2; // level 1 button
	JButton blvl3; // level 1 button
	JButton blvl4; // level 1 button
	JButton blvl5; // level 1 button
	JLabel gtitle = new JLabel("Memory Gap"); //text for title need a variable here for each lvl

	//Options_Panel options = new Options_Panel();
	//not sure how to do this part
	//it pulls the info right when the game starts and doesnt update with changes
	
	//String Race = options.getRace();
	//String Sex = options.getSex();
	//String Difficulty = options.getDifficulty();
	
	
	
  	public Game_Panel() { //Constructer
  		
  		super();
		setLayout(null);
		//gtitle.setForeground(Color.LIGHT_GRAY); //sets color of title
       	gtitle.setBounds(260, 50, 400, 100); //sets location of title
		gtitle.setFont(new Font("Serif", Font.BOLD, 45)); //sets font of title
		
		bMenu = new JButton("Main Menu");
		blvl1 = new JButton("Start Level 1");
		blvl2 = new JButton("Start Level 2");
		blvl3 = new JButton("Start Level 3");
		blvl4 = new JButton("Start Level 4");
		blvl5 = new JButton("Start Level 5");
		
		
		bMenu.setBounds(600,300,150,50); //sets location of menu button
		blvl1.setBounds(600, 350, 150, 50); //sets location of lvl 1 button
		blvl2.setBounds(600, 400, 150, 50); //sets location of lvl 2 button
		blvl3.setBounds(600, 450, 150, 50); //sets location of lvl 3 button
		blvl4.setBounds(600, 500, 150, 50); //sets location of lvl 4 button
		blvl5.setBounds(600, 550, 150, 50); //sets location of lvl 5 button
		
		
		bMenu.setIcon(new ImageIcon("images/buttontile.png"));
		bMenu.setHorizontalTextPosition(AbstractButton.CENTER);
    	
		blvl1.setIcon(new ImageIcon("images/buttontile.png"));
		blvl1.setHorizontalTextPosition(AbstractButton.CENTER);
    	
		blvl2.setIcon(new ImageIcon("images/buttontile.png"));
		blvl2.setHorizontalTextPosition(AbstractButton.CENTER);
    	
		blvl3.setIcon(new ImageIcon("images/buttontile.png"));
		blvl3.setHorizontalTextPosition(AbstractButton.CENTER);
    	
		blvl4.setIcon(new ImageIcon("images/buttontile.png"));
		blvl4.setHorizontalTextPosition(AbstractButton.CENTER);
    	
		blvl5.setIcon(new ImageIcon("images/buttontile.png"));
		blvl5.setHorizontalTextPosition(AbstractButton.CENTER);
		
       	add(gtitle); //adds title
		add(bMenu); //adds menu button
		add(blvl1); //adds lvl1 button
		add(blvl2); //adds lvl2 button
		add(blvl3); //adds lvl3 button
		add(blvl4); //adds lvl4 button
		add(blvl5); //adds lvl5 button
		
		}


  	
	public void paintComponent (Graphics g) //method to set background 
	 {
	    super.paintComponent(g);
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/backgrounddim.png");
	    g.drawImage(myImage, 0, 0, this);
        validate();
        repaint();

	 }

}

