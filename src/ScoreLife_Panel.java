import javax.swing.*;

import java.awt.*;

@SuppressWarnings("serial")
public class ScoreLife_Panel extends JPanel {
 //Panel created to display life and score

	
 // attributes

	 private JLabel life1;
	 private JLabel life2;
	 private JLabel life3;
	 private JLabel life4;
	 private JLabel life5;

	 private int difficulty= 1;
	 private String race = "";
	
	 private int lives;
	 private int level;

	 private JButton bmenu;
	 private JButton bnextLevel;

	 private JButton[] bstartLevel = new JButton[11];

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


		setBmenu(new JButton("Main Menu"));
		getBmenu().setBounds(650,10,150,50);
		getBmenu().setFont(new Font(fontStyle, Font.BOLD,20));
		getBmenu().setIcon(new ImageIcon("images/buttontile.png"));
		getBmenu().setForeground(Color.white);
		getBmenu().setHorizontalTextPosition(AbstractButton.CENTER);

		setBnextLevel(new JButton("Next Level"));
		getBnextLevel().setBounds(500,10,150,50);
		getBnextLevel().setFont(new Font(fontStyle, Font.BOLD,20));
		getBnextLevel().setIcon(new ImageIcon("images/buttontile.png"));
		getBnextLevel().setForeground(Color.white);
		getBnextLevel().setHorizontalTextPosition(AbstractButton.CENTER);

		for (int i=0;i<11;i++){
			getBstartLevel()[i] = new JButton("Start Level "+ i);
			getBstartLevel()[i].setBounds(350,10,150,50);
			getBstartLevel()[i].setFont(new Font(fontStyle, Font.BOLD,20));
			getBstartLevel()[i].setIcon(new ImageIcon("images/buttontile.png"));
			getBstartLevel()[i].setForeground(Color.white);
			getBstartLevel()[i].setHorizontalTextPosition(AbstractButton.CENTER);
		}
		add(getBstartLevel()[level]);
		add(getBmenu());
	}
	
	
	
	
 //accessors and mutators

	public void setDiff(int d){
 //accessor to set difficulty for timer
 //

		difficulty = d;

	}

	public void setRace(String r){
 //
		race = r;
	}
	public void setLives(){
 //

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
	public void removeLife()
 //
	{
				
		if (!"Potato".equals(race)){
			switch (lives){
				case 1:
					  int reply = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
				        if (reply == JOptionPane.YES_OPTION) {
				        	getBmenu().doClick();
				        }
				        else {
				        	System.exit(0);
				        }
				 break;
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
		add(getBmenu());

	}

	public void addNextLevel()
	{
		add(getBnextLevel());

	}

	public void removeNextLevel()
	{
		remove(getBnextLevel());

	}

	public void setLevelButton(int implevel)
	{
		level = implevel;

	}


	public void removeAll()
	{
		remove(getBnextLevel());
		for (int i=0;i<11;i++){
			remove(getBstartLevel()[i]);
		}

	}

	public void addStartLevel(int level)
	{
		for (int i=0;i<11;i++){
			remove(getBstartLevel()[i]);
		}
		
		add (getBstartLevel()[level]);

	}



	public JButton getBnextLevel() {
		return bnextLevel;
	}



	public void setBnextLevel(JButton bnextLevel) {
		this.bnextLevel = bnextLevel;
	}



	public JButton getBmenu() {
		return bmenu;
	}



	public void setBmenu(JButton bmenu) {
		this.bmenu = bmenu;
	}



	public JButton[] getBstartLevel() {
		return bstartLevel;
	}



	public void setBstartLevel(JButton[] bstartLevel) {
		this.bstartLevel = bstartLevel;
	}

}