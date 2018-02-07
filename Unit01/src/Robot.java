//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas {
   public Robot() {
	  //constructor method - sets up the class 
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window);
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window ) {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
      window.setColor(Color.RED);
      window.fillOval(360, 120, 20, 20);
      window.fillOval(420, 120, 20, 20);
      window.fillRect(350, 170, 100, 4);

		//add more code here
				
   }

   public void upperBody( Graphics window ) {

		window.setColor(Color.BLUE);
		window.fillRect(300, 190, 200, 110);
   }

   public void lowerBody( Graphics window ) {
	   	window.setColor(Color.BLACK);
	   	window.fillRect(340, 300, 20, 100);
	   	window.fillRect(440, 300, 20, 100);

   }
}