import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.JSlider;

public class Options_Panel extends JPanel {

	JButton bSave; //makes Save button 

	JButton bHuman; //makes Human ? button 
	JButton bOstrich; //makes Ostrich ? button 
	JButton bPotato; //makes Potato ? button 
	
	JSlider SliderSound = new JSlider(JSlider.HORIZONTAL,0,10,5);
	JSlider SliderMusic = new JSlider(JSlider.HORIZONTAL,0,10,5);
	
	

	JLabel Race = new JLabel("Race"); //makes jlabel for Race label
	JLabel Sex = new JLabel("Sex"); //makes jlabel for Sex 
	JLabel Difficulty = new JLabel("Difficulty"); //makes jlabel for Difficulty 
	JLabel Bgmusic =new JLabel("BG Music");//makes jlabel for Background music label
	JLabel Sound = new JLabel("Sound Control");//makes jlabel for Sound Control label
	JLabel Music = new JLabel("Music Control");//makes jlabel for Music Control label


	JLabel otitle = new JLabel("Options"); //text for title 

	private JRadioButton Human; //jradio Human button 
	private JRadioButton Ostrich; //jradio Ostrich button 
	private JRadioButton Potato; //jradio Potato button 
	private ButtonGroup bgRace; //jradio Race buttongroup 

	private JRadioButton Male; //jradio Male button 
	private JRadioButton Female; //jradio Female button 
	private ButtonGroup bgSex; //jradio Sex buttongroup 

	private JRadioButton Easy; //jradio Easy button 
	private JRadioButton Normal; //jradio Normal button 
	private JRadioButton Expert; //jradio Expert button 
	private ButtonGroup bgDifficulty; //jradio Difficulty buttongroup 

	private JRadioButton bgm1; // jradion bg1 
	private JRadioButton bgm2; // jradio bg2 
	private JRadioButton bgmoff; // jradio bg2 
	private ButtonGroup bgMusic;// bg for bgm 

	String buttontile = Back_Panel.getButtonTile();
	String fontStyle = Back_Panel.getFontStyle();

	public Options_Panel() { //Constructor//

		setLayout(null);

		otitle.setBounds(325, 60, 500, 100);
		otitle.setFont(new Font(fontStyle, Font.PLAIN, 50));
		otitle.setForeground(Color.white);

		setOutline(300,800,500,100,"Options",otitle);
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

		bgm1 = new JRadioButton("Music 1", false);
		bgm2 = new JRadioButton("Music 2", false);
		bgmoff = new JRadioButton("Off", true);

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

		bgMusic = new ButtonGroup();
		bgMusic.add(bgm1);
		bgMusic.add(bgm2);
		bgMusic.add(bgmoff);

		Race.setBounds(200,175,100,20);

		Human.setBounds(280,175,70,20);
		bHuman.setBounds(280,150,80,20);
		bHuman.setToolTipText("Human\n *Can jump higher than the Potato\n ");
		
		Ostrich.setBounds(360,175,70,20);
		bOstrich.setBounds(360,150,80,20);
		bOstrich.setToolTipText("Ostrich\n *Has more feathers than a Human\n *Immune to Smallpox");
		
		Potato.setBounds(440,175,70,20);
		bPotato.setBounds(440,150,80,20);
		bPotato.setToolTipText("Potato\n *Has infinite lives\n *Flame resistant up to 375 degrees\n *Likes long walks on the beach");
		
		Sex.setBounds(200,200,100,20);

		Male.setBounds(280,200,70,20);
		Female.setBounds(360,200,70,20);

		Difficulty.setBounds(200,225,150,20);

		Easy.setBounds(280,225,70,20);
		Normal.setBounds(360,225,70,20);
		Expert.setBounds(440,225,70,20);
 
		Bgmusic.setBounds(200, 250, 150, 20);
		
		bgm1.setBounds(280, 250, 70, 20);
		bgm2.setBounds(360,250,70,20);
		bgmoff.setBounds(440,250,70,20);
		
		Sound.setBounds(200,285,100,20);
		Music.setBounds(200,335,100,20);

		

       SliderMusic.setMajorTickSpacing(1);
       SliderMusic.setPaintTicks(true);
       SliderMusic.setPaintTrack(true);
       SliderMusic.setAutoscrolls(true);
       SliderMusic.setVisible(true);
       SliderMusic.setOpaque(false);
       SliderMusic.setForeground(Color.black);
       SliderMusic.setSize(100,50);
       SliderMusic.setLocation(280,275);
       add(SliderMusic);
       

       SliderSound.setMajorTickSpacing(1);
       SliderSound.setPaintTicks(true);
       SliderSound.setPaintTrack(true);
       SliderSound.setAutoscrolls(true);
       SliderSound.setVisible(true);
       SliderSound.setOpaque(false);
       SliderSound.setForeground(Color.black);
       SliderSound.setSize(100,50);
       SliderSound.setLocation(280,325);
       add(SliderSound);


		bSave.setFont(new Font(fontStyle, Font.PLAIN,0));
		bSave.setForeground(Color.black);
		bSave.setBounds(300,300,150,50);
		bSave.setIcon(new ImageIcon("images/ReturnButton.png"));
		bSave.setHorizontalTextPosition(AbstractButton.CENTER);
		bSave.setToolTipText("Return to Main Menu");
		SetButton(bSave);
		bSave.setBounds(600,600,150,50);
		
		SetButton(Human);
		SetButton(Ostrich);
		SetButton(Potato);
		SetButton(Male);
		SetButton(Female);
		SetButton(Easy);
		SetButton(Normal);
		SetButton(Expert);
		SetButton(bgm1);
		SetButton(bgm2);
		SetButton(bgmoff);


		Race.setForeground(Color.black);
		Sex.setForeground(Color.black);
		Difficulty.setForeground(Color.black);
		Bgmusic.setForeground(Color.black);
		Sound.setForeground(Color.black);
		Music.setForeground(Color.black);
		
		add(Race); 
		add(Sex);
		add(Difficulty);
		add(Bgmusic);
		add(bSave);
		add(bHuman);
		add(bOstrich);
		add(bPotato);
	
		add(Sound);
		add(Music);
	}
	
	
	public void SetButton(JRadioButton buttonName){

		buttonName.setContentAreaFilled(false);
		buttonName.setBorderPainted(false);
		buttonName.setOpaque(false);
		buttonName.setForeground(Color.black);
		add(buttonName);
	}
	
	public void SetButton(JButton buttonName){

		buttonName.setContentAreaFilled(false);
		buttonName.setBorderPainted(false);
		buttonName.setOpaque(false);
		buttonName.setForeground(Color.black);
		add(buttonName);

	}
	

	public int getRace()
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
	public int getSex() 
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
	public int getDifficulty()
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


	public void setOutline(int x,int y,int xbounds,int ybounds,String text,JLabel labelname){
		JLabel Outline = new JLabel(text);

		Outline.setBounds(labelname.getBounds().x-3,labelname.getBounds().y-3,xbounds+3,ybounds+3);
		Outline.setFont(new Font(fontStyle, Font.PLAIN, 51));
		Outline.setForeground(Color.black);
		add(otitle);
		add(Outline);

	}

	//added bgm method to return bgm option 
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

	public void paintComponent (Graphics g)//
	{
		super.paintComponent(g);
		Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.jpg");
		g.drawImage(myImage, 0, 0, this);


	}


}

