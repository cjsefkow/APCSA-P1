//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		AtCounter test = new AtCounter();
		
		System.out.println(test.countAts(0, 0));
		test.resetBoard();
		System.out.println(test.countAts(2, 5));
		test.resetBoard();
		System.out.println(test.countAts(5, 0));
		test.resetBoard();
		System.out.println(test.countAts(9, 9));
		test.resetBoard();
		System.out.println(test.countAts(3, 9));
		test.resetBoard();
		
	}
}