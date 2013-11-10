import java.awt.Color;
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
   	JLabel Option1 = new JLabel("Race");
   	JLabel Option2 = new JLabel("Sex");
   	JLabel Option3 = new JLabel("Option 3 (incomplete)");
   	

    
    private JRadioButton Human;
    private JRadioButton Ostrich;
    private JRadioButton Potato;
    private ButtonGroup Race;
    
    private JRadioButton Male;
    private JRadioButton Female;
    private ButtonGroup Sex;
    
	//Constructor
 	public Options_Panel() {
 		
		setBackground(Color.white);
       	setLayout(null);
       	
       	bOk= new JButton("Ok");
       	
        Human = new JRadioButton("Human", true);
        Ostrich = new JRadioButton("Ostrich", false);
        Potato = new JRadioButton("Potato", false);
        
        Male = new JRadioButton("Male", true);
        Female = new JRadioButton("Female", false);

        Race = new ButtonGroup();
        Race.add(Human);
        Race.add(Ostrich);
        Race.add(Potato);
        
        Sex = new ButtonGroup();
        Sex.add(Male);
        Sex.add(Female);
     
       	bOk.setBounds(300, 400,150,50);
       	Option1.setBounds(300,200,150,50); 
       	Option2.setBounds(300,250,150,50); 
       	Option3.setBounds(300,300,150,50);
       	Human.setBounds(350,200,100,50);
       	Ostrich.setBounds(450,200,100,50);
       	Potato.setBounds(550,200,100,50);
       	Male.setBounds(350,250,100,50);
       	Female.setBounds(450,250,100,50);
       	
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
       	
       	add(Human);
        add(Ostrich);
        add(Potato);
        add(Male);
        add(Female);
       	add(Option1); 
       	add(Option2);
       	add(Option3);
      	add(bOk);
      	
  	} // end constructor
 	
	public void paintComponent (Graphics g)
	 {
	    super.paintComponent(g);
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.png");
	    g.drawImage(myImage, 0, 0, this);
	 }


}// end class


