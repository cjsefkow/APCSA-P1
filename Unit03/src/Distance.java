//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{



	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		


	}

	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow(xTwo-xOne, 2) + Math.pow(yTwo-yOne, 2));
	}

	public void print( )
	{
		out.printf("Distance = %.3f\n\n", distance);
	}
}