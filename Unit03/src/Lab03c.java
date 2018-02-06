//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
		Quadratic test = new Quadratic(5, -8, 3);
		test.calcRoots();
		test.print();
		
		test = new Quadratic(3, 2, -7);
		test.calcRoots();
		test.print();
		
		test = new Quadratic(9, 6, 1);
		test.calcRoots();
		test.print();
	}
}