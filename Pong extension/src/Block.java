import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Block {
	
	private int x, y, size, health;
	
	public Block(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.setHealth(3);
	}
	
	public void draw (Graphics window) {
		window.setColor(Color.GREEN);
		window.fillRect(this.x, this.y, size, size * getHealth() / 3);
	}
	
	public void didCollide(Bullets bullets) {
		for (Ammo bullet : bullets.getList()) {
			if (bullet.getX() > x - bullet.getSize()/2 && 
				bullet.getX() < x + this.size + bullet.getSize() && 
				bullet.getY() > y - bullet.getSize() && 
				bullet.getY() < y + this.size*getHealth()/3) {
				this.setHealth(this.getHealth() - 1);
				bullets.useUp(bullet);
//				System.out.println("Bullet collided with block");
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