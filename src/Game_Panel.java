import java.awt.*;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game_Panel extends JPanel {
	//added to display picks DN
	int race= 1;
	int difficulty;
	int sex;

	JButton bmenu; //menu button JD
	JButton bnewGame; // new game button JD
	JButton bcontinue; // continue button JD

	JLabel gtitle = new JLabel("Memory Gap"); //text for title JD

	// JLabels to display race and difficulty//DN
	JLabel grace = new JLabel("Race: ");

	JLabel gdiff = new JLabel("Difficulty: ");
	
	JLabel selecteddiff = null;
	JButton selectedRace;

	String buttontile = Back_Panel.getButtonTile(); //gets button background from Back Panel JD
	String fontStyle = Back_Panel.getFontStyle(); //gets fontstyle from Back Panel JD

	static String[] ComboboxStrings = { "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6"};

	static JComboBox cblevelList = new JComboBox(ComboboxStrings);

	public Game_Panel() { //Constructor//JD

		super();
		setLayout(null);

		gtitle.setBounds(245, 70, 400, 100); //sets location of title JD
		gtitle.setFont(new Font(fontStyle, Font.BOLD, 50)); //sets font of title JD

		grace.setBounds(560, 300, 300, 70);
		grace.setFont(new Font(fontStyle, Font.BOLD, 30));

		gdiff.setBounds(560, 380, 300, 70);
		gdiff.setFont(new Font(fontStyle, Font.BOLD, 30));


		bmenu = new JButton("Main Menu");
		bnewGame = new JButton("New Game");
		bcontinue = new JButton("Continue");

		bmenu.setBounds(200,350,150,50); //sets location of menu button JD
		bnewGame.setBounds(200, 400, 150, 50); //sets location of new game button JD
		cblevelList.setBounds(130, 450, 70, 50); //sets location of levellist combobox JD
		bcontinue.setBounds(200, 450, 150, 50); //sets location of continue button JD

		bmenu.setFont(new Font(fontStyle, Font.BOLD,20)); //sets fontstyle on menu button JD
		bmenu.setForeground(Color.white); //sets text color of menu button JD
		bmenu.setIcon(new ImageIcon(buttontile)); //sets button background of menu button JD
		bmenu.setHorizontalTextPosition(AbstractButton.CENTER); //centers text of menu button JD

		bnewGame.setFont(new Font(fontStyle, Font.BOLD,20));
		bnewGame.setForeground(Color.white);
		bnewGame.setIcon(new ImageIcon(buttontile));
		bnewGame.setHorizontalTextPosition(AbstractButton.CENTER);

		bcontinue.setFont(new Font(fontStyle, Font.BOLD,20));
		bcontinue.setForeground(Color.white);
		bcontinue.setIcon(new ImageIcon(buttontile));
		bcontinue.setHorizontalTextPosition(AbstractButton.CENTER);

		add(gtitle); //adds title JD
		add(bmenu); //adds menu button JD
		add(bnewGame); //adds new game button JD
		add(cblevelList);//adds combobox JD
		add(bcontinue); //adds continue button JD

	}
	// Method created to handle display of race and diff DN
	/*public void displayRaceDif(int r, int s, int d,String loc){
		race = r;
		difficulty = d;
		sex=s;


		if (race==1 && s ==1){
			selectedRace.setIcon(new ImageIcon("images/humanm1-3.png"));
		}
		if (race==1 && s ==2){
			selectedRace.setIcon(new ImageIcon("images/humanf1-3.png"));
		}
		else if (race == 2 && s ==1){
			selectedRace.setIcon(new ImageIcon("images/ostrichm1-3.png"));
		}
		else if (race == 2 && s ==2){
			selectedRace.setIcon(new ImageIcon("images/ostrichf1-3.png"));
		}
		else if (race == 3 && s ==1){
			selectedRace.setIcon(new ImageIcon("images/potatom1-3.png"));
		}
		else if (race == 3 && s ==2){
			selectedRace.setIcon(new ImageIcon("images/potatof1-3.png"));
		}
		selectedRace.setBounds(445,490,100,100);
		selectedRace.setVisible(true);
		add(selectedRace);


		if(race == 3)
			selecteddiff = new JLabel("Infinite Lifes");
		else if (d>1)
			selecteddiff = new JLabel(d+" Lives");
		else if(d<1)
			selecteddiff = new JLabel(d+" Life");


		switch(loc){
		case "ip":
			selecteddiff.setBounds(555,525,200,100);
			break;
			
		case "gp":
			selecteddiff.setBounds(700,525,200,100);
			break;
			
		case "wp":
			selecteddiff.setBounds(555,525,200,100);
			break;
			
		case "op":
			selecteddiff.setBounds(555,525,200,100);
			break;
			
		}


		selecteddiff.setVisible(true);
		selecteddiff.setFont(new Font(fontStyle, Font.BOLD, 30));
		add(selecteddiff);

		validate();
		repaint();

	}
	*/
	public void paintComponent (Graphics g) //method to set background //JD
	{
		super.paintComponent(g);
		Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.jpg");
		g.drawImage(myImage, 0, 0, this);

	}
}

