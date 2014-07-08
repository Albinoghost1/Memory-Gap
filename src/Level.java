import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
=======
>>>>>>> origin/master

public class Level extends JPanel{//JD

	int level = 1;
	int sex;
	int race;
	int difficulty;

	JButton[] grid = new JButton[36];
	JButton[] tile = new JButton[75];

	boolean gotKey = false;

	JButton Key;
	JButton Door;
	Character cr;

	ScoreLife_Panel sl; 

	String buttontile = Back_Panel.getButtonTile();
	String fontStyle = Back_Panel.getFontStyle();
<<<<<<< HEAD
	

=======
>>>>>>> origin/master

	public Level() {//JD
		super();
		setLayout(null);
		setBackground(Color.black);

		for (int i = 0;i<36;i++){//JD
			grid[i] = new JButton();
			grid[i].addActionListener(new grid_Listener());
			grid[i].setName(String.valueOf(i));
		}

		for (int i=0;i<75;i++){//JD
			tile[i] = new JButton();
		}

		Key = new JButton();
		Door = new JButton();
		Key.addActionListener(new key_Listener());
		Door.addActionListener(new door_Listener());
		createCharacter();
		sl = new ScoreLife_Panel();
		sl.setBounds(0,25,870,70);
		sl.setOpaque(false);
		add(sl);

	}


	public void level1()//JD
	{

		clearLevel();
		level = 1;

		tile[0].setBounds(200,200,100,100);
		tile[1].setBounds(300,200,100,100);
		tile[2].setBounds(400,200,100,100);
		tile[3].setBounds(500,200,100,100);
		tile[4].setBounds(600,200,100,100);
		tile[5].setBounds(500,300,100,100);
		tile[6].setBounds(500,400,100,100);

		Key.setBounds(200,100,100,100);
		Key.setBorder(null);
		Door.setBounds(600,100,100,100);
		Door.setBorder(null);
		cr.setBounds(500,500,100,100);
		cr.setBorder(null);

		for (int i=0;i<7;i++){
			tile[i].setIcon(new ImageIcon("images/floortile1-3.png"));
			tile[i].setBorder(null);
			add(tile[i]);
		}

		Key.setIcon(new ImageIcon("images/keytile1-3.png"));
		Key.setBorder(null);
		Door.setIcon(new ImageIcon("images/doortile1-3.png"));
		Door.setBorder(null);
		cr.setBorder(null);

		add(Key);
		add(Door);
		add(cr);


		validate();
		repaint();




	}
	public void level2()//JD
	{
		clearLevel();
		level = 2;

		tile[0].setBounds(200,200,100,100);
		tile[1].setBounds(400,300,100,100);
		tile[2].setBounds(200,300,100,100);
		tile[3].setBounds(300,300,100,100);
		tile[4].setBounds(600,400,100,100);
		tile[5].setBounds(400,400,100,100);
		tile[6].setBounds(500,400,100,100);
		tile[7].setBounds(200,100,100,100);

		Key.setBounds(300,100,100,100);
		Door.setBounds(600,300,100,100);
		cr.setBounds(500,500,100,100);

		for (int i=0;i<9;i++){
			tile[i].setIcon(new ImageIcon("images/floortile1-3.png"));
			tile[i].setBorder(null);
			add(tile[i]);
		}

		Key.setIcon(new ImageIcon("images/keytile1-3.png"));
		Key.setBorder(null);
		Door.setIcon(new ImageIcon("images/doortile1-3.png"));
		Door.setBorder(null);
		cr.setBorder(null);

		add(Key);
		add(Door);
		add(cr);

		validate();
		repaint();

	}
	public void level3()//JD
	{
		clearLevel();
		level = 3;

		tile[0].setBounds(200,400,100,100);
		tile[1].setBounds(300,400,100,100);
		tile[2].setBounds(300,500,100,100);
		tile[3].setBounds(400,500,100,100);
		tile[4].setBounds(600,500,100,100);
		tile[5].setBounds(600,400,100,100);
		tile[6].setBounds(700,400,100,100);
		tile[7].setBounds(700,300,100,100);
		tile[8].setBounds(700,200,100,100);

		Key.setBounds(200,300,100,100);
		Door.setBounds(700,100,100,100);
		cr.setBounds(500,500,100,100);

		for (int i=0;i<9;i++){
			tile[i].setIcon(new ImageIcon("images/floortile1-3.png"));
			tile[i].setBorder(null);
			add(tile[i]);
		}

		Key.setIcon(new ImageIcon("images/keytile1-3.png"));
		Key.setBorder(null);
		Door.setIcon(new ImageIcon("images/doortile1-3.png"));
		Door.setBorder(null);
		cr.setBorder(null);

		add(Key);
		add(Door);
		add(cr);

		validate();
		repaint();

	}
	public void level4()//JD
	{
		clearLevel();
		level = 4;

		tile[0].setBounds(100,400,100,100);
		tile[1].setBounds(200,200,100,100);
		tile[2].setBounds(200,300,100,100);
		tile[3].setBounds(200,400,100,100);
		tile[4].setBounds(300,200,100,100);
		tile[5].setBounds(400,200,100,100);
		tile[6].setBounds(400,300,100,100);
		tile[7].setBounds(400,400,100,100);
		tile[8].setBounds(400,500,100,100);
		tile[9].setBounds(500,300,100,100);

		Key.setBounds(600,300,100,100);
		Door.setBounds(100,500,100,100);
		cr.setBounds(500,500,100,100);

		for (int i=0;i<10;i++){
			tile[i].setIcon(new ImageIcon("images/floortile4-6.png"));
			tile[i].setBorder(null);
			add(tile[i]);
		}

		Key.setIcon(new ImageIcon("images/keytile4-6.png"));
		Key.setBorder(null);
		Door.setIcon(new ImageIcon("images/doortile4-6.png"));
		Door.setBorder(null);
		cr.setBorder(null);

		add(Key);
		add(Door);
		add(cr);

		validate();
		repaint();

	}
	public void level5() //Andrew Chambliss
	{

		clearLevel();
		level = 5;

		tile[0].setBounds(200,200,100,100);//6
		tile[1].setBounds(200,300,100,100);//7
		tile[2].setBounds(300,200,100,100);//11
		tile[3].setBounds(400,100,100,100);//15
		tile[4].setBounds(400,200,100,100);//16
		tile[5].setBounds(500,100,100,100);//20
		tile[6].setBounds(600,100,100,100);//25
		tile[7].setBounds(600,200,100,100);//26
		tile[8].setBounds(600,300,100,100);//27
		tile[9].setBounds(600,400,100,100);//28
		tile[10].setBounds(600,500,100,100);//29


		Key.setBounds(500,300,100,100);//22
		Door.setBounds(100,300,100,100);//2
		cr.setBounds(500,500,100,100);//24

		for (int i=0;i<11;i++){
			tile[i].setIcon(new ImageIcon("images/floortile4-6.png"));
			tile[i].setBorder(null);
			add(tile[i]);
		}

		Key.setIcon(new ImageIcon("images/keytile4-6.png"));
		Key.setBorder(null);
		Door.setIcon(new ImageIcon("images/doortile4-6.png"));
		Door.setBorder(null);
		cr.setBorder(null);

		add(Key);
		add(Door);
		add(cr);

		validate();
		repaint();

	}

	public void level6()	//Andrew Chambliss
	{

		clearLevel();
		level = 6;

		tile[0].setBounds(200,100,100,100); //5
		tile[1].setBounds(200,200,100,100);//6
		tile[2].setBounds(200,300,100,100);//7
		tile[3].setBounds(200,400,100,100);//8
		tile[4].setBounds(300,300,100,100);//12
		tile[5].setBounds(300,400,100,100);//13
		tile[6].setBounds(300,500,100,100);//14
		tile[7].setBounds(400,400,100,100);//18
		tile[8].setBounds(500,300,100,100);//22
		tile[9].setBounds(500,400,100,100);//23
		tile[10].setBounds(600,200,100,100); //26
		tile[11].setBounds(600,300,100,100); //27
		tile[12].setBounds(600,400,100,100); //28
		tile[13].setBounds(700,200,100,100); //31
		tile[14].setBounds(700,500,100,100);//33

		Key.setBounds(100,100,100,100);//0
		Door.setBounds(600,100,100,100);//25
		cr.setBounds(500,500,100,100);

		for (int i=0;i<15;i++){
			tile[i].setIcon(new ImageIcon("images/floortile4-6.png"));
			tile[i].setBorder(null);
			add(tile[i]);
		}

		Key.setIcon(new ImageIcon("images/keytile4-6.png"));
		Key.setBorder(null);
		Door.setIcon(new ImageIcon("images/doortile4-6.png"));
		Door.setBorder(null);
		cr.setBorder(null);

		add(Key);
		add(Door);
		add(cr);

		validate();
		repaint();
	}
	public void level7()	//Andrew Chambliss
	{

		clearLevel();
		level = 7;

		tile[0].setBounds(100,300,100,100);//2 
		tile[1].setBounds(100,400,100,100);//3
		tile[2].setBounds(100,500,100,100);//4
		tile[3].setBounds(200,300,100,100);//7
		tile[4].setBounds(300,300,100,100);//12
		tile[5].setBounds(400,200,100,100);//16
		tile[6].setBounds(400,300,100,100);//17
		tile[7].setBounds(400,400,100,100);//18
		tile[8].setBounds(500,200,100,100);//21
		tile[9].setBounds(500,400,100,100);//23
		tile[10].setBounds(600,200,100,100);//26
		tile[11].setBounds(600,300,100,100);//27


		Key.setBounds(200,500,100,100);
		Door.setBounds(500,400,100,100);
		cr.setBounds(500,500,100,100);

		for (int i=0;i<12;i++){
			tile[i].setIcon(new ImageIcon("images/floortile7-9.png"));
			tile[i].setBorder(null);
			add(tile[i]);
		}

		Key.setIcon(new ImageIcon("images/keytile7-9.png"));
		Key.setBorder(null);
		Door.setIcon(new ImageIcon("images/doortile7-9.png"));
		Door.setBorder(null);
		cr.setBorder(null);

		add(Key);
		add(Door);
		add(cr);

		validate();
		repaint();
	}
	public void level8()	//Andrew Chambliss
	{

		clearLevel();
		level = 8;

		tile[0].setBounds(200,200,100,100); //6
		tile[1].setBounds(300,200,100,100);//11
		tile[2].setBounds(300,300,100,100);//12
		tile[3].setBounds(300,400,100,100);//13
		tile[4].setBounds(400,400,100,100);//18
		tile[5].setBounds(400,500,100,100);//19
		tile[6].setBounds(500,100,100,100);//20
		tile[7].setBounds(500,200,100,100);//21
		tile[8].setBounds(500,300,100,100);//22
		tile[9].setBounds(600,300,100,100);//27
		tile[10].setBounds(600,400,100,100);//28
		tile[11].setBounds(600,500,100,100);//29
		//tile[12].setBounds(700,500,100,100);
		//tile[13].setBounds(600,500,100,100);


		Key.setBounds(600,100,100,100);
		Door.setBounds(100,200,100,100);
		cr.setBounds(500,500,100,100);

		for (int i=0;i<12;i++){
			tile[i].setIcon(new ImageIcon("images/floortile7-9.png"));
			tile[i].setBorder(null);
			add(tile[i]);
		}

		Key.setIcon(new ImageIcon("images/keytile7-9.png"));
		Key.setBorder(null);
		Door.setIcon(new ImageIcon("images/doortile7-9.png"));
		Door.setBorder(null);
		cr.setBorder(null);

		add(Key);
		add(Door);
		add(cr);

		validate();
		repaint();

	}
	public void level9()	//Andrew Chambliss
	{

		clearLevel();
		level = 9;

		tile[0].setBounds(100,200,100,100); //1
		tile[1].setBounds(100,300,100,100);//2
		tile[2].setBounds(100,400,100,100);//3
		tile[3].setBounds(200,100,100,100);//5
		tile[4].setBounds(200,200,100,100);//6
		tile[5].setBounds(200,400,100,100);//8
		tile[6].setBounds(300,300,100,100);//12
		tile[7].setBounds(300,400,100,100);//13
		tile[8].setBounds(300,500,100,100);//14
		tile[9].setBounds(400,100,100,100);//15
		tile[10].setBounds(400,400,100,100);//18
		tile[11].setBounds(400,500,100,100);//19
		tile[12].setBounds(600,200,100,100);//26
		tile[13].setBounds(600,300,100,100);//27
		tile[14].setBounds(600,400,100,100);//28
		tile[15].setBounds(600,500,100,100);//29




		Key.setBounds(300,100,100,100);
		Door.setBounds(500,200,100,100);
		cr.setBounds(500,500,100,100);

		for (int i=0;i<16;i++){
			tile[i].setIcon(new ImageIcon("images/floortile7-9.png"));
			tile[i].setBorder(null);
			add(tile[i]);
		}

		Key.setIcon(new ImageIcon("images/keytile7-9.png"));
		Key.setBorder(null);
		Door.setIcon(new ImageIcon("images/doortile7-9.png"));
		Door.setBorder(null);
		cr.setBorder(null);

		add(Key);
		add(Door);
		add(cr);

		validate();
		repaint();
	}
	public void level10()	//Andrew Chambliss
	{

		clearLevel();
		level = 10;

		tile[0].setBounds(100,100,100,100);//0
		tile[1].setBounds(100,200,100,100); //1
		tile[2].setBounds(100,300,100,100);//2
		tile[3].setBounds(100,400,100,100);//3
		tile[4].setBounds(100,500,100,100);//4
		tile[5].setBounds(200,400,100,100);//8
		tile[6].setBounds(200,500,100,100);//9
		tile[7].setBounds(300,400,100,100);//13
		tile[8].setBounds(400,100,100,100);//15
		tile[9].setBounds(400,200,100,100);//16
		tile[10].setBounds(400,400,100,100);//18
		tile[11].setBounds(400,500,100,100);//19
		tile[12].setBounds(500,100,100,100);//20
		tile[13].setBounds(500,200,100,100);//21
		tile[14].setBounds(500,300,100,100);//22
		tile[15].setBounds(500,100,100,100);//25
		tile[16].setBounds(500,300,100,100);//27
		tile[17].setBounds(600,100,100,100);//28
		tile[18].setBounds(600,300,100,100);//29




		Key.setBounds(700,100,100,100);
		Door.setBounds(200,100,100,100);
		cr.setBounds(500,500,100,100);

		for (int i=0;i<19;i++){
			tile[i].setIcon(new ImageIcon("images/floortile7-9.png"));
			tile[i].setBorder(null);
			add(tile[i]);
		}

		Key.setIcon(new ImageIcon("images/keytile.png"));
		Key.setBorder(null);
		Door.setIcon(new ImageIcon("images/doortile.png"));
		Door.setBorder(null);
		cr.setBorder(null);

		add(Key);
		add(Door);
		add(cr);

		validate();
		repaint();
	}

	public int getLevel(){//JD
		return level;

	}
	public void setLevel(int inplevel){//JD
		level = inplevel;
	}
	public void clearLevel(){//sets all tiles,door,key and char to visible and bounds to 0,0,0,0 JD


		for(int i=0;i<75;i++){//JD
			tile[i].setBounds(0,0,0,0);
			tile[i].setVisible(true);
		}

		Key.setBounds(0,0,0,0);
		Key.setVisible(true);
		Door.setBounds(0,0,0,0);
		Door.setVisible(true);
		cr.setBounds(0,0,0,0);
		cr.setVisible(true);

		sl.removeNextLevel();

		for (int i = 0;i<36;i++){
			grid[i].setBounds(0,0,0,0);
			grid[i].setVisible(true);
		}

		gotKey = false;

		validate();
		repaint();
	}	

	public void setLevelGrid(){ //makes level grid***//JD

		int x = 1;
		int y = 1;

		for (int i = 0;i<35;i++){

			if (i == 5 || i == 10 || i == 15 || i == 20 || i == 25 || i == 30){
				x++;
				y = 1;
			}		
			grid[i].setBounds(x*100,y*100,100,100);

			if (level == 1 || level ==2 || level ==3){
				grid[i].setIcon(new ImageIcon("images/floortile1-3.png"));
			}
			else if (level == 4 || level == 5 || level == 6){
				grid[i].setIcon(new ImageIcon("images/floortile4-6.png"));
			}
			else if (level == 7 || level == 8 || level == 9 || level == 10){
				grid[i].setIcon(new ImageIcon("images/floortile7-9.png"));
			}

			grid[i].setBorder(null);
			add(grid[i]);
			y++;
		}	


		for(int i=0;i<10;i++){
			remove(tile[i]);
		}
		sl.removeAll();


		if (level==1){ //makes sure tiles dont cover up door and key JD
			grid[5].setVisible(false);
			grid[25].setVisible(true);
			Key.setBounds(200,100,100,100);
			Door.setVisible(false);
		}
		else if (level==2){
			grid[10].setVisible(false);
			grid[27].setVisible(true);
			Key.setBounds(300,100,100,100);
			Door.setVisible(false);
		}
		else if (level==3){	//AChambliss
			grid[7].setVisible(false);//key
			grid[30].setVisible(true);//door
			Key.setBounds(200,300,100,100);
			Door.setVisible(false);
		}
		else if (level==4){	//AChambliss
			grid[27].setVisible(false);//key
			grid[4].setVisible(true);//door
			Key.setBounds(600,300,100,100);
			Door.setVisible(false);
		}
		else if (level==5){	//AChambliss
			grid[22].setVisible(false);//key
			grid[2].setVisible(true);//door
			Key.setBounds(500,300,100,100);
			Door.setVisible(false);
		}
		else if (level==6){	//AChambliss
			grid[0].setVisible(false);//key
			grid[25].setVisible(true);//door
			Key.setBounds(100,100,100,100);
			Door.setVisible(false);
		}
		else if (level==7){	//AChambliss
			grid[9].setVisible(false);//key
			grid[28].setVisible(true);//door
			Key.setBounds(200,500,100,100);
			Door.setVisible(false);
		}
		else if (level==8){	//AChambliss
			grid[25].setVisible(false);//key
			grid[1].setVisible(true);//door
			Key.setBounds(600,100,100,100);
			Door.setVisible(false);
		}
		else if (level==9){	//AChambliss
			grid[10].setVisible(false);//key
			grid[21].setVisible(true);//door
			Key.setBounds(300,100,100,100);
			Door.setVisible(false);	
		}
		else if (level==10){	//AChambliss	
			grid[30].setVisible(false);//key
			grid[5].setVisible(true);//door
			Key.setBounds(700,100,100,100);
			Door.setVisible(false);
		}

		grid[24].setVisible(false);
		cr.setBounds(500,500,100,100);
		add(Key);
		add(Door);
		add(cr);

	}


	public void move(int tile){//Move method checks if move is good or not and sends to either goodmove or badmove method//JD

		int charx = cr.getBounds().x;
		int chary = cr.getBounds().y;

<<<<<<< HEAD
		int chartile=findChar(charx,chary);
=======
		int chartile = 0;

		//these convert player tile coordinates to a tile number//JD
		switch (charx){
		case 100:
			switch (chary){
			case 100:
				chartile = 0;
				break;
			case 200:
				chartile = 1;
				break;
			case 300:
				chartile = 2;
				break;
			case 400:
				chartile = 3;
				break;
			case 500:
				chartile = 4;
				break;
			}
			break;
		case 200:
			switch (chary){
			case 100:
				chartile = 5;
				break;
			case 200:
				chartile = 6;
				break;
			case 300:
				chartile = 7;
				break;
			case 400:
				chartile = 8;
				break;
			case 500:
				chartile = 9;
				break;
			}
			break;
		case 300:
			switch (chary){
			case 100:
				chartile = 10;
				break;
			case 200:
				chartile = 11;
				break;
			case 300:
				chartile = 12;
				break;
			case 400:
				chartile = 13;
				break;
			case 500:
				chartile = 14;
				break;
			}
			break;
		case 400:
			switch (chary){
			case 100:
				chartile = 15;
				break;
			case 200:
				chartile = 16;
				break;
			case 300:
				chartile = 17;
				break;
			case 400:
				chartile = 18;
				break;
			case 500:
				chartile = 19;
				break;
			}
			break;
		case 500:
			switch (chary){
			case 100:
				chartile = 20;
				break;
			case 200:
				chartile = 21;
				break;
			case 300:
				chartile = 22;
				break;
			case 400:
				chartile = 23;
				break;
			case 500:
				chartile = 24;
				break;
			}
			break;
		case 600:
			switch (chary){
			case 100:
				chartile = 25;
				break;
			case 200:
				chartile = 26;
				break;
			case 300:
				chartile = 27;
				break;
			case 400:
				chartile = 28;
				break;
			case 500:
				chartile = 29;
				break;
			}
			break;
		case 700:
			switch (chary){
			case 100:
				chartile = 30;
				break;
			case 200:
				chartile = 31;
				break;
			case 300:
				chartile = 32;
				break;
			case 400:
				chartile = 33;
				break;
			case 500:
				chartile = 34;
				break;
			}
			break;
		}
>>>>>>> origin/master


		if (chartile-1== tile || chartile+1 == tile || chartile+5 == tile || chartile-5 ==tile || tile == 99 || tile == 98 ){

			//catches cheating jumping to highlighted box
			if (chartile==4 && tile==5||
					chartile==9 && tile==10||
					chartile==14 && tile==15||
					chartile==19 && tile==20||
					chartile==24 && tile==25||
					chartile==29 && tile==30||
					chartile==5 && tile==4||
					chartile==10 && tile==9||
					chartile==15 && tile==14||
					chartile==20 && tile==19||
					chartile==25 && tile==24||
					chartile==30 && tile==29){
				badMove(tile);
			}
			switch (level){//JD
			case 1: //lvl 1 done//JD
				switch (tile){
				case 24:
				case 23:
				case 22:
				case 21:
				case 16:
				case 11:
				case 6:
				case 26:
				case 25:
					goodMove(tile,charx,chary,chartile);
					break;
				case 98:
					switch (chartile){
					case 26:
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				case 99:
					switch (chartile){
					case 6:
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

			case 2: //lvl 2 done//JD
				switch (tile){
				case 5:
				case 6:
				case 7:
				case 12:
				case 17:
				case 18:
				case 23:
				case 24:
				case 28:
					goodMove(tile,charx,chary,chartile);
					break;
				case 98:
					switch (chartile){
					case 28://door
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				case 99:
					switch (chartile){
					case 5://key
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

			case 3: //lvl 3 done//JD
				switch (tile){
				case 8:
				case 13:
				case 14:
				case 19:
				case 24:
				case 25:
				case 29:
				case 28:
				case 33:
				case 32:
				case 31:
					goodMove(tile,charx,chary,chartile);
					break;
				case 98:
					switch (chartile){
					case 31://door
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				case 99:
					switch (chartile){
					case 8://key
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

			case 4: //lvl 4//JD
				switch (tile){
				case 3:
				case 6:
				case 7:
				case 8:
				case 11:
				case 16:
				case 17:
				case 18:
				case 19:
				case 22:
				case 24:
					goodMove(tile,charx,chary,chartile);
					break;
				case 98:
					switch (chartile){
					case 3://door
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				case 99:
					switch (chartile){
					case 22://key
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

				//Andrew Chambliss
			case 5:
				switch (tile){
				case 6:
				case 7:
				case 11:
				case 15:
				case 16:
				case 20:
				case 24:
				case 25:
				case 26:
				case 27:
				case 28:
				case 29:
					goodMove(tile,charx,chary,chartile);
					break;
				case 98:
					switch (chartile){
					case 7://door
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				case 99:
					switch (chartile){
					case 27://key
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;
				//Andrew Chambliss
			case 6: 
				switch (tile){
				case 5:
				case 6:
				case 7:
				case 8:
				case 12:
				case 13:
				case 14:
				case 18:
				case 22:
				case 23:
				case 24:
				case 26:
				case 27:
				case 28:
				case 31:
				case 33:

					goodMove(tile,charx,chary,chartile);
					break;
				case 98:
					switch (chartile){
					case 26://door
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				case 99:
					switch (chartile){
					case 5: //key
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;
				//Andrew Chambliss
			case 7:
				switch (tile){
				case 2:
				case 3:
				case 4:
				case 7:
				case 12:
				case 16:
				case 17:
				case 18:
				case 21:
				case 23:
				case 24:
				case 26:
				case 27:


					goodMove(tile,charx,chary,chartile);
					break;
				case 98:
					switch (chartile){
					case 23://door
					case 27://door	goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				case 99:
					switch (chartile){
					case 4://key
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;
				//Andrew Chambliss
			case 8:
				switch (tile){
				case 6:
				case 11:
				case 12:
				case 13:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 24:
				case 27:
				case 28:
				case 29:

					goodMove(tile,charx,chary,chartile);
					break;
				case 98:
					switch (chartile){
					case 6://door
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				case 99:
					switch (chartile){
					case 20://key
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

				//Andrew Chambliss
			case 9:
				switch (tile){
				case 1:
				case 2:
				case 3:
				case 5:
				case 6:
				case 8:
				case 12:
				case 13:
				case 14:
				case 18:
				case 19:
				case 24:
				case 26:
				case 27:
				case 28:
				case 29:

					goodMove(tile,charx,chary,chartile);
					break;
				case 98:
					switch (chartile){
					case 26://door
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				case 99:
					switch (chartile){

					case 5://key
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

				//Andrew Chambliss
			case 10:
				switch (tile){
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 8:
				case 9:
				case 13:
				case 15:
				case 16:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 24:
				case 25:
				case 27:
				case 28:
				case 29:


					goodMove(tile,charx,chary,chartile);
					break;
				case 98:
					switch (chartile){
					case 0://door
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				case 99:
					switch (chartile){
					case 25://key
						goodMove(tile,charx,chary,chartile);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;
			}
		}
	}


	public void goodMove(int tile1, int charx,int chary,int chartile) {//JD

		int swapx = 0;
		int swapy = 0;
		int tilex;
		int tiley;

		for (int i = 0;i<35;i++){ //JD
			grid[i].setBorder(null);
			if ((level == 1 && (i == 5 || i == 25))||
					(level == 2 && (i == 10 || i == 27))||
					(level == 3 && (i == 7 || i == 30 )) ||
					(level == 4 && (i == 4 || i == 27 )) ||
					(level == 5 && (i == 16 || i == 22 )) ||
					(level == 6 && (i == 7 || i == 25 )) ||
					(level == 7 && (i == 9 || i == 33 )) ||
					(level == 8 && (i == 25 || i == 1 )) ||
					(level == 9 && (i == 10 || i == 21 )) ||
					(level == 10 && (i == 30 || i == 5 )) ){
			}
			else{
				grid[i].setVisible(true);
			}
		}
		//this if statement happens when you step on key JD
		if (tile1 == 99){
			tilex = Key.getBounds().x;
			tiley = Key.getBounds().y;
			Key.setVisible(false);
			gotKey = true;
			Door.setVisible(true);

			if (level == 1){
				Door.setBounds(600,100,100,100);//AC
				grid[25].setVisible(false); //door tile number for each level
			}

			else if (level == 2){
				Door.setBounds(600,300,100,100);//AC
				grid[27].setVisible(false);//door tile number for each level
			}

			else if (level == 3){
				Door.setBounds(700,100,100,100);//AC
				grid[30].setVisible(false);//door tile number for each level    
			}

			else if (level == 4){
				Door.setBounds(100,500,100,100);//AC
				grid[4].setVisible(false); //door tile number for each level
			}

			else if (level == 5){
				Door.setBounds(100,300,100,100);//AC
				grid[2].setVisible(false);//door tile number for each level
			}

			else if (level == 6){
				Door.setBounds(600,100,100,100);//AC
				grid[25].setVisible(false);//door tile number for each level
<<<<<<< HEAD
			}

			else if (level == 7){
				Door.setBounds(600,400,100,100);//AC
				grid[28].setVisible(false); //door tile number for each level
			}

			else if (level == 8){
				Door.setBounds(100,200,100,100);//AC
				grid[1].setVisible(false);//door tile number for each level
			}

			else if (level == 9){
				Door.setBounds(500,200,100,100);//AC
				grid[21].setVisible(false);//door tile number for each level
			}


			else {
				Door.setBounds(200,100,100,100);//AC
				grid[5].setVisible(false);//door tile number for each level
			}

=======
			}

			else if (level == 7){
				Door.setBounds(600,400,100,100);//AC
				grid[28].setVisible(false); //door tile number for each level
			}

			else if (level == 8){
				Door.setBounds(100,200,100,100);//AC
				grid[1].setVisible(false);//door tile number for each level
			}

			else if (level == 9){
				Door.setBounds(500,200,100,100);//AC
				grid[21].setVisible(false);//door tile number for each level
			}


			else {
				Door.setBounds(200,100,100,100);//AC
				grid[5].setVisible(false);//door tile number for each level
			}

>>>>>>> origin/master
		}
		//this if statement happens when you step on door and you have key JD
		else if (tile1 == 98 && gotKey == true){
			tilex = Door.getBounds().x;
			tiley = Door.getBounds().y;
			Door.setVisible(false);
			sl.addNextLevel();
		}
		//just the standard move method JD
		else{

			tilex = grid[tile1].getBounds().x;
			tiley = grid[tile1].getBounds().y;
			grid[tile1].setVisible(false);

			if (gotKey == true){
				if (level == 1){//AC
					grid[5].setVisible(true); //key location
				}

				else if (level == 2){//AC
					grid[10].setVisible(true); //key location
				}

				else if (level == 3){//AC
					grid[7].setVisible(true); //key location
				}

				else if (level == 4){//AC
					grid[27].setVisible(true); //key location
				}

				else if (level == 5){//AC
					grid[22].setVisible(true); //key location
				}

				else if (level == 6){//AC
					grid[7].setVisible(true); //key location
				}

				else if (level == 7){//AC
					grid[9].setVisible(true); //key location
				}

				else if (level == 8){//AC
					grid[25].setVisible(true); //key location
				}

				else if (level == 9){//AC
					grid[10].setVisible(true); //key location
				}

				else {//AC
					grid[30].setVisible(true); //key location
				}

				Door.setVisible(true);
			}

		}

		if (tile1-1 > 0 && tile1-1 < 35){
			grid[tile1-1].setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createRaisedBevelBorder(),BorderFactory.createLoweredBevelBorder()));
		}
		if (tile1+1 < 35 && tile1+1 > 0){
			grid[tile1+1].setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createRaisedBevelBorder(),BorderFactory.createLoweredBevelBorder()));
		}
		if (tile1-5 > 0 && tile1-5< 35){
			grid[tile1-5].setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createRaisedBevelBorder(),BorderFactory.createLoweredBevelBorder()));
		}
		if (tile1+5 < 35 && tile1+5 > 0){
			grid[tile1+5].setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createRaisedBevelBorder(),BorderFactory.createLoweredBevelBorder()));
		}

		swapx = charx;
		swapy = chary;

		charx = tilex;
		chary = tiley;

		tilex = swapx;
		tiley = swapy;



		cr.setBounds(charx,chary,100,100);
		validate();
		repaint();
	}



	public void badMove(int tile){//JD
<<<<<<< HEAD


		sl.removeLife();
		if (tile <35){
			if (level == 1 || level ==2 || level ==3){
				grid[tile].setIcon(new ImageIcon("images/floortile1-3x.png"));
			}
			else if (level == 4 || level ==5 || level ==6){
				grid[tile].setIcon(new ImageIcon("images/floortile4-6x.png"));
			}
			else if (level == 7 || level ==8 || level ==9 || level == 10){
				grid[tile].setIcon(new ImageIcon("images/floortile7-9x.png"));
			}
		}
		validate();
		repaint();
	}


	public void createCharacter()
	{
		cr = new Character(sex, race,level); //add character DN 11-19
		setLayout(null);
		cr.setBounds(500,500,100,100);

	}


	///************ accessors
	public void setSex(int s)//JD
	{
		sex = s;
	}
	public void setRace(int r)//JD
	{
		race= r;
	}
	public void setDifficulty(int d)// to be used for difficulty DN
	{
		difficulty=d;
	}


=======


		sl.removeLife();
		if (tile <35){
			if (level == 1 || level ==2 || level ==3){
				grid[tile].setIcon(new ImageIcon("images/floortile1-3x.png"));
			}
			else if (level == 4 || level ==5 || level ==6){
				grid[tile].setIcon(new ImageIcon("images/floortile4-6x.png"));
			}
			else if (level == 7 || level ==8 || level ==9 || level == 10){
				grid[tile].setIcon(new ImageIcon("images/floortile7-9x.png"));
			}
		}
		validate();
		repaint();
	}


	public void createCharacter()
	{
		cr = new Character(sex, race,level); //add character DN 11-19
		setLayout(null);
		cr.setBounds(500,500,100,100);

	}


	///************ accessors
	public void setSex(int s)//JD
	{
		sex = s;
	}
	public void setRace(int r)//JD
	{
		race= r;
	}
	public void setDifficulty(int d)// to be used for difficulty DN
	{
		difficulty=d;
	}


>>>>>>> origin/master




	private class grid_Listener implements ActionListener {//JD
		public void actionPerformed(ActionEvent event) {
			move(Integer.parseInt((((JComponent) event.getSource()).getName())));
		}
	}
	private class key_Listener implements ActionListener {//JD
		public void actionPerformed(ActionEvent event) {
			move(99);
		}
	}
	private class door_Listener implements ActionListener {//JD
		public void actionPerformed(ActionEvent event) {
			move(98);
		}
	}
<<<<<<< HEAD
	

	
	public int findChar(int charx , int chary){
		//these convert player tile coordinates to a tile number//JD
		
		int chartile = 0;
		
		switch (charx){
		case 100:
			switch (chary){
			case 100:
				chartile = 0;
				break;
			case 200:
				chartile = 1;
				break;
			case 300:
				chartile = 2;
				break;
			case 400:
				chartile = 3;
				break;
			case 500:
				chartile = 4;
				break;
			}
			break;
		case 200:
			switch (chary){
			case 100:
				chartile = 5;
				break;
			case 200:
				chartile = 6;
				break;
			case 300:
				chartile = 7;
				break;
			case 400:
				chartile = 8;
				break;
			case 500:
				chartile = 9;
				break;
			}
			break;
		case 300:
			switch (chary){
			case 100:
				chartile = 10;
				break;
			case 200:
				chartile = 11;
				break;
			case 300:
				chartile = 12;
				break;
			case 400:
				chartile = 13;
				break;
			case 500:
				chartile = 14;
				break;
			}
			break;
		case 400:
			switch (chary){
			case 100:
				chartile = 15;
				break;
			case 200:
				chartile = 16;
				break;
			case 300:
				chartile = 17;
				break;
			case 400:
				chartile = 18;
				break;
			case 500:
				chartile = 19;
				break;
			}
			break;
		case 500:
			switch (chary){
			case 100:
				chartile = 20;
				break;
			case 200:
				chartile = 21;
				break;
			case 300:
				chartile = 22;
				break;
			case 400:
				chartile = 23;
				break;
			case 500:
				chartile = 24;
				break;
			}
			break;
		case 600:
			switch (chary){
			case 100:
				chartile = 25;
				break;
			case 200:
				chartile = 26;
				break;
			case 300:
				chartile = 27;
				break;
			case 400:
				chartile = 28;
				break;
			case 500:
				chartile = 29;
				break;
			}
			break;
		case 700:
			switch (chary){
			case 100:
				chartile = 30;
				break;
			case 200:
				chartile = 31;
				break;
			case 300:
				chartile = 32;
				break;
			case 400:
				chartile = 33;
				break;
			case 500:
				chartile = 34;
				break;
			}
			break;
		}
		if (chartile == 0){
			chartile = 24;
		}
		return chartile;
	}
=======

>>>>>>> origin/master

	public void paintComponent (Graphics g)//JD
	{
		super.paintComponent(g);
		Image myImage = null;
		if (level == 1 || level ==2 || level ==3){
			myImage = Toolkit.getDefaultToolkit().getImage("images/background1-3.jpg");
		}
		else if (level == 4 || level ==5 || level ==6){
			myImage = Toolkit.getDefaultToolkit().getImage("images/background4-6.png");
		}
		else if (level == 7 || level ==8 || level ==9 || level == 10){
			myImage = Toolkit.getDefaultToolkit().getImage("images/background7-9.jpg");
		}
		g.drawImage(myImage, 0, 0, this);
		validate();
		repaint();
	}

}
