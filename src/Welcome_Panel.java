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
		title.setBounds(260, 50, 400, 100);
		title.setFont(new Font("Serif", Font.BOLD, 45));
		
		bOption = new JButton("Options");	
		bInstruction = new JButton("Instructions");
		bGame = new JButton("Play-Doesnt Work");
		bExit = new JButton("Exit");

		bGame.setBounds(600, 350, 150, 50);
		bInstruction.setBounds(600, 400, 150, 50);
		bOption.setBounds(600, 450, 150, 50);
		bExit.setBounds(600, 500, 150, 50);
		
		
		add(title);
		add(bGame);
		add(bInstruction);
		add(bOption);
		add(bExit);
		
  	} // end constructor


	
	
	
	public void paintComponent (Graphics g)
	 {
	    super.paintComponent(g);
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.png");
	    g.drawImage(myImage, 0, 0, this);
	 }

}
