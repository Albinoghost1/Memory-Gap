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

public class Back_Panel extends JPanel {//entire class by JD
	
	Welcome_Panel wp;
    Options_Panel op;
    Instructions_Panel ip;
    Game_Panel gp;
    Level lp; 
    
    static String fontStyle = "Vivaldi"; //font for entire program
	static String buttontile = "images/buttontile.png"; //button location for entire program
	  
	public Back_Panel() {
		super();	
		setLayout(new BorderLayout());
		
		wp = new Welcome_Panel();
		op = new Options_Panel();
		ip = new Instructions_Panel();
		gp = new Game_Panel();
		lp = new Level();
		
		add(wp);
		
	     wp.bGame.addActionListener(new Button_Listener()); //Welcome Panel Buttons
	     wp.bInstruction.addActionListener(new Button_Listener());
	     wp.bOption.addActionListener(new Button_Listener());
	     wp.bExit.addActionListener(new Button_Listener());
	     
	     gp.bmenu.addActionListener(new Button_Listener()); //Game Panel Buttons
	     gp.bnewGame.addActionListener(new Button_Listener());
	     gp.bcontinue.addActionListener(new Button_Listener());
	     
	     lp.bmenu.addActionListener(new Button_Listener()); //Level buttons
	     lp.bstartLevel1.addActionListener(new Button_Listener()); 
	     lp.bstartLevel2.addActionListener(new Button_Listener()); 
	     
	     ip.bOk.addActionListener(new Button_Listener()); //Instruction Panel Buttons
	     
	     op.bSave.addActionListener(new Button_Listener()); //Option Panel Buttons
	     op.bHuman.addActionListener(new HumanListener());
	     op.bOstrich.addActionListener(new OstrichListener());
	     op.bPotato.addActionListener(new PotatoListener());

	}

private class Button_Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   switch (event.getActionCommand()) {
			   
			   case "Options":
				   remove(wp);
				   add(op);
				   validate();
				   repaint();
               break;
               
			   case "Play":
			        remove(wp);
			        add(gp);
			        validate();
			        repaint();
               break;	   
				
			   case "Instructions":
			        remove(wp);
			        add(ip);
			        validate();
			        repaint();
              break;
					
			   case "Exit":
			        System.exit(0);
			  break;
				
			   case "Ok":
			        remove(ip);
			        remove(gp);
			        add(wp);
			        
			        validate();
			        repaint();
			  break;
            
			   case "Save":
			        remove(op);
			        add(wp);
			        validate();
			        repaint();
			   break;
           
			   case "Main Menu":
				   lp.clearLevel();
				   	remove(lp);
			        remove(gp);
			        add(wp);
			        validate();
			        repaint();
			        
			   break;
			   
			   case "Continue":
				   remove(gp);
				   if (Game_Panel.cblevelList.getSelectedItem() == "Level 1")
					   lp.level = 1;
				   if (Game_Panel.cblevelList.getSelectedItem() == "Level 2")
					   lp.level = 2;
				   if (Game_Panel.cblevelList.getSelectedItem() == "Level 3")
					   lp.level = 3;
				   if (Game_Panel.cblevelList.getSelectedItem() == "Level 4")
					   lp.level = 4;
				   if (Game_Panel.cblevelList.getSelectedItem() == "Level 5")
					   lp.level = 5;
				   if (Game_Panel.cblevelList.getSelectedItem() == "Level 6")
					   lp.level = 6;
				   if (Game_Panel.cblevelList.getSelectedItem() == "Level 7")
					   lp.level = 7;
				   if (Game_Panel.cblevelList.getSelectedItem() == "Level 8")
					   lp.level = 8;
				   if (Game_Panel.cblevelList.getSelectedItem() == "Level 9")
					   lp.level = 9;
				   if (Game_Panel.cblevelList.getSelectedItem() == "Level 10")
					   lp.level = 10;
				   
					if (lp.getLevel() == 1)
						{
					   	remove(gp);
					   	add(lp);
						lp.level1();
						}
					else if (lp.getLevel() == 2)
						{
					   	remove(gp);
					   	add(lp);
						lp.level2();
						}
					else if (lp.getLevel() == 3)
						{
					   	remove(gp);
					   	add(lp);
						lp.level3();
						}
					else if (lp.getLevel() == 4)
						{
					   	remove(gp);
					   	add(lp);
						lp.level4();
						}
					else if (lp.getLevel() == 5)
						{
					   	remove(gp);
					   	add(lp);
						lp.level5();
						}
					else if (lp.getLevel() == 6)
						{
					   	remove(gp);
					   	add(lp);
						lp.level6();
						}
					else if (lp.getLevel() == 7)
						{
					   	remove(gp);
					   	add(lp);
						lp.level7();
						}
					else if (lp.getLevel() == 8)
						{
					   	remove(gp);
					   	add(lp);
						lp.level8();
						}
					else if (lp.getLevel() == 9)
						{
					   	remove(gp);
					   	add(lp);
						lp.level9();
						}
					else {	
						 }
			        validate();
			        repaint();
			        
			   break;
			   
			   case "New Game":
				   lp.setLevel(1);
				   	remove(gp);
				   	add(lp);
					lp.level1();
			        validate();
			        repaint();
			        
			   break;
			   
			   case "Start Level 1":
			   case "Start Level 2":
			   case "Start Level 3":
			   case "Start Level 4":
			   case "Start Level 5":
				   	lp.clearLevel();
				   	lp.setLevelGrid();
				   	lp.setOpaque(false);

			        validate();
			        repaint();
			       
			   break;	
		   
			   }
		}
	}

public static String getFontStyle()
{
	return fontStyle;
}
public static String getButtonTile()
{
	return buttontile;
}
private class HumanListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   JOptionPane.showMessageDialog(null, "Human\n*Has 1 life\n *Can jump higher than the Potato\n ");

	  	}
	}
private class OstrichListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   JOptionPane.showMessageDialog(null, "Ostrich\n*Can see better in the dark\n *Has more feathers than a Human\n *Immune to Smallpox");


	  	}
	}
private class PotatoListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   JOptionPane.showMessageDialog(null, "Potato\n If this was a Who Can Be the best Potato Championship this is the one to pick\n *Flame resistant up to 375 degrees\n *Likes long walks on the beach");

	  	}
	}


//button listener that goes into level panel to listen to grid buttons

//for (int i=0;i<36;i++){
	 
	// grid[i].addActionListener(new grid[i]_Listener());

//private class grid[i]_Listener implements ActionListener {
	//   public void actionPerformed(ActionEvent event) {
	//	    System.out.println(event.getActionCommand());
	//	   move(i);
	//   }
	//}

//}


}
	
	







