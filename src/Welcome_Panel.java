import java.awt.*;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Welcome_Panel extends JPanel {
	JButton bOption;	
	
  	public Welcome_Panel() {
		super();
		setBackground(Color.blue);
		setLayout(null);
		bOption = new JButton("Options");	    //create button
		bOption.setBounds(500, 200, 150, 50);   //define position
		add(bOption);				    // add button to panel
  	} // end constructor


	
	
	
	public void paintComponent (Graphics g)
	 {
	    super.paintComponent(g);
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/background.jpg");
	    g.drawImage(myImage, 0, 0, this);
	 }

}
