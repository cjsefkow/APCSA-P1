//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		//add test cases
		
		LoopStats test = new LoopStats(1, 5);
		System.out.println(test.toString());
		System.out.println(test.getTotal());
		System.out.println(test.getEvenCount());
		System.out.println(test.getOddCount());
		System.out.println("");
		test.setNums(2, 8);
		System.out.println(test.toString());
		System.out.println(test.getTotal());
		System.out.println(test.getEvenCount());
		System.out.println(test.getOddCount());
		System.out.println("");
		test.setNums(5, 15);
		System.out.println(test.toString());
		System.out.println(test.getTotal());
		System.out.println(test.getEvenCount());
		System.out.println(test.getOddCount());
					
	}
}