import javax.swing.*;
import java.awt.*;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;



public class Character extends JButton{ //entire class by 

	// create attributes for gender and race 
	int race;
	int gender;
	int direction;
	int level;
	int xPos;
	int yPos;
	int width = 100;
	int height = 100;
	int movement = 100;
	int charImage;
	private AudioClip deathSound;

	// character constructor 
	public Character(int s, int r, int l)
	{
		race = r;
		gender = s;
		level = l;


		// call method to set character attributes 
		setAvatar();
		setBorder(null); 
		setContentAreaFilled(false);
	}

	// Accessors & Mutators  ********
	public void setChar(int s,int r)// accessor to set gender and race separately if needed 
	{
		gender = s;
		race = r;

		setAvatar();
	}
	//accessor to change level every 3 levels. 
	public void setLevel(int l){
		level = l;
	}



	// Methods *********************
	// Method to set avatar and death sound, updated for all levels 
	public void setAvatar()
	{
		//sets a default image if none is chosen and overwrites.
		ImageIcon image = new ImageIcon("images/humanM1-3.png");

		//set image and sound for each race 
		if (race == 1)
		{
			if (gender == 1) // male
			{
				if (level == 1 || level ==2 || level == 3){
					image = new ImageIcon("images/humanM1-3.png"); //set human male sprite 
				}
				else if (level == 4 || level == 5 || level == 6){
					image = new ImageIcon("images/humanM4-6.png");
				}
				else if (level == 7 || level == 8 || level == 9){
					image = new ImageIcon("images/humanM7-9.png");
				}
				try {
					URL sound = new URL("file:sound/humanM.wav"); // Set Male sound
					deathSound = Applet.newAudioClip(sound);
				} catch(Exception e) {
					e.printStackTrace();
				}

			}
			else if (gender == 2)
			{
				if (level == 1 || level ==2 || level == 3){
					image= new ImageIcon("images/humanF1-3.png");// Set Female human sprite
				}
				else if (level == 4 || level == 5 || level == 6){
					image = new ImageIcon("images/humanF4-6.png");
				}
				else if (level == 7 || level == 8 || level == 9){
					image = new ImageIcon("images/humanF7-9.png");
				}
				try {
					URL sound = new URL("file:sound/humanF.wav"); // Set Female sound
					deathSound = Applet.newAudioClip(sound);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		else if (race == 2)
		{
			if (gender == 1) // male
			{
				if (level == 1 || level ==2 || level == 3){
					image = new ImageIcon("images/ostrichM1-3.png"); //set male sprite 
				}
				else if (level == 4 || level == 5 || level == 6){
					image =  new ImageIcon("images/ostrichM4-6.png");
				}
				else if (level == 7 || level == 8 || level == 9){
					image = new ImageIcon("images/ostrichM7-9.png");
				}
				try {
					URL sound = new URL("file:sound/ostrichM.wav"); // Set Male sound
					deathSound = Applet.newAudioClip(sound);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			else if (gender == 2)
			{
				if (level == 1 || level ==2 || level == 3){
					image = new ImageIcon("images/ostrichF1-3.png");// Set Female sprite
				}
				else if (level == 4 || level == 5 || level == 6){
					image = new ImageIcon("images/ostrichF4-6.png");
				}
				else if (level == 7 || level == 8 || level == 9){
					image = new ImageIcon("images/ostrichF7-9.png");
				}
				try {
					URL sound = new URL("file:sound/ostrichF.wav"); // Set Female sound
					deathSound = Applet.newAudioClip(sound);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		else if (race == 3)
		{
			if (gender == 1) // male
			{
				if (level == 1 || level ==2 || level == 3){
					image = new ImageIcon("images/potatoM1-3.png"); //set male sprite 
				}
				else if (level == 4 || level == 5 || level == 6){
					image = new ImageIcon("images/potatoM4-6.png");
				}
				else if (level == 7 || level == 8 || level == 9){
					image = new ImageIcon("images/potatoM7-9.png");
				}
				try {
					URL sound = new URL("file:sound/potatom.wav"); // Set Male sound
					deathSound = Applet.newAudioClip(sound);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			else if (gender == 2)
			{
				if (level == 1 || level ==2 || level == 3){
					image = new ImageIcon("images/potatoF1-3.png");// Set Female sprite
				}
				else if (level == 4 || level == 5 || level == 6){
					image = new ImageIcon("images/potatoF4-6.png");
				}
				else if (level == 7 || level == 8 || level == 9){
					image = new ImageIcon("images/potatoF7-9.png");
				}
				try {
					URL sound = new URL("file:sound/potatof.wav"); // Set Female sound
					deathSound = Applet.newAudioClip(sound);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

		setIcon(image);// commit the image change
		validate();
		repaint();
	}


	// method to play the death sound of character 
	public void dsound(){
		deathSound.play();
	}
}
