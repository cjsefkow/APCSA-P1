//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block(int x, int y, int w, int h, Color c) 
	{
		this.xPos = x;
		this.yPos = y;
		this.width = w;
		this.height = h;
		this.color = c;
	}
	
	public Block(int x, int y, int w, int h) 
	{
		this.xPos = x;
		this.yPos = y;
		this.width = w;
		this.height = h;
		this.color = Color.BLACK;
	}
	
	public Block() 
	{
		this.xPos = 0;
		this.yPos = 0;
		this.width = 0;
		this.height = 0;
		this.color = Color.BLACK;
	}
	
	public Block(int x, int y) 
	{
		this.xPos = x;
		this.yPos = y;
		this.width = 0;
		this.height = 0;
		this.color = Color.BLACK;
	}

	public void setColor(Color col)
	{
		this.color = col;
	}
	
	public void setPos(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	 /**
	 * @return the xPos
	 */
	public int getX() {
		return xPos;
	}
	
	/**
	 * @param xPos the xPos to set
	 */
	public void setX(int xPos) {
		this.xPos = xPos;
	}
	
	/**
	 * @return the yPos
	 */
	public int getY() {
		return yPos;
	}
	
	/**
	 * @param yPos the yPos to set
	 */
	public void setY(int yPos) {
		this.yPos = yPos;
	}
	
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	public void draw(Graphics window)
    {
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
    }

	public void draw(Graphics window, Color col)
	{
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
   
	public boolean equals(Block obj)
	{
		return ( (this.getX() == obj.getX()) && 
				 (this.getY() == obj.getY()) && 
				 (this.getHeight() == obj.getHeight()) && 
				 (this.getWidth() == obj.getWidth()) && 
				 (this.getColor() == obj.getColor()) );
	}       

   public String toString() {
	   return "" + this.getX() + " " + this.getY() + " " + this.getHeight() + " " + this.getWidth() + " " + this.getColor();
   }
}