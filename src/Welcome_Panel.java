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

		SetItem(bGame,350);
		SetItem(bInstruction,400);
		SetItem(bOption,450);
		SetItem(bExit,500);
		
		add(wtitle);

	}	
	
	public void SetItem(JButton buttonName , int x){
		buttonName.setFont(new Font(fontStyle, Font.BOLD,35));
		buttonName.setForeground(Color.white);
		buttonName.setBounds(600, x, 150, 50);
		buttonName.setIcon(new ImageIcon(buttontile));
		buttonName.setHorizontalTextPosition(AbstractButton.CENTER);
		add(buttonName);
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
