import java.awt.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Welcome_Panel extends JPanel {
	JButton bOption;
	JButton bInstruction;
	JButton bGame;
	JButton bExit;
	JLabel title = new JLabel("Memory Gap"); //text for title
	
  	public Welcome_Panel() {
		super();
		setLayout(null);
		title.setBounds(200, 100, 400, 100);
		title.setFont(new Font("Serif", Font.BOLD, 45));
		
		bOption = new JButton("Options");	    //create button
		bInstruction = new JButton("Instructions");	    //create button
		bGame = new JButton("Game");	    //create button
		bExit = new JButton("Exit");	    //create button

		bGame.setBounds(500, 200, 150, 50);   //define position
		bInstruction.setBounds(500, 250, 150, 50);   //define position
		bOption.setBounds(500, 300, 150, 50);   //define position
		bExit.setBounds(500, 350, 150, 50);   //define position
		
		
		add(title);						// add title to panel
		add(bGame);
		add(bInstruction);
		add(bOption);				    // add button to panel
		add(bExit);
		
  	} // end constructor


	
	
	
	public void paintComponent (Graphics g)
	 {
	    super.paintComponent(g);
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.png");
	    g.drawImage(myImage, 0, 0, this);
	 }

}
