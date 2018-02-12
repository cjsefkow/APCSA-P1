//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Lab08i
{
	public static void main ( String[] args )
	{
		Prime test = new Prime();
		//add test cases
		int[] testCases = {24, 7, 100, 113, 65535, 2, 7334, 7919, 1115125003};
		
		for (int i = 0; i < testCases.length; i++) {
			test.setPrime(testCases[i]);
			System.out.println(test.toString());
		}
		
	}	
}