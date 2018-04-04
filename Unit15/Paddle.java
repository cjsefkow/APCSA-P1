//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
	{
		super(10, 10, 10, 50, Color.BLACK);
		setSpeed(5);
	}

	public Paddle(int x, int y) {
		super(x, y, 10, 50, Color.BLACK);
		setSpeed(5);
	}
	
	public Paddle(int x, int y, int s) {
		super(x, y);
		setSpeed(s);
	}
	
	public Paddle(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		setSpeed(s);
	}
	
	public Paddle(int x, int y, int w, int h, Color col, int s) {
		super(x, y, w, h, col);
		setSpeed(s);
	}

   public void moveUpAndDraw(Graphics window)
   {
		Color temp = getColor();
		draw(window, Color.WHITE);
		setY(getY()-speed);
		draw(window, temp);
   }

   /**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * @param speed the speed to set
	 */
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void moveDownAndDraw(Graphics window)
    {
		Color temp = getColor();
		draw(window, Color.WHITE);
		setY(getY()+speed);
		draw(window, temp);
    }

	public String toString() {
		return super.toString() +" "+ getSpeed();
	}
}