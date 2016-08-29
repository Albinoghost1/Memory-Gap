import java.awt.*;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Welcome_Panel extends JPanel {

	private JButton bOption;
	private JButton bInstruction;
	private JButton bGame;
	private JButton bExit;
	
	private JLabel wtitle = new JLabel("Memory Gap"); //text for title 
	
	private Changelog_Panel cl;

	public Welcome_Panel(){//constructor
		super();
		setLayout(null);

		wtitle.setBounds(220, 80, 470, 100);
		wtitle.setFont(new Font("Freestyle Script", Font.PLAIN, 80 ));
		wtitle.setForeground(Color.GREEN.darker().darker().darker());
		//wtitle.setBorder(BorderFactory.createLineBorder(Color.white));
		wtitle.setBackground(Color.black);
		
		cl = new Changelog_Panel();
		cl.setBounds(500,200,200,400);
		cl.setOpaque(false);
		add(cl);
		
		add(wtitle);

		setbOption(new JButton("Options"));	
		setbInstruction(new JButton("Instructions"));
		setbGame(new JButton("Play"));
		setbExit(new JButton("Exit"));

		setButton(getbGame(),500,0,"images/playButton.png");
		getbGame().setToolTipText("Play");
		
		setButton(getbInstruction(),550,0,"images/InstructionsButton.png");
		getbInstruction().setToolTipText("Instructions");
		setButton(getbOption(),600,0,"images/OptionButton.png");
		getbOption().setToolTipText("Options");
		setButton(getbExit(),650,0,"images/ExitButton.png");
		getbExit().setToolTipText("Exit");
		
	}	
	
	public void setButton(JButton buttonName , int xCoord,int size, String buttonImage){

		buttonName.setFont(new Font("Impact", Font.PLAIN,size));
		buttonName.setForeground(Color.white);
		buttonName.setBounds(xCoord, 600, 50, 50);
		buttonName.setIcon(new ImageIcon(buttonImage));
		buttonName.setHorizontalTextPosition(AbstractButton.CENTER);
		buttonName.setFocusPainted(false);
		buttonName.setContentAreaFilled(false);
		buttonName.setBorderPainted(false);
		buttonName.setOpaque(false);
		add(buttonName);
	}
	
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.jpg");
		g.drawImage(myImage, 0, 0, this);
		validate();
		repaint();
	}

	public JButton getbGame() {
		return bGame;
	}

	public void setbGame(JButton bGame) {
		this.bGame = bGame;
	}

	public JButton getbInstruction() {
		return bInstruction;
	}

	public void setbInstruction(JButton bInstruction) {
		this.bInstruction = bInstruction;
	}

	public JButton getbOption() {
		return bOption;
	}

	public void setbOption(JButton bOption) {
		this.bOption = bOption;
	}

	public JButton getbExit() {
		return bExit;
	}

	public void setbExit(JButton bExit) {
		this.bExit = bExit;
	}

}
