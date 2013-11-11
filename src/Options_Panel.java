import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Options_Panel extends JPanel {

	JButton bOk;
	
	JButton bHuman;
	JButton bOstrich;
	JButton bPotato;
	
   	JLabel Option1 = new JLabel("Race");
   	JLabel Option2 = new JLabel("Sex");
   	JLabel Option3 = new JLabel("Difficulty");
   	
   	JLabel otitle = new JLabel("Options"); //text for title
    
    private JRadioButton Human;
    private JRadioButton Ostrich;
    private JRadioButton Potato;
    private ButtonGroup Race;
    
    private JRadioButton Male;
    private JRadioButton Female;
    private ButtonGroup Sex;
    
    private JRadioButton Easy;
    private JRadioButton Normal;
    private JRadioButton Expert;
    private ButtonGroup Difficulty;
    
 	public Options_Panel() {
 		
       	setLayout(null);
       	
       otitle.setBounds(260, 50, 400, 100);
       otitle.setFont(new Font("Serif", Font.BOLD, 45));
       	
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

        Race = new ButtonGroup();
        Race.add(Human);
        Race.add(Ostrich);
        Race.add(Potato);
        
        Sex = new ButtonGroup();
        Sex.add(Male);
        Sex.add(Female);
        
        Difficulty = new ButtonGroup();
        Difficulty.add(Easy);
        Difficulty.add(Normal);
        Difficulty.add(Expert);
        
       	Option1.setBounds(150,300,100,20);
       	Option2.setBounds(150,375,100,20);
       	Option3.setBounds(150,450,150,20);
       	
       	Human.setBounds(200,300,70,20);
       	Ostrich.setBounds(280,300,70,20);
       	Potato.setBounds(355,300,70,20);
       	
       	Male.setBounds(200,375,70,20);
       	Female.setBounds(280,375,70,20);
       	
       	Easy.setBounds(200,450,70,20);
       	Normal.setBounds(280,450,70,20);
       	Expert.setBounds(355,450,70,20);
       	
    	bOk.setBounds(217,500,150,50);
    	bHuman.setBounds(200,325,50,20);
    	bOstrich.setBounds(280,325,50,20);
    	bPotato.setBounds(355,325,50,20);
       	
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
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.png");
	    g.drawImage(myImage, 0, 0, this);
	 }


}

