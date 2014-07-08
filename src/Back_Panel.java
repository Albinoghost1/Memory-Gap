import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
=======
>>>>>>> origin/master
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Back_Panel extends JPanel {//JD

	//initialize Variables
	Welcome_Panel wp;
	Options_Panel op;
	Instructions_Panel ip;
	Game_Panel gp;
	Level lp; 

	AudioClip bgm;
	//Creates JButton Array JD
	JButton[] bstartLevel = new JButton[11];

	//Sets Strings for FontStyle and buttontile(button background) JD
	static String fontStyle = "Vivaldi"; //font for entire program JD
	static String buttontile = "images/buttontile.png"; //button location for entire program JD

	public Back_Panel() {//JD
		super();	
		//sets layout to border JD
		setLayout(new BorderLayout());
		//creates new instance of classes
		wp = new Welcome_Panel();
		op = new Options_Panel();
		ip = new Instructions_Panel();
		gp = new Game_Panel();
		lp = new Level();
		//adds Welcome Panel to the screen JD
		add(wp);

		//adds button listeners to JButtons throughout the classes JD
		wp.bGame.addActionListener(new Button_Listener()); //Welcome Panel Buttons JD
		wp.bInstruction.addActionListener(new Button_Listener());
		wp.bOption.addActionListener(new Button_Listener());
		wp.bExit.addActionListener(new Button_Listener());

		gp.bmenu.addActionListener(new Button_Listener()); //Game Panel Buttons JD
		gp.bnewGame.addActionListener(new Button_Listener());
		gp.bcontinue.addActionListener(new Button_Listener());

		lp.sl.bnextLevel.addActionListener(new Button_Listener());//Level buttons JD
		lp.sl.bmenu.addActionListener(new Button_Listener());
<<<<<<< HEAD
		
		addKeyListener( new KeyboardInput());
		
		lp.setFocusable(true);
		lp.addKeyListener(new KeyboardInput());
		
=======

>>>>>>> origin/master
		ip.bOk.addActionListener(new Button_Listener()); //Instruction Panel Buttons JD

		op.bSave.addActionListener(new Button_Listener()); //Option Panel Buttons JD
		op.bHuman.addActionListener(new HumanListener());
		op.bOstrich.addActionListener(new OstrichListener());
		op.bPotato.addActionListener(new PotatoListener());
<<<<<<< HEAD
		
		
=======
>>>>>>> origin/master
		//sets bstartLevel array = bstartlevel array in scorelife panel JD
		//adds button listeners to bstartlevel array JD
		for (int i=0;i<11;i++){
			bstartLevel[i] = lp.sl.bstartLevel[i];
			bstartLevel[i].addActionListener(new Button_Listener());
		}

	}

<<<<<<< HEAD
	//Method to handle bgm 
=======
	//Method to handle bgm DN
>>>>>>> origin/master
	public void bgMusic(){


		if (op.getBGMusic() == 1){
			try {
				URL sound = new URL("file:sound/bgm3.wav");
				bgm = Applet.newAudioClip(sound);
			} catch(Exception e) {
				e.printStackTrace();
			}
<<<<<<< HEAD
		}
		else if(op.getBGMusic() == 2){
			try {
				URL sound = new URL("file:sound/bgm5.wav");
				bgm= Applet.newAudioClip(sound);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		bgm.loop();


	}
	//main private class button listener for all buttons JD
	//it checks how each button is labeled and does things accordingly JD
	private class Button_Listener implements ActionListener {//JD
		public void actionPerformed(ActionEvent event) {
			switch (event.getActionCommand()) {

			//if button is named Options this case happens JD
			//removes welcome panel
			//adds option panel
			case "Options":
				remove(wp);
				add(op);
				break;

				//if button is named Play this case happens JD
				//removes welcome panel
				//adds game panel
			case "Play":

				remove(wp);
				add(gp);
				lp.sl.setLives();
				break;	   

				//if button is named Instructions this case happens JD
				//removes welcome panel
				//adds Instruction panel
			case "Instructions":
				remove(wp);
				add(ip);
				break;

				//if button is named Exit this case happens JD
				//Exits game
			case "Exit":
				System.exit(0);
				break;

				//if button is named Ok this case happens JD
				//Remove Instruction Panel
				//Remove Game Panel
				//Add Welcome Panel
			case "Ok":
				remove(ip);
				remove(gp);
				add(wp);
				break;

				//if button is named Save this case happens JD
				//Remove Option Panel 
				//Add Welcome Panel
				//get Race from Option Panel and send to Character LifeBar method in scorelife panel
				//get race and sex for option panel and send to set Character method in Character class
			case "Save":
				remove(op);
				add(wp);

				lp.sl.setDiff(op.getDifficulty());
				lp.cr.setChar(op.getSex(),op.getRace());
				break;

				//if button is named Main Menu this case happens JD
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

				//if button is named Next Level this case happens JD
				//gets level from Level Panel and calls level set level method which sets level variable
				//gets level from Level Panel and calls Scorelife Panel set LevelButton method which sets the "X" in JButton "Start Level X"
				//gets level from Level Panel and calls add start level method which places "Start Level X" (X=current level) on the screen
				//calls method in Level Panel that Clears level
				//checks what level variable equals and goes to next level
			case "Next Level":

				lp.setLevel(lp.level);
				lp.sl.setLevelButton(lp.getLevel());
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

				//if button is named Continue this case happens JD
			case "Continue":

				// Added call to bgm here 
				if (op.getBGMusic() ==1 || op.getBGMusic() ==2){
					bgMusic();
				}

				//checks Level Panel combobox for which level is selected and calls that level method  JD
				if (gp.cblevelList.getSelectedItem() == "Level 1")
					lp.setLevel(1);
				if (gp.cblevelList.getSelectedItem() == "Level 2")
					lp.setLevel(2);
				if (gp.cblevelList.getSelectedItem() == "Level 3")
					lp.setLevel(3);
				if (gp.cblevelList.getSelectedItem() == "Level 4")
					lp.setLevel(4);
				if (gp.cblevelList.getSelectedItem() == "Level 5")
					lp.setLevel(5);
				if (gp.cblevelList.getSelectedItem() == "Level 6")
					lp.setLevel(6);
				if (gp.cblevelList.getSelectedItem() == "Level 7")
					lp.setLevel(7);
				if (gp.cblevelList.getSelectedItem() == "Level 8")
					lp.setLevel(8);
				if (gp.cblevelList.getSelectedItem() == "Level 9")
					lp.setLevel(9);
				if (gp.cblevelList.getSelectedItem() == "Level 10")
					lp.setLevel(10);


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

				//removes Game Panel JD
				//Adds Level Panel
				remove(gp);
				add(lp);

				//gets level from Level Panel and calls Scorelife Panel set LevelButton method which sets the "X" in JButton "Start Level X" JD
				//gets level from Level Panel and calls add start level method which places "Start Level X" (X=current level) on the screen
				lp.sl.setLevelButton(lp.getLevel());
				lp.sl.addStartLevel(lp.getLevel());

				//checks Level Panel level variable and calls that level method JD
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

				//if button is named New Game this case happens JD
			case "New Game":

				//calls Level Panel setlevel method and sets level to 1 JD
				lp.setLevel(1);

				//gets level from Level Panel and calls Scorelife Panel set LevelButton method which sets the "X" in JButton "Start Level X" JD
				//gets level from Level Panel and calls add start level method which places "Start Level X" (X=current level) on the screen
				lp.sl.setLevelButton(lp.getLevel());
				lp.sl.addStartLevel(lp.level);

				//send Race,Sex to Character Class, Edit 
				lp.setSex(op.getSex());
				lp.setRace(op.getRace());
				//send Difficulty to Level Class 
				lp.setDifficulty(op.getDifficulty());
				lp.cr.setAvatar();
				lp.createCharacter(); 
				//added to send race to SL 
				lp.sl.setRace(op.getRace());
				lp.sl.addLives();

				// Added call to bgm here 
				if (op.getBGMusic() ==1 || op.getBGMusic() ==2){
					bgMusic();
				}

				//Remove Game Panel JD
				//Adds Level Panel
				remove(gp);
				add(lp);

				//calls Level Panel Level 1 Method JD
				lp.level1(); 
				break;

				//  if button is named  Start Level 1 or Start Level 2 or Start Level 3 or Start Level 4 or Start Level 5 or ... JD
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

				//calls Level Panel setlevelgrid JD
				lp.setLevelGrid();
				break;	
				

			}
			validate();
			repaint();
=======
>>>>>>> origin/master
		}
		else if(op.getBGMusic() == 2){
			try {
				URL sound = new URL("file:sound/bgm5.wav");
				bgm= Applet.newAudioClip(sound);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		bgm.loop();


	}
	//main private class button listener for all buttons JD
	//it checks how each button is labeled and does things accordingly JD
	private class Button_Listener implements ActionListener {//JD
		public void actionPerformed(ActionEvent event) {
			switch (event.getActionCommand()) {

<<<<<<< HEAD
	public void ResetGame(){
		lp.clearLevel();
		remove(lp.sl);
		remove(lp);
		remove(gp);
		add(wp);
		validate();
		repaint();
	}
	



	//used to get fontstyle JD
	public static String getFontStyle() 
	{
		return fontStyle;
	}

	//used get buttontile background JD
	public static String getButtonTile()
	{
		return buttontile;
	}

	//Button listeners for race buttons Human,Ostrich,Potato in Option Panel JD
	private class HumanListener implements ActionListener {//JD
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, "Human\n *Can jump higher than the Potato\n ");

		}
	}
	private class OstrichListener implements ActionListener {//JD
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, "Ostrich\n *Has more feathers than a Human\n *Immune to Smallpox");


		}
	}
	private class PotatoListener implements ActionListener {//JD
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, "Potato\n *Has infinite lives\n *Flame resistant up to 375 degrees\n *Likes long walks on the beach");

		}
=======
			//if button is named Options this case happens JD
			//removes welcome panel
			//adds option panel
			//validate verifies variables
			//repaint redraws screen
			case "Options":
				remove(wp);
				add(op);

				validate();
				repaint();
				break;

				//if button is named Play this case happens JD
				//removes welcome panel
				//adds game panel
				//validate verifies variables
				//repaint redraws screen
			case "Play":

				remove(wp);
				add(gp);
				lp.sl.setLives();
				validate();
				repaint();
				break;	   

				//if button is named Instructions this case happens JD
				//removes welcome panel
				//adds Instruction panel
				//validate verifies variables
				//repaint redraws screen
			case "Instructions":
				remove(wp);
				add(ip);

				validate();
				repaint();
				break;

				//if button is named Exit this case happens JD
				//Exits game
			case "Exit":
				System.exit(0);
				break;

				//if button is named Ok this case happens JD
				//Remove Instruction Panel
				//Remove Game Panel
				//Add Welcome Panel
				//validate verifies variables
				//repaint redraws screen
			case "Ok":
				remove(ip);
				remove(gp);
				add(wp);

				validate();
				repaint();
				break;

				//if button is named Save this case happens JD
				//Remove Option Panel 
				//Add Welcome Panel
				//get Race from Option Panel and send to Character LifeBar method in scorelife panel
				//get race and sex for option panel and send to set Character method in Character class
				//validate verifies variables
				//repaint redraws screen
			case "Save":
				remove(op);
				add(wp);

				lp.sl.setDiff(op.getDifficulty());
				lp.cr.setChar(op.getSex(),op.getRace());

				validate();
				repaint();
				break;

				//if button is named Main Menu this case happens JD
				//calls method in Level Panel that Clears level
				//remove Scorelife Panel
				//remove Level Panel
				//remove Game Panel
				//add Welcome Panel
				//validate verifies variables
				//repaint redraws screen
			case "Main Menu":

				lp.clearLevel();
				remove(lp.sl);
				remove(lp);
				remove(gp);
				add(wp);
				validate();
				repaint();

				break;

				//if button is named Next Level this case happens JD
				//gets level from Level Panel and calls level set level method which sets level variable
				//gets level from Level Panel and calls Scorelife Panel set LevelButton method which sets the "X" in JButton "Start Level X"
				//gets level from Level Panel and calls add start level method which places "Start Level X" (X=current level) on the screen
				//calls method in Level Panel that Clears level
				//checks what level variable equals and goes to next level
				//validate verifies variables
				//repaint redraws screen
			case "Next Level":

				lp.setLevel(lp.level);
				lp.sl.setLevelButton(lp.getLevel());
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

				validate();
				repaint();

				break;

				//if button is named Continue this case happens JD
			case "Continue":

				// Added call to bgm here DN
				if (op.getBGMusic() ==1 || op.getBGMusic() ==2){
					bgMusic();
				}

				//checks Level Panel combobox for which level is selected and calls that level method  JD
				if (gp.cblevelList.getSelectedItem() == "Level 1")
					lp.setLevel(1);
				if (gp.cblevelList.getSelectedItem() == "Level 2")
					lp.setLevel(2);
				if (gp.cblevelList.getSelectedItem() == "Level 3")
					lp.setLevel(3);
				if (gp.cblevelList.getSelectedItem() == "Level 4")
					lp.setLevel(4);
				if (gp.cblevelList.getSelectedItem() == "Level 5")
					lp.setLevel(5);
				if (gp.cblevelList.getSelectedItem() == "Level 6")
					lp.setLevel(6);
				if (gp.cblevelList.getSelectedItem() == "Level 7")
					lp.setLevel(7);
				if (gp.cblevelList.getSelectedItem() == "Level 8")
					lp.setLevel(8);
				if (gp.cblevelList.getSelectedItem() == "Level 9")
					lp.setLevel(9);
				if (gp.cblevelList.getSelectedItem() == "Level 10")
					lp.setLevel(10);


				//Added here to handle lives DN
				lp.setSex(op.getSex());
				lp.setRace(op.getRace());
				lp.setDifficulty(op.getDifficulty());
				lp.cr.setLevel(lp.getLevel());


				lp.createCharacter();  
				//Added to send race to SL DN
				lp.sl.setRace(op.getRace());
				lp.sl.addLives();
				lp.cr.setAvatar();

				//removes Game Panel JD
				//Adds Level Panel
				remove(gp);
				add(lp);

				//gets level from Level Panel and calls Scorelife Panel set LevelButton method which sets the "X" in JButton "Start Level X" JD
				//gets level from Level Panel and calls add start level method which places "Start Level X" (X=current level) on the screen
				lp.sl.setLevelButton(lp.getLevel());
				lp.sl.addStartLevel(lp.getLevel());

				//checks Level Panel level variable and calls that level method JD
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
				//validate verifies variables JD
				//repaint redraws screen
				validate();
				repaint();

				break;

				//if button is named New Game this case happens JD
			case "New Game":

				//calls Level Panel setlevel method and sets level to 1 JD
				lp.setLevel(1);

				//gets level from Level Panel and calls Scorelife Panel set LevelButton method which sets the "X" in JButton "Start Level X" JD
				//gets level from Level Panel and calls add start level method which places "Start Level X" (X=current level) on the screen
				lp.sl.setLevelButton(lp.getLevel());
				lp.sl.addStartLevel(lp.level);

				//send Race,Sex to Character Class, Edit DN
				lp.setSex(op.getSex());
				lp.setRace(op.getRace());
				//send Difficulty to Level Class DN
				lp.setDifficulty(op.getDifficulty());
				lp.cr.setAvatar();
				lp.createCharacter(); 
				//added to send race to SL DN
				lp.sl.setRace(op.getRace());
				lp.sl.addLives();

				// Added call to bgm here DN
				if (op.getBGMusic() ==1 || op.getBGMusic() ==2){
					bgMusic();
				}

				//Remove Game Panel JD
				//Adds Level Panel
				remove(gp);
				add(lp);

				//calls Level Panel Level 1 Method JD
				lp.level1(); 

				//validate verifies variables JD
				//repaint redraws screen
				validate();
				repaint();

				break;

				//  if button is named  Start Level 1 or Start Level 2 or Start Level 3 or Start Level 4 or Start Level 5 or ... JD
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

				//calls Level Panel setlevelgrid JD
				lp.setLevelGrid();

				//validate verifies variables JD
				//repaint redraws screen
				validate();
				repaint();

				break;	

			}
		}
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

	//used to get fontstyle JD
	public static String getFontStyle() 
	{
		return fontStyle;
	}

	//used get buttontile background JD
	public static String getButtonTile()
	{
		return buttontile;
>>>>>>> origin/master
	}
	
	public class KeyboardInput implements KeyListener {

<<<<<<< HEAD
		@Override
		public void keyPressed(KeyEvent e) {
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
			
			System.out.println(e);
			
			if( e.getKeyCode() == KeyEvent.VK_DOWN ) {
				lp.move(lp.findChar(lp.cr.getBounds().x,lp.cr.getBounds().y)+1);
				System.out.println("Down");

			}
			
			if( e.getKeyCode() == KeyEvent.VK_UP ) {
				lp.move(lp.findChar(lp.cr.getBounds().x,lp.cr.getBounds().y)-1);
				System.out.println("Up");
			}
			
			if( e.getKeyCode() == KeyEvent.VK_LEFT) {
				lp.move(lp.findChar(lp.cr.getBounds().x,lp.cr.getBounds().y)-5);
				System.out.println("Left");
			}
			
			if( e.getKeyCode() == KeyEvent.VK_RIGHT ) {
				lp.move(lp.findChar(lp.cr.getBounds().x,lp.cr.getBounds().y)+5);
				System.out.println("Right");
			}
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
=======
	//Button listeners for race buttons Human,Ostrich,Potato in Option Panel JD
	private class HumanListener implements ActionListener {//JD
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, "Human\n *Can jump higher than the Potato\n ");

		}
	}
	private class OstrichListener implements ActionListener {//JD
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, "Ostrich\n *Has more feathers than a Human\n *Immune to Smallpox");


		}
	}
	private class PotatoListener implements ActionListener {//JD
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, "Potato\n *Has infinite lives\n *Flame resistant up to 375 degrees\n *Likes long walks on the beach");

>>>>>>> origin/master
		}
	}



}









