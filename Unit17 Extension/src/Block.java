import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Block {
	
	private int x, y, s, health;
	
	public Block(int x, int y, int s) {
		this.x = x;
		this.y = y;
		this.s = s;
		this.setHealth(3);
	}
	
	public void draw (Graphics window) {
		window.setColor(Color.GREEN);
		window.fillRect(this.x, this.y, s * 3, s * getHealth());
	}
	
	public void didCollide(Bullets bullets) {
		for (Ammo bullet : bullets.getList()) {
			if (bullet.getX() > x - bullet.getWidth() && 
				bullet.getX() < x + s*3 && 
				bullet.getY() > y - bullet.getHeight() && 
				bullet.getY() < y + s*getHealth()) {
				this.setHealth(this.getHealth() - 1);
				bullets.useUp(bullet);
				System.out.println("Bullet collided with block");
				break;
			}
		}
	}

	public int getHealth() {
		return health;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}