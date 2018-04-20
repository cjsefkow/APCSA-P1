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
			aliens.add(new Alien(num, col, sizeOfAlien, sizeOfAlien, 4*startingDirection));
			System.out.println("Added alien at (" + num + ", " + col + ")");
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

	public void moveEmAll()
	{
		for (Alien alien : aliens) {
			if (alien.getX() < 0 || alien.getX() > 800 - alien.getWidth()) {
				alien.setY(alien.getY()+60);
				alien.setSpeed(alien.getSpeed()*-1);
			}
			alien.move("");        
		}
	}

	public void removeDeadOnes(Bullets shots)
	{
		for (Ammo bullet : shots.getList()) {
			for (Alien alien : aliens) {
				if (bullet.getX() > alien.getX() - bullet.getWidth() && 
					bullet.getX() < alien.getX() + alien.getWidth() && 
					bullet.getY() > alien.getY() - bullet.getHeight() && 
					bullet.getY() < alien.getY() + alien.getHeight()) {
					aliens.remove(alien);
					shots.useUp(bullet);
				}
			}
		}
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
