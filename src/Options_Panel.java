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

@SuppressWarnings("serial")
public class Options_Panel extends JPanel {

	private JButton bSave; //makes Save button 

	private JButton bHuman; //makes Human ? button 
	private JButton bOstrich; //makes Ostrich ? button 
	private JButton bPotato; //makes Potato ? button 
	
	private JLabel Race = new JLabel("Race"); //makes jlabel for Race label
	private JLabel Sex = new JLabel("Sex"); //makes jlabel for Sex 
	private JLabel Difficulty = new JLabel("Difficulty"); //makes jlabel for Difficulty 

	private JLabel otitle = new JLabel("Options"); //text for title 

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

	private String fontStyle = Back_Panel.getFontStyle();

	public Options_Panel() { //Constructor//

		setLayout(null);

		otitle.setBounds(325, 60, 500, 100);
		otitle.setFont(new Font(fontStyle, Font.PLAIN, 50));
		otitle.setForeground(Color.white);

		setOutline(300,800,500,100,"Options",otitle);
		
		setbSave(new JButton("Save"));

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
		
		getbSave().setFont(new Font(fontStyle, Font.PLAIN,0));
		getbSave().setForeground(Color.black);
		getbSave().setBounds(300,300,150,50);
		getbSave().setIcon(new ImageIcon("images/ReturnButton.png"));
		getbSave().setHorizontalTextPosition(AbstractButton.CENTER);
		getbSave().setToolTipText("Return to Main Menu");
		setButton(getbSave());
		getbSave().setBounds(600,600,150,50);
		
		setButton(Human);
		setButton(Ostrich);
		setButton(Potato);
		setButton(Male);
		setButton(Female);
		setButton(Easy);
		setButton(Normal);
		setButton(Expert);

		Race.setForeground(Color.black);
		Sex.setForeground(Color.black);
		Difficulty.setForeground(Color.black);
		
		add(Race); 
		add(Sex);
		add(Difficulty);
		add(getbSave());
		add(bHuman);
		add(bOstrich);
		add(bPotato);
	
	}
	
	
	public void setButton(JRadioButton buttonName){

		buttonName.setContentAreaFilled(false);
		buttonName.setBorderPainted(false);
		buttonName.setOpaque(false);
		buttonName.setForeground(Color.black);
		add(buttonName);
	}
	
	public void setButton(JButton buttonName){

		buttonName.setContentAreaFilled(false);
		buttonName.setBorderPainted(false);
		buttonName.setOpaque(false);
		buttonName.setForeground(Color.black);
		add(buttonName);

	}
	
	public String getRace()
	{
		String race;
		if(Potato.isSelected()){
			race = "Potato";
		}
		else if(Ostrich.isSelected()){
			race = "Ostrich";
		}
		else
		{
			race = "Human";	
		}
		return race;

	}
	public String getSex() 
	{
		String sex;
		if(Male.isSelected()){
			sex = "Male";
		}
		else{
			sex = "Female";	
		}
		return sex;

	}
	public int getDifficulty()
	{
		int difficulty = 1;
		
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

		Outline.setBounds(labelname.getBounds().x-8,labelname.getBounds().y-8,xbounds+8,ybounds+8);
		Outline.setFont(new Font(fontStyle, Font.PLAIN, 55));
		Outline.setForeground(Color.black);
		add(otitle);
		add(Outline);

	}


	public void paintComponent (Graphics g)//
	{
		super.paintComponent(g);
		Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.jpg");
		g.drawImage(myImage, 0, 0, this);


	}


	public JButton getbSave() {
		return bSave;
	}


	public void setbSave(JButton bSave) {
		this.bSave = bSave;
	}


}

