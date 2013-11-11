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

public class Options_Panel extends JPanel {

	JButton bOk; //makes ok button
	
	JButton bHuman; //makes Human ? button
	JButton bOstrich; //makes Ostrich ? button
	JButton bPotato; //makes Potato ? button
	
   	JLabel Option1 = new JLabel("Race"); //makes jlabel for option 1 Race
   	JLabel Option2 = new JLabel("Sex"); //makes jlabel for option 2 Sex
   	JLabel Option3 = new JLabel("Difficulty"); //makes jlabel for option 3 Difficulty
   	
   	JLabel otitle = new JLabel("Options"); //text for title
    
    private JRadioButton Human; //jradio Human button
    private JRadioButton Ostrich; //jradio Ostrich button
    private JRadioButton Potato; //jradio Potato button
    private ButtonGroup gRace; //jradio Race buttongroup
    
    private JRadioButton Male; //jradio Male button
    private JRadioButton Female; //jradio Female button
    private ButtonGroup gSex; //jradio Sex buttongroup
    
    private JRadioButton Easy; //jradio Easy button
    private JRadioButton Normal; //jradio Normal button
    private JRadioButton Expert; //jradio Expert button
    private ButtonGroup gDifficulty; //jradio Difficulty buttongroup
    
 	public Options_Panel() { //Constructor
 		
       	setLayout(null);
       	
       otitle.setBounds(260, 50, 400, 100);
       otitle.setFont(new Font("Serif", Font.BOLD, 45));
       //otitle.setForeground(Color.LIGHT_GRAY); //sets color of title
       
       	bOk= new JButton("Ok");
       	
       	bHuman = new JButton("?");
       	bOstrich = new JButton("?");
       	bPotato = new JButton("?");
       	
        Human = new JRadioButton("Human", true);
        Ostrich = new JRadioButton("Ostrich", false);
        Potato = new JRadioButton("Potato", false);
        
        Male = new JRadioButton("Male", true);
        Female = new JRadioButton("Female", false);
        
        Easy = new JRadioButton("Easy", false);
        Normal = new JRadioButton("Normal", true);
        Expert = new JRadioButton("Expert", false);

        gRace = new ButtonGroup();
        gRace.add(Human);
        gRace.add(Ostrich);
        gRace.add(Potato);
        
        gSex = new ButtonGroup();
        gSex.add(Male);
        gSex.add(Female);
        
        gDifficulty = new ButtonGroup();
        gDifficulty.add(Easy);
        gDifficulty.add(Normal);
        gDifficulty.add(Expert);
        
       	Option1.setBounds(200,175,100,20);
       	Option2.setBounds(200,200,100,20);
       	Option3.setBounds(200,225,150,20);
       	
       	Human.setBounds(280,175,70,20);
       	Ostrich.setBounds(360,175,70,20);
       	Potato.setBounds(440,175,70,20);
       	
       	Male.setBounds(280,200,70,20);
       	Female.setBounds(360,200,70,20);
       	
       	Easy.setBounds(280,225,70,20);
       	Normal.setBounds(360,225,70,20);
       	Expert.setBounds(440,225,70,20);
       	
    	bOk.setBounds(300,300,150,50);
    	bOk.setIcon(new ImageIcon("images/buttontile.png"));
    	bOk.setHorizontalTextPosition(AbstractButton.CENTER);
		
    	bHuman.setBounds(280,150,50,20);
    	bOstrich.setBounds(360,150,50,20);
    	bPotato.setBounds(440,150,50,20);
       	
       	Human.setOpaque(false);
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
       	add(Option1); 
       	add(Option2);
       	add(Option3);
      	add(bOk);
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
        validate();
        repaint();
	    
	 }


}

