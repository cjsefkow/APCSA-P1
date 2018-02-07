//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Circle {
	
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea( )
	{
		area = Math.PI*radius*radius;
	}

	public void print( )
	{
		out.printf("The area is :: %.4f  \n\n\n" , area);
	}
}