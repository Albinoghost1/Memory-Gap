import java.awt.*;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Welcome_Panel extends JPanel {

	JButton bOption;
	JButton bInstruction;
	JButton bGame;
	JButton bExit;
	
	JLabel wtitle = new JLabel("Memory Gap"); //text for title 
	
	Changelog_Panel cl;

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

		bOption = new JButton("Options");	
		bInstruction = new JButton("Instructions");
		bGame = new JButton("Play");
		bExit = new JButton("Exit");

		SetButton(bGame,500,0,"images/playButton.png");
		bGame.setToolTipText("Play");
		
		SetButton(bInstruction,550,0,"images/InstructionsButton.png");
		bInstruction.setToolTipText("Instructions");
		SetButton(bOption,600,0,"images/OptionButton.png");
		bOption.setToolTipText("Options");
		SetButton(bExit,650,0,"images/ExitButton.png");
		bExit.setToolTipText("Exit");
		
	}	
	
	public void SetButton(JButton buttonName , int xCoord,int size, String buttonImage){

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

}
