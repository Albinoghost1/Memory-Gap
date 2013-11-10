import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class Back_Panel extends JPanel {
	
	// ATTRIBUTES
	Welcome_Panel wp;//declare a variable for welcome panel
    Options_Panel op;//declare a variable for option panel

	// CONSTRUCTOR
	public Back_Panel() {
		super();	
		setLayout(new BorderLayout());
		wp = new Welcome_Panel();
		op = new Options_Panel();	
		add(wp);	
	     wp.bOption.addActionListener(new Button_OptionListener());
	     op.bOk.addActionListener(new ButtonOkListener());

	}// end constructor

	// METHODS
	
	//Inner Classes
	private class Button_OptionListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	        remove(wp);
	        add(op);
	        validate();
	        repaint();

		}
	}
	private class ButtonOkListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	        remove(op);
	        add(wp);
	        validate();
	        repaint();

	  	}
	}

}// end class







