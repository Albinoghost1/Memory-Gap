import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Options_Panel extends JPanel {
	//Attributes
	JButton bOk;// declare a variable for button OK
	//Constructor
 	public Options_Panel() {
		setBackground(Color.red);
       	setLayout(null);
       	bOk= new JButton("ok");//create ok button
       	bOk.setBounds(500, 400, 150, 50);//define position/size
      	add(bOk);// add button OK to panel
  	} // end constructor
}// end class


