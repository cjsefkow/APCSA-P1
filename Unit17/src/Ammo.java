//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private int size = 8;

	public Ammo()
	{
		this(-100,-100,0);
	}

	public Ammo(int x, int y)
	{
		super(x,y);
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y);
		speed = s;
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
		window.fillRect(getX()-size/2, getY(), 8, 8);
	}
	
	
	public void move( String direction )
	{
		setY(getY()-speed);
	}

	public String toString()
	{
		return "";
	}
}
