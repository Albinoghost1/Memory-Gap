import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class Back_Panel extends JPanel {
	
	// ATTRIBUTES
	Welcome_Panel wp;//declare a variable for welcome panel
    Options_Panel op;//declare a variable for option panel
    Instructions_Panel ip;//declare a variable for Instructions panel
    Game_Panel gp; //declare a variable for Game Panel
	// CONSTRUCTOR
	public Back_Panel() {
		super();	
		setLayout(new BorderLayout());
		wp = new Welcome_Panel();
		op = new Options_Panel();
		ip = new Instructions_Panel();
		gp = new Game_Panel();
		
		add(wp);
		
	     wp.bOption.addActionListener(new Button_OptionListener());
	     wp.bGame.addActionListener(new Button_GameListener());
	     wp.bInstruction.addActionListener(new Button_InstructionListener());
	     wp.bExit.addActionListener(new Button_ExitListener());
	     ip.bOk.addActionListener(new ButtonOkListener());
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
	private class Button_GameListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	        remove(wp);
	        //add(paintingChild);
	        validate();
	        repaint();

		}
	}
	private class Button_InstructionListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	        remove(wp);
	        add(ip);
	        validate();
	        repaint();

		}
	}
	private class Button_ExitListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	        System.exit(0);

		}
	}
	private class ButtonOkListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	        remove(op);
	        remove(ip);
	       // remove(gp);
	        add(wp);
	        validate();
	        repaint();

	  	}
	}

}// end class







