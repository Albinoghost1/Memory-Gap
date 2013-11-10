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
   	JLabel Option1 = new JLabel("Race");
   	JLabel Option2 = new JLabel("Sex");
   	JLabel Option3 = new JLabel("Option 3 (incomplete)");
   	
   	JLabel title = new JLabel("Options"); //text for title
    
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
       	
       	title.setBounds(260, 50, 400, 100);
		title.setFont(new Font("Serif", Font.BOLD, 45));
       	
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
     
       
       	Option1.setBounds(150,300,100,50);
       	Option2.setBounds(150,350,100,50);
       	Option3.setBounds(150,400,150,50);
       	
       Human.setBounds(200,300,75,50);
       Ostrich.setBounds(280,300,75,50);
       Potato.setBounds(355,300,75,50);
       	
       Male.setBounds(200,350,100,50);
       Female.setBounds(280,350,100,50);
       	
    	bOk.setBounds(217,500,150,50);
       	
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
      	add(title);
      	
  	} // end constructor
 	
	public void paintComponent (Graphics g)
	 {
	    super.paintComponent(g);
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.png");
	    g.drawImage(myImage, 0, 0, this);
	 }


}// end class


