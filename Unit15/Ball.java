//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200, 10, 10, Color.BLACK);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball (int x, int y, int w, int h, Color c, int xSpeed, int ySpeed)
	{
		super(x, y, w, h, c);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public Ball (int x, int y, int w, int h, Color c)
	{
		super(x, y, w, h, c);
		this.xSpeed = 3;
		this.ySpeed = 1;
	}
	
	public Ball (int x, int y, int w, int h)
	{
		super(x, y, w, h, Color.BLACK);
		this.xSpeed = 3;
		this.ySpeed = 1;
	}
	
	public Ball (int x, int y)
	{
		super(x, y, 10, 10, Color.BLACK);
		this.xSpeed = 3;
		this.ySpeed = 1;
	}   

	public void moveAndDraw(Graphics window)
	{
		{
			Color temp = getColor();
			draw(window, Color.WHITE);
			setPos(getX()+xSpeed, getY()+ySpeed);
			draw(window, temp);
		}
	}
	
	//Collidable
	public boolean didCollideLeft(Block obj) {
		// Left side of the ball colliding with something else's right
		if (this.getXSpeed() < 0 &&
				
			// Currently inside of the block
			this.getX() <= obj.getX() + obj.getWidth() &&
			this.getX() >= obj.getX() &&
			this.getY() <= obj.getY() + obj.getHeight() &&
			this.getY() >= obj.getY() &&
			
			// Previously was not outside of the block
			
			this.getX() >= obj.getX() + obj.getWidth() + this.getXSpeed()) {
			return true;
		}   return false;
	}
	public boolean didCollideRight(Block obj) {
    	// Right side of the ball colliding with something else's left
		if (this.getXSpeed() > 0 &&
				
			// Currently inside of the block
			this.getX() <= obj.getX() + obj.getWidth() &&
			this.getX() >= obj.getX() &&
			this.getY() <= obj.getY() + obj.getHeight() &&
			this.getY() >= obj.getY() &&
			
			// Previously was not outside of the block
			
			this.getX() <= obj.getX() + obj.getWidth() + this.getXSpeed()) {
			return true;
		}   return false;
    }
    public boolean didCollideTop(Block obj) {
    	// Top side of the ball colliding with something else's bottom
		if (this.getYSpeed() < 0 &&
				
			// Currently inside of the block
			this.getX() <= obj.getX() + obj.getWidth() &&
			this.getX() >= obj.getX() &&
			this.getY() <= obj.getY() + obj.getHeight() &&
			this.getY() >= obj.getY() &&
			
			// Previously was not outside of the block
			
			this.getY() <= obj.getY() + obj.getHeight() + this.getYSpeed()) {
			return true;
		}   return false;
    }
    public boolean didCollideBottom(Block obj) {
		// Bottom side of the ball colliding with something else's top
		if (this.getYSpeed() < 0 &&
				
			// Currently inside of the block
			this.getX() <= obj.getX() + obj.getWidth() &&
			this.getX() >= obj.getX() &&
			this.getY() <= obj.getY() + obj.getHeight() &&
			this.getY() >= obj.getY() &&
			
			// Previously was not outside of the block
			
			this.getY() <= obj.getY() + obj.getHeight() + this.getYSpeed()) {
			return true;
		}   return false;
	}
   
	/**
	 * @return the xSpeed
	 */
	public int getXSpeed() {
		return xSpeed;
	}
	
	/**
	 * @param xSpeed the xSpeed to set
	 */
	public void setXSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	
	/**
	 * @return the ySpeed
	 */
	public int getYSpeed() {
		return ySpeed;
	}
	
	/**
	 * @param ySpeed the ySpeed to set
	 */
	public void setYSpeed(int ySpeed) {
		this.ySpeed = ySpeed;
}

	public boolean equals(Ball obj)
	{
		return super.equals(obj) && this.getXSpeed() == obj.getXSpeed() && this.getYSpeed() == obj.getYSpeed();
	}   

    public String toString() {
    	return "" + super.toString() + " " + this.getXSpeed() + " " + this.getYSpeed();
    }
}