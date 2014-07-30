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
	//added to display picks 
	int race= 1;
	int difficulty;
	int sex;

	JButton bmenu; //menu button JD
	JButton bnewGame; // new game button JD
	JButton bcontinue; // continue button JD

	JLabel gtitle = new JLabel("Memory Gap"); //text for title JD

	// JLabels to display race and difficulty//
	JLabel grace = new JLabel("Race: ");

	JLabel gdiff = new JLabel("Difficulty: ");
	
	JLabel selecteddiff = new JLabel("");
	JButton selectedRace = new JButton("");

	String buttontile = Back_Panel.getButtonTile(); //gets button background from Back Panel JD
	String fontStyle = Back_Panel.getFontStyle(); //gets fontstyle from Back Panel JD

	static String[] ComboboxStrings = { "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6", "Level 7", "Level 8", "Level 9", "Level 10"};

	static JComboBox cblevelList = new JComboBox(ComboboxStrings);

	public Game_Panel() { //Constructor//JD

		super();
		setLayout(null);

		gtitle.setBounds(245, 70, 400, 100); //sets location of title JD
		gtitle.setFont(new Font(fontStyle, Font.BOLD, 50)); //sets font of title JD

		grace.setBounds(330, 600, 50, 50);
		grace.setFont(new Font(fontStyle, Font.BOLD, 30));

		gdiff.setBounds(560, 380, 50, 50);
		gdiff.setFont(new Font(fontStyle, Font.BOLD, 30));
		gdiff.setForeground(Color.WHITE);

		bmenu = new JButton("Main Menu");
		bnewGame = new JButton("New Game");
		bcontinue = new JButton("Continue");

		bmenu.setBounds(200,350,150,50); //sets location of menu button JD
		bnewGame.setBounds(200, 400, 150, 50); //sets location of new game button JD
		bcontinue.setBounds(200, 450, 150, 50); //sets location of continue button JD
		
		//add(gtitle); //adds title JD
		add(bmenu); //adds menu button JD
		add(bnewGame); //adds new game button JD
		add(bcontinue); //adds continue button JD


		
		cblevelList.setBounds(220, 615, 100, 25); //sets location of levellist combobox JD
		add(cblevelList);//adds combobox JD
		
		



		bmenu.setToolTipText("Return To Main Menu");
		bnewGame.setToolTipText("New Game");
		bcontinue.setToolTipText("Continue");
		
		
		SetButton(bmenu,650,0,"images/ReturnButton.png");
		SetButton(bnewGame,170,0,"images/PlayButton.png");
		SetButton(bcontinue,320,0,"images/NextLevelButton.png");
	
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
	
	 //Method created to handle display of race and diff 
	 public void displayRaceDif(int r, int s, int d,String loc){
		race = r;
		difficulty = d;
		sex=s;


		if (race==1 && s ==1){
			selectedRace.setIcon(new ImageIcon("images/humanm1-3_opt.png"));
		}
		if (race==1 && s ==2){
			selectedRace.setIcon(new ImageIcon("images/humanf1-3_opt.png"));
		}
		else if (race == 2 && s ==1){
			selectedRace.setIcon(new ImageIcon("images/ostrichm1-3_opt.png"));
		}
		else if (race == 2 && s ==2){
			selectedRace.setIcon(new ImageIcon("images/ostrichf1-3_opt.png"));
		}
		else if (race == 3 && s ==1){
			selectedRace.setIcon(new ImageIcon("images/potatom1-3_opt.png"));
		}
		else if (race == 3 && s ==2){
			selectedRace.setIcon(new ImageIcon("images/potatof1-3_opt.png"));
		}
		selectedRace.setBounds(400,600,50,50);
		selectedRace.setVisible(true);
		selectedRace.setFocusPainted(false);
		selectedRace.setContentAreaFilled(false);
		selectedRace.setBorderPainted(false);
		add(selectedRace);


		if(race == 3)
			selecteddiff.setText("Infinite Lifes");
		else if (d>1)
			selecteddiff.setText(d+" Lives");
		else if(d<1)
			selecteddiff.setText(d+" Life");


		switch(loc){
		case "ip":
		case "gp":
		case "wp":
		case "op":
			selecteddiff.setBounds(470,600,250,50);
			break;
			
		}


		selecteddiff.setVisible(true);
		selecteddiff.setFont(new Font("Impact", Font.BOLD, 30));
		selecteddiff.setForeground(Color.WHITE);
		add(selecteddiff);

		validate();
		repaint();

	}

	public void paintComponent (Graphics g) //method to set background //JD
	{
		super.paintComponent(g);
		Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.jpg");
		g.drawImage(myImage, 0, 0, this);

	}
}

