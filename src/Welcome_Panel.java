import java.awt.*;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome_Panel extends JPanel {
	
	JButton bOption;
	JButton bInstruction;
	JButton bGame;
	JButton bExit;
	JLabel wtitle = new JLabel("Memory Gap"); //text for title

  	public Welcome_Panel() {
		super();
		setLayout(null);
		wtitle.setBounds(260, 50, 400, 100);
		wtitle.setFont(new Font("Serif", Font.BOLD, 45));
		//wtitle.setForeground(Color.LIGHT_GRAY); //sets color of title
		
		bOption = new JButton("Options");	
		bInstruction = new JButton("Instructions");
		bGame = new JButton("Play");
		bExit = new JButton("Exit");
		
		bGame.setBounds(600, 350, 150, 50);
		bGame.setIcon(new ImageIcon("images/buttontile.png"));
		bGame.setHorizontalTextPosition(AbstractButton.CENTER);
		
		bInstruction.setBounds(600, 400, 150, 50);
		bInstruction.setIcon(new ImageIcon("images/buttontile.png"));
		bInstruction.setHorizontalTextPosition(AbstractButton.CENTER);
		
		bOption.setBounds(600, 450, 150, 50);
		bOption.setIcon(new ImageIcon("images/buttontile.png"));
		bOption.setHorizontalTextPosition(AbstractButton.CENTER);
		
		bExit.setBounds(600, 500, 150, 50);
		bExit.setIcon(new ImageIcon("images/buttontile.png"));
		bExit.setHorizontalTextPosition(AbstractButton.CENTER);
		
		
		add(wtitle);
		add(bGame);
		add(bInstruction);
		add(bOption);
		add(bExit);
		
  	}


	
	
	
	public void paintComponent (Graphics g)
	 {
	    super.paintComponent(g);
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/backgrounddim.png");
	    g.drawImage(myImage, 0, 0, this);
        validate();
        repaint();
	 }

}
