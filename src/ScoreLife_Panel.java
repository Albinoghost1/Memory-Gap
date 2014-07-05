import javax.swing.*;

import java.awt.*;

public class ScoreLife_Panel extends JPanel { //Panel created to display life and score DN

	// attributes DN

	JLabel life1;
	JLabel life2;
	JLabel life3;
	JLabel life4;
	JLabel life5;

	int difficulty= 1;
	int race = 1;
	int lives;
	int level;
	int character = 1;

	JButton bmenu;
	JButton bnextLevel;

	JButton[] bstartLevel = new JButton[11];

	String buttontile = Back_Panel.getButtonTile();
	String fontStyle = Back_Panel.getFontStyle();

	public ScoreLife_Panel() { //Changed this to accept values DN
		super();
		setLayout(null);



		//constructor objects, Could possibly have if's to affect lifes DN


		life1 = new JLabel();
		life2 = new JLabel();
		life3 = new JLabel();
		life4 = new JLabel();
		life5 = new JLabel();


		life1.setIcon(new ImageIcon("images/life.png"));
		life2.setIcon(new ImageIcon("images/life.png"));
		life3.setIcon(new ImageIcon("images/life.png"));
		life4.setIcon(new ImageIcon("images/life.png"));
		life5.setIcon(new ImageIcon("images/life.png"));


		life1.setBounds(50,10,50,50);
		life2.setBounds(100,10,50,50);
		life3.setBounds(150,10,50,50);
		life4.setBounds(200,10,50,50);
		life5.setBounds(250,10,50,50);


		bmenu = new JButton("Main Menu");
		bmenu.setBounds(650,10,150,50);
		bmenu.setFont(new Font(fontStyle, Font.BOLD,20));
		bmenu.setIcon(new ImageIcon("images/buttontile.png"));
		bmenu.setForeground(Color.white);
		bmenu.setHorizontalTextPosition(AbstractButton.CENTER);

		bnextLevel = new JButton("Next Level");
		bnextLevel.setBounds(500,10,150,50);
		bnextLevel.setFont(new Font(fontStyle, Font.BOLD,20));
		bnextLevel.setIcon(new ImageIcon("images/buttontile.png"));
		bnextLevel.setForeground(Color.white);
		bnextLevel.setHorizontalTextPosition(AbstractButton.CENTER);

		for (int i=0;i<11;i++){ //JD
			bstartLevel[i] = new JButton("Start Level "+ i);	
			bstartLevel[i].setBounds(350,10,150,50);
			bstartLevel[i].setFont(new Font(fontStyle, Font.BOLD,20));
			bstartLevel[i].setIcon(new ImageIcon("images/buttontile.png"));
			bstartLevel[i].setForeground(Color.white);
			bstartLevel[i].setHorizontalTextPosition(AbstractButton.CENTER);
		}
		add(bstartLevel[level]);
		add(bmenu);
	}
	//accessors and mutators

	public void setDiff(int d){ //accessor to set difficulty for timer//DN

		difficulty = d;

	}

	public void setRace(int r){//DN
		race = r;
	}
	public void setLives(){//DN

		if (difficulty ==3){
			lives=1;
		}
		if (difficulty ==2){
			lives=3;
		}
		if (difficulty ==1){
			lives=5;
		}

	}


	// Other Methods DN

	public void addLives(){//JD



		add(life1);
		add(life2);
		add(life3);
		add(life4);
		add(life5);

		if (difficulty == 2)
			remove(life4);
			remove(life5);

		if (difficulty == 3){
			remove(life2);
			remove(life3);
			remove(life4);
			remove(life5);
		}


	}
	public void removeLife() //DN
	{
		if (lives < 1 && race != 3){
			JOptionPane.showMessageDialog(null,"Game Over");
			//Back_Panel bpreset = new Back_Panel();
			//bpreset.ResetGame();
			System.exit(0);
		}

		if (lives == 1 && race != 3) {
			remove(life1);
		}  
		if (lives == 2 && race != 3) {
			remove(life2);
		}  
		if (lives == 3 && race != 3) {
			remove(life3);
		}  
		if (lives == 4 && race != 3) {
			remove(life4);
		}  
		if (lives == 5 && race != 3) {
			remove(life5);
		} 

		lives -= 1;


		validate();
		repaint();
	}



	public void addMenu() //JD
	{
		add(bmenu);

	}

	public void addNextLevel()//JD
	{
		add(bnextLevel);

	}

	public void removeNextLevel()//JD
	{
		remove(bnextLevel);

	}

	public void setLevelButton(int implevel)//JD
	{
		level = implevel;

	}


	public void removeAll()//JD
	{
		remove(bnextLevel);
		for (int i=0;i<11;i++){
			remove(bstartLevel[i]);	
		}

	}

	public void addStartLevel(int level)//JD
	{
		for (int i=0;i<11;i++){
			remove(bstartLevel[i]);	
		}
		
		add (bstartLevel[level]);

	}

}
