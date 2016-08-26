import javax.swing.*;

import java.awt.*;

@SuppressWarnings("serial")
public class ScoreLife_Panel extends JPanel { //Panel created to display life and score 

	// attributes 

	private JLabel life1;
	private JLabel life2;
	private JLabel life3;
	private JLabel life4;
	private JLabel life5;

	private int difficulty= 1;
	private String race = "";
	private String gender ="";
	private int lives;
	private int level;
	private int character = 1;

	private JButton bmenu;
	private JButton bnextLevel;

	private JButton[] bstartLevel = new JButton[11];

	private String buttontile = Back_Panel.getButtonTile();
	private String fontStyle = Back_Panel.getFontStyle();

	public ScoreLife_Panel() { 
		super();
		setLayout(null);

		//constructor objects

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

		for (int i=0;i<11;i++){ 
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

	public void setDiff(int d){ //accessor to set difficulty for timer//

		difficulty = d;

	}

	public void setRace(String r){//
		race = r;
	}
	public void setLives(){//

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


	// Other Methods 

	public void addLives(){



		add(life1);
		if (difficulty == 2){
		add(life2);
		add(life3);
		}
		else if (difficulty == 1){
		add(life2);
		add(life3);
		add(life4);
		add(life5);
		}



	}
	public void removeLife() //
	{
				
		if (!"Potato".equals(race)){
			switch (lives){
				case 1:
					  int reply = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
				        if (reply == JOptionPane.YES_OPTION) {
				        	bmenu.doClick();
				        }
				        else {
				        	System.exit(0);
				        }
				case 2:remove(life2);break;
				case 3:remove(life3);break;
				case 4:remove(life4);break;
				case 5:remove(life5);break;
				default:System.exit(0);break;
			
			
			}
		}
		lives -= 1;

		validate();
		repaint();
	}



	public void addMenu() 
	{
		add(bmenu);

	}

	public void addNextLevel()
	{
		add(bnextLevel);

	}

	public void removeNextLevel()
	{
		remove(bnextLevel);

	}

	public void setLevelButton(int implevel)
	{
		level = implevel;

	}


	public void removeAll()
	{
		remove(bnextLevel);
		for (int i=0;i<11;i++){
			remove(bstartLevel[i]);	
		}

	}

	public void addStartLevel(int level)
	{
		for (int i=0;i<11;i++){
			remove(bstartLevel[i]);	
		}
		
		add (bstartLevel[level]);

	}

}
