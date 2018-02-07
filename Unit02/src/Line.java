//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Line {
	
	private int xOne, yOne, xTwo, yTwo;
	private double slope;


	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}

	public void calculateSlope( )
	{
		double yDrop = (yTwo - yOne);
		double xDrop = (xTwo - xOne);
		slope = yDrop/xDrop;
	}

	public void print( )
	{
		out.printf("The slope is %.2f\n", slope);
	}
}