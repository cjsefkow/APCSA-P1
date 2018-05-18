//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
		super(x,y);
	}

	public Ship(int x, int y, int s)
	{
	   super(x,y);
	   this.speed = s;
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("Not loaded");
		}
	}


	public void setSpeed(int s)
	{
	   this.speed = s;
	}

	public int getSpeed()
	{
	   return 0;
	}

	public void move(String direction)
	{
		if (direction == "UP") { setY(getY()-speed); }
		else if (direction == "DOWN") { setY(getY()+speed); }
		else if (direction == "LEFT") { setX(getX()-speed); }
		else if (direction == "RIGHT") { setX(getX()+speed); }
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
