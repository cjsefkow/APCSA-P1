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
import java.awt.Font;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	
	private int leftScore = 0;
	private int rightScore = 0;

	public Pong()
	{
		//set up all variables related to the game

		ball = new BlinkyBall(400, 300, 10, 10, Color.BLACK, 2, 1);
		leftPaddle = new Paddle(10, 244, 20, 70, Color.BLACK, 4);
		rightPaddle = new Paddle(760, 244, 20, 70, Color.BLACK, 4);

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		
		graphToBack.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		graphToBack.clearRect(0, 650, 800, 150);
		graphToBack.setColor(Color.RED);
		graphToBack.drawString("Player 1 Score: "+ leftScore + "      " + 
				"Player 2 Score: "+ rightScore, 10, 710);


		//see if ball hits left wall or right wall
		if(ball.getX()<=10)
		{
			graphToBack.clearRect(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
			ball.setX(400);
			ball.setY(300);
			rightScore++;
		}
		
		if(ball.getX()>=790)
		{
			graphToBack.clearRect(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
			ball.setX(400);
			ball.setY(300);
			leftScore++;
		}
		
		if(ball.getY()>=600 || ball.getY()<=0)
		{
			ball.setYSpeed(-1*ball.getYSpeed());
		}
		
		
		// Collisions with paddles
		
		if (ball.didCollideBottom(leftPaddle) || ball.didCollideTop(leftPaddle)) {
			ball.setYSpeed(ball.getYSpeed());
		}
		if (ball.didCollideLeft(leftPaddle) || ball.didCollideRight(leftPaddle)) {
			ball.setXSpeed(ball.getXSpeed()*-1);
		}
		
		if (ball.didCollideBottom(rightPaddle) || ball.didCollideTop(rightPaddle)) {
			ball.setYSpeed(ball.getYSpeed());
		}
		if (ball.didCollideLeft(rightPaddle) || ball.didCollideRight(rightPaddle)) {
			ball.setXSpeed(ball.getXSpeed()*-1);
		}
		
		// Move paddles
		
		if(keys[0] == true) {
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true) {
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		
		if(keys[2] == true) {
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true) {
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}