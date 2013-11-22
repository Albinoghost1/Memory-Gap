import javax.swing.*;
import java.awt.*;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;



public class Character extends JButton{ //entire class by DN

	// create attributes for gender and race DN
	int race;
	int gender;
	int direction;
	int xPos;
	int yPos;
	int width = 100;
	int height = 100;
	int movement = 100;
	int charImage;
	private AudioClip deathSound;
	
	// character constructor DN
	public Character(int r, int g, int w, int h )
	{
		// may remove completely and initialize to human above
		race = r;
		gender = g;
		width = w;
		height = h;
		
		// call method for character DN
			setAvatar();
	
	}
	
	// Methods ***********************************
	// Method to set avatar and death sound DN
	public void setAvatar()
	{
		ImageIcon sprite = null;
		
		// set image and sound for each race DN
		if (race == 1)
		{
			if (gender == 1) // male
			{
				sprite = new ImageIcon("images/humanM.jpg"); //set human male sprite DN
				
				try {
					URL sound = new URL("file:sound/humanM.wav"); // Set Male sound
					deathSound = Applet.newAudioClip(sound);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			else if (gender == 2)
			{
				sprite = new ImageIcon("images/humanF.jpg");// Set Female human sprite
				
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
				sprite = new ImageIcon("images/ostrichM"); //set male sprite DN
				
				try {
					URL sound = new URL("file:sound/ostrichM.wav"); // Set Male sound
					deathSound = Applet.newAudioClip(sound);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			else if (gender == 2)
			{
				sprite = new ImageIcon("images/ostrichF.jpg");// Set Female sprite
				
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
				sprite = new ImageIcon("images/potatoM"); //set male sprite DN
				
				try {
					URL sound = new URL("file:sound/potatoM.wav"); // Set Male sound
					deathSound = Applet.newAudioClip(sound);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			else if (gender == 2)
			{
				sprite = new ImageIcon("images/potatoF.jpg");// Set Female sprite
				
				try {
					URL sound = new URL("file:sound/potatoF.wav"); // Set Female sound
					deathSound = Applet.newAudioClip(sound);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	// Possible method used by level to set sprite start position DN
	public void setStartPosition(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	
	// methods to listen and change sprites direction DN
	public void turnLeft()
	{
		/* image Icons etc. This may be difficult as it will 
		 constantly  need to listen and update. 
		 */
	}
	
	/* Methods to move character across screen DN
	  This is set to move in 100 pixel intervals, can be changed later*/
	public void moveUp(){
		yPos = yPos - movement; 
	    	setLocation(xPos, yPos);
	}
	public void moveDown(){
		yPos = yPos + movement;
			setLocation(xPos, yPos);
	}
	public void moveLeft(){
		xPos = xPos - movement;
			setLocation(xPos, yPos);
	}
	public void moveRight(){
		xPos = xPos + movement;
			setLocation(xPos, yPos);
	}
	
	
	
	
}
