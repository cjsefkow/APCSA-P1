//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;


/*
 * Caterpillar
 * 
 * Every time you kill an alien it turns into a block that functions as a wall.
 * Shoot the blocks to destroy them; they absorb three hits before breaking.
 * The game ends when an alien reaches the bottom of the screen.
 * Arrow keys to move, space to shoot.
 * Enjoy
 *
 */


public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
    private AlienHorde horde;
	private Bullets shots;
	private int bulletCD = 0;
	private int level = 1;
	
	private ArrayList<Block> blocks = new ArrayList<Block>();
	
	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		ship = new Ship(100, 100, 40, 40, 3);
		shots = new Bullets();
		horde = new AlienHorde(level);

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("Caterpillar | Level " + (level), 25, 50 );
		if (horde.gameover() == true) {
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("Game Over! You Reached Level " + level, 300, 300);
		}

		twoDGraph.drawImage(back, null, 0, 0);
		
		ship.draw(window);
		if (shots.getList().size() > 0) {
			shots.moveEmAll();
			shots.drawEmAll(window);
		}
		horde.moveEmAll(blocks);
		horde.drawEmAll(window);
		for (Block block : blocks) {
			block.draw(window);
			block.didCollide(shots);
			if (block.getHealth() <= 0) {
				blocks.remove(block);
				break;
			}
		}
		bulletCD--;
			
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		if(keys[4] == true)
		{
			if (bulletCD <= 0) {
				bulletCD = 50;
				shots.add(new Ammo(ship.getX() + ship.getWidth()/2, ship.getY(), 3));
			}
		}
		
		int[] toBlock = horde.removeDeadOnes(shots);
		if (toBlock[0] != -1) {
			blocks.add(new Block(horde.SIZE_OF_ALIEN*(toBlock[0]/horde.SIZE_OF_ALIEN), toBlock[1], 15));
		}
		
		if (horde.toString() == "") {
			level++;
			horde = new AlienHorde(level);
		}
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

