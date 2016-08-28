import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Level extends JPanel {

	private int level = 1;
	private String sex="Male";
	private String race="Ostrich";
	private int doorLoc;
	private int keyLoc;
	private int charLoc;
	private int[] goodtiles;

	private JButton[] grid = new JButton[35];
	private JButton[] tile = new JButton[35];

	
	private boolean gotKey = false;

	private JButton Key;
	private JButton Door;
	private Character cr;

	ScoreLife_Panel sl;

	public Level() {
		super();
		setLayout(null);
		setBackground(Color.black);

		for (int i = 0; i == 35; i++) {
			grid[i] = new JButton();
			grid[i].addActionListener(new grid_Listener());
			grid[i].setName(String.valueOf(i));
		}

		for (int i = 0; i == 35; i++) {
			tile[i] = new JButton();
		}

		Key = new JButton();
		Door = new JButton();
		Key.addActionListener(new grid_Listener());
		Door.addActionListener(new grid_Listener());
		createCharacter();
		sl = new ScoreLife_Panel();
		sl.setBounds(0, 25, 870, 70);
		sl.setOpaque(false);
		add(sl);
		

	}
	public void level1() {
		int[] goodtiles = new int[] {6,11,16,21,26,22,23};//goodtiles
		setTiles(goodtiles,5,25);//send good tiles,key,door locations
		JOptionPane.showMessageDialog(null, level);
	}
	public void level2() {
		int[] goodtiles = new int[] {6,11,16,21,26,22,23};
		setTiles(goodtiles,10,27);
		JOptionPane.showMessageDialog(null, level);
	}
	public void level3() {
		int[] goodtiles = new int[] {6,11,16,21,26,22,23};
		setTiles(goodtiles,7,30);
		JOptionPane.showMessageDialog(null, level);
	}
	public void level4() {
		int[] goodtiles = new int[] {6,11,16,21,26,22,23};
		setTiles(goodtiles,27,4);
		JOptionPane.showMessageDialog(null, level);
	}
	public void level5() {
		setKeyLoc(500,300);
		JOptionPane.showMessageDialog(null, coordConvert(Key.getBounds().x,Key.getBounds().y));
		setDoorLoc(100,300);
		JOptionPane.showMessageDialog(null, coordConvert(Door.getBounds().x,Door.getBounds().y));
		//setTile20(6,7,11,15,16,20,25,26,27,28,29,99,99,99,99,99,99,99,99,99,12,12);
	}
	public void level6() {
		setKeyLoc(100,100);
		JOptionPane.showMessageDialog(null, coordConvert(Key.getBounds().x,Key.getBounds().y));
		setDoorLoc(600,100);
		JOptionPane.showMessageDialog(null, coordConvert(Door.getBounds().x,Door.getBounds().y));
		//setTile20(5,6,7,8,12,13,14,18,22,23,26,27,28,31,33,99,99,99,99,99,12,12);
	}
	public void level7() {
		setKeyLoc(200,500);
		JOptionPane.showMessageDialog(null, coordConvert(Key.getBounds().x,Key.getBounds().y));
		setDoorLoc(600,400);
		JOptionPane.showMessageDialog(null, coordConvert(Door.getBounds().x,Door.getBounds().y));
		//setTile20(2,3,4,7,12,16,17,18,21,23,26,27,99,99,99,99,99,99,99,99,12,12);
	}
	public void level8() {
		setKeyLoc(600,100);
		JOptionPane.showMessageDialog(null, coordConvert(Key.getBounds().x,Key.getBounds().y));
		setDoorLoc(100,200);
		JOptionPane.showMessageDialog(null, coordConvert(Door.getBounds().x,Door.getBounds().y));
		//setTile20(6,11,12,13,18,19,20,21,22,27,28,29,34,99,99,99,99,99,99,99,12,12);
	}
	public void level9() {
		setKeyLoc(300,100);
		JOptionPane.showMessageDialog(null, coordConvert(Key.getBounds().x,Key.getBounds().y));
		setDoorLoc(500,200);
		JOptionPane.showMessageDialog(null, coordConvert(Door.getBounds().x,Door.getBounds().y));
		//setTile20(1,2,3,5,6,8,12,13,14,15,18,19,26,27,28,29,99,99,99,99,12,12);
	}
	public void level10() {
		setKeyLoc(700,100);
		JOptionPane.showMessageDialog(null, coordConvert(Key.getBounds().x,Key.getBounds().y));
		setDoorLoc(200,100);
		JOptionPane.showMessageDialog(null, coordConvert(Door.getBounds().x,Door.getBounds().y));
		//setTile20(0,1,2,3,4,8,9,13,15,16,18,19,20,21,22,25,27,28,29,99,12,12);
	}

	
	private void setTiles(int[] goodtiles,int newkey,int newdoor) {
		
		clearLevel();
		Key.setBorder(null);
		Door.setBorder(null);
		getCr().setBorder(null);
	
		setKeyLoc(newkey);
		setDoorLoc(newdoor);
		setCharLoc(24);
		
		add(Key);
		add(Door);
		add(getCr());

		for(int i=0;i<20;i++){
			if(level==1||level==2||level==3){
				tile[i].setIcon(new ImageIcon("images/floortile1-3.png"));
				Key.setIcon(new ImageIcon("images/keytile1-3.png"));
				Door.setIcon(new ImageIcon("images/doortile1-3.png"));
			}
			else if(level==4||level==5||level==6){
				tile[i].setIcon(new ImageIcon("images/floortile4-6.png"));
				Key.setIcon(new ImageIcon("images/keytile4-6.png"));
				Door.setIcon(new ImageIcon("images/doortile4-6.png"));
			}
			else{
				tile[i].setIcon(new ImageIcon("images/floortile7-9.png"));
				Key.setIcon(new ImageIcon("images/keytile7-9.png"));
				Door.setIcon(new ImageIcon("images/doortile7-9.png"));
			}
			tile[i].setBorder(null);
			
			JOptionPane.showMessageDialog(null, goodtiles[i]);

			
			tile[i].setBounds(posConvert(goodtiles[i],"x"), posConvert(goodtiles[i],"y"), 100, 100);
			add(tile[i]);		
		}
	}

	public void setLevelGrid() { // makes level grid that hides where good and bad tiles are

		int x = 1;
		int y = 1;

		for (int i = 0; i < 35; i++) {

			if (i == 5 || i == 10 || i == 15 || i == 20 || i == 25 || i == 30) {
				x++;
				y = 1;
			}
			grid[i].setBounds(x * 100, y * 100, 100, 100);

			if (level <=3) {
				grid[i].setIcon(new ImageIcon("images/floortile1-3.png"));
			} else if (level >=4&&level<= 6) {
				grid[i].setIcon(new ImageIcon("images/floortile4-6.png"));
			} else if (level >= 7) {
				grid[i].setIcon(new ImageIcon("images/floortile7-9.png"));
			}

			grid[i].setBorder(null);
			add(grid[i]);
			y++;
		}

		for (int i = 0; i < 10; i++) {
			remove(tile[i]);
		}
		
		sl.removeAll();
		grid[keyLoc].setVisible(false);// hide key grid square
		grid[doorLoc].setVisible(false);// hide door grid square
		Door.setVisible(true);	//hide door icon
		grid[24].setVisible(false);	//hide char starting location tile
		setCharLoc(500,500,true); //set char location and set visible to true
		
		add(Key);
		add(Door);
		add(getCr());

	}

	public void clearLevel() {// sets all tiles,door,key and char to visible and
							// bounds to 0,0,0,0 JD
	
		for (int i = 0; i < 75; i++) {
		tile[i].setBounds(0, 0, 0, 0);
		tile[i].setVisible(true);
		}
		
		for (int i = 0; i < 35; i++) {
		grid[i].setBounds(0, 0, 0, 0);
		grid[i].setVisible(true);
		}
		
		setKeyLoc(0,0,0,0,true);
		setDoorLoc(0,0,0,0,true);
		setCharLoc(0,0,0,0,true);
		
		sl.removeNextLevel();
		
		gotKey = false;
		
		validate();
		repaint();
}
	
	public void move(int tile) {// Move method checks if move is good or not and
								// sends to either good move or bad move method

		if (getCharLoc() - 1 == tile //checks for valid move
		|| getCharLoc() + 1 == tile
		|| getCharLoc() + 5 == tile 
		|| getCharLoc() - 5 == tile ){

			// catches cheating jumping to highlighted box
			if (getCharLoc() == 4 && tile == 5 
			|| getCharLoc() == 9  && tile == 10
			|| getCharLoc() == 14 && tile == 15 
			|| getCharLoc() == 19 && tile == 20 
			|| getCharLoc() == 24 && tile == 25
			|| getCharLoc() == 29 && tile == 30 
			|| getCharLoc() == 5  && tile == 4 
			|| getCharLoc() == 10 && tile == 9
			|| getCharLoc() == 15 && tile == 14 
			|| getCharLoc() == 20 && tile == 19 
			|| getCharLoc() == 25 && tile == 24
			|| getCharLoc() == 30 && tile == 29) {
				return;
			}
			
			if (tile==getKeyLoc()){
				goodMove(tile,"Key");
				return;
			}
			
			else if (tile==getDoorLoc()){
				goodMove(tile,"Door");
				return;
			}
			
			for (int i = 0; i < 20; i++) {
				if (tile==goodtiles[i]){
					goodMove(tile,"");
					return;
				}
			}
			badMove(tile);
			return;
		}
	}

	private void goodMove(int newPos,String keydoor) { 

		int tilex;
		int tiley;

		for (int i = 0; i < 35; i++) {
			grid[i].setBorder(null);
			
			if  ((i!=coordConvert(Key.getBounds().x,Key.getBounds().y)||gotKey==true) && (i!=coordConvert(Door.getBounds().x,Door.getBounds().y))) {
				grid[i].setVisible(true);
			}
		}
		// this if statement happens when you step on the key JD
		if ("Key".equals(keydoor)) {
			tilex = posConvert(getKeyLoc(),"x");
			tiley = posConvert(getKeyLoc(),"y");
			Key.setVisible(false);
			gotKey = true;
			Door.setVisible(true);
			grid[getDoorLoc()].setVisible(false); // door tile number
			
		}
		// this if statement happens when you step on the door JD
		else if ("Door".equals(keydoor)) {
			tilex = posConvert(getDoorLoc(),"x");
			tiley = posConvert(getDoorLoc(),"y");
			Door.setVisible(false);
			if (gotKey==true){
				sl.addNextLevel();
			}
		}

		// just the standard move method JD
		else {
			tilex = grid[newPos].getBounds().x;
			tiley = grid[newPos].getBounds().y;
			grid[newPos].setVisible(false);

			if (gotKey == true) {
				Door.setVisible(true);
			}
			else{
				Door.setVisible(false);
				}
		}

		setBorder();	
		setCharLoc(tilex,tiley);

		validate();
		repaint();
	}
	

	
	private void badMove(int tile) {
		
		sl.removeLife();
		if (tile < 35) {
			if (level<=3) {
				grid[tile].setIcon(new ImageIcon("images/floortile1-3x.png"));
			} else if (level>=4 && level<=6) {
				grid[tile].setIcon(new ImageIcon("images/floortile4-6x.png"));
			} else if (level>=7) {
				grid[tile].setIcon(new ImageIcon("images/floortile7-9x.png"));
			}
		}
		validate();
		repaint();
	}

	//******************** GETS & SETS ETC.
	public void createCharacter() {
		setCr(new Character(sex, race, level)); // add character 11-19
		setLayout(null);
		getCr().setBounds(500, 500, 100, 100);

	}
	private void setBorder(){

		if (getCharLoc() - 1 > 0&& getCharLoc() - 1 < 35){
			grid[getCharLoc() - 5].setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createRaisedBevelBorder(),
					BorderFactory.createLoweredBevelBorder()));

			grid[getCharLoc() + 5].setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createRaisedBevelBorder(),
					BorderFactory.createLoweredBevelBorder()));
			
			if (getCharLoc() - 1 != 4&& getCharLoc() - 1 != 9 && getCharLoc() - 1 != 14 && getCharLoc() - 1 != 19&& getCharLoc() - 1 != 24&& getCharLoc() - 1 != 29) {
				grid[getCharLoc() - 1].setBorder(BorderFactory.createCompoundBorder(
						BorderFactory.createRaisedBevelBorder(),
						BorderFactory.createLoweredBevelBorder()));
			}
			if (getCharLoc() + 1 != 5&& getCharLoc() + 1 != 10&& getCharLoc() + 1 != 15&& getCharLoc() + 1 != 20&& getCharLoc() + 1 != 25&& getCharLoc() + 1 != 30) {
				grid[getCharLoc() + 1].setBorder(BorderFactory.createCompoundBorder(
						BorderFactory.createRaisedBevelBorder(),
						BorderFactory.createLoweredBevelBorder()));
			}
		
		}

	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public void setDifficulty(int dif)// to be used for difficulty
	{
	}

	//********************************************GETS & SETS CHAR	
	public int getCharLoc(){
		return charLoc;
	}
	
	public void setCharLoc(int newCharLoc){
		this.charLoc=newCharLoc;
		getCr().setBounds(posConvert(newCharLoc,"x") ,posConvert(newCharLoc,"y"), 100, 100);
	}
	
	public void setCharLoc(int newCharLoc,Boolean vis){
		this.charLoc=newCharLoc;
		getCr().setBounds(posConvert(newCharLoc,"x") ,posConvert(newCharLoc,"y"), 100, 100);
		getCr().setVisible(vis);	

	}
	
	public void setCharLoc(int newCharLocX,int newCharLocY){
		this.charLoc=coordConvert(newCharLocX,newCharLocY);
		getCr().setBounds(newCharLocX, newCharLocY, 100, 100);
	}
	
	public void setCharLoc(int newCharLocX,int newCharLocY,Boolean vis){
		this.charLoc=coordConvert(newCharLocX,newCharLocY);
		getCr().setBounds(newCharLocX, newCharLocY, 100, 100);
		getCr().setVisible(vis);
	}
	
	public void setCharLoc(int newCharLocX,int newCharLocY,int newCharLocSX,int newCharLocSY){
		this.charLoc=coordConvert(newCharLocX,newCharLocY);
		getCr().setBounds(newCharLocX, newCharLocY, newCharLocSX, newCharLocSY);
	}
	
	public void setCharLoc(int newCharLocX,int newCharLocY,int newCharLocSX,int newCharLocSY,Boolean vis){
		this.charLoc=coordConvert(newCharLocX,newCharLocY);
		getCr().setBounds(newCharLocX, newCharLocY, newCharLocSX, newCharLocSY);
		getCr().setVisible(vis);
	}
	
//********************************************GETS & SETS KEY	
	public int getKeyLoc(){
		return keyLoc;
	}

	public void setKeyLoc(int newKey){
		this.keyLoc=newKey;
		Key.setBounds(posConvert(newKey,"x") ,posConvert(newKey,"y"), 100, 100);
	}
	
	public void setKeyLoc(int newKey,Boolean vis){
		this.keyLoc=newKey;
		Key.setBounds(posConvert(newKey,"x") ,posConvert(newKey,"y"), 100, 100);
		Key.setVisible(vis);
	}
	
	public void setKeyLoc(int newKeyX,int newKeyY){
		this.keyLoc=coordConvert(newKeyX,newKeyY);
		Key.setBounds(newKeyX,newKeyY, 100, 100);
	}
	
	public void setKeyLoc(int newKeyX,int newKeyY,Boolean vis){
		this.keyLoc=coordConvert(newKeyX,newKeyY);
		Key.setBounds(newKeyX,newKeyY, 100, 100);
		Key.setVisible(vis);
	}
	
	public void setKeyLoc(int newKeyX,int newKeyY,int newKeySX,int newKeySY){
		this.keyLoc=coordConvert(newKeyX,newKeyY);
		Key.setBounds(newKeyX,newKeyY, newKeySX, newKeySY);
	}
	
	public void setKeyLoc(int newKeyX,int newKeyY,int newKeySX,int newKeySY,Boolean vis){
		this.keyLoc=coordConvert(newKeyX,newKeyY);
		Key.setBounds(newKeyX,newKeyY, newKeySX, newKeySY);
		Key.setVisible(vis);
	}
	//********************************************GETS & SETS DOOR	
	public int getDoorLoc(){
		return doorLoc;
	}
	
	public void setDoorLoc(int newDoor){
		this.doorLoc=newDoor;
		Door.setBounds(posConvert(newDoor,"x") ,posConvert(newDoor,"y"), 100, 100);
	}
	
	public void setDoorLoc(int newDoor,Boolean vis){
		this.doorLoc=newDoor;
		Door.setBounds(posConvert(newDoor,"x") ,posConvert(newDoor,"y"), 100, 100);
		Door.setVisible(vis);
	}
	
	public void setDoorLoc(int newDoorX,int newDoorY){
		this.doorLoc=coordConvert(newDoorX,newDoorY);
		Door.setBounds(newDoorX,newDoorY, 100, 100);
	}
	
	public void setDoorLoc(int newDoorX,int newDoorY,Boolean vis){
		this.doorLoc=coordConvert(newDoorX,newDoorY);
		Door.setBounds(newDoorX,newDoorY, 100, 100);
		Door.setVisible(vis);
	}
	
	public void setDoorLoc(int newDoorX,int newDoorY,int newDoorSX,int newDoorSY){
		this.doorLoc=coordConvert(newDoorX,newDoorY);
		Door.setBounds(newDoorX,newDoorY, newDoorSX, newDoorSY);
	}
	
	public void setDoorLoc(int newDoorX,int newDoorY,int newDoorSX,int newDoorSY,Boolean vis){
		this.doorLoc=coordConvert(newDoorX,newDoorY);
		Door.setBounds(newDoorX,newDoorY, newDoorSX, newDoorSY);
		Door.setVisible(vis);
	}
	
	
	//********************************************Listeners/Converts	
private class grid_Listener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			move(Integer.parseInt((((JComponent) event.getSource()).getName())));
		}
	}


	public boolean beatLvl() {
		boolean win = false;
		if (getCharLoc() == getDoorLoc()) {
			win = true;
		}
		return win;

	}

	
	
	public int posConvert(int pos,String xy) {// these convert tile number to coordinates
	int x=0;
	int y=0;
	int coord=0;
	switch(pos){
	case 0:x=100;y=100;break;
	case 1:x=100;y=200;break;
	case 2:x=100;y=300;break;
	case 3:x=100;y=400;break;
	case 4:x=100;y=500;break;
	case 5:x=200;y=100;break;
	case 6:x=200;y=200;break;
	case 7:x=200;y=300;break;
	case 8:x=200;y=400;break;
	case 9:x=200;y=500;break;
	case 10:x=300;y=100;break;
	case 11:x=300;y=200;break;
	case 12:x=300;y=300;break;
	case 13:x=300;y=400;break;
	case 14:x=300;y=500;break;
	case 15:x=400;y=100;break;
	case 16:x=400;y=200;break;
	case 17:x=400;y=300;break;
	case 18:x=400;y=400;break;
	case 19:x=400;y=500;break;
	case 20:x=500;y=100;break;
	case 21:x=500;y=200;break;
	case 22:x=500;y=300;break;
	case 23:x=500;y=400;break;
	case 24:x=500;y=500;break;
	case 25:x=600;y=100;break;
	case 26:x=600;y=200;break;
	case 27:x=600;y=300;break;
	case 28:x=600;y=400;break;
	case 29:x=600;y=500;break;
	case 30:x=700;y=100;break;
	case 31:x=700;y=200;break;
	case 32:x=700;y=300;break;
	case 33:x=700;y=400;break;
	case 34:x=700;y=500;break;
	}
	if (xy=="x"){
		coord=x;
	}
	else if (xy=="y"){
		coord=y;
	}
	return coord;
}
	public int coordConvert(int charx, int chary) {// these convert tile coordinates to a tile number
		
		int chartile = 0;

		switch (charx) {
		case 100:
			switch (chary) {
			case 100:chartile = 0;break;
			case 200:chartile = 1;break;
			case 300:chartile = 2;break;
			case 400:chartile = 3;break;
			case 500:chartile = 4;break;
			}
			break;
		case 200:
			switch (chary) {
			case 100:chartile = 5;break;
			case 200:chartile = 6;break;
			case 300:chartile = 7;break;
			case 400:chartile = 8;break;
			case 500:chartile = 9;break;
			}
			break;
		case 300:
			switch (chary) {
			case 100:chartile = 10;break;
			case 200:chartile = 11;break;
			case 300:chartile = 12;break;
			case 400:chartile = 13;break;
			case 500:chartile = 14;break;
			}
			break;
		case 400:
			switch (chary) {
			case 100:chartile = 15;break;
			case 200:chartile = 16;break;
			case 300:chartile = 17;break;
			case 400:chartile = 18;break;
			case 500:chartile = 19;break;
			}
			break;
		case 500:
			switch (chary) {
			case 100:chartile = 20;break;
			case 200:chartile = 21;break;
			case 300:chartile = 22;break;
			case 400:chartile = 23;break;
			case 500:chartile = 24;break;
			}
			break;
		case 600:
			switch (chary) {
			case 100:chartile = 25;break;
			case 200:chartile = 26;break;
			case 300:chartile = 27;break;
			case 400:chartile = 28;break;
			case 500:chartile = 29;break;
			}
			break;
		case 700:
			switch (chary) {
			case 100:chartile = 30;break;
			case 200:chartile = 31;break;
			case 300:chartile = 32;break;
			case 400:chartile = 33;break;
			case 500:chartile = 34;break;
			}
			break;
		}
		return chartile;
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image myImage = null;
		if (level == 1 || level == 2 || level == 3) {
			myImage = Toolkit.getDefaultToolkit().getImage(
					"images/background1-3.jpg");
		} else if (level == 4 || level == 5 || level == 6) {
			myImage = Toolkit.getDefaultToolkit().getImage(
					"images/background4-6.png");
		} else if (level == 7 || level == 8 || level == 9 || level == 10) {
			myImage = Toolkit.getDefaultToolkit().getImage(
					"images/background7-9.jpg");
		}
		g.drawImage(myImage, 0, 0, this);
		validate();
		repaint();
	}
	public Character getCr() {
		return cr;
	}
	public void setCr(Character cr) {
		this.cr = cr;
	}

}
