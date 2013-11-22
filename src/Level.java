import javax.swing.*;

//import Back_Panel.Button_Listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Level extends JPanel{ //entire class by DN
	
	int level = 1;
	int sex;
	int race;
	int difficulty;
	
	
	JButton[] grid = new JButton[36];
	JButton[] tile = new JButton[10];
	
	boolean gotKey = false;
	
	JButton Key;
	JButton Door;
	JButton Char;
	
	JButton bmenu;
	JButton bstartLevel1;
	JButton bstartLevel2;
	String levelbuttontext;
	

	
	public Level() {
		super();
		setLayout(null);
		setBackground(Color.black);

		bmenu = new JButton("Main Menu");
		bmenu.setBounds(700,50,100,50);
		
		bstartLevel1 = new JButton("Start Level 1");
		bstartLevel2 = new JButton("Start Level 2");
		
		for (int i = 0;i<36;i++){
		grid[i] = new JButton();
		grid[i].addActionListener(new grid_Listener());
		grid[i].setName(String.valueOf(i));
		}
		
		for (int i=0;i<10;i++){
			tile[i] = new JButton();
		}
		
		Key = new JButton();
		Door = new JButton();
		Key.addActionListener(new key_Listener());
		Door.addActionListener(new door_Listener());
		Char = new JButton();
		
	}
	public void level1()
	{
		
			bstartLevel1.setBounds(350,500,150,50);
		
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
			Char.setBounds(500,500,100,100);
			Char.setBorder(null);
			
			for (int i=0;i<7;i++){
				tile[i].setIcon(new ImageIcon("images/floortile.png"));
				tile[i].setBorder(null);
				add(tile[i]);
			}
			
			Key.setIcon(new ImageIcon("images/keytile.png"));
			Door.setIcon(new ImageIcon("images/doortile.png"));
			Char.setIcon(new ImageIcon("images/chartile.png"));

			add(Key);
			add(Door);
			add(Char);
			add(bmenu);
			add(bstartLevel1);
	        validate();
	        repaint();
	}
	public void level2()
	{
		

			bstartLevel2.setBounds(350,500,150,50);
		
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
			Char.setBounds(500,500,100,100);
			
			for (int i=0;i<9;i++){
				tile[i].setIcon(new ImageIcon("images/floortile.png"));
				tile[i].setBorder(null);
				add(tile[i]);
			}
	
			Key.setIcon(new ImageIcon("images/keytile.png"));
			Key.setBorder(null);
			Door.setIcon(new ImageIcon("images/doortile.png"));
			Door.setBorder(null);
			Char.setIcon(new ImageIcon("images/chartile.png"));
			Char.setBorder(null);
			
			add(Key);
			add(Door);
			add(Char);
			add(bmenu);
			add(bstartLevel2);
	        validate();
	        repaint();
			
	}
	public void level3()
	{
		

			// Set Tiles position on screen DN
			
	}
	public void level4()
	{
		
	
			// Set Tiles position on screen DN
			
	}
	public void level5()
	{
		

			// Set Tiles position on screen DN
			
	}
	public void level6()
	{
		
	
			// Set Tiles position on screen DN
			
	}
	public void level7()
	{
		
	
			// Set Tiles position on screen DN
			
	}
	public void level8()
	{
		
	
			// Set Tiles position on screen DN
			
	}
	public void level9()
	{
		
	
			// Set Tiles position on screen DN
			
	}
	public void level10()
	{
		
	
			// Set Tiles position on screen DN
			
	}
	public int getLevel(){
		return level;
		
	}
	public void setLevel(int inplevel){
		level = inplevel;
	}
	public void clearLevel(){
		
		
		bstartLevel1.setBounds(0,0,0,0);
		bstartLevel2.setBounds(0,0,0,0);
		
		for(int i=0;i<10;i++){
			tile[i].setBounds(0,0,0,0);
			tile[i].setVisible(true);
		}

		Key.setBounds(0,0,0,0);
		Key.setVisible(true);
		Door.setBounds(0,0,0,0);
		Door.setVisible(true);
		Char.setBounds(0,0,0,0);
		Char.setVisible(true);
		
		for (int i = 0;i<36;i++){
		grid[i].setBounds(0,0,0,0);
		grid[i].setVisible(true);
		}
		
		gotKey = false;
		
	    validate();
	    repaint();
	}	
	public void setLevelGrid(){

		int x = 1;
		int y = 1;
		
		for (int i = 0;i<35;i++){

				if (i == 5 || i == 10 || i == 15 || i == 20 || i == 25 || i == 30){
					x++;
					y = 1;
				}		
			grid[i].setBounds(x*100,y*100,100,100);
			
			grid[i].setIcon(new ImageIcon("images/floortile.png"));
			grid[i].setBorder(null);
			add(grid[i]);
			y++;
			}	

	
		for(int i=0;i<10;i++){
			remove(tile[i]);
		}
	remove(bstartLevel1);
	remove(bstartLevel2);


	if (level==1){
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
	else{
		
	}
	grid[24].setVisible(false);
	Char.setBounds(500,500,100,100);
	add(Key);
	add(Door);
	add(Char);

	}
	public void move(int tile){
		
		int charx = Char.getBounds().x;
		int chary = Char.getBounds().y;
		int swapx = 0;
		int swapy = 0;
		int tilex;
		int tiley;

		
		for (int i = 0;i<35;i++){
			if (level == 1 && (i == 5 || i == 25)){
			}
			else{
			grid[i].setVisible(true);
			}
		}
		
		if (tile == 99){
			tilex = Key.getBounds().x;
			tiley = Key.getBounds().y;
			Key.setVisible(false);
			gotKey = true;
			System.out.println(gotKey);
			Door.setVisible(true);
			
			if (level == 1){
				Door.setBounds(600,100,100,100);
				grid[25].setVisible(false);
			}
			
		}
		else if (tile == 98 && gotKey != false){
			tilex = Door.getBounds().x;
			tiley = Door.getBounds().y;
			Door.setVisible(false);
		}
		else{
			
			tilex = grid[tile].getBounds().x;
			tiley = grid[tile].getBounds().y;
			grid[tile].setVisible(false);
			if (gotKey != false){
				grid[5].setVisible(true);
				Door.setVisible(true);
			}
			
		}


		swapx = charx;
		swapy = chary;
		
		charx = tilex;
		chary = tiley;
		
		tilex = swapx;
		tiley = swapy;
		
		System.out.println("Clicked tile number "+tile);
		System.out.println("last tile Char was on are "+ Char.getBounds().x+" "+ Char.getBounds().y);
		Char.setBounds(charx,chary,100,100);

	       validate();
	       repaint();


	}
	
	



	private class grid_Listener implements ActionListener {
		  public void actionPerformed(ActionEvent event) {
		    System.out.println(event.getActionCommand());
		    move(Integer.parseInt((((JComponent) event.getSource()).getName())));
		  }
}
	private class key_Listener implements ActionListener {
		  public void actionPerformed(ActionEvent event) {
		    System.out.println(event.getActionCommand());
		    move(99);
		  	}
}
	private class door_Listener implements ActionListener {
		  public void actionPerformed(ActionEvent event) {
		    System.out.println(event.getActionCommand());
		    move(98);
		  }
}


	public void paintComponent (Graphics g)
	 {
	    super.paintComponent(g);
	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/blankbackground.jpg");
	    g.drawImage(myImage, 0, 0, this);
       validate();
       repaint();
	 }
	
}
