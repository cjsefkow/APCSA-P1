//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{


	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}
	
	public void calcRoots( )
	{
		rootOne = ((-b + Math.sqrt(b*b - 4*a*c))/(2*a));
		rootTwo = ((-b - Math.sqrt(b*b - 4*a*c))/(2*a));
	}

	public void print( )
	{
		out.printf("rootone :: %.2f\n", rootOne);
		out.printf("roottwo :: %.2f\n\n\n", rootTwo);
	}
}