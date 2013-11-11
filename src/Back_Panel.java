import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class Back_Panel extends JPanel {
	
	Welcome_Panel wp;
    Options_Panel op;
    Instructions_Panel ip;
    Game_Panel gp;

	public Back_Panel() {
		super();	
		setLayout(new BorderLayout());
		wp = new Welcome_Panel();
		op = new Options_Panel();
		ip = new Instructions_Panel();
		gp = new Game_Panel();
		
		add(wp);
		
	     wp.bOption.addActionListener(new Button_OptionListener()); //main menu option button
	     wp.bGame.addActionListener(new Button_GameListener()); // main menu game button
	     wp.bInstruction.addActionListener(new Button_InstructionListener()); // main menu instructions button
	     gp.bMenu.addActionListener(new ButtonOkListener()); // game menu button which goes back to main menu
	     wp.bExit.addActionListener(new Button_ExitListener()); //main menu exit button
	     ip.bOk.addActionListener(new ButtonOkListener()); // instruction ok button
	     op.bOk.addActionListener(new ButtonOkListener()); // options ok button

	}

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
	        add(gp);
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
	        remove(gp);
	        add(wp);
	        validate();
	        repaint();

	  	}
	}

}







