//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


		Shape shape1 = new Shape(200, 200, 100, 100, Color.BLACK);
		window.setColor(Color.BLUE);
		window.fillRect(100, 100, 50, 50);
		window.setColor(Color.RED);
		window.fillRect(110, 110, 30, 30);
		
		window.setColor(Color.BLUE);
		window.fillRect(300, 100, 50, 50);
		window.setColor(Color.RED);
		window.fillRect(310, 110, 30, 30);
		
		window.setColor(Color.BLUE);
		window.fillRect(50, 300, 25, 25);
		window.setColor(Color.RED);
		window.fillRect(55, 305, 15, 15);
		
		//instantiate a Shape
		//tell your shape to draw

		//instantiate a Shape
		//tell your shape to draw
	}
}