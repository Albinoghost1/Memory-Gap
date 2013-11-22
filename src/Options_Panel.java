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

public class Options_Panel extends JPanel { //entire class by JD

	JButton bSave; //makes Save button
	
	JButton bHuman; //makes Human ? button
	JButton bOstrich; //makes Ostrich ? button
	JButton bPotato; //makes Potato ? button
	
   	JLabel Race = new JLabel("Race"); //makes jlabel for option 1 Race
   	JLabel Sex = new JLabel("Sex"); //makes jlabel for option 2 Sex
   	JLabel Difficulty = new JLabel("Difficulty"); //makes jlabel for option 3 Difficulty
   	
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
    
	String buttontile = Back_Panel.getButtonTile();
	String fontStyle = Back_Panel.getFontStyle();
    
 	public Options_Panel() { //Constructor
 		
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
       	
       	bSave.setFont(new Font(fontStyle, Font.BOLD,35));
       	bSave.setForeground(Color.white);
       	bSave.setBounds(300,300,150,50);
       	bSave.setIcon(new ImageIcon(buttontile));
       	bSave.setHorizontalTextPosition(AbstractButton.CENTER);
		
  
       	Human.setOpaque(false); //these make the background of the buttons invisible
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
       	
       	add(Human);
        add(Ostrich);
        add(Potato);
        add(Male);
        add(Female);
        add(Easy);
        add(Normal);
        add(Expert);
       	add(Race); 
       	add(Sex);
       	add(Difficulty);
      	add(bSave);
      	add(bHuman);
      	add(bOstrich);
      	add(bPotato);
      	add(otitle);
      	
  	}
 	
 public String getRace()
 {
	 String race = null;
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
	 String sex = null;
	if(Male.isSelected()){
	sex = "Male";
	}
	else{
	sex = "Female";	
	}
	return sex;
	 
 }
 public String getDifficulty()
 {
	 String difficulty = null;
	if(Easy.isSelected()){
	difficulty = "Easy";
	}
	else if(Normal.isSelected()){
	difficulty = "Medium";
	}
	else
	{
	difficulty = "Expert";	
	}
	return difficulty;
	 
 }
 	
	public void paintComponent (Graphics g)
	 {
	    super.paintComponent(g);
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/background3.png");
	    g.drawImage(myImage, 0, 0, this);

	    
	 }


}

