import java.awt.*;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome_Panel extends JPanel {//JD

	JButton bOption;
	JButton bInstruction;
	JButton bGame;
	JButton bExit;
	JLabel wtitle = new JLabel("Memory Gap"); //text for title JD

	String buttontile = Back_Panel.getButtonTile();//JD
	String fontStyle = Back_Panel.getFontStyle();//JD

	public Welcome_Panel(){//constructor//JD
		super();
		setLayout(null);

		wtitle.setBounds(245, 70, 400, 100);
		wtitle.setFont(new Font(fontStyle, Font.BOLD, 50));


		bOption = new JButton("Options");	
		bInstruction = new JButton("Instructions");
		bGame = new JButton("Play");
		bExit = new JButton("Exit");

		bGame.setFont(new Font(fontStyle, Font.BOLD,35));
		bGame.setForeground(Color.white);
		bGame.setBounds(600, 350, 150, 50);
		bGame.setIcon(new ImageIcon(buttontile));
		bGame.setHorizontalTextPosition(AbstractButton.CENTER);

		bInstruction.setFont(new Font(fontStyle, Font.BOLD,25));
		bInstruction.setForeground(Color.white);
		bInstruction.setBounds(600, 400, 150, 50);
		bInstruction.setIcon(new ImageIcon(buttontile));
		bInstruction.setHorizontalTextPosition(AbstractButton.CENTER);

		bOption.setFont(new Font(fontStyle, Font.BOLD,35));
		bOption.setForeground(Color.white);
		bOption.setBounds(600, 450, 150, 50);
		bOption.setIcon(new ImageIcon(buttontile));
		bOption.setHorizontalTextPosition(AbstractButton.CENTER);

		bExit.setFont(new Font(fontStyle, Font.BOLD,35));
		bExit.setForeground(Color.white);
		bExit.setBounds(600, 500, 150, 50);
		bExit.setIcon(new ImageIcon(buttontile));
		bExit.setHorizontalTextPosition(AbstractButton.CENTER);


		add(wtitle);
		add(bGame);
		add(bInstruction);
		add(bOption);
		add(bExit);

	}	
	public void paintComponent (Graphics g)//JD
	{
		super.paintComponent(g);
		Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.jpg");
		g.drawImage(myImage, 0, 0, this);
		validate();
		repaint();
	}

}
