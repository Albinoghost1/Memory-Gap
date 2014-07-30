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

public class Level extends JPanel {

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

	public Level() {
		super();
		setLayout(null);
		setBackground(Color.black);

		for (int i = 0; i < 36; i++) {
			grid[i] = new JButton();
			grid[i].addActionListener(new grid_Listener());
			grid[i].setName(String.valueOf(i));
		}

		for (int i = 0; i < 75; i++) {
			tile[i] = new JButton();
		}

		Key = new JButton();
		Door = new JButton();
		Key.addActionListener(new key_Listener());
		Door.addActionListener(new door_Listener());
		createCharacter();
		sl = new ScoreLife_Panel();
		sl.setBounds(0, 25, 870, 70);
		sl.setOpaque(false);
		add(sl);

	}

	public void level1() {

		clearLevel();
		level = 1;

		setTile10(6,11,16,21,26,22,23,99,99,99,1,200,100,600,100);

	}

	public void level2() {
		clearLevel();
		level = 2;

		setTile10(6,17,7,12,28,18,23,5,99,99,1,300,100,600,300);

	}

	public void level3() {
		clearLevel();
		level = 3;

		setTile10(8,13,14,19,29,28,33,32,31,99,1,200,300,700,100);


	}

	public void level4() {
		clearLevel();
		level = 4;

		setTile10(3,6,7,8,11,16,17,18,19,22,2,600,300,100,500);

	}

	public void level5() {

		clearLevel();
		level = 5;

		setTile20(6,7,11,15,16,20,25,26,27,28,29,99,99,99,99,99,99,99,99,99,2,500,300,100,300);
		
	}

	public void level6() {

		clearLevel();
		level = 6;

		setTile20(5,6,7,8,12,13,14,18,22,23,26,27,28,31,33,99,99,99,99,99,2,100,100,600,100);

	}

	public void level7() {

		clearLevel();
		level = 7;

		setTile20(2,3,4,7,12,16,17,18,21,23,26,27,99,99,99,99,99,99,99,99,3,200,500,600,400);
	}

	public void level8() {

		clearLevel();
		level = 8;

		setTile20(6,11,12,13,18,19,20,21,22,27,28,29,34,99,99,99,99,99,99,99,3,600,100,100,200);

	}

	public void level9() {

		clearLevel();
		level = 9;

		setTile20(1,2,3,5,6,8,12,13,14,15,18,19,26,27,28,29,99,99,99,99,3,300,100,500,200);

	}

	public void level10() {

		clearLevel();
		level = 10;

		setTile20(0,1,2,3,4,8,9,13,15,16,18,19,20,21,22,25,27,28,29,99,3,700,100,200,100);

	}

	public int getLevel() {
		return level;

	}

	public void setLevel(int inplevel) {
		level = inplevel;
	}

	public void clearLevel() {// sets all tiles,door,key and char to visible and
								// bounds to 0,0,0,0 JD

		for (int i = 0; i < 75; i++) {
			tile[i].setBounds(0, 0, 0, 0);
			tile[i].setVisible(true);
		}

		Key.setBounds(0, 0, 0, 0);
		Key.setVisible(true);
		Door.setBounds(0, 0, 0, 0);
		Door.setVisible(true);
		cr.setBounds(0, 0, 0, 0);
		cr.setVisible(true);

		sl.removeNextLevel();

		for (int i = 0; i < 36; i++) {
			grid[i].setBounds(0, 0, 0, 0);
			grid[i].setVisible(true);
		}

		gotKey = false;

		validate();
		repaint();
	}

	//sets tiles for lvls
	
	public void setTile10(int tile1,int tile2,int tile3,int tile4,int tile5,int tile6,int tile7,int tile8, int tile9, int tile10,int tilelvl,int keyx,int keyy,int doorx, int doory){
		int tile11 = 99;
		int tile12 = 99;
		int tile13 = 99;
		int tile14 = 99;
		int tile15 = 99;
		int tile16 = 99;
		int tile17 = 99;
		int tile18 = 99;
		int tile19 = 99;
		int tile20 = 99;
		setTile20(tile1,tile2,tile3,tile4,tile5,tile6,tile7,tile8,tile9,tile10,tile11,tile12,tile13,tile14,tile15,tile16,tile17,tile18,tile19,tile20,tilelvl,keyx,keyy,doorx,doory);
	}
	
	public void setTile20(int tile1,int tile2,int tile3,int tile4,int tile5,int tile6,int tile7,int tile8, int tile9, int tile10,int tile11,int tile12,int tile13,int tile14,int tile15,int tile16,int tile17,int tile18,int tile19,int tile20,int tilelvl,int keyx,int keyy,int doorx, int doory) {
		
		
		int [] locations ={tile1,tile2,tile3,tile4,tile5,tile6,tile7,tile8,tile9,tile10,tile11,tile12,tile13,tile14,tile15,tile16,tile17,tile18,tile19,tile20};
		
		Key.setBorder(null);
		Door.setBorder(null);
		cr.setBorder(null);
		cr.setBounds(500, 500, 100, 100);
		
		Key.setBounds(keyx,keyy, 100, 100);
		Door.setBounds(doorx,doory,100,100);
		
		
		add(Key);
		add(Door);
		add(cr);
		
		for(int i=0;i<20;i++){
			if(tilelvl==1){
				tile[i].setIcon(new ImageIcon("images/floortile1-3.png"));
				Key.setIcon(new ImageIcon("images/keytile1-3.png"));
				Door.setIcon(new ImageIcon("images/doortile1-3.png"));
			}
			else if(tilelvl==2){
				tile[i].setIcon(new ImageIcon("images/floortile4-6.png"));
				Key.setIcon(new ImageIcon("images/keytile4-6.png"));
				Door.setIcon(new ImageIcon("images/doortile1-3.png"));
			}
			else{
				tile[i].setIcon(new ImageIcon("images/floortile7-9.png"));
				Key.setIcon(new ImageIcon("images/keytile7-9.png"));
				Door.setIcon(new ImageIcon("images/doortile1-3.png"));
			}
			tile[i].setBorder(null);	
			add(tile[i]);
		switch (locations[i]) {

		case 0:
			tile[i].setBounds(100, 100, 100, 100);
			break;
		case 1:
			tile[i].setBounds(100, 200, 100, 100);
			break;
		case 2:
			tile[i].setBounds(100, 300, 100, 100);
			break;
		case 3:
			tile[i].setBounds(100, 400, 100, 100);
			break;
		case 4:
			tile[i].setBounds(100, 500, 100, 100);
			break;
		case 5:
			tile[i].setBounds(200, 100, 100, 100);
			break;
		case 6:
			tile[i].setBounds(200, 200, 100, 100);
			break;
		case 7:
			tile[i].setBounds(200, 300, 100, 100);
			break;
		case 8:
			tile[i].setBounds(200, 400, 100, 100);
			break;
		case 9:
			tile[i].setBounds(200, 500, 100, 100);
			break;
		case 10:
			tile[i].setBounds(300, 100, 100, 100);
			break;
		case 11:
			tile[i].setBounds(300, 200, 100, 100);
			break;
		case 12:
			tile[i].setBounds(300, 300, 100, 100);
			break;
		case 13:
			tile[i].setBounds(300, 400, 100, 100);
			break;
		case 14:
			tile[i].setBounds(300, 500, 100, 100);
			break;
		case 15:
			tile[i].setBounds(400, 100, 100, 100);
			break;
		case 16:
			tile[i].setBounds(400, 200, 100, 100);
			break;
		case 17:
			tile[i].setBounds(400, 300, 100, 100);
			break;
		case 18:
			tile[i].setBounds(400, 400, 100, 100);
			break;
		case 19:
			tile[i].setBounds(400, 500, 100, 100);
			break;
		case 20:
			tile[i].setBounds(500, 100, 100, 100);
			break;
		case 21:
			tile[i].setBounds(500, 200, 100, 100);
			break;
		case 22:
			tile[i].setBounds(500, 300, 100, 100);
			break;
		case 23:
			tile[i].setBounds(500, 400, 100, 100);
			break;
		case 24:
			tile[i].setBounds(500, 500, 100, 100);
			break;
		case 25:
			tile[i].setBounds(600, 100, 100, 100);
			break;
		case 26:
			tile[i].setBounds(600, 200, 100, 100);
			break;
		case 27:
			tile[i].setBounds(600, 300, 100, 100);
			break;
		case 28:
			tile[i].setBounds(600, 400, 100, 100);
			break;
		case 29:
			tile[i].setBounds(600, 500, 100, 100);
			break;
		case 30:
			tile[i].setBounds(700, 100, 100, 100);
			break;
		case 31:
			tile[i].setBounds(700, 200, 100, 100);
			break;
		case 32:
			tile[i].setBounds(700, 300, 100, 100);
			break;
		case 33:
			tile[i].setBounds(700, 400, 100, 100);
			break;
		case 34:
			tile[i].setBounds(700, 500, 100, 100);
			break;
		case 99:
		break;
		}
	}
	}

	public void setLevelGrid() { // makes level grid***

		int x = 1;
		int y = 1;

		for (int i = 0; i < 35; i++) {

			if (i == 5 || i == 10 || i == 15 || i == 20 || i == 25 || i == 30) {
				x++;
				y = 1;
			}
			grid[i].setBounds(x * 100, y * 100, 100, 100);

			if (level == 1 || level == 2 || level == 3) {
				grid[i].setIcon(new ImageIcon("images/floortile1-3.png"));
			} else if (level == 4 || level == 5 || level == 6) {
				grid[i].setIcon(new ImageIcon("images/floortile4-6.png"));
			} else if (level == 7 || level == 8 || level == 9 || level == 10) {
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

		if (level == 1) { // makes sure tiles dont cover up door and key JD
			grid[5].setVisible(false);
			grid[25].setVisible(true);
			Key.setBounds(200, 100, 100, 100);
			Door.setVisible(false);
		} else if (level == 2) {
			grid[10].setVisible(false);
			grid[27].setVisible(true);
			Key.setBounds(300, 100, 100, 100);
			Door.setVisible(false);
		} else if (level == 3) {
			grid[7].setVisible(false);// key
			grid[30].setVisible(true);// door
			Key.setBounds(200, 300, 100, 100);
			Door.setVisible(false);
		} else if (level == 4) {
			grid[27].setVisible(false);// key
			grid[4].setVisible(true);// door
			Key.setBounds(600, 300, 100, 100);
			Door.setVisible(false);
		} else if (level == 5) {
			grid[22].setVisible(false);// key
			grid[2].setVisible(true);// door
			Key.setBounds(500, 300, 100, 100);
			Door.setVisible(false);
		} else if (level == 6) {
			grid[0].setVisible(false);// key
			grid[25].setVisible(true);// door
			Key.setBounds(100, 100, 100, 100);
			Door.setVisible(false);
		} else if (level == 7) {
			grid[9].setVisible(false);// key
			grid[28].setVisible(true);// door
			Key.setBounds(200, 500, 100, 100);
			Door.setVisible(false);
		} else if (level == 8) {
			grid[25].setVisible(false);// key
			grid[1].setVisible(true);// door
			Key.setBounds(600, 100, 100, 100);
			Door.setVisible(false);
		} else if (level == 9) {
			grid[10].setVisible(false);// key
			grid[21].setVisible(true);// door
			Key.setBounds(300, 100, 100, 100);
			Door.setVisible(false);
		} else if (level == 10) {
			grid[30].setVisible(false);// key
			grid[5].setVisible(true);// door
			Key.setBounds(700, 100, 100, 100);
			Door.setVisible(false);
		}

		grid[24].setVisible(false);
		cr.setBounds(500, 500, 100, 100);
		add(Key);
		add(Door);
		add(cr);

	}

	public void move(int tile) {// Move method checks if move is good or not and
								// sends to either goodmove or badmove method

		int charx = cr.getBounds().x;
		int chary = cr.getBounds().y;

		int chartile = findChar(charx, chary);

		if (chartile - 1 == tile || chartile + 1 == tile
				|| chartile + 5 == tile || chartile - 5 == tile || tile == 99
				|| tile == 98) {

			// catches cheating jumping to highlighted box
			if (chartile == 4 && tile == 5 || chartile == 9 && tile == 10
					|| chartile == 14 && tile == 15 || chartile == 19
					&& tile == 20 || chartile == 24 && tile == 25
					|| chartile == 29 && tile == 30 || chartile == 5
					&& tile == 4 || chartile == 10 && tile == 9
					|| chartile == 15 && tile == 14 || chartile == 20
					&& tile == 19 || chartile == 25 && tile == 24
					|| chartile == 30 && tile == 29) {
				badMove(tile);
			}
			switch (level) {
			case 1: // lvl 1
				switch (tile) {
				case 24:
				case 23:
				case 22:
				case 21:
				case 16:
				case 11:
				case 26:
				case 6:
					goodMove(tile, charx, chary, 0);
					break;

				case 5:
					if (chartile == 6) {
						goodMove(tile, charx, chary, 1);
					} else {
						badMove(tile);
					}
					break;

				case 25:
					if (chartile == 26) {
						goodMove(tile, charx, chary, 2);
					} else {
						badMove(tile);
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

			case 2: // lvl 2 done
				switch (tile) {
				case 5:
				case 6:
				case 7:
				case 12:
				case 17:
				case 18:
				case 23:
				case 24:
				case 28:
					goodMove(tile, charx, chary, 0);
					break;
				case 98:
					switch (chartile) {
					case 28:// door
						goodMove(tile, charx, chary, 1);
						break;
					}
					break;
				case 99:
					switch (chartile) {
					case 5:// key
						goodMove(tile, charx, chary, 2);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

			case 3: // lvl 3 done
				switch (tile) {
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
					goodMove(tile, charx, chary, 0);
					break;
				case 98:
					switch (chartile) {
					case 31:// door
						goodMove(tile, charx, chary, 2);
						break;
					}
					break;
				case 99:
					switch (chartile) {
					case 8:// key
						goodMove(tile, charx, chary, 1);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

			case 4: // lvl 4
				switch (tile) {
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
					goodMove(tile, charx, chary, 0);
					break;
				case 98:
					switch (chartile) {
					case 3:// door
						goodMove(tile, charx, chary, 2);
						break;
					}
					break;
				case 99:
					switch (chartile) {
					case 22:// key
						goodMove(tile, charx, chary, 1);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

			case 5:
				switch (tile) {
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
					goodMove(tile, charx, chary, 0);
					break;
				case 98:
					switch (chartile) {
					case 7:// door
						goodMove(tile, charx, chary, 2);
						break;
					}
					break;
				case 99:
					switch (chartile) {
					case 27:// key
						goodMove(tile, charx, chary, 1);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

			case 6:
				switch (tile) {
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

					goodMove(tile, charx, chary, 0);
					break;
				case 98:
					switch (chartile) {
					case 26:// door
						goodMove(tile, charx, chary, 2);
						break;
					}
					break;
				case 99:
					switch (chartile) {
					case 5: // key
						goodMove(tile, charx, chary, 1);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

			case 7:
				switch (tile) {
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

					goodMove(tile, charx, chary, 0);
					break;
				case 98:
					switch (chartile) {
					case 23:// door
					case 27:// door
						goodMove(tile, charx, chary, 0);
						break;
					}
					break;
				case 99:
					switch (chartile) {
					case 4:// key
						goodMove(tile, charx, chary, 0);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

			case 8:
				switch (tile) {
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

					goodMove(tile, charx, chary, 0);
					break;
				case 98:
					switch (chartile) {
					case 6:// door
						goodMove(tile, charx, chary, 0);
						break;
					}
					break;
				case 99:
					switch (chartile) {
					case 20:// key
						goodMove(tile, charx, chary, 0);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

			case 9:
				switch (tile) {
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

					goodMove(tile, charx, chary, 0);
					break;
				case 98:
					switch (chartile) {
					case 26:// door
						goodMove(tile, charx, chary, 0);
						break;
					}
					break;
				case 99:
					switch (chartile) {

					case 5:// key
						goodMove(tile, charx, chary, 0);
						break;
					}
					break;
				default:
					badMove(tile);
					break;
				}
				break;

			case 10:
				switch (tile) {
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

					goodMove(tile, charx, chary, 0);
					break;

				case 98:
					switch (chartile) {
					case 0:// door
						goodMove(tile, charx, chary, 0);
						break;
					}
					break;

				case 99:
					switch (chartile) {
					case 25:// key
						goodMove(tile, charx, chary, 0);
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

	public void goodMove(int tile1, int charx, int chary, int keydoor) { // keydoor
																			// =0
																			// nothing
																			// =1
																			// key
																			// =2															// door

		int swapx = 0;
		int swapy = 0;
		int tilex;
		int tiley;

		for (int i = 0; i < 35; i++) {
			grid[i].setBorder(null);
			if ((level == 1 && (i == 5 || i == 25))
					|| (level == 2 && (i == 10 || i == 27))
					|| (level == 3 && (i == 7 || i == 30))
					|| (level == 4 && (i == 4 || i == 27))
					|| (level == 5 && (i == 16 || i == 22))
					|| (level == 6 && (i == 7 || i == 25))
					|| (level == 7 && (i == 9 || i == 33))
					|| (level == 8 && (i == 25 || i == 1))
					|| (level == 9 && (i == 10 || i == 21))
					|| (level == 10 && (i == 30 || i == 5))) {
			} else {
				grid[i].setVisible(true);
			}
		}
		// this if statement happens when you step on key JD
		if (keydoor == 1) {
			tilex = Key.getBounds().x;
			tiley = Key.getBounds().y;
			Key.setVisible(false);
			gotKey = true;
			Door.setVisible(true);

			if (level == 1) {
				Door.setBounds(600, 100, 100, 100);
				grid[25].setVisible(false); // door tile number for each level
			}

			else if (level == 2) {
				Door.setBounds(600, 300, 100, 100);
				grid[27].setVisible(false);// door tile number for each level
			}

			else if (level == 3) {
				Door.setBounds(700, 100, 100, 100);
				grid[30].setVisible(false);// door tile number for each level
			}

			else if (level == 4) {
				Door.setBounds(100, 500, 100, 100);
				grid[4].setVisible(false); // door tile number for each level
			}

			else if (level == 5) {
				Door.setBounds(100, 300, 100, 100);
				grid[2].setVisible(false);// door tile number for each level
			}

			else if (level == 6) {
				Door.setBounds(600, 100, 100, 100);
				grid[25].setVisible(false);// door tile number for each level
			}

			else if (level == 7) {
				Door.setBounds(600, 400, 100, 100);
				grid[28].setVisible(false); // door tile number for each level
			}

			else if (level == 8) {
				Door.setBounds(100, 200, 100, 100);
				grid[1].setVisible(false);// door tile number for each level
			}

			else if (level == 9) {
				Door.setBounds(500, 200, 100, 100);
				grid[21].setVisible(false);// door tile number for each level
			}

			else {
				Door.setBounds(200, 100, 100, 100);
				grid[5].setVisible(false);// door tile number for each level
			}

		}
		// this if statement happens when you step on door and you have key JD
		else if (keydoor == 2 && gotKey == true) {
			tilex = Door.getBounds().x;
			tiley = Door.getBounds().y;
			Door.setVisible(false);
			sl.addNextLevel();
		}

		// this if statement happens when you step on door and you have key JD
		else if (keydoor == 2 && gotKey == false) {
			tilex = Door.getBounds().x;
			tiley = Door.getBounds().y;
			Door.setVisible(false);
		}

		// just the standard move method JD
		else {

			tilex = grid[tile1].getBounds().x;
			tiley = grid[tile1].getBounds().y;
			grid[tile1].setVisible(false);

			if (gotKey == true) {
				switch (level) {

				case 1:
					grid[5].setVisible(true); // key location
					break;
				case 2:
					grid[10].setVisible(true); // key location
					break;
				case 3:
					grid[7].setVisible(true); // key location
					break;
				case 4:
					grid[27].setVisible(true); // key location
					break;
				case 5:
					grid[22].setVisible(true); // key location
					break;
				case 6:
					grid[7].setVisible(true); // key location
					break;
				case 7:
					grid[9].setVisible(true); // key location
					break;
				case 8:
					grid[25].setVisible(true); // key location
					break;
				case 9:
					grid[10].setVisible(true); // key location
					break;
				case 10:
					grid[30].setVisible(true); // key location
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Error");
					break;
				}
				Door.setVisible(true);

			}

		}


		setBorder(tile1);
		
		swapx = charx;
		swapy = chary;

		charx = tilex;
		chary = tiley;

		tilex = swapx;
		tiley = swapy;

		cr.setBounds(charx, chary, 100, 100);
		validate();
		repaint();
	}

	
	public void setBorder(int playerLocation){

		if (playerLocation - 1 > 0 && playerLocation - 1 < 35 && playerLocation - 1 !=4 && playerLocation - 1 !=9 && playerLocation - 1 !=14&& playerLocation - 1 !=19&& playerLocation - 1 !=24&& playerLocation - 1 !=29) {
			grid[playerLocation - 1].setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createRaisedBevelBorder(),
					BorderFactory.createLoweredBevelBorder()));
		}
		if (playerLocation + 1 < 35 && playerLocation + 1 > 0 && playerLocation + 1 != 5 && playerLocation + 1 != 10&& playerLocation + 1 != 15&& playerLocation + 1 != 20&& playerLocation + 1 != 25&& playerLocation + 1 != 30) {
			grid[playerLocation + 1].setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createRaisedBevelBorder(),
					BorderFactory.createLoweredBevelBorder()));
		}
		if (playerLocation - 5 > 0 && playerLocation - 5 < 35) {
			grid[playerLocation - 5].setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createRaisedBevelBorder(),
					BorderFactory.createLoweredBevelBorder()));
		}
		if (playerLocation + 5 < 35 && playerLocation + 5 > 0) {
			grid[playerLocation + 5].setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createRaisedBevelBorder(),
					BorderFactory.createLoweredBevelBorder()));
		}
	}
	public void badMove(int tile) {

		sl.removeLife();
		if (tile < 35) {
			if (level == 1 || level == 2 || level == 3) {
				grid[tile].setIcon(new ImageIcon("images/floortile1-3x.png"));
			} else if (level == 4 || level == 5 || level == 6) {
				grid[tile].setIcon(new ImageIcon("images/floortile4-6x.png"));
			} else if (level == 7 || level == 8 || level == 9 || level == 10) {
				grid[tile].setIcon(new ImageIcon("images/floortile7-9x.png"));
			}
		}
		validate();
		repaint();
	}

	public void createCharacter() {
		cr = new Character(sex, race, level); // add character 11-19
		setLayout(null);
		cr.setBounds(500, 500, 100, 100);

	}

	public void setSex(int s) {
		sex = s;
	}

	public void setRace(int r) {
		race = r;
	}

	public void setDifficulty(int d)// to be used for difficulty
	{
		difficulty = d;
	}

	private class grid_Listener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			move(Integer.parseInt((((JComponent) event.getSource()).getName())));
		}
	}

	private class key_Listener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			move(99);
		}
	}

	private class door_Listener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			move(98);
		}
	}

	public boolean beatLvl() {
		boolean win = false;
		if (cr.getBounds().x == Door.getBounds().x
				&& cr.getBounds().y == Door.getBounds().y) {
			win = true;
		}
		return win;

	}

	public int findChar(int charx, int chary) {
		// these convert player tile coordinates to a tile number

		int chartile = 0;

		switch (charx) {
		case 100:
			switch (chary) {
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
			switch (chary) {
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
			switch (chary) {
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
			switch (chary) {
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
			switch (chary) {
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
			switch (chary) {
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
			switch (chary) {
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
		if (chartile == 0) {
			chartile = 24;
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

}
