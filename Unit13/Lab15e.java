//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import static java.lang.System.*;

public class Lab15e
{
	public static void main(String args[])
	{
		//test case 1
		int[] one = NumberSort.getSortedDigitArray(567891);
		for(int item : one)
		{
			System.out.print(item + " ");
		}
		System.out.println();
		
		one = NumberSort.getSortedDigitArray(901912468);
		for(int item : one)
		{
			System.out.print(item + " ");
		}
		System.out.println();
		
		one = NumberSort.getSortedDigitArray(864213507);
		for(int item : one)
		{
			System.out.print(item + " ");
		}
		System.out.println();
	}
}