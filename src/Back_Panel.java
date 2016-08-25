
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Back_Panel extends JPanel {//

	//initialize Variables
	Welcome_Panel wp;
	Options_Panel op;
	Instructions_Panel ip;
	Game_Panel gp;
	Level lp; 

	//Creates JButton Array 
	JButton[] bstartLevel = new JButton[11];

	//Sets Strings for FontStyle and buttontile(button background) 
	static String fontStyle = "Impact"; //font for entire program 
	static String buttontile = "images/buttontile.png"; //button location for entire program 

	public Back_Panel() {//
		super();	
		//sets layout to border 
		setLayout(new BorderLayout());
		//creates new instance of classes
		wp = new Welcome_Panel();
		op = new Options_Panel();
		ip = new Instructions_Panel();
		gp = new Game_Panel();
		lp = new Level();

		//adds Welcome Panel to the screen 
		add(wp);

		
		addKeyListener(new KeyboardInput());
		setFocusable(true);
		requestFocusInWindow();
		requestFocus();
		
		//adds button listeners to JButtons throughout the classes 
		 buttonListener(wp.bGame);
		 buttonListener(wp.bInstruction);
		 buttonListener(wp.bOption);
		 buttonListener(wp.bExit);

		 buttonListener(gp.bmenu);
		 buttonListener(gp.bnewGame);
		 buttonListener(gp.bcontinue);

		 buttonListener(lp.sl.bnextLevel);
		 buttonListener(lp.sl.bmenu);
		
		 buttonListener(ip.bOk);

		buttonListener(op.bSave);
		
		op.bHuman.addActionListener(new HumanListener());
		op.bOstrich.addActionListener(new OstrichListener());
		op.bPotato.addActionListener(new PotatoListener());
		
		
		//sets bstartLevel array = bstartlevel array in scorelife panel 
		//adds button listeners to bstartlevel array 
		for (int i=0;i<11;i++){
			bstartLevel[i] = lp.sl.bstartLevel[i];
			bstartLevel[i].addActionListener(new Button_Listener());
		}

	}
	//add generic button listener to jbutton
	public void buttonListener(JButton buttonName){
		buttonName.addActionListener(new Button_Listener());
	}
	

	//main private class button listener for all buttons 

	private class Button_Listener implements ActionListener {//
		public void actionPerformed(ActionEvent event) {
			requestFocusInWindow();
			requestFocus();
			menuMove(event.getActionCommand());
			}
	}
		
	//it checks how each button is labeled and does things accordingly 
		public void menuMove(String buttonName) {

				
			switch(buttonName){
			
			//if button is named Options this case happens 
			//removes welcome panel
			//adds option panel
			case "Options":
				remove(wp);
				add(op);
				break;

				//if button is named Play this case happens 
				//removes welcome panel
				//adds game panel
			case "Play":

				remove(wp);
				add(gp);
				lp.sl.setLives();
				gp.displayRaceDif(op.getRace(), op.getSex(), op.getDifficulty(), "op");
				break;	   
				
				
				//if button is named Instructions this case happens 
				//removes welcome panel
				//adds Instruction panel
			case "Instructions":
				remove(wp);
				add(ip);
				break;

				//if button is named Exit this case happens 
				//Exits game
			case "Exit":

				  int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
			        if (reply == JOptionPane.YES_OPTION) {
			          System.exit(0);
			        }
			        else {

			          
			        }
				break;

				//if button is named Ok this case happens 
				//Remove Instruction Panel
				//Remove Game Panel
				//Add Welcome Panel
			case "Ok":

				remove(ip);
				
			case "Save":
				remove(op);
				remove(lp.sl);
				remove(lp);
				remove(gp);
				add(wp);

				lp.sl.setDiff(op.getDifficulty());
				lp.cr.setChar(op.getSex(),op.getRace());
				break;

				//if button is named Main Menu this case happens 
				//calls method in Level Panel that Clears level
				//remove Scorelife Panel
				//remove Level Panel
				//remove Game Panel
				//add Welcome Panel
				
			case "Main Menu":

				lp.clearLevel();
				remove(lp.sl);
				remove(lp);
				remove(gp);
				add(wp);
				break;

				//if button is named Next Level this case happens 
				//gets level from Level Panel and calls level set level method which sets level variable
				//gets level from Level Panel and calls Scorelife Panel set LevelButton method which sets the "X" in JButton "Start Level X"
				//gets level from Level Panel and calls add start level method which places "Start Level X" (X=current level) on the screen
				//calls method in Level Panel that Clears level
				//checks what level variable equals and goes to next level
				
				
			case "Next Level":

				lp.setLevel(lp.level+1);
				lp.sl.setLevelButton(lp.getLevel()+1);
				lp.sl.addStartLevel(lp.level);
				lp.cr.setAvatar();
				lp.clearLevel();

				if (lp.getLevel() == 1)
				{
					lp.level2();
				}
				else if (lp.getLevel() == 2)
				{
					lp.level3();
				}
				else if (lp.getLevel() == 3)
				{
					lp.level4();
				}
				else if (lp.getLevel() == 4)
				{
					lp.level5();
				}
				else if (lp.getLevel() == 5)
				{
					lp.level6();
				}
				else if (lp.getLevel() == 6)
				{
					lp.level7();
				}
				else if (lp.getLevel() == 7)
				{
					lp.level8();
				}
				else if (lp.getLevel() == 8)
				{
					lp.level9();
				}
				else if (lp.getLevel() == 9)
				{
					lp.level10();
				}
				break;

				//if button is named Continue this case happens 
			case "Continue":

				//checks Level Panel combobox for which level is selected and calls that level method  
				lp.setLevel(Integer.parseInt((String) gp.cblevelList.getSelectedItem()));

				//Added here to handle lives 
				lp.setSex(op.getSex());
				lp.setRace(op.getRace());
				lp.setDifficulty(op.getDifficulty());
				lp.cr.setLevel(lp.getLevel());

				lp.createCharacter();  
				
				//Added to send race to SL 
				lp.sl.setRace(op.getRace());
				lp.sl.addLives();
				lp.cr.setAvatar();

				//removes Game Panel 
				//Adds Level Panel
				remove(gp);
				add(lp);

				//gets level from Level Panel and calls Scorelife Panel set LevelButton method which sets the "X" in JButton "Start Level X" 
				//gets level from Level Panel and calls add start level method which places "Start Level X" (X=current level) on the screen
				lp.sl.setLevelButton(lp.getLevel());
				lp.sl.addStartLevel(lp.getLevel());

				//checks Level Panel level variable and calls that level method 
				if (lp.getLevel() == 1)
				{
					lp.level1();
				}
				else if (lp.getLevel() == 2)
				{
					lp.level2();
				}
				else if (lp.getLevel() == 3)
				{
					lp.level3();
				}
				else if (lp.getLevel() == 4)
				{
					lp.level4();
				}
				else if (lp.getLevel() == 5)
				{
					lp.level5();
				}
				else if (lp.getLevel() == 6)
				{
					lp.level6();
				}
				else if (lp.getLevel() == 7)
				{
					lp.level7();
				}
				else if (lp.getLevel() == 8)
				{
					lp.level8();
				}
				else if (lp.getLevel() == 9)
				{
					lp.level9();
				}
				else {	
					lp.level10();
				}
				break;

				//if button is named New Game this case happens 
			case "New Game":

				//calls Level Panel setlevel method and sets level to 1 
				lp.setLevel(1);

				//gets level from Level Panel and calls Scorelife Panel set LevelButton method which sets the "X" in JButton "Start Level X" 
				//gets level from Level Panel and calls add start level method which places "Start Level X" (X=current level) on the screen
				lp.sl.setLevelButton(lp.getLevel());
				lp.sl.addStartLevel(lp.level);

				//send Race,Sex to lp
				lp.setSex(op.getSex());
				lp.setRace(op.getRace());
				//send Difficulty to Level Class 
				lp.setDifficulty(op.getDifficulty());
				lp.cr.setAvatar();
				lp.createCharacter(); 
				//added to send race to SL 
				lp.sl.setRace(op.getRace());
				lp.sl.addLives();
				//Remove Game Panel 
				//Adds Level Panel
				remove(gp);
				add(lp);
				//calls Level Panel Level 1 Method 
				lp.level1(); 
				break;

				//  if button is named  Start Level 1 or Start Level 2 or Start Level 3 or Start Level 4 or Start Level 5 or ... 
			case "Start Level 1":
			case "Start Level 2":
			case "Start Level 3":
			case "Start Level 4":
			case "Start Level 5":
			case "Start Level 6":
			case "Start Level 7":
			case "Start Level 8":
			case "Start Level 9":
			case "Start Level 10":

				//calls Level Panel set level grid 
				lp.setLevelGrid();
				break;	
				

			}
			validate();
			repaint();
		}




	public void ResetGame(){
		lp.clearLevel();
		remove(lp.sl);
		remove(lp);
		remove(gp);
		add(wp);
		validate();
		repaint();
	}
	



	//used to get fontstyle 
	public static String getFontStyle() 
	{
		return fontStyle;
	}

	//used get buttontile background 
	public static String getButtonTile()
	{
		return buttontile;
	}


	
	//Button listeners for race buttons Human,Ostrich,Potato in Option Panel 
	private class HumanListener implements ActionListener {//
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, "Human\n *Can jump higher than the Potato\n ");

		}
	}
	private class OstrichListener implements ActionListener {//
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, "Ostrich\n *Has more feathers than a Human\n *Immune to Smallpox");


		}
	}
	private class PotatoListener implements ActionListener {//
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, "Potato\n *Has infinite lives\n *Flame resistant up to 375 degrees\n *Likes long walks on the beach");

		}
	}
	
	public class KeyboardInput implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
			
			if( e.getKeyCode() == KeyEvent.VK_DOWN ) {
				lp.move(lp.coordConvert(lp.cr.getBounds().x,lp.cr.getBounds().y)+1);


			}
			
			if( e.getKeyCode() == KeyEvent.VK_UP ) {
				lp.move(lp.coordConvert(lp.cr.getBounds().x,lp.cr.getBounds().y)-1);

			}
			
			if( e.getKeyCode() == KeyEvent.VK_LEFT) {
				lp.move(lp.coordConvert(lp.cr.getBounds().x,lp.cr.getBounds().y)-5);
	
			}
			
			if( e.getKeyCode() == KeyEvent.VK_RIGHT ) {
				lp.move(lp.coordConvert(lp.cr.getBounds().x,lp.cr.getBounds().y)+5);
		
			}
			
			if( e.getKeyCode() == KeyEvent.VK_ESCAPE ) {
				ResetGame();
				menuMove("OK");
			}
			
			if( e.getKeyCode() == KeyEvent.VK_ENTER ) {
				if(lp.beatLvl()==true && lp.isVisible()){
					menuMove("Next Level");
				}

			}
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}



}









