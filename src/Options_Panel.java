import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Options_Panel extends JPanel { //JD

	JButton bSave; //makes Save button JD

	JButton bHuman; //makes Human ? button JD
	JButton bOstrich; //makes Ostrich ? button JD
	JButton bPotato; //makes Potato ? button JD

	JLabel Race = new JLabel("Race"); //makes jlabel for option 1 Race JD
	JLabel Sex = new JLabel("Sex"); //makes jlabel for option 2 Sex JD
	JLabel Difficulty = new JLabel("Difficulty"); //makes jlabel for option 3 Difficulty JD
	JLabel Bgmusic =new JLabel("BG Music");//makes jlabel for Background music DN

	JLabel otitle = new JLabel("Options"); //text for title JD

	private JRadioButton Human; //jradio Human button JD
	private JRadioButton Ostrich; //jradio Ostrich button JD
	private JRadioButton Potato; //jradio Potato button JD
	private ButtonGroup bgRace; //jradio Race buttongroup JD

	private JRadioButton Male; //jradio Male button JD
	private JRadioButton Female; //jradio Female button JD
	private ButtonGroup bgSex; //jradio Sex buttongroup JD

	private JRadioButton Easy; //jradio Easy button JD
	private JRadioButton Normal; //jradio Normal button JD
	private JRadioButton Expert; //jradio Expert button JD
	private ButtonGroup bgDifficulty; //jradio Difficulty buttongroup JD

	private JRadioButton bgm1; // jradion bg1 DN
	private JRadioButton bgm2; // jradio bg2 DN
	private JRadioButton bgm3; // jradio bg2 DN
	private ButtonGroup bgMusic;// bg for bgm DN

	String buttontile = Back_Panel.getButtonTile();//JD
	String fontStyle = Back_Panel.getFontStyle();//JD

	public Options_Panel() { //Constructor//JD

		setLayout(null);

		otitle.setBounds(260, 50, 400, 100);
		otitle.setFont(new Font(fontStyle, Font.ITALIC, 50));


		bSave= new JButton("Save");

		bHuman = new JButton("Human");
		bOstrich = new JButton("Ostrich");
		bPotato = new JButton("Potato");

		Human = new JRadioButton("Human", true);
		Ostrich = new JRadioButton("Ostrich", false);
		Potato = new JRadioButton("Potato", false);

		Male = new JRadioButton("Male", true);
		Female = new JRadioButton("Female", false);

		Easy = new JRadioButton("Easy", false);
		Normal = new JRadioButton("Normal", true);
		Expert = new JRadioButton("Expert", false);

		bgm1 = new JRadioButton("Bgm 1", false);
		bgm2 = new JRadioButton("Bgm 2", false);
		bgm3 = new JRadioButton("None", true);

		bgRace = new ButtonGroup();
		bgRace.add(Human);
		bgRace.add(Ostrich);
		bgRace.add(Potato);

		bgSex = new ButtonGroup();
		bgSex.add(Male);
		bgSex.add(Female);

		bgDifficulty = new ButtonGroup();
		bgDifficulty.add(Easy);
		bgDifficulty.add(Normal);
		bgDifficulty.add(Expert);

		// group for background music DN
		bgMusic = new ButtonGroup();
		bgMusic.add(bgm1);
		bgMusic.add(bgm2);
		bgMusic.add(bgm3);

		Race.setBounds(200,175,100,20);

		Human.setBounds(280,175,70,20);
		bHuman.setBounds(280,150,80,20);
		Ostrich.setBounds(360,175,70,20);
		bOstrich.setBounds(360,150,80,20);
		Potato.setBounds(440,175,70,20);
		bPotato.setBounds(440,150,80,20);

		Sex.setBounds(200,200,100,20);

		Male.setBounds(280,200,70,20);
		Female.setBounds(360,200,70,20);

		Difficulty.setBounds(200,225,150,20);

		Easy.setBounds(280,225,70,20);
		Normal.setBounds(360,225,70,20);
		Expert.setBounds(440,225,70,20);

		//added option for bg music DN
		Bgmusic.setBounds(200, 250, 150, 20);
		bgm1.setBounds(280, 250, 70, 20);
		bgm2.setBounds(360,250,70,20);
		bgm3.setBounds(440,250,70,20);

		bSave.setFont(new Font(fontStyle, Font.BOLD,35));
		bSave.setForeground(Color.white);
		bSave.setBounds(300,300,150,50);
		bSave.setIcon(new ImageIcon(buttontile));
		bSave.setHorizontalTextPosition(AbstractButton.CENTER);


		Human.setOpaque(false); //these make the background of the buttons invisible JD
		Human.setContentAreaFilled(false); 
		Human.setBorderPainted(false);

		Ostrich.setOpaque(false);
		Ostrich.setContentAreaFilled(false);
		Ostrich.setBorderPainted(false);

		Potato.setOpaque(false);
		Potato.setContentAreaFilled(false);
		Potato.setBorderPainted(false);

		Male.setOpaque(false);
		Male.setContentAreaFilled(false);
		Male.setBorderPainted(false);

		Female.setOpaque(false);
		Female.setContentAreaFilled(false);
		Female.setBorderPainted(false);

		Easy.setOpaque(false);
		Easy.setContentAreaFilled(false);
		Easy.setBorderPainted(false);

		Normal.setOpaque(false);
		Normal.setContentAreaFilled(false);
		Normal.setBorderPainted(false);

		Expert.setOpaque(false);
		Expert.setContentAreaFilled(false);
		Expert.setBorderPainted(false);

		bgm1.setOpaque(false);
		bgm1.setContentAreaFilled(false);
		bgm1.setBorderPainted(false);

		bgm2.setOpaque(false);
		bgm2.setContentAreaFilled(false);
		bgm2.setBorderPainted(false);

		bgm3.setOpaque(false);
		bgm3.setContentAreaFilled(false);
		bgm3.setBorderPainted(false);

		add(Human);
		add(Ostrich);
		add(Potato);
		add(Male);
		add(Female);
		add(Easy);
		add(Normal);
		add(Expert);
		add(bgm1);
		add(bgm2);
		add(bgm3);
		add(Race); 
		add(Sex);
		add(Difficulty);
		add(Bgmusic);
		add(bSave);
		add(bHuman);
		add(bOstrich);
		add(bPotato);
		add(otitle);

	}

	public int getRace()/// edit DN 11/19
	{
		int race;
		if(Potato.isSelected()){
			race = 3;
		}
		else if(Ostrich.isSelected()){
			race = 2;
		}
		else
		{
			race = 1;	
		}
		return race;

	}
	public int getSex() /// edit DN 11/19
	{
		int sex;
		if(Male.isSelected()){
			sex = 1;
		}
		else{
			sex = 2;	
		}
		return sex;

	}
	public int getDifficulty()//JD
	{
		int difficulty = 0;
		
		if(Easy.isSelected()){
			difficulty = 1;
		}
		else if(Normal.isSelected()){
			difficulty = 2;
		}
		else
		{
			difficulty = 3;	
		}
		return difficulty;

	}



	//added bgm method to return bgm option DN
	public int getBGMusic(){
		int bgm;
		if(bgm1.isSelected()){
			bgm = 1;
		}
		else if(bgm2.isSelected()){
			bgm = 2;
		}
		else {
			bgm = 3;
		}
		return bgm;
	}

	public void paintComponent (Graphics g)//JD
	{
		super.paintComponent(g);
		Image myImage = Toolkit.getDefaultToolkit().getImage("images/background3.png");
		g.drawImage(myImage, 0, 0, this);


	}


}

