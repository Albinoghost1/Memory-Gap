import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
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
		
	     wp.bGame.addActionListener(new Button_GameListener()); // main menu game button
	     wp.bInstruction.addActionListener(new Button_InstructionListener()); // main menu instructions button
	     wp.bOption.addActionListener(new Button_OptionListener()); //main menu option button
	     wp.bExit.addActionListener(new Button_ExitListener()); //main menu exit button
	     
	     gp.bMenu.addActionListener(new ButtonOkListener()); // game menu button which goes back to main menu
	     ip.bOk.addActionListener(new ButtonOkListener()); // instruction ok button
	     op.bOk.addActionListener(new ButtonOkListener()); // options ok button
	     
	     op.bHuman.addActionListener(new HumanListener()); //? button over human
	     op.bOstrich.addActionListener(new OstrichListener()); //? button over Ostrich
	     op.bPotato.addActionListener(new PotatoListener()); //? button over Potato

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
private class HumanListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   JOptionPane.showMessageDialog(null, "Human\n *Can jump higher than the Potato\n ");

	  	}
	}
private class OstrichListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   JOptionPane.showMessageDialog(null, "Ostrich\n *Has more feathers than a Human\n *Immune to Smallpox");

	  	}
	}
private class PotatoListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   JOptionPane.showMessageDialog(null, "Potato\n If this was a Who Can Be the best Potato Championship this is the one to pick\n *Flame resistant up to 375 degrees\n *Likes long walks on the beach");

	  	}
	}
	
}
	
	







