//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Window;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		for (int i = 0; i < size; i++) {
			int num = i*60;
			int col = 10;
			int sizeOfAlien = 40;
			int startingDirection = 1;
			while (num >= 800 - sizeOfAlien) {
				num -= 800 - sizeOfAlien;
				col += 60;
				startingDirection *= -1;
			}
			aliens.add(new Alien(num, col, sizeOfAlien, sizeOfAlien, 2*startingDirection));
//			System.out.println("Added alien at (" + num + ", " + col + ")");
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien alien : aliens) {
			alien.draw(window);
		}
	}

	public void moveEmAll(ArrayList<Block> blocks)
	{
		for (Alien alien : aliens) {
			if (alien.getX() < 0 || alien.getX() > 800 - alien.getWidth()) {
				alien.setY(alien.getY()+60);
				alien.setSpeed(alien.getSpeed()*-1);
			}
			
			for (Block block : blocks) {
				if (alien.getX() + alien.getSpeed() == block.getX() && alien.getY() == block.getY()) {
					alien.setY(alien.getY()+60);
					alien.setSpeed(alien.getSpeed()*-1);
				}
			}
			
			alien.move("");        
		}
	}

	public int[] removeDeadOnes(Bullets shots)
	{
		int[] toReturn = new int[2];
		toReturn[0] = -1;
		outerloop:
		for (Ammo bullet : shots.getList()) {
			for (Alien alien : aliens) {
				if (bullet.getX() > alien.getX() - bullet.getWidth() && 
					bullet.getX() < alien.getX() + alien.getWidth() && 
					bullet.getY() > alien.getY() - bullet.getHeight() && 
					bullet.getY() < alien.getY() + alien.getHeight()) {
					toReturn[0] = alien.getX();
					toReturn[1] = alien.getY();
					aliens.remove(alien);
					shots.useUp(bullet);
//					System.out.println("Hit alien");
//					System.out.println("Creating block at " + toReturn[0] + " " + toReturn[1]);
					break outerloop;
				}
			}
		} return toReturn;
	}
	
	public boolean gameover() {
		for (Alien alien : aliens) {
			if (alien.getY() > 590) {
				return true;
			}
		} return false;
	}

	public String toString()
	{
		String toReturn = "";
		for (Alien alien : aliens) {
			toReturn += alien.getX() + " " + alien.getY() + " " + alien.getHeight() + " " + alien.getWidth() + " " + alien.getSpeed() + "\n";
		} return toReturn;
		
	}
}
